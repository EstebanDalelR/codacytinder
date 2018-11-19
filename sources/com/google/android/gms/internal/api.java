package com.google.android.gms.internal;

import java.util.concurrent.Future;

final /* synthetic */ class api implements Runnable {
    /* renamed from: a */
    private final iw f15569a;
    /* renamed from: b */
    private final Future f15570b;

    api(iw iwVar, Future future) {
        this.f15569a = iwVar;
        this.f15570b = future;
    }

    public final void run() {
        iw iwVar = this.f15569a;
        Future future = this.f15570b;
        if (iwVar.isCancelled()) {
            future.cancel(true);
        }
    }
}
