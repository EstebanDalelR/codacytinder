package com.google.android.gms.ads;

import android.content.Context;
import android.support.annotation.RequiresPermission;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.internal.akg;
import com.google.android.gms.internal.hx;
import com.google.android.gms.internal.zzje;

/* renamed from: com.google.android.gms.ads.f */
class C2349f extends ViewGroup {
    /* renamed from: a */
    protected final akg f7049a;

    public C2349f(Context context, int i) {
        super(context);
        this.f7049a = new akg(this, i);
    }

    /* renamed from: a */
    public void mo2457a() {
        this.f7049a.i();
    }

    @RequiresPermission("android.permission.INTERNET")
    /* renamed from: a */
    public void mo2458a(C2342c c2342c) {
        this.f7049a.a(c2342c.m8561a());
    }

    /* renamed from: b */
    public void mo2459b() {
        this.f7049a.h();
    }

    /* renamed from: c */
    public void mo2460c() {
        this.f7049a.a();
    }

    public C2338a getAdListener() {
        return this.f7049a.b();
    }

    public C2343d getAdSize() {
        return this.f7049a.c();
    }

    public String getAdUnitId() {
        return this.f7049a.e();
    }

    public String getMediationAdapterClassName() {
        return this.f7049a.j();
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null && childAt.getVisibility() != 8) {
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            i3 = ((i3 - i) - measuredWidth) / 2;
            i4 = ((i4 - i2) - measuredHeight) / 2;
            childAt.layout(i3, i4, measuredWidth + i3, measuredHeight + i4);
        }
    }

    protected void onMeasure(int i, int i2) {
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

    public void setAdListener(C2338a c2338a) {
        this.f7049a.a(c2338a);
        if (c2338a == null) {
            this.f7049a.a(null);
            this.f7049a.a(null);
            return;
        }
        if (c2338a instanceof zzje) {
            this.f7049a.a((zzje) c2338a);
        }
        if (c2338a instanceof AppEventListener) {
            this.f7049a.a((AppEventListener) c2338a);
        }
    }

    public void setAdSize(C2343d c2343d) {
        this.f7049a.a(new C2343d[]{c2343d});
    }

    public void setAdUnitId(String str) {
        this.f7049a.a(str);
    }
}
