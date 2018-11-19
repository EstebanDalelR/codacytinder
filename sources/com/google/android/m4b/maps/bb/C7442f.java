package com.google.android.m4b.maps.bb;

import android.view.animation.Interpolator;

/* renamed from: com.google.android.m4b.maps.bb.f */
public final class C7442f extends C6428m {
    /* renamed from: a */
    private float f27254a;
    /* renamed from: b */
    private float f27255b;
    /* renamed from: c */
    private float f27256c;
    /* renamed from: d */
    private boolean f27257d = false;

    public C7442f(Interpolator interpolator) {
        setInterpolator(interpolator);
    }

    /* renamed from: a */
    public final void m32039a(float f) {
        if (this.f27257d) {
            this.f27254a = this.f27256c;
            this.f27255b = f;
            return;
        }
        this.f27254a = f;
        this.f27255b = f;
        this.f27256c = f;
        this.f27257d = true;
    }

    public final boolean isInitialized() {
        return this.f27257d;
    }

    /* renamed from: a */
    public final float m32038a() {
        return this.f27255b;
    }

    /* renamed from: b */
    public final float m32040b() {
        return this.f27256c;
    }
}
