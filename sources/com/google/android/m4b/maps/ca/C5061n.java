package com.google.android.m4b.maps.ca;

import com.google.android.m4b.maps.cb.C5063d;
import com.google.android.m4b.maps.cb.C5067l;

/* renamed from: com.google.android.m4b.maps.ca.n */
public final class C5061n {
    /* renamed from: a */
    private static final float[] f18761a = new float[]{0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0.0f};
    /* renamed from: b */
    private static final float[] f18762b = new float[]{0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f};
    /* renamed from: c */
    private static final float[] f18763c = new float[]{-1.0f, 1.0f, 0.0f, 0.0f, 0.0f, -1.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 1.0f, -1.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: a */
    public static void m22661a(C5067l c5067l, C5063d c5063d) {
        float tan = (float) Math.tan(0.06283185631036758d);
        float cos = (float) Math.cos(0.06283185631036758d);
        float f = 1.0f;
        float f2 = 0.0f;
        for (int i = 0; i < 100; i++) {
            c5067l.mo5252a(f + 0.0f, f2 + 0.0f, 0.0f);
            if (c5063d != null) {
                c5063d.mo5264d((short) i);
            }
            float f3 = ((-f2) * tan) + f;
            f2 += f * tan;
            f = f3 * cos;
            f2 *= cos;
        }
    }

    /* renamed from: b */
    public static void m22662b(C5067l c5067l, C5063d c5063d) {
        float tan = (float) Math.tan(0.06283185631036758d);
        float cos = (float) Math.cos(0.06283185631036758d);
        c5067l.mo5252a(0.0f, 0.0f, 0.0f);
        int i = 0;
        if (c5063d != null) {
            c5063d.mo5264d(0);
        }
        float f = 1.0f;
        float f2 = 0.0f;
        while (i < 100) {
            c5067l.mo5252a(f + 0.0f, f2 + 0.0f, 0.0f);
            if (c5063d != null) {
                c5063d.mo5264d((short) (i + 1));
            }
            float f3 = ((-f2) * tan) + f;
            f2 += f * tan;
            f = f3 * cos;
            f2 *= cos;
            i++;
        }
        if (c5063d != null) {
            c5063d.mo5264d(1);
        } else {
            c5067l.mo5252a(1.0f, 0.0f, 0.0f);
        }
    }
}
