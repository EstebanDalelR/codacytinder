package com.google.android.gms.internal;

import java.util.concurrent.Executor;

final /* synthetic */ class io implements Runnable {
    /* renamed from: a */
    private final Executor f16193a;
    /* renamed from: b */
    private final Runnable f16194b;

    io(Executor executor, Runnable runnable) {
        this.f16193a = executor;
        this.f16194b = runnable;
    }

    public final void run() {
        this.f16193a.execute(this.f16194b);
    }
}
