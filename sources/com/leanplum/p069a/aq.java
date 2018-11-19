package com.leanplum.p069a;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.leanplum.a.aq */
public final class aq {
    /* renamed from: a */
    private static aq f7939a;
    /* renamed from: b */
    private Handler f7940b = new Handler(Looper.getMainLooper());

    /* renamed from: a */
    public final Boolean m9523a(Runnable runnable) {
        return Boolean.valueOf(this.f7940b.post(runnable));
    }

    /* renamed from: a */
    public final Boolean m9524a(Runnable runnable, long j) {
        return Boolean.valueOf(this.f7940b.postDelayed(runnable, j));
    }

    /* renamed from: a */
    public static aq m9522a() {
        if (f7939a == null) {
            f7939a = new aq();
        }
        return f7939a;
    }
}
