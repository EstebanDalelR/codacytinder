package com.google.android.gms.ads.internal;

import android.os.Handler;

public final class ak {
    /* renamed from: a */
    private final Handler f7104a;

    public ak(Handler handler) {
        this.f7104a = handler;
    }

    /* renamed from: a */
    public final void m8632a(Runnable runnable) {
        this.f7104a.removeCallbacks(runnable);
    }

    /* renamed from: a */
    public final boolean m8633a(Runnable runnable, long j) {
        return this.f7104a.postDelayed(runnable, j);
    }
}
