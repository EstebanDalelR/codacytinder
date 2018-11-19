package com.tinder.recs.view;

import com.tinder.recs.model.AgeConfig;
import com.tinder.views.RangeSeekBar;
import com.tinder.views.RangeSeekBar.OnRangeSeekBarChangeListener;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0016\u0010\u0002\u001a\u0012\u0012\u0002\b\u0003 \u0004*\b\u0012\u0002\b\u0003\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u00062\u000e\u0010\u0007\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Lcom/tinder/views/RangeSeekBar;", "kotlin.jvm.PlatformType", "minValue", "", "maxValue", "onRangeSeekBarValuesChanged", "(Lcom/tinder/views/RangeSeekBar;Ljava/lang/Integer;Ljava/lang/Integer;)V"}, k = 3, mv = {1, 1, 10})
final class SettingsShortcutDialog$rangeSeekBarChangeListener$1<T> implements OnRangeSeekBarChangeListener<Integer> {
    final /* synthetic */ SettingsShortcutDialog this$0;

    SettingsShortcutDialog$rangeSeekBarChangeListener$1(SettingsShortcutDialog settingsShortcutDialog) {
        this.this$0 = settingsShortcutDialog;
    }

    public final void onRangeSeekBarValuesChanged(RangeSeekBar<?> rangeSeekBar, Integer num, Integer num2) {
        rangeSeekBar = this.this$0.getPresenter$Tinder_release();
        C2668g.a(num, "minValue");
        num = num.intValue();
        C2668g.a(num2, "maxValue");
        rangeSeekBar.onAgeChanged(new AgeConfig(num, num2.intValue()));
    }
}
