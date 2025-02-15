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

import org.koishi.launcher.h2co3.core.utils.NetworkUtils;

import java.net.URL;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * The service provider that provides Minecraft online file downloads.
 */
public interface DownloadProvider {

    String getVersionListURL();

    String getAssetBaseURL();

    default List<URL> getAssetObjectCandidates(String assetObjectLocation) {
        return Collections.singletonList(NetworkUtils.toURL(getAssetBaseURL() + assetObjectLocation));
    }

    /**
     * 注入到由Mojang和Forge提供的原始URL中。
     * <p>
     * 由于有许多提供的URL是以JSON格式编写且不可修改的，
     * 此方法提供了一种更改它们的方式。
     *
     * @param baseURL 由Mojang和Forge提供的原始URL。
     * @return 与[baseURL]等效但属于您自己的服务提供商的URL。
     */
    String injectURL(String baseURL);

    /**
     * Inject into original URL provided by Mojang and Forge.
     * <p>
     * Since there are many provided URLs that are written in JSONs and are unmodifiable,
     * this method provides a way to change them.
     *
     * @param baseURL original URL provided by Mojang and Forge.
     * @return the URL that is equivalent to [baseURL], but belongs to your own service provider.
     */
    default List<URL> injectURLWithCandidates(String baseURL) {
        return Collections.singletonList(NetworkUtils.toURL(injectURL(baseURL)));
    }

    default List<URL> injectURLsWithCandidates(List<String> urls) {
        return urls.stream().flatMap(url -> injectURLWithCandidates(url).stream()).collect(Collectors.toList());
    }

    /**
     * the specific version list that this download provider provides. i.e. "fabric", "forge", "liteloader", "game", "optifine"
     *
     * @param id the id of specific version list that this download provider provides. i.e. "fabric", "forge", "liteloader", "game", "optifine"
     * @return the version list
     * @throws IllegalArgumentException if the version list does not exist
     */
    VersionList<?> getVersionListById(String id);

    /**
     * The maximum download concurrency that this download provider supports.
     *
     * @return the maximum download concurrency.
     */
    int getConcurrency();
}
