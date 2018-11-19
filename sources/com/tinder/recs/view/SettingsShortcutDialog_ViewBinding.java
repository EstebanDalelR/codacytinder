package com.tinder.recs.view;

import android.content.res.Resources;
import android.support.annotation.UiThread;
import android.support.v4.content.C0432b;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.C0759a;
import butterknife.internal.C0761c;
import com.tinder.R;

public final class SettingsShortcutDialog_ViewBinding implements Unbinder {
    private SettingsShortcutDialog target;
    private View view2131362028;
    private View view2131363920;

    @UiThread
    public SettingsShortcutDialog_ViewBinding(SettingsShortcutDialog settingsShortcutDialog) {
        this(settingsShortcutDialog, settingsShortcutDialog.getWindow().getDecorView());
    }

    @UiThread
    public SettingsShortcutDialog_ViewBinding(final SettingsShortcutDialog settingsShortcutDialog, View view) {
        this.target = settingsShortcutDialog;
        settingsShortcutDialog.agePrefsContainer = (FrameLayout) C0761c.b(view, R.id.layout_age, "field 'agePrefsContainer'", FrameLayout.class);
        settingsShortcutDialog.textYears = (TextView) C0761c.b(view, R.id.textView_years, "field 'textYears'", TextView.class);
        settingsShortcutDialog.seekBarDistance = (SeekBar) C0761c.b(view, R.id.seekBar_distance, "field 'seekBarDistance'", SeekBar.class);
        settingsShortcutDialog.textDistance = (TextView) C0761c.b(view, R.id.textView_distance, "field 'textDistance'", TextView.class);
        settingsShortcutDialog.cardView = (CardView) C0761c.b(view, R.id.card_view, "field 'cardView'", CardView.class);
        View a = C0761c.a(view, R.id.cancelButton, "method 'cancelDialog$Tinder_release'");
        this.view2131362028 = a;
        a.setOnClickListener(new C0759a() {
            public void doClick(View view) {
                settingsShortcutDialog.cancelDialog$Tinder_release();
            }
        });
        a = C0761c.a(view, R.id.updateButton, "method 'saveDiscoveryPref$Tinder_release'");
        this.view2131363920 = a;
        a.setOnClickListener(new C0759a() {
            public void doClick(View view) {
                settingsShortcutDialog.saveDiscoveryPref$Tinder_release();
            }
        });
        view = view.getContext();
        Resources resources = view.getResources();
        settingsShortcutDialog.sliderColor = C0432b.c(view, R.color.gray_background_light);
        settingsShortcutDialog.thumbColor = C0432b.c(view, R.color.tinder_red);
        settingsShortcutDialog.sliderLineWidth = resources.getDimensionPixelSize(R.dimen.slider_line_width);
        settingsShortcutDialog.seekBarThumb = C0432b.a(view, R.drawable.seekbar_thumb);
        settingsShortcutDialog.seekBarThumbSelected = C0432b.a(view, R.drawable.seekbar_thumb_selected);
    }

    public void unbind() {
        SettingsShortcutDialog settingsShortcutDialog = this.target;
        if (settingsShortcutDialog == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.target = null;
        settingsShortcutDialog.agePrefsContainer = null;
        settingsShortcutDialog.textYears = null;
        settingsShortcutDialog.seekBarDistance = null;
        settingsShortcutDialog.textDistance = null;
        settingsShortcutDialog.cardView = null;
        this.view2131362028.setOnClickListener(null);
        this.view2131362028 = null;
        this.view2131363920.setOnClickListener(null);
        this.view2131363920 = null;
    }
}
