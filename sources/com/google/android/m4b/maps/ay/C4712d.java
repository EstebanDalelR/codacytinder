package com.google.android.m4b.maps.ay;

import android.os.SystemClock;

/* renamed from: com.google.android.m4b.maps.ay.d */
public final class C4712d {
    /* renamed from: a */
    private static C4712d f17331a;

    /* renamed from: a */
    public static C4712d m20955a() {
        if (f17331a == null) {
            f17331a = new C4712d();
        }
        return f17331a;
    }

    /* renamed from: b */
    public static long m20956b() {
        return System.currentTimeMillis();
    }

    /* renamed from: c */
    public static long m20957c() {
        return SystemClock.elapsedRealtime();
    }
}
