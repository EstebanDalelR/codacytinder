package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

final class is implements Executor {
    /* renamed from: a */
    private final Handler f16199a = new Handler(Looper.getMainLooper());

    is() {
    }

    public final void execute(Runnable runnable) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            runnable.run();
        } else {
            this.f16199a.post(runnable);
        }
    }
}
