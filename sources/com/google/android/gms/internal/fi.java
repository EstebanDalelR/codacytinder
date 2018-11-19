package com.google.android.gms.internal;

import java.util.concurrent.Future;

final class fi implements Runnable {
    /* renamed from: a */
    private /* synthetic */ iw f16056a;
    /* renamed from: b */
    private /* synthetic */ Future f16057b;

    fi(iw iwVar, Future future) {
        this.f16056a = iwVar;
        this.f16057b = future;
    }

    public final void run() {
        if (this.f16056a.isCancelled()) {
            this.f16057b.cancel(true);
        }
    }
}
