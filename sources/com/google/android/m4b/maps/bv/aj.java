package com.google.android.m4b.maps.bv;

import android.opengl.Matrix;
import android.opengl.Visibility;
import javax.microedition.khronos.opengles.GL10;

final class aj {
    /* renamed from: a */
    private final C4939n f18115a = new C4939n();
    /* renamed from: b */
    private final float[] f18116b = new float[16];

    /* renamed from: a */
    public final void m22050a(GL10 gl10) {
        this.f18115a.m22129a(gl10);
        Matrix.multiplyMM(this.f18116b, 0, this.f18115a.f18241b, 0, this.f18115a.f18240a, 0);
    }

    /* renamed from: a */
    public final int m22049a(float[] fArr, int i, char[] cArr, int i2, int i3) {
        return Visibility.visibilityTest(this.f18116b, 0, fArr, 0, cArr, 0, i3);
    }

    /* renamed from: a */
    public final int m22048a(float[] fArr, int i, int i2, int[] iArr, int i3, int i4) {
        return Visibility.frustumCullSpheres(this.f18116b, 0, fArr, 0, i2, iArr, 0, i4);
    }
}
