package com.google.android.m4b.maps.bv;

import android.opengl.GLU;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.google.android.m4b.maps.bv.w */
public final class C4954w {
    /* renamed from: a */
    private final C4939n f18308a = new C4939n();
    /* renamed from: b */
    private final int[] f18309b = new int[4];

    /* renamed from: a */
    public final void m22203a(int i, int i2, int i3, int i4) {
        this.f18309b[0] = null;
        this.f18309b[1] = null;
        this.f18309b[2] = i3;
        this.f18309b[3] = i4;
    }

    /* renamed from: a */
    public final void m22205a(float[] fArr, int i, float[] fArr2, int i2) {
        GLU.gluProject(fArr[0], fArr[1], fArr[2], this.f18308a.f18240a, 0, this.f18308a.f18241b, 0, this.f18309b, 0, fArr2, 4);
    }

    /* renamed from: a */
    public final void m22206a(float[] fArr, int i, float[] fArr2, float[] fArr3, int i2) {
        GLU.gluProject(fArr[0], fArr[1], fArr[2], fArr2 == null ? this.f18308a.f18240a : fArr2, 0, r0.f18308a.f18241b, 0, r0.f18309b, 0, fArr3, 0);
    }

    /* renamed from: b */
    public final void m22208b(float[] fArr, int i, float[] fArr2, float[] fArr3, int i2) {
        GLU.gluUnProject(fArr[0], fArr[1], fArr[2], fArr2 == null ? this.f18308a.f18240a : fArr2, 0, r0.f18308a.f18241b, 0, r0.f18309b, 0, fArr3, 0);
    }

    /* renamed from: a */
    public final void m22204a(GL10 gl10) {
        this.f18308a.m22131c(gl10);
    }

    /* renamed from: b */
    public final void m22207b(GL10 gl10) {
        this.f18308a.m22130b(gl10);
    }
}
