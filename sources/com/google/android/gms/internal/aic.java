package com.google.android.gms.internal;

import android.os.Handler;
import java.util.concurrent.Executor;

final class aic implements Executor {
    /* renamed from: a */
    private /* synthetic */ Handler f15290a;

    aic(ahh ahh, Handler handler) {
        this.f15290a = handler;
    }

    public final void execute(Runnable runnable) {
        this.f15290a.post(runnable);
    }
}
