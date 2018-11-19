package com.google.android.m4b.maps.bv;

import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.google.android.m4b.maps.bv.n */
final class C4939n {
    /* renamed from: a */
    public final float[] f18240a = new float[16];
    /* renamed from: b */
    public final float[] f18241b = new float[16];

    /* renamed from: a */
    public final void m22129a(GL10 gl10) {
        m22131c(gl10);
        m22130b(gl10);
    }

    /* renamed from: b */
    public final void m22130b(GL10 gl10) {
        C4939n.m22128a(gl10, 5888, this.f18240a);
    }

    /* renamed from: c */
    public final void m22131c(GL10 gl10) {
        C4939n.m22128a(gl10, 5889, this.f18241b);
    }

    /* renamed from: a */
    private static void m22128a(GL10 gl10, int i, float[] fArr) {
        if (gl10 instanceof C4923c) {
            C4923c c4923c = (C4923c) gl10;
            c4923c.glMatrixMode(i);
            c4923c.m22070a(fArr, 0);
            return;
        }
        throw new IllegalArgumentException("gl must be GLMatrixWrapper");
    }
}
