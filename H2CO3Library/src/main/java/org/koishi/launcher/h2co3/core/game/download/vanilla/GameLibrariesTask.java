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
package org.koishi.launcher.h2co3.core.game.download.vanilla;

import org.koishi.launcher.h2co3.core.H2CO3Tools;
import org.koishi.launcher.h2co3.core.game.GameRepository;
import org.koishi.launcher.h2co3.core.game.LibFilter;
import org.koishi.launcher.h2co3.core.game.download.AbstractDependencyManager;
import org.koishi.launcher.h2co3.core.game.download.Library;
import org.koishi.launcher.h2co3.core.game.download.Version;
import org.koishi.launcher.h2co3.core.message.H2CO3MessageManager;
import org.koishi.launcher.h2co3.core.utils.file.FileTools;
import org.koishi.launcher.h2co3.core.utils.task.FileDownloadTask;
import org.koishi.launcher.h2co3.core.utils.task.Task;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

/**
 * This task is to download game libraries.
 * This task should be executed last(especially after game downloading, Forge, LiteLoader and OptiFine install task).
 */
public final class GameLibrariesTask extends Task<Void> {

    private final AbstractDependencyManager dependencyManager;
    private final Version version;
    private final boolean integrityCheck;
    private final List<Library> libraries;
    private final List<Task<?>> dependencies = new ArrayList<>();

    /**
     * Constructor.
     *
     * @param dependencyManager the dependency manager that can provides {@link GameRepository}
     * @param version           the game version
     */
    public GameLibrariesTask(AbstractDependencyManager dependencyManager, Version version, boolean integrityCheck) {
        this(dependencyManager, version, integrityCheck, version.resolve(dependencyManager.getGameRepository()).getLibraries());
    }

    /**
     * Constructor.
     *
     * @param dependencyManager the dependency manager that can provides {@link GameRepository}
     * @param version           the game version
     */
    public GameLibrariesTask(AbstractDependencyManager dependencyManager, Version version, boolean integrityCheck, List<Library> libraries) {
        this.dependencyManager = dependencyManager;
        this.version = LibFilter.filter(version);
        this.integrityCheck = integrityCheck;
        this.libraries = LibFilter.filterLibs(libraries);

        setSignificance(TaskSignificance.MODERATE);
    }

    @Override
    public List<Task<?>> getDependencies() {
        return dependencies;
    }

    public static boolean shouldDownloadLibrary(GameRepository gameRepository, Version version, Library library, boolean integrityCheck) {
        File file = gameRepository.getLibraryFile(version, library);
        Path jar = file.toPath();
        if (!file.isFile()) return true;
        try {
            if (integrityCheck && !library.getDownload().validateChecksum(jar, true)) return true;
            if (integrityCheck &&
                    library.getChecksums() != null && !library.getChecksums().isEmpty() &&
                    !LibraryDownloadTask.checksumValid(file, library.getChecksums())) return true;
            if (integrityCheck) {
                String ext = FileTools.getExtension(file);
                if (ext.equals("jar")) {
                    try {
                        FileDownloadTask.ZIP_INTEGRITY_CHECK_HANDLER.checkIntegrity(jar, jar);
                    } catch (IOException ignored) {
                        // the Jar file is malformed, so re-download it.
                        return true;
                    }
                }
            }
        } catch (IOException e) {
           H2CO3Tools.showMessage(H2CO3MessageManager.NotificationItem.Type.WARNING, "Unable to calc hash value of file " + jar + e);
        }

        return false;
    }

    @Override
    public void execute() {
        libraries.stream().filter(Library::appliesToCurrentEnvironment).forEach(library -> {
            File file = dependencyManager.getGameRepository().getLibraryFile(version, library);
            if (shouldDownloadLibrary(dependencyManager.getGameRepository(), version, library, integrityCheck)) {
                if (library.hasDownloadURL() || !"optifine".equals(library.getGroupId()))
                    dependencies.add(new LibraryDownloadTask(dependencyManager, file, library));
            } else {
                dependencyManager.getCacheRepository().tryCacheLibrary(library, file.toPath());
            }
        });
    }

}
