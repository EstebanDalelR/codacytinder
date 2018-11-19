package com.google.android.gms.internal;

import java.util.concurrent.Future;

final /* synthetic */ class il implements Runnable {
    /* renamed from: a */
    private final zzakv f16188a;
    /* renamed from: b */
    private final Future f16189b;

    il(zzakv zzakv, Future future) {
        this.f16188a = zzakv;
        this.f16189b = future;
    }

    public final void run() {
        zzakv zzakv = this.f16188a;
        Future future = this.f16189b;
        if (zzakv.isCancelled()) {
            future.cancel(true);
        }
    }
}
