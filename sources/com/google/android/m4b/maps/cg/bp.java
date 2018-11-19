package com.google.android.m4b.maps.cg;

public final class bp {
    /* renamed from: a */
    private static double f19126a = Math.log(2.0d);

    /* renamed from: j */
    public static float m23002j(float f) {
        return f * 0.15915494f;
    }

    /* renamed from: k */
    public static float m23003k(float f) {
        return f * 6.2831855f;
    }

    /* renamed from: l */
    public static float m23004l(float f) {
        return f * 0.0027777778f;
    }

    /* renamed from: m */
    public static float m23005m(float f) {
        return f * 360.0f;
    }

    /* renamed from: n */
    public static float m23006n(float f) {
        return f * 57.29578f;
    }

    /* renamed from: o */
    public static float m23007o(float f) {
        return f * 0.017453292f;
    }

    /* renamed from: a */
    public static float m22983a(float f) {
        return f - (((float) Math.floor((double) (f / 360.0f))) * 360.0f);
    }

    /* renamed from: b */
    public static float m22991b(float f) {
        return f - ((float) Math.floor((double) f));
    }

    /* renamed from: a */
    public static int m22987a(int i, int i2, int i3) {
        return Math.min(i3, Math.max(0, i));
    }

    /* renamed from: a */
    public static float m22985a(float f, float f2, float f3) {
        return Math.min(f3, Math.max(f2, f));
    }

    /* renamed from: c */
    public static float m22993c(float f) {
        return m22985a(f, 0.0f, 1.0f);
    }

    /* renamed from: d */
    public static float m22995d(float f) {
        return (float) (Math.log((double) f) / f19126a);
    }

    /* renamed from: e */
    public static float m22997e(float f) {
        return (float) Math.exp(((double) f) * f19126a);
    }

    /* renamed from: a */
    public static int m22988a(int i, int i2, int i3, int i4) {
        return Math.max(0, (int) Math.ceil((double) m22995d(Math.max(((float) i2) / ((float) i4), ((float) i) / ((float) i3))))) + 1;
    }

    /* renamed from: q */
    private static float m23009q(float f) {
        return (float) Math.sin((double) (f * 6.2831855f));
    }

    /* renamed from: r */
    private static float m23010r(float f) {
        return (float) Math.cos((double) (f * 6.2831855f));
    }

    /* renamed from: f */
    public static float m22998f(float f) {
        return m23009q(f) / m23010r(f);
    }

    /* renamed from: g */
    public static float m22999g(float f) {
        return ((float) Math.atan((double) f)) * 0.15915494f;
    }

    /* renamed from: d */
    private static float m22996d(float f, float f2) {
        return m22991b(((float) Math.atan2((double) f, (double) f2)) * 0.15915494f);
    }

    /* renamed from: h */
    public static float m23000h(float f) {
        return (float) Math.sin((double) (f * 0.017453292f));
    }

    /* renamed from: i */
    public static float m23001i(float f) {
        return (float) Math.cos((double) (f * 0.017453292f));
    }

    /* renamed from: b */
    public static float m22992b(float f, float f2) {
        f = m22983a(f - f2);
        return f < 180.0f ? f : f - 360.0f;
    }

    /* renamed from: c */
    public static float m22994c(float f, float f2) {
        f = m22991b(f - f2);
        return ((double) f) < 0.5d ? f : f - 1.0f;
    }

    /* renamed from: a */
    public static void m22990a(float f, float f2, float[] fArr, int i) {
        i = m23009q(f);
        f = m23010r(f);
        float q = m23009q(f2);
        f2 = -m23010r(f2);
        q *= f;
        fArr[0] = (-q) * i;
        fArr[1] = f2;
        fArr[2] = q;
    }

    /* renamed from: a */
    public static void m22989a(float f, float f2, float f3, float[] fArr) {
        fArr[0] = m22996d(-f, f3);
        fArr[1] = m22996d((float) Math.sqrt((double) ((f * f) + (f3 * f3))), -f2);
    }

    /* renamed from: p */
    public static int m23008p(float f) {
        return ((int) Math.floor((double) ((f + 22.5f) / 45.0f))) & 7;
    }

    /* renamed from: a */
    public static float m22986a(float f, float f2, float f3, float f4, float f5) {
        f = 1.0f - f5;
        f2 = (double) f;
        f4 = (double) f5;
        return (float) ((((Math.pow(f2, 3.0d) * 0.0d) + (((Math.pow(f2, 2.0d) * 0.0f) * f4) * 0.10000000149011612d)) + ((((double) (f * 3.0f)) * Math.pow(f4, 2.0d)) * 0.949999988079071d)) + (Math.pow(f4, 3.0d) * 0.0f));
    }

    /* renamed from: a */
    public static float m22984a(float f, float f2) {
        if (f >= 0.0f && f < 360.0f) {
            return f;
        }
        f /= 360.0f;
        return (f - ((float) Math.floor((double) f))) * 360.0f;
    }
}
