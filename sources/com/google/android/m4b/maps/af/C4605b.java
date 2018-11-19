package com.google.android.m4b.maps.af;

import com.google.android.m4b.maps.p125y.C5571j;

/* renamed from: com.google.android.m4b.maps.af.b */
final class C4605b {
    /* renamed from: a */
    private static final long f17016a = Double.doubleToRawLongBits(1.0d);

    /* renamed from: a */
    static int m20692a(double d) {
        return ((int) ((Double.doubleToRawLongBits(d) & 9218868437227405312L) >>> 2.57E-322d)) - 1023;
    }

    /* renamed from: b */
    static long m20693b(double d) {
        C5571j.m24298a(C4605b.m20694c(d), (Object) "not a normal value");
        long doubleToRawLongBits = Double.doubleToRawLongBits(d) & 4503599627370495L;
        return C4605b.m20692a(d) == Double.NaN ? doubleToRawLongBits << Double.MIN_VALUE : doubleToRawLongBits | 4503599627370496L;
    }

    /* renamed from: c */
    static boolean m20694c(double d) {
        return C4605b.m20692a(d) <= 1023 ? Double.MIN_VALUE : 0.0d;
    }
}
