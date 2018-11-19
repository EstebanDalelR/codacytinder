package com.google.android.m4b.maps.bv;

import com.google.android.m4b.maps.bv.C4952u.C4951c;
import com.google.android.m4b.maps.cg.bp;
import com.google.android.m4b.maps.p125y.C5571j;

final class ab extends C6549d {
    /* renamed from: b */
    private final float[] f27438b = new float[4];

    public ab(C4952u c4952u, C4951c c4951c) {
        super(c4952u, c4951c);
    }

    /* renamed from: a */
    public final void mo7099a(C4944q c4944q, af afVar, int i, int i2) {
        m28934a(c4944q, afVar, i, i2, 1.0f, 1);
    }

    /* renamed from: a */
    public final C4926f mo7098a(int i, int i2, float f, float f2, int i3, float f3, float f4, float f5, float f6, boolean z) {
        ab abVar = this;
        int i4 = i;
        int i5 = i2;
        if (i3 != 0) {
            throw new IllegalStateException("Invalid sphere face.");
        }
        int i6 = i4 + 1;
        int i7 = i5 + 1;
        float f7 = 1.0f;
        float f8 = (1.0f - f2) - f4;
        C4926f c4926f = new C4926f(i6, i7);
        int i8 = 0;
        int i9 = 0;
        while (i9 < i6) {
            C4926f c4926f2;
            float f9 = ((float) i9) / ((float) i4);
            float f10 = f9 * f5;
            float f11 = 0.0f;
            float a = bp.m22985a(f + (f9 * f3), 0.0f, f7);
            int i10 = 0;
            while (i10 < i7) {
                f9 = ((float) i10) / ((float) i5);
                float f12 = (f7 - f9) * f6;
                f9 = bp.m22985a(((f9 * f4) + f8) * 0.5f, f11, 0.5f);
                bp.m22990a(a, f9, abVar.f27438b, i8);
                if (z && abVar.a.f18286z != null) {
                    f7 = Math.min(200.0f, abVar.a.f18286z.m22060a(a, f9, null));
                    if (f7 == f11) {
                        f7 = 200.0f;
                    }
                    for (int i11 = 0; i11 < 3; i11++) {
                        float[] fArr = abVar.f27438b;
                        fArr[i11] = fArr[i11] * f7;
                    }
                }
                abVar.f27438b[3] = 1.0f;
                f7 = abVar.f27438b[0];
                float f13 = abVar.f27438b[1];
                int i12 = i10;
                float f14 = a;
                f11 = f13;
                int i13 = i9;
                c4926f2 = c4926f;
                c4926f.m22080a(i9, i10, f7, f11, abVar.f27438b[2], f10, f12);
                i10 = i12 + 1;
                i9 = i13;
                a = f14;
                c4926f = c4926f2;
                f7 = 1.0f;
                f11 = 0.0f;
                i8 = 0;
            }
            c4926f2 = c4926f;
            i9++;
            f7 = 1.0f;
            i8 = 0;
        }
        return c4926f;
    }

    /* renamed from: a */
    public final int mo7097a(int i) {
        C5571j.m24301b(i == 0 ? 1 : 0);
        return -1;
    }
}
