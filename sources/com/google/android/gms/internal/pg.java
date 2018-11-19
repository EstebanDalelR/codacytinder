package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import java.util.concurrent.Executor;

public final class pg implements Executor {
    /* renamed from: a */
    private final Handler f16379a;

    public pg(Looper looper) {
        this.f16379a = new Handler(looper);
    }

    public final void execute(@NonNull Runnable runnable) {
        this.f16379a.post(runnable);
    }
}
