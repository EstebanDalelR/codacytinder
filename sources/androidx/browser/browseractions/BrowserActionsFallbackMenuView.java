package androidx.browser.browseractions;

import android.content.Context;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import android.support.customtabs.C0169g.C0168a;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.LinearLayout;

@RestrictTo({Scope.LIBRARY_GROUP})
public class BrowserActionsFallbackMenuView extends LinearLayout {
    /* renamed from: a */
    private final int f2022a = getResources().getDimensionPixelOffset(C0168a.browser_actions_context_menu_min_padding);
    /* renamed from: b */
    private final int f2023b = getResources().getDimensionPixelOffset(C0168a.browser_actions_context_menu_max_width);

    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.f2022a * 2), this.f2023b), 1073741824), i2);
    }
}
