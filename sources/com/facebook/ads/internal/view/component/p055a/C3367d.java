package com.facebook.ads.internal.view.component.p055a;

import android.content.Context;
import android.content.res.Resources;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.adapters.C1359i;
import com.facebook.ads.internal.p041h.C1425f;
import com.facebook.ads.internal.view.C1604d.C1603a;

/* renamed from: com.facebook.ads.internal.view.component.a.d */
public class C3367d extends C1593b {
    /* renamed from: c */
    private static final int f10233c = Resources.getSystem().getDisplayMetrics().widthPixels;
    /* renamed from: d */
    private final C1595e f10234d;

    public C3367d(Context context, C1425f c1425f, C1603a c1603a, View view, @Nullable View view2, @Nullable View view3, boolean z, C1359i c1359i) {
        super(context, c1425f, c1603a, c1359i, z);
        this.f10234d = new C1595e(context, view);
        this.f10234d.m5464a(view2, view3, getTextContainer(), z);
        LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        layoutParams.setMargins(a, a, a, a);
        getCtaButton().setLayoutParams(layoutParams);
        View frameLayout = new FrameLayout(context);
        LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(2, getCtaButton().getId());
        frameLayout.setLayoutParams(layoutParams2);
        layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams2.gravity = 17;
        layoutParams2.setMargins(a, 0, a, 0);
        frameLayout.addView(this.f10234d, layoutParams2);
        addView(frameLayout);
        addView(getCtaButton());
    }

    /* renamed from: a */
    public void mo1815a(String str, String str2, String str3, String str4, String str5, double d) {
        super.mo1815a(str, str2, str3, str4, str5, d);
        if (d > 0.0d) {
            this.f10234d.m5463a((int) (d * ((double) (f10233c - (a * 2)))));
        }
    }

    /* renamed from: a */
    public boolean mo1814a() {
        return false;
    }

    /* renamed from: b */
    protected boolean mo1816b() {
        return false;
    }

    /* renamed from: c */
    protected boolean mo1817c() {
        return false;
    }
}
