package org.koishi.launcher.h2co3.ui.setting;

import static org.koishi.launcher.h2co3core.util.Lang.tryCast;

import android.content.Context;

import com.google.android.material.tabs.TabLayout;
import org.koishi.launcher.h2co3.R;
import org.koishi.launcher.h2co3.setting.Profiles;
import org.koishi.launcher.h2co3.ui.manage.VersionSettingPage;
import org.koishi.launcher.h2co3core.task.Task;
import org.koishi.launcher.h2co3library.component.ui.H2CO3LauncherBasePage;
import org.koishi.launcher.h2co3library.component.ui.H2CO3LauncherMultiPageUI;
import org.koishi.launcher.h2co3library.component.view.H2CO3LauncherTabLayout;
import org.koishi.launcher.h2co3library.component.view.H2CO3LauncherUILayout;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Collectors;

public class SettingUI extends H2CO3LauncherMultiPageUI implements TabLayout.OnTabSelectedListener {

    private SettingPageManager pageManager;

    private H2CO3LauncherUILayout container;

    public SettingUI(Context context, H2CO3LauncherUILayout parent, int id) {
        super(context, parent, id);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        H2CO3LauncherTabLayout tabLayout = findViewById(R.id.tab_layout);
        container = findViewById(R.id.container);

        tabLayout.addOnTabSelectedListener(this);
        container.post(this::initPages);
    }

    @Override
    public void onStart() {
        super.onStart();
        if (pageManager != null) {
            ((VersionSettingPage) pageManager.getPageById(SettingPageManager.PAGE_ID_SETTING_GAME)).loadVersion(Profiles.getSelectedProfile(), null);
        }
    }

    @Override
    public void onBackPressed() {
        if (pageManager != null && pageManager.canReturn()) {
            pageManager.dismissCurrentTempPage();
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public void onPause() {
        super.onPause();
        if (pageManager != null) {
            pageManager.onPause();
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        if (pageManager != null) {
            pageManager.onResume();
        }
    }

    @Override
    public void initPages() {
        pageManager = new SettingPageManager(getContext(), container, SettingPageManager.PAGE_ID_SETTING_GAME, null);
    }

    @Override
    public ArrayList<H2CO3LauncherBasePage> getAllPages() {
        return pageManager == null ? null : (ArrayList<H2CO3LauncherBasePage>) pageManager.getAllPages().stream().map(it -> tryCast(it, H2CO3LauncherBasePage.class)).filter(Optional::isPresent).map(Optional::get).collect(Collectors.toList());
    }

    @Override
    public H2CO3LauncherBasePage getPage(int id) {
        return pageManager == null ? null : pageManager.getPageById(id);
    }

    @Override
    public Task<?> refresh(Object... param) {
        return null;
    }

    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        if (pageManager != null) {
            switch (tab.getPosition()) {
                case 1:
                    pageManager.switchPage(SettingPageManager.PAGE_ID_SETTING_LAUNCHER);
                    break;
                case 2:
                    pageManager.switchPage(SettingPageManager.PAGE_ID_SETTING_HELP);
                    break;
                case 3:
                    pageManager.switchPage(SettingPageManager.PAGE_ID_SETTING_COMMUNITY);
                    break;
                case 4:
                    pageManager.switchPage(SettingPageManager.PAGE_ID_SETTING_ABOUT);
                    break;
                default:
                    pageManager.switchPage(SettingPageManager.PAGE_ID_SETTING_GAME);
                    ((VersionSettingPage) pageManager.getPageById(SettingPageManager.PAGE_ID_SETTING_GAME)).loadVersion(Profiles.getSelectedProfile(), null);
                    break;
            }
        }
    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }
}
