package com.bumptech.glide.p026d;

import android.annotation.TargetApi;
import android.os.Build.VERSION;
import android.os.SystemClock;

/* renamed from: com.bumptech.glide.d.d */
public final class C0982d {
    /* renamed from: a */
    private static final double f2672a;

    static {
        double d = 1.0d;
        if (17 <= VERSION.SDK_INT) {
            d = 1.0d / Math.pow(10.0d, 6.0d);
        }
        f2672a = d;
    }

    @TargetApi(17)
    /* renamed from: a */
    public static long m3393a() {
        if (17 <= VERSION.SDK_INT) {
            return SystemClock.elapsedRealtimeNanos();
        }
        return System.currentTimeMillis();
    }

    /* renamed from: a */
    public static double m3392a(long j) {
        return ((double) (C0982d.m3393a() - j)) * f2672a;
    }
}
