package org.koishi.launcher.h2co3.ui.fragment.download;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.progressindicator.LinearProgressIndicator;

import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.koishi.launcher.h2co3.R;
import org.koishi.launcher.h2co3.resources.component.H2CO3CardView;
import org.koishi.launcher.h2co3.resources.component.H2CO3TextView;
import org.koishi.launcher.h2co3.resources.component.adapter.H2CO3RecycleAdapter;
import org.koishi.launcher.h2co3.ui.fragment.H2CO3Fragment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

public class MinecraftVersionListFragment extends H2CO3Fragment {

    private final ExecutorService executor = Executors.newSingleThreadExecutor();
    private final Handler uiHandler = new Handler(Looper.getMainLooper());
    private final List<Version> versionList = new ArrayList<>();
    private final List<Version> filteredList = new ArrayList<>();
    private RecyclerView recyclerView;
    private VersionAdapter versionAdapter;
    private RadioGroup typeRadioGroup;
    private LinearProgressIndicator progressIndicator;
    private LinearLayoutCompat eMessageLayout;
    private AppCompatImageButton eMessageImageButton;
    private H2CO3TextView eMessageText;
    private volatile boolean isFetching = false;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_download_minecraft_list, container, false);
        initView(view);
        initListeners();
        versionAdapter = new VersionAdapter(filteredList, requireActivity());
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(versionAdapter);
        eMessageImageButton.setOnClickListener(v -> refreshVersions());
        fetchVersionsFromApi();
        return view;
    }

    private void initView(View view) {
        eMessageLayout = view.findViewById(R.id.emessage_layout);
        eMessageText = view.findViewById(R.id.emessage_text);
        eMessageImageButton = view.findViewById(R.id.emessage_refresh_button);
        recyclerView = view.findViewById(R.id.loadingversionFileListView1);
        typeRadioGroup = view.findViewById(R.id.typeRadioGroup);
        progressIndicator = view.findViewById(R.id.progressIndicator);
    }

    private void initListeners() {
        typeRadioGroup.setOnCheckedChangeListener((group, checkedId) -> filterVersions(checkedId));
    }

    private void refreshVersions() {
        eMessageLayout.setVisibility(View.GONE);
        progressIndicator.show();
        recyclerView.setVisibility(View.VISIBLE);
        fetchVersionsFromApi();
    }

    private void fetchVersionsFromApi() {
        if (isFetching) return;
        isFetching = true;
        String apiUrl = "https://bmclapi2.bangbang93.com/mc/game/version_manifest_v2.json";
        fetchVersions(apiUrl);
    }

    private void fetchVersions(String apiUrl) {
        executor.execute(() -> {
            HttpURLConnection con = null;
            try {
                URL url = new URL(apiUrl);
                con = (HttpURLConnection) url.openConnection();
                con.setConnectTimeout(5000);
                if (con.getResponseCode() != HttpURLConnection.HTTP_OK) {
                    throw new IOException("HTTP error code: " + con.getResponseCode());
                }
                String response = readStream(con.getInputStream());
                List<Version> versionList = getVersionList(response);
                uiHandler.post(() -> {
                    this.versionList.clear();
                    this.versionList.addAll(versionList);
                    filterVersions(typeRadioGroup.getCheckedRadioButtonId());
                    progressIndicator.hide();
                    isFetching = false;
                });
            } catch (Exception e) {
                uiHandler.post(() -> {
                    eMessageLayout.setVisibility(View.VISIBLE);
                    eMessageText.setText(e.getMessage());
                    progressIndicator.hide();
                    recyclerView.setVisibility(View.GONE);
                    isFetching = false;
                });
            } finally {
                if (con != null) {
                    con.disconnect();
                }
            }
        });
    }

    private String readStream(InputStream inputStream) throws IOException {
        StringBuilder str = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            while ((line = reader.readLine()) != null) {
                str.append(line).append("\n");
            }
        }
        return str.toString();
    }

    private void filterVersions(int checkedId) {
        List<Version> newFilteredList = versionList.stream().filter(version -> {
            String versionType = version.versionType();
            return (checkedId == R.id.rb_release && "release".equals(versionType)) ||
                    (checkedId == R.id.rb_snapshot && "snapshot".equals(versionType)) ||
                    (checkedId == R.id.rb_old_beta && ("old_alpha".equals(versionType) || "old_beta".equals(versionType)));
        }).collect(Collectors.toList());

        int oldSize = filteredList.size();
        int newSize = newFilteredList.size();

        filteredList.clear();
        filteredList.addAll(newFilteredList);

        if (oldSize > newSize) {
            versionAdapter.notifyItemRangeRemoved(newSize, oldSize - newSize);
        } else if (oldSize < newSize) {
            versionAdapter.notifyItemRangeInserted(oldSize, newSize - oldSize);
        }

        for (int i = 0; i < Math.min(oldSize, newSize); i++) {
            versionAdapter.notifyItemChanged(i);
        }
    }

    @NotNull
    private List<Version> getVersionList(String response) throws JSONException {
        JSONObject jsonObject = new JSONObject(response);
        JSONArray versionsArray = jsonObject.getJSONArray("versions");
        List<Version> versionList = new ArrayList<>();
        for (int i = 0; i < versionsArray.length(); i++) {
            JSONObject versionObject = versionsArray.getJSONObject(i);
            versionList.add(new Version(versionObject.getString("id"), versionObject.getString("type"),
                    versionObject.getString("url"), versionObject.getString("sha1")));
        }
        return versionList;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        executor.shutdown();
    }

    public record Version(String versionName, String versionType, String versionUrl,
                          String versionSha1) {
    }

    class VersionAdapter extends H2CO3RecycleAdapter<Version> {

        public VersionAdapter(List<Version> versionList, Context context) {
            super(versionList, context);
        }

        @NonNull
        @Override
        public BaseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_version, parent, false);
            return new ViewHolder(view);
        }

        @Override
        protected void bindData(BaseViewHolder holder, int position) {
            Version version = data.get(position);
            ViewHolder viewHolder = (ViewHolder) holder;
            viewHolder.versionNameTextView.setText(version.versionName());
            viewHolder.versionTypeTextView.setText(version.versionType());
        }

        @Override
        public int getLayoutId() {
            return R.layout.item_version;
        }

        public class ViewHolder extends BaseViewHolder implements View.OnClickListener {
            public TextView versionNameTextView;
            public TextView versionTypeTextView;
            public H2CO3CardView versionCardView;

            public ViewHolder(View itemView) {
                super(itemView);
                versionNameTextView = itemView.findViewById(R.id.id);
                versionTypeTextView = itemView.findViewById(R.id.type);
                versionCardView = itemView.findViewById(R.id.download_ver_item);
                versionCardView.setOnClickListener(this);
            }

            @Override
            public void onClick(View v) {
                int position = getBindingAdapterPosition();
                if (position != RecyclerView.NO_POSITION) {
                    Version version = data.get(position);
                    Bundle bundle = new Bundle();
                    bundle.putString("versionName", version.versionName());
                    EditDownloadInfoFragment editDownloadInfoFragment = new EditDownloadInfoFragment(MinecraftVersionListFragment.this, bundle);
                    getParentFragmentManager().beginTransaction()
                            .setCustomAnimations(org.koishi.launcher.h2co3.library.R.anim.fragment_enter,
                                    org.koishi.launcher.h2co3.library.R.anim.fragment_exit,
                                    org.koishi.launcher.h2co3.library.R.anim.fragment_enter_pop,
                                    org.koishi.launcher.h2co3.library.R.anim.fragment_exit_pop)
                            .add(R.id.downloadFragmentContainerView, editDownloadInfoFragment)
                            .hide(MinecraftVersionListFragment.this)
                            .commit();
                }
            }
        }
    }
}