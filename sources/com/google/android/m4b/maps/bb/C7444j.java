package com.google.android.m4b.maps.bb;

import android.view.animation.Interpolator;

/* renamed from: com.google.android.m4b.maps.bb.j */
public abstract class C7444j<V> extends C6428m {
    /* renamed from: a */
    protected V f27262a;
    /* renamed from: b */
    protected V f27263b;
    /* renamed from: c */
    protected V f27264c;
    /* renamed from: d */
    protected boolean f27265d = false;

    /* renamed from: a */
    protected abstract void mo7538a(long j);

    /* renamed from: a */
    protected abstract void mo7539a(V v);

    /* renamed from: b */
    protected abstract void mo7540b(V v);

    /* renamed from: c */
    protected abstract void mo7541c(V v);

    public C7444j(Interpolator interpolator) {
        setInterpolator(interpolator);
    }

    /* renamed from: a */
    public final void m32048a(V v, V v2) {
        if (v != null) {
            if (v2 != null) {
                mo7539a((Object) v);
                mo7540b((Object) v2);
                mo7541c(v);
                this.f27265d = true;
            }
        }
    }

    /* renamed from: d */
    public final void m32053d(V v) {
        if (v != null) {
            if (this.f27265d) {
                mo7539a(this.f27264c);
                mo7540b((Object) v);
                return;
            }
            m32048a(v, v);
        }
    }

    public boolean isInitialized() {
        return this.f27265d;
    }

    /* renamed from: a */
    public final V m32045a() {
        return this.f27263b;
    }

    /* renamed from: b */
    public final V m32049b() {
        return this.f27264c;
    }

    /* renamed from: b */
    public final void m32050b(long j) {
        mo7538a(j);
    }
}
