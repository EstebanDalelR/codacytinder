package com.google.android.gms.internal;

import java.util.concurrent.Callable;

final class ff implements Callable<Void> {
    /* renamed from: a */
    private /* synthetic */ Runnable f16052a;

    ff(Runnable runnable) {
        this.f16052a = runnable;
    }

    public final /* synthetic */ Object call() throws Exception {
        this.f16052a.run();
        return null;
    }
}
