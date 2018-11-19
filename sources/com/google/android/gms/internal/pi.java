package com.google.android.gms.internal;

import android.os.Process;

final class pi implements Runnable {
    /* renamed from: a */
    private final Runnable f16384a;
    /* renamed from: b */
    private final int f16385b;

    public pi(Runnable runnable, int i) {
        this.f16384a = runnable;
        this.f16385b = i;
    }

    public final void run() {
        Process.setThreadPriority(this.f16385b);
        this.f16384a.run();
    }
}
