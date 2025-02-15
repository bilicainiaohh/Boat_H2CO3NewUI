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
package org.koishi.launcher.h2co3.core.game.download;

import org.koishi.launcher.h2co3.core.utils.task.Task;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * The builder which provide a task to build Minecraft environment.
 */
public abstract class GameBuilder {

    protected final Map<String, String> toolVersions = new HashMap<>();
    protected final Set<RemoteVersion> remoteVersions = new HashSet<>();
    protected String name = "";
    protected String gameVersion = "";

    public String getName() {
        return name;
    }

    /**
     * The new game version name, for .minecraft/&lt;version name&gt;.
     *
     * @param name the name of new game version.
     */
    public GameBuilder name(String name) {
        this.name = Objects.requireNonNull(name);
        return this;
    }

    public GameBuilder gameVersion(String version) {
        this.gameVersion = Objects.requireNonNull(version);
        return this;
    }

    /**
     * @param id      the core library id. i.e. "forge", "liteloader", "optifine"
     * @param version the version of the core library. For documents, you can first try [VersionList.versions]
     */
    public GameBuilder version(String id, String version) {
        if ("game".equals(id))
            gameVersion(version);
        else
            toolVersions.put(id, version);
        return this;
    }

    public GameBuilder version(RemoteVersion remoteVersion) {
        remoteVersions.add(remoteVersion);
        return this;
    }

    /**
     * @return the task that can build thw whole Minecraft environment
     */
    public abstract Task<?> buildAsync();
}
