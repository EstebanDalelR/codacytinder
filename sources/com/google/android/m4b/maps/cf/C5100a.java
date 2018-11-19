package com.google.android.m4b.maps.cf;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: com.google.android.m4b.maps.cf.a */
public class C5100a extends Animation {
    /* renamed from: a */
    private float f18938a;

    /* renamed from: c */
    protected final float m22778c(long j) {
        getTransformation(j, null);
        return this.f18938a;
    }

    protected void applyTransformation(float f, Transformation transformation) {
        this.f18938a = f;
    }
}
