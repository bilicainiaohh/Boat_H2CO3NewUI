/*
 * Hello Minecraft! Launcher
 * Copyright (C) 2020  huangyuhui <huanghongxun2008@126.com> and contributors
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
package org.koishi.launcher.h2co3.core.game.mod.modrinth;

import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;

import org.koishi.launcher.h2co3.core.game.download.DefaultDependencyManager;
import org.koishi.launcher.h2co3.core.game.download.DefaultGameRepository;
import org.koishi.launcher.h2co3.core.game.download.GameBuilder;
import org.koishi.launcher.h2co3.core.game.mod.MinecraftInstanceTask;
import org.koishi.launcher.h2co3.core.game.mod.Modpack;
import org.koishi.launcher.h2co3.core.game.mod.ModpackCompletionException;
import org.koishi.launcher.h2co3.core.game.mod.ModpackConfiguration;
import org.koishi.launcher.h2co3.core.game.mod.ModpackInstallTask;
import org.koishi.launcher.h2co3.core.game.mod.curse.CurseManifest;
import org.koishi.launcher.h2co3.core.utils.file.FileTools;
import org.koishi.launcher.h2co3.core.utils.gson.JsonUtils;
import org.koishi.launcher.h2co3.core.utils.task.Task;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class ModrinthInstallTask extends Task<Void> {

    private final DefaultDependencyManager dependencyManager;
    private final DefaultGameRepository repository;
    private final File zipFile;
    private final Modpack modpack;
    private final ModrinthManifest manifest;
    private final String name;
    private final File run;
    private final ModpackConfiguration<ModrinthManifest> config;
    private final List<Task<?>> dependents = new ArrayList<>(4);
    private final List<Task<?>> dependencies = new ArrayList<>(1);

    public ModrinthInstallTask(DefaultDependencyManager dependencyManager, File zipFile, Modpack modpack, ModrinthManifest manifest, String name) {
        this.dependencyManager = dependencyManager;
        this.zipFile = zipFile;
        this.modpack = modpack;
        this.manifest = manifest;
        this.name = name;
        this.repository = dependencyManager.getGameRepository();
        this.run = repository.getRunDirectory(name);

        File json = repository.getModpackConfiguration(name);
        if (repository.hasVersion(name) && !json.exists())
            throw new IllegalArgumentException("VersionMod " + name + " already exists.");

        GameBuilder builder = dependencyManager.gameBuilder().name(name).gameVersion(manifest.getGameVersion());
        for (Map.Entry<String, String> modLoader : manifest.getDependencies().entrySet()) {
            switch (modLoader.getKey()) {
                case "minecraft":
                    break;
                case "forge":
                    builder.version("forge", modLoader.getValue());
                    break;
                case "fabric-loader":
                    builder.version("fabric", modLoader.getValue());
                    break;
                case "quilt-loader":
                    builder.version("quilt", modLoader.getValue());
                    break;
                default:
                    throw new IllegalStateException("Unsupported mod loader " + modLoader.getKey());
            }
        }
        dependents.add(builder.buildAsync());

        onDone().register(event -> {
            Exception ex = event.getTask().getException();
            if (event.isFailed()) {
                if (!(ex instanceof ModpackCompletionException)) {
                    repository.removeVersionFromDisk(name);
                }
            }
        });

        ModpackConfiguration<ModrinthManifest> config = null;
        try {
            if (json.exists()) {
                config = JsonUtils.GSON.fromJson(FileTools.readText(json), new TypeToken<ModpackConfiguration<CurseManifest>>() {
                }.getType());

                if (!ModrinthModpackProvider.INSTANCE.getName().equals(config.getType()))
                    throw new IllegalArgumentException("VersionMod " + name + " is not a Modrinth modpack. Cannot update this version.");
            }
        } catch (JsonParseException | IOException ignore) {
        }

        this.config = config;
        List<String> subDirectories = Arrays.asList("/client-overrides", "/overrides");
        dependents.add(new ModpackInstallTask<>(zipFile, run, modpack.getEncoding(), subDirectories, any -> true, config).withStage("h2co3.modpack"));
        dependents.add(new MinecraftInstanceTask<>(zipFile, modpack.getEncoding(), subDirectories, manifest, ModrinthModpackProvider.INSTANCE, manifest.getName(), manifest.getVersionId(), repository.getModpackConfiguration(name)).withStage("h2co3.modpack"));

        dependencies.add(new ModrinthCompletionTask(dependencyManager, name, manifest));
    }

    @Override
    public Collection<Task<?>> getDependents() {
        return dependents;
    }

    @Override
    public Collection<Task<?>> getDependencies() {
        return dependencies;
    }

    @Override
    public void execute() throws Exception {
        if (config != null) {
            // For update, remove mods not listed in new manifest
            for (ModrinthManifest.File oldManifestFile : config.getManifest().getFiles()) {
                Path oldFile = run.toPath().resolve(oldManifestFile.getPath());
                if (!Files.exists(oldFile)) continue;
                if (manifest.getFiles().stream().noneMatch(oldManifestFile::equals)) {
                    Files.deleteIfExists(oldFile);
                }
            }
        }

        File root = repository.getVersionRoot(name);
        FileTools.writeText(new File(root, "modrinth.index.json"), JsonUtils.GSON.toJson(manifest));
    }
}
