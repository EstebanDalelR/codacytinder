package com.google.android.m4b.maps.cf;

import android.opengl.Matrix;

/* renamed from: com.google.android.m4b.maps.cf.t */
public final class C5121t {
    /* renamed from: a */
    private float[] f19025a = new float[16];

    public C5121t() {
        Matrix.setIdentityM(this.f19025a, 0);
    }

    public final String toString() {
        float[] fArr = this.f19025a;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < 16; i++) {
            float f = fArr[i];
            StringBuilder stringBuilder = new StringBuilder(17);
            stringBuilder.append(f);
            stringBuilder.append("  ");
            stringBuffer.append(stringBuilder.toString());
            if (i % 4 == 3) {
                stringBuffer.append("\n");
            }
        }
        return stringBuffer.toString();
    }
}
