package com.google.android.gms.ads.doubleclick;

import android.content.Context;
import android.support.annotation.RequiresPermission;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.C2338a;
import com.google.android.gms.ads.C2343d;
import com.google.android.gms.ads.C2362g;
import com.google.android.gms.ads.C2412j;
import com.google.android.gms.ads.C2414k;
import com.google.android.gms.internal.akg;
import com.google.android.gms.internal.hx;

/* renamed from: com.google.android.gms.ads.doubleclick.b */
public final class C2346b extends ViewGroup {
    /* renamed from: a */
    private final akg f7048a = new akg(this);

    public C2346b(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void m8573a() {
        this.f7048a.a();
    }

    @RequiresPermission("android.permission.INTERNET")
    /* renamed from: a */
    public final void m8574a(C2345a c2345a) {
        this.f7048a.a(c2345a.m8572a());
    }

    /* renamed from: b */
    public final void m8575b() {
        this.f7048a.h();
    }

    /* renamed from: c */
    public final void m8576c() {
        this.f7048a.i();
    }

    public final C2338a getAdListener() {
        return this.f7048a.b();
    }

    public final C2343d getAdSize() {
        return this.f7048a.c();
    }

    public final C2343d[] getAdSizes() {
        return this.f7048a.d();
    }

    public final String getAdUnitId() {
        return this.f7048a.e();
    }

    public final AppEventListener getAppEventListener() {
        return this.f7048a.f();
    }

    public final String getMediationAdapterClassName() {
        return this.f7048a.j();
    }

    public final OnCustomRenderedAdLoadedListener getOnCustomRenderedAdLoadedListener() {
        return this.f7048a.g();
    }

    public final C2412j getVideoController() {
        return this.f7048a.k();
    }

    public final C2414k getVideoOptions() {
        return this.f7048a.m();
    }

    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null && childAt.getVisibility() != 8) {
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            i3 = ((i3 - i) - measuredWidth) / 2;
            i4 = ((i4 - i2) - measuredHeight) / 2;
            childAt.layout(i3, i4, measuredWidth + i3, measuredHeight + i4);
        }
    }

    protected final void onMeasure(int i, int i2) {
        int a;
        int i3 = 0;
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            C2343d c2343d = null;
            try {
                c2343d = getAdSize();
            } catch (Throwable e) {
                hx.b("Unable to retrieve ad size.", e);
            }
            if (c2343d != null) {
                Context context = getContext();
                int b = c2343d.m8565b(context);
                a = c2343d.m8563a(context);
                i3 = b;
            } else {
                a = 0;
            }
        } else {
            measureChild(childAt, i, i2);
            i3 = childAt.getMeasuredWidth();
            a = childAt.getMeasuredHeight();
        }
        setMeasuredDimension(View.resolveSize(Math.max(i3, getSuggestedMinimumWidth()), i), View.resolveSize(Math.max(a, getSuggestedMinimumHeight()), i2));
    }

    public final void setAdListener(C2338a c2338a) {
        this.f7048a.a(c2338a);
    }

    public final void setAdSizes(C2343d... c2343dArr) {
        if (c2343dArr != null) {
            if (c2343dArr.length > 0) {
                this.f7048a.b(c2343dArr);
                return;
            }
        }
        throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
    }

    public final void setAdUnitId(String str) {
        this.f7048a.a(str);
    }

    public final void setAppEventListener(AppEventListener appEventListener) {
        this.f7048a.a(appEventListener);
    }

    public final void setCorrelator(C2362g c2362g) {
        this.f7048a.a(c2362g);
    }

    public final void setManualImpressionsEnabled(boolean z) {
        this.f7048a.a(z);
    }

    public final void setOnCustomRenderedAdLoadedListener(OnCustomRenderedAdLoadedListener onCustomRenderedAdLoadedListener) {
        this.f7048a.a(onCustomRenderedAdLoadedListener);
    }

    public final void setVideoOptions(C2414k c2414k) {
        this.f7048a.a(c2414k);
    }
}
