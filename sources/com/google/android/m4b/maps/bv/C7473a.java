package com.google.android.m4b.maps.bv;

import com.google.android.m4b.maps.bv.C4952u.C4951c;
import com.google.android.m4b.maps.cg.bp;

/* renamed from: com.google.android.m4b.maps.bv.a */
public final class C7473a extends C6549d {
    /* renamed from: b */
    private float[] f27437b = new float[2];

    public C7473a(C4952u c4952u, C4951c c4951c) {
        super(c4952u, c4951c);
    }

    /* renamed from: a */
    public final void mo7099a(C4944q c4944q, af afVar, int i, int i2) {
        m28934a(c4944q, afVar, i, i2, 1.0f, 6);
    }

    /* renamed from: a */
    public final C4926f mo7098a(int i, int i2, float f, float f2, int i3, float f3, float f4, float f5, float f6, boolean z) {
        C7473a c7473a = this;
        int i4 = i3;
        if (i4 >= 0) {
            if (i4 <= 5) {
                int i5;
                int i6;
                int i7 = 1;
                if (z) {
                    i5 = i;
                    i6 = i2;
                } else {
                    i5 = 1;
                    i6 = 1;
                }
                int i8 = i5 + 1;
                int i9 = i6 + 1;
                C4926f c4926f = new C4926f(i8, i9);
                int i10 = 0;
                while (i10 < i8) {
                    C4926f c4926f2;
                    float f7 = ((float) i10) / ((float) i5);
                    float f8 = f7 * f5;
                    float f9 = 0.0f;
                    float f10 = 1.0f;
                    float a = bp.m22985a(f + (f7 * f3), 0.0f, 1.0f);
                    int i11 = 0;
                    while (i11 < i9) {
                        float f11;
                        float min;
                        f7 = ((float) i11) / ((float) i6);
                        float f12 = f7 * f6;
                        f7 = bp.m22985a(f2 + (f7 * f4), f9, f10);
                        float f13 = -1.0f;
                        switch (i4) {
                            case 0:
                                f7 = f10 - (f7 * 2.0f);
                                f13 = (a * 2.0f) - f10;
                                f11 = -1.0f;
                                break;
                            case 1:
                                f7 = f10 - (f7 * 2.0f);
                                f11 = f10 - (2.0f * a);
                                break;
                            case 2:
                                f13 = f10 - (a * 2.0f);
                                f7 = f10 - (f7 * 2.0f);
                                f11 = 1.0f;
                                break;
                            case 3:
                                f7 = f10 - (f7 * 2.0f);
                                f11 = (2.0f * a) - f10;
                                f13 = 1.0f;
                                break;
                            case 4:
                                f13 = (a * 2.0f) - f10;
                                f11 = f10 - (f7 * 2.0f);
                                f7 = 1.0f;
                                break;
                            case 5:
                                f11 = (f7 * 2.0f) - f10;
                                f13 = (a * 2.0f) - f10;
                                f7 = -1.0f;
                                break;
                            default:
                                StringBuilder stringBuilder = new StringBuilder(30);
                                stringBuilder.append("Invalid cube face: ");
                                stringBuilder.append(i4);
                                throw new IllegalStateException(stringBuilder.toString());
                        }
                        if (z && c7473a.a.f18286z != null) {
                            bp.m22989a(f13, f7, f11, c7473a.f27437b);
                            float f14 = 200.0f;
                            min = Math.min(200.0f, c7473a.a.f18286z.m22060a(c7473a.f27437b[0], c7473a.f27437b[i7], null));
                            if (min != 0.0f) {
                                f14 = min;
                            }
                            f13 *= f14;
                            f7 *= f14;
                            f11 *= f14;
                        }
                        min = f13;
                        int i12 = i11;
                        f9 = f11;
                        i7 = i10;
                        c4926f2 = c4926f;
                        c4926f.m22080a(i10, i11, min, f7, f9, f8, f12);
                        i11 = i12 + 1;
                        i10 = i7;
                        c4926f = c4926f2;
                        c7473a = this;
                        i7 = 1;
                        f10 = 1.0f;
                        f9 = 0.0f;
                    }
                    c4926f2 = c4926f;
                    i10++;
                    c7473a = this;
                    i7 = 1;
                }
                return c4926f;
            }
        }
        throw new IllegalArgumentException("Invalid cube face.");
    }

    /* renamed from: a */
    public final int mo7097a(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            default:
                throw new IllegalArgumentException("Invalid face index for cube.");
        }
    }
}
