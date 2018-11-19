package com.tinder.cardstack.p180a.p181a;

import android.view.animation.Interpolator;

/* renamed from: com.tinder.cardstack.a.a.a */
public class C8360a implements Interpolator {
    /* renamed from: a */
    private final float f29693a;
    /* renamed from: b */
    private final float f29694b;
    /* renamed from: c */
    private final long f29695c;
    /* renamed from: d */
    private final double f29696d;

    public C8360a(float f, float f2, long j) {
        this.f29693a = f;
        this.f29694b = f2;
        this.f29695c = j;
        this.f29696d = ((double) ((f - (f2 * ((float) j))) * 2.0f)) / Math.pow((double) j, 2.0d);
    }

    public float getInterpolation(float f) {
        f *= (float) this.f29695c;
        return ((float) (((double) (this.f29694b * f)) + ((this.f29696d * 0.5d) * Math.pow((double) f, 2.0d)))) / this.f29693a;
    }
}
