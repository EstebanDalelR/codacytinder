package com.google.android.m4b.maps.bb;

import android.view.animation.Interpolator;

/* renamed from: com.google.android.m4b.maps.bb.d */
public final class C4746d implements Interpolator {
    /* renamed from: a */
    private final float f17410a = 0.99f;

    public C4746d(float f) {
    }

    public final float getInterpolation(float f) {
        return f < 0.0f ? 0.0f : (float) (1.0d - Math.pow((double) (1.0f - this.f17410a), (double) f));
    }
}
