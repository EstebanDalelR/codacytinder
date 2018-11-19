package com.tinder.settings.views;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/CompoundButton;", "kotlin.jvm.PlatformType", "isChecked", "", "onCheckedChanged"}, k = 3, mv = {1, 1, 10})
final class SwitchRowView$b implements OnCheckedChangeListener {
    /* renamed from: a */
    final /* synthetic */ SwitchRowView$CheckStatusListener f46612a;

    SwitchRowView$b(SwitchRowView$CheckStatusListener switchRowView$CheckStatusListener) {
        this.f46612a = switchRowView$CheckStatusListener;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (z) {
            this.f46612a.onChecked();
        } else {
            this.f46612a.onUnChecked();
        }
    }
}
