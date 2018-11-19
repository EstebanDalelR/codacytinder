package com.google.android.gms.ads.p068a;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.C2338a;
import com.google.android.gms.ads.C2343d;
import com.google.android.gms.internal.akg;
import com.google.android.gms.internal.hx;
import com.google.android.gms.internal.zzzv;

@zzzv
/* renamed from: com.google.android.gms.ads.a.b */
public final class C2337b extends ViewGroup {
    /* renamed from: a */
    private final akg f7025a;

    public final C2338a getAdListener() {
        return this.f7025a.b();
    }

    public final C2343d getAdSize() {
        return this.f7025a.c();
    }

    public final String getAdUnitId() {
        return this.f7025a.e();
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
        this.f7025a.a(c2338a);
    }

    public final void setAdSize(C2343d c2343d) {
        this.f7025a.a(new C2343d[]{c2343d});
    }

    public final void setAdUnitId(String str) {
        this.f7025a.a(str);
    }
}
