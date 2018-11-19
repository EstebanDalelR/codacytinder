package com.google.android.m4b.maps.bb;

import android.view.animation.Interpolator;
import com.google.android.m4b.maps.p125y.C5571j;

/* renamed from: com.google.android.m4b.maps.bb.c */
public final class C4745c implements Interpolator {
    /* renamed from: a */
    private final float f17409a;

    public C4745c(float f) {
        boolean z = 0.0f <= f && f < 1.0f;
        C5571j.m24297a(z);
        this.f17409a = f;
    }

    public final float getInterpolation(float f) {
        f = Math.min(Math.max(f, 0.0f), 1.0f);
        if (f < this.f17409a) {
            return 0.0f;
        }
        return (float) (((double) (f - this.f17409a)) / (1.0d - ((double) this.f17409a)));
    }
}
