package org.koishi.launcher.h2co3.ui.download;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import org.koishi.launcher.h2co3.R;
import org.koishi.launcher.h2co3.util.ModTranslations;
import org.koishi.launcher.h2co3core.mod.RemoteMod;
import org.koishi.launcher.h2co3library.component.H2CO3LauncherAdapter;
import org.koishi.launcher.h2co3core.util.LocaleUtils;

import org.koishi.launcher.h2co3library.component.view.H2CO3LauncherLinearLayout;
import org.koishi.launcher.h2co3library.component.view.H2CO3LauncherTextView;
import org.koishi.launcher.h2co3library.util.ConvertUtils;

import java.util.List;

public class DependencyAdapter extends H2CO3LauncherAdapter {

    private final DownloadPage downloadPage;
    private final List<RemoteMod> list;
    private final Callback callback;

    public DependencyAdapter(Context context, DownloadPage page, List<RemoteMod> list, Callback callback) {
        super(context);
        this.downloadPage = page;
        this.list = list;
        this.callback = callback;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @SuppressLint({"UseCompatLoadingForDrawables", "SetTextI18n"})
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        final ViewHolder viewHolder;
        if (view == null) {
            viewHolder = new ViewHolder();
            view = new H2CO3LauncherLinearLayout(getContext());
            viewHolder.parent = new H2CO3LauncherLinearLayout(getContext());
            viewHolder.name = new H2CO3LauncherTextView(getContext());
            ((H2CO3LauncherLinearLayout) view).addView(viewHolder.parent, new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
            int padding = ConvertUtils.dip2px(getContext(), 10);
            viewHolder.parent.setPadding(padding, padding, padding, padding);
            viewHolder.parent.setBackground(getContext().getDrawable(R.drawable.bg_container_transparent_clickable));
            viewHolder.parent.addView(viewHolder.name, new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
            viewHolder.name.setSingleLine(true);
            viewHolder.name.setAutoTint(true);
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }
        RemoteMod remoteMod = list.get(i);
        viewHolder.parent.setOnClickListener(v -> callback.onItemSelect(remoteMod));
        ModTranslations.Mod mod = ModTranslations.getTranslationsByRepositoryType(downloadPage.repository.getType()).getModByCurseForgeId(remoteMod.getSlug());
        viewHolder.name.setText(getContext().getString(R.string.mods_dependency) + ": " + (mod != null && LocaleUtils.isChinese(getContext()) ? mod.getDisplayName() : remoteMod.getTitle()));
        return view;
    }

    public interface Callback {
        void onItemSelect(RemoteMod mod);
    }

    private static class ViewHolder {
        H2CO3LauncherLinearLayout parent;
        H2CO3LauncherTextView name;
    }
}
