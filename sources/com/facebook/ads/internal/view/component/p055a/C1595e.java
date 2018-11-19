package com.facebook.ads.internal.view.component.p055a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.facebook.ads.internal.p047k.an;
import com.facebook.ads.internal.view.component.C1599e;
import com.facebook.ads.internal.view.component.C1602h;

/* renamed from: com.facebook.ads.internal.view.component.a.e */
final class C1595e extends RelativeLayout {
    /* renamed from: a */
    private final View f4417a;
    /* renamed from: b */
    private final C1599e f4418b;

    public C1595e(Context context, View view) {
        super(context);
        this.f4417a = view;
        this.f4418b = new C1599e(context);
        an.m5203a(this.f4418b);
    }

    /* renamed from: a */
    public void m5463a(int i) {
        this.f4417a.setLayoutParams(new LayoutParams(-1, i));
    }

    /* renamed from: a */
    public void m5464a(@Nullable View view, @Nullable View view2, @Nullable C1602h c1602h, boolean z) {
        ViewGroup.LayoutParams layoutParams;
        this.f4418b.addView(this.f4417a, new LayoutParams(-1, -2));
        if (view2 != null) {
            layoutParams = new LayoutParams(C1593b.f4412b, C1593b.f4412b);
            layoutParams.addRule(6, this.f4417a.getId());
            layoutParams.addRule(7, this.f4417a.getId());
            layoutParams.setMargins(C1593b.f4411a, C1593b.f4411a, C1593b.f4411a, C1593b.f4411a);
            this.f4418b.addView(view2, layoutParams);
        }
        view2 = new LinearLayout(getContext());
        view2.setOrientation(1);
        layoutParams = new LayoutParams(-1, -2);
        layoutParams.addRule(8, this.f4417a.getId());
        if (c1602h != null) {
            ViewGroup.LayoutParams layoutParams2;
            if (z) {
                layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                c1602h.setAlignment(3);
                layoutParams2.setMargins(C1593b.f4411a / 2, C1593b.f4411a / 2, C1593b.f4411a / 2, C1593b.f4411a / 2);
                view2.addView(c1602h, layoutParams2);
                Drawable gradientDrawable = new GradientDrawable(Orientation.BOTTOM_TOP, new int[]{-1778384896, 0});
                gradientDrawable.setCornerRadius(0.0f);
                gradientDrawable.setGradientType(0);
                an.m5205a(view2, gradientDrawable);
            } else {
                layoutParams2 = new LayoutParams(-1, -2);
                layoutParams2.addRule(3, this.f4418b.getId());
                layoutParams2.setMargins(0, C1593b.f4411a, 0, 0);
                c1602h.setAlignment(17);
                addView(c1602h, layoutParams2);
            }
        }
        if (view != null) {
            view2.addView(view, new LayoutParams(-1, -2));
        }
        this.f4418b.addView(view2, layoutParams);
        addView(this.f4418b, new LayoutParams(-1, -2));
    }
}
