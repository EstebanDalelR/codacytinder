package com.tinder.recs.view;

import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\r"}, d2 = {"com/tinder/recs/view/SettingsShortcutDialog$seekBarChangeListener$1", "Landroid/widget/SeekBar$OnSeekBarChangeListener;", "(Lcom/tinder/recs/view/SettingsShortcutDialog;)V", "onProgressChanged", "", "seekBar", "Landroid/widget/SeekBar;", "progress", "", "isChangeByUser", "", "onStartTrackingTouch", "onStopTrackingTouch", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class SettingsShortcutDialog$seekBarChangeListener$1 implements OnSeekBarChangeListener {
    final /* synthetic */ SettingsShortcutDialog this$0;

    public void onStartTrackingTouch(@NotNull SeekBar seekBar) {
        C2668g.b(seekBar, "seekBar");
    }

    public void onStopTrackingTouch(@NotNull SeekBar seekBar) {
        C2668g.b(seekBar, "seekBar");
    }

    SettingsShortcutDialog$seekBarChangeListener$1(SettingsShortcutDialog settingsShortcutDialog) {
        this.this$0 = settingsShortcutDialog;
    }

    public void onProgressChanged(@NotNull SeekBar seekBar, int i, boolean z) {
        C2668g.b(seekBar, "seekBar");
        this.this$0.getPresenter$Tinder_release().onDistanceChanged(Math.max(true, i));
    }
}
