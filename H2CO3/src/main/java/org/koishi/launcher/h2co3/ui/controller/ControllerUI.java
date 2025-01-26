package org.koishi.launcher.h2co3.ui.controller;

import static org.koishi.launcher.h2co3core.util.Lang.tryCast;

import android.content.Context;

import org.koishi.launcher.h2co3.R;
import org.koishi.launcher.h2co3core.task.Task;
import org.koishi.launcher.h2co3library.component.ui.H2CO3LauncherBasePage;
import org.koishi.launcher.h2co3library.component.ui.H2CO3LauncherMultiPageUI;
import org.koishi.launcher.h2co3library.component.view.H2CO3LauncherUILayout;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Collectors;

public class ControllerUI extends H2CO3LauncherMultiPageUI {

    private ControllerPageManager pageManager;

    private H2CO3LauncherUILayout container;

    public ControllerUI(Context context, H2CO3LauncherUILayout parent, int id) {
        super(context, parent, id);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        container = findViewById(R.id.container);
        container.post(this::initPages);
    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onBackPressed() {
        if (pageManager != null && pageManager.canReturn()) {
            pageManager.dismissCurrentTempPage();
        } else if (pageManager != null && pageManager.getCurrentPage() instanceof ControllerRepoPage) {
            pageManager.switchPage(ControllerPageManager.PAGE_ID_CONTROLLER_MANAGER);
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
        pageManager = new ControllerPageManager(getContext(), container, ControllerPageManager.PAGE_ID_CONTROLLER_MANAGER, null);
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

    public ControllerPageManager getPageManager() {
        return pageManager;
    }
}
