package org.koishi.launcher.h2co3.resources.component.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.android.material.checkbox.MaterialCheckBox;

import org.koishi.launcher.h2co3.library.R;
import org.koishi.launcher.h2co3.resources.component.H2CO3CardView;

public class H2CO3CheckBoxPreference extends H2CO3CardView {

    private MaterialCheckBox checkBox;
    private TextView titleView;
    private H2CO3CardView rootView;
    private String key;
    private boolean isChecked;
    // The preference change listener
    private OnPreferenceChangeListener onPreferenceChangeListener;

    public H2CO3CheckBoxPreference(@NonNull Context context) {
        this(context, null);
    }

    public H2CO3CheckBoxPreference(@NonNull Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public H2CO3CheckBoxPreference(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs);
    }

    private void init(Context context, AttributeSet attrs) {
        // Inflate the custom layout
        LayoutInflater.from(context).inflate(R.layout.preference_custom_checkbox, this, true);
        setBackgroundResource(android.R.color.transparent);
        setStrokeWidth(0);

        // Initialize views
        checkBox = findViewById(R.id.checkBox);
        titleView = findViewById(R.id.textViewTitle);
        rootView = findViewById(R.id.root_view);

        // Set up the click listener for the card
        rootView.setOnClickListener(v -> checkBox.toggle());

        // Set up the compound button change listener
        checkBox.setOnCheckedChangeListener((buttonView, isChecked) -> {
            this.isChecked = isChecked;
            if (onPreferenceChangeListener != null) {
                onPreferenceChangeListener.onPreferenceChange(this, isChecked);
            }
        });
    }

    // Set the title of the preference
    public void setTitle(String title) {
        titleView.setText(title);
    }

    // Set the key for the preference
    public void setKey(String key) {
        this.key = key;
    }

    // Get the checked state of the checkbox
    public boolean getChecked() {
        return isChecked;
    }

    // Set the checked state of the checkbox
    public void setChecked(boolean checked) {
        checkBox.setChecked(checked);
        isChecked = checked;
    }

    // Set the preference change listener
    public void setOnPreferenceChangeListener(OnPreferenceChangeListener listener) {
        onPreferenceChangeListener = listener;
    }

    // Define the interface for the preference change listener
    public interface OnPreferenceChangeListener {
        void onPreferenceChange(H2CO3CheckBoxPreference preference, boolean newValue);
    }
}