package com.google.android.gms.common.util;

import android.os.SystemClock;

/* renamed from: com.google.android.gms.common.util.e */
public final class C3827e implements zzd {
    /* renamed from: a */
    private static C3827e f12074a = new C3827e();

    private C3827e() {
    }

    /* renamed from: a */
    public static zzd m14460a() {
        return f12074a;
    }

    public final long currentTimeMillis() {
        return System.currentTimeMillis();
    }

    public final long elapsedRealtime() {
        return SystemClock.elapsedRealtime();
    }

    public final long nanoTime() {
        return System.nanoTime();
    }
}
