package com.facebook.ads.internal.view.component.p055a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.adapters.C1359i;
import com.facebook.ads.internal.p041h.C1425f;
import com.facebook.ads.internal.p047k.an;
import com.facebook.ads.internal.view.C1604d.C1603a;

/* renamed from: com.facebook.ads.internal.view.component.a.a */
public class C3366a extends C1593b {
    public C3366a(Context context, C1425f c1425f, C1603a c1603a, View view, @Nullable View view2, @Nullable View view3, int i, C1359i c1359i, boolean z) {
        Context context2 = context;
        View view4 = view2;
        View view5 = view3;
        super(context2, c1425f, c1603a, c1359i, true);
        View relativeLayout = new RelativeLayout(context2);
        LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        Drawable gradientDrawable = new GradientDrawable(Orientation.BOTTOM_TOP, new int[]{-1778384896, 0});
        gradientDrawable.setCornerRadius(0.0f);
        gradientDrawable.setGradientType(0);
        an.m5205a(relativeLayout, gradientDrawable);
        View linearLayout = new LinearLayout(context2);
        linearLayout.setOrientation(z ^ 1);
        linearLayout.setGravity(80);
        an.m5203a(linearLayout);
        LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(a, 0, a, view4 == null ? a : a / 2);
        LayoutParams layoutParams3 = new LinearLayout.LayoutParams(z ? -2 : -1, -2);
        layoutParams3.setMargins(z ? a : 0, z ? 0 : a, 0, 0);
        LayoutParams layoutParams4 = new LinearLayout.LayoutParams(z ? 0 : -1, -2);
        layoutParams4.setMargins(0, 0, 0, 0);
        layoutParams4.weight = 1.0f;
        linearLayout.addView(getTextContainer(), layoutParams4);
        linearLayout.addView(getCtaButton(), layoutParams3);
        relativeLayout.addView(linearLayout, layoutParams2);
        if (view4 != null) {
            layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams2.setMargins(0, 0, 0, 0);
            layoutParams2.addRule(3, linearLayout.getId());
            relativeLayout.addView(view4, layoutParams2);
        }
        addView(view, new RelativeLayout.LayoutParams(-1, -1));
        addView(relativeLayout, layoutParams);
        if (view5 != null) {
            LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(b, b);
            layoutParams5.addRule(10);
            layoutParams5.addRule(11);
            layoutParams5.setMargins(a, a + i, a, a);
            addView(view5, layoutParams5);
        }
    }

    /* renamed from: a */
    public boolean mo1814a() {
        return true;
    }
}
