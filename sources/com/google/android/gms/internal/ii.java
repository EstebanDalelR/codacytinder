package com.google.android.gms.internal;

import java.util.concurrent.Future;

final /* synthetic */ class ii implements Runnable {
    /* renamed from: a */
    private final Future f16180a;

    ii(Future future) {
        this.f16180a = future;
    }

    public final void run() {
        Future future = this.f16180a;
        if (!future.isDone()) {
            future.cancel(true);
        }
    }
}
