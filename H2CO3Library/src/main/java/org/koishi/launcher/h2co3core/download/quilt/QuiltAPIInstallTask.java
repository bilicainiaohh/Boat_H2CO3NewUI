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
package org.koishi.launcher.h2co3core.download.quilt;

import org.koishi.launcher.h2co3core.download.DefaultDependencyManager;
import org.koishi.launcher.h2co3core.game.Version;
import org.koishi.launcher.h2co3core.task.FileDownloadTask;
import org.koishi.launcher.h2co3core.task.Task;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * <b>Note</b>: Quilt should be installed first.
 */
public final class QuiltAPIInstallTask extends Task<Version> {

    private final DefaultDependencyManager dependencyManager;
    private final Version version;
    private final QuiltAPIRemoteVersion remote;
    private final List<Task<?>> dependencies = new ArrayList<>(1);

    public QuiltAPIInstallTask(DefaultDependencyManager dependencyManager, Version version, QuiltAPIRemoteVersion remoteVersion) {
        this.dependencyManager = dependencyManager;
        this.version = version;
        this.remote = remoteVersion;
    }

    @Override
    public Collection<Task<?>> getDependencies() {
        return dependencies;
    }

    @Override
    public boolean isRelyingOnDependencies() {
        return false;
    }

    @Override
    public void execute() throws IOException {
        dependencies.add(new FileDownloadTask(
                new URL(remote.getVersion().getFile().getUrl()),
                dependencyManager.getGameRepository().getRunDirectory(version.getId()).toPath().resolve("mods").resolve("quilt-api-" + remote.getVersion().getVersion() + ".jar").toFile(),
                remote.getVersion().getFile().getIntegrityCheck())
        );
    }
}
