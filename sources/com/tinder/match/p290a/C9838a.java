package com.tinder.match.p290a;

import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.support.design.widget.TabLayout;
import android.support.v4.content.res.C0441a;
import android.widget.LinearLayout;
import com.tinder.R;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/tinder/match/decorator/TabLayoutDecorator;", "", "()V", "insertDivider", "", "tabLayout", "Landroid/support/design/widget/TabLayout;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.match.a.a */
public final class C9838a {
    /* renamed from: a */
    public final void m40519a(@NotNull TabLayout tabLayout) {
        C2668g.b(tabLayout, "tabLayout");
        Resources resources = tabLayout.getResources();
        tabLayout = tabLayout.getChildAt(0);
        if (tabLayout == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        LinearLayout linearLayout = (LinearLayout) tabLayout;
        linearLayout.setShowDividers(2);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(C0441a.b(resources, R.color.tab_divider_grey, null));
        gradientDrawable.setSize(resources.getDimensionPixelSize(R.dimen.space_xxxs), resources.getDimensionPixelSize(R.dimen.space_xxxxs));
        linearLayout.setDividerPadding(resources.getDimensionPixelSize(R.dimen.tab_divider_padding));
        linearLayout.setDividerDrawable(gradientDrawable);
    }
}
