package com.google.android.m4b.maps.bb;

import android.view.animation.Interpolator;

/* renamed from: com.google.android.m4b.maps.bb.g */
public final class C7443g extends C6428m {
    /* renamed from: a */
    private int f27258a;
    /* renamed from: b */
    private int f27259b;
    /* renamed from: c */
    private int f27260c;
    /* renamed from: d */
    private boolean f27261d = false;

    public C7443g(Interpolator interpolator) {
        setInterpolator(interpolator);
    }

    /* renamed from: a */
    public final void m32042a(int i) {
        if (this.f27261d) {
            this.f27258a = this.f27260c;
            this.f27259b = i;
            return;
        }
        this.f27258a = i;
        this.f27259b = i;
        this.f27260c = i;
        this.f27261d = true;
    }

    public final boolean isInitialized() {
        return this.f27261d;
    }

    /* renamed from: a */
    public final int m32041a() {
        return this.f27259b;
    }

    /* renamed from: b */
    public final int m32044b() {
        return this.f27260c;
    }

    /* renamed from: a */
    public final void m32043a(long j) {
        this.f27260c = Math.round(((float) this.f27258a) + (m22778c(j) * ((float) (this.f27259b - this.f27258a))));
    }
}
