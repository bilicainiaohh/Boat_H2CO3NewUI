package org.koishi.launcher.h2co3library.browser;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;

import org.koishi.launcher.h2co3library.R;
import org.koishi.launcher.h2co3library.browser.options.LibMode;
import org.koishi.launcher.h2co3library.browser.options.SelectionMode;
import org.koishi.launcher.h2co3library.component.ResultListener;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class FileBrowser implements Serializable {

    public static final String SELECTED_FILES = "SELECTED_FILES";
    private boolean externalSelection = true;
    private LibMode libMode = LibMode.FILE_BROWSER;
    private SelectionMode selectionMode = SelectionMode.SINGLE_SELECTION;
    private String initDir = Environment.getExternalStorageDirectory().getAbsolutePath();
    private ArrayList<String> suffix = new ArrayList<>();
    private String title;
    private int code;
    public FileBrowser(String title) {
        this.title = title;
    }

    public static ArrayList<String> getSelectedFiles(Intent data) {
        if (data == null) {
            return null;
        }
        ArrayList<Uri> selectedFiles  = data.getParcelableArrayListExtra(SELECTED_FILES);
        return (ArrayList<String>) selectedFiles.stream().map(Uri::toString).collect(Collectors.toList());
    }

    public boolean isExternalSelection() {
        return externalSelection;
    }

    public LibMode getLibMode() {
        return libMode;
    }

    public SelectionMode getSelectionMode() {
        return selectionMode;
    }

    public String getInitDir() {
        return initDir;
    }

    public ArrayList<String> getSuffix() {
        return suffix;
    }

    public String getTitle() {
        return title;
    }

    public int getCode() {
        return code;
    }

    public void browse(Activity activity, int code, ResultListener.Listener listener) {
        Intent intent = new Intent(activity, FileBrowserActivity.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("config", this);
        intent.putExtras(bundle);
        this.code = code;
        ResultListener.startActivityForResult(activity, intent, code, listener);
    }

    public static class Builder {

        private final FileBrowser fileBrowser;

        public Builder(Context context) {
            fileBrowser = new FileBrowser(context.getString(R.string.file_browser_title));
        }

        public FileBrowser create() {
            return fileBrowser;
        }

        public boolean isExternalSelection() {
            return fileBrowser.externalSelection;
        }

        public Builder setExternalSelection(boolean externalSelection) {
            fileBrowser.externalSelection = externalSelection;
            return this;
        }

        public LibMode getLibMode() {
            return fileBrowser.libMode;
        }

        public Builder setLibMode(LibMode libMode) {
            fileBrowser.libMode = libMode;
            return this;
        }

        public SelectionMode getSelectionMode() {
            return fileBrowser.selectionMode;
        }

        public Builder setSelectionMode(SelectionMode selectionMode) {
            fileBrowser.selectionMode = selectionMode;
            return this;
        }

        public String getInitDir() {
            return fileBrowser.initDir;
        }

        public Builder setInitDir(String initDir) {
            fileBrowser.initDir = initDir;
            return this;
        }

        public ArrayList<String> getSuffix() {
            return fileBrowser.suffix;
        }

        public Builder setSuffix(ArrayList<String> suffix) {
            fileBrowser.suffix = suffix;
            return this;
        }

        public String getTitle() {
            return fileBrowser.title;
        }

        public Builder setTitle(String title) {
            fileBrowser.title = title;
            return this;
        }

    }

}
