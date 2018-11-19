package com.google.android.m4b.maps.bb;

import android.view.animation.Interpolator;
import com.google.android.m4b.maps.p125y.C5571j;

/* renamed from: com.google.android.m4b.maps.bb.a */
public final class C8063a<V> extends C7444j<V> {
    /* renamed from: e */
    private final V[] f28873e;

    public C8063a(Interpolator interpolator, V[] vArr) {
        super(interpolator);
        C5571j.m24297a(vArr.length >= 2 ? true : null);
        this.f28873e = vArr;
        this.a = vArr[0];
        this.b = vArr[vArr.length - 1];
        this.c = vArr[0];
        this.d = true;
    }

    /* renamed from: a */
    protected final void mo7538a(long j) {
        this.c = this.f28873e[Math.min(Math.max((int) (m22778c(j) * ((float) (this.f28873e.length - 1))), 0), this.f28873e.length - 1)];
    }

    /* renamed from: a */
    protected final void mo7539a(V v) {
        this.a = v;
    }

    /* renamed from: b */
    protected final void mo7540b(V v) {
        this.b = v;
    }

    /* renamed from: c */
    protected final void mo7541c(V v) {
        this.c = v;
    }
}
