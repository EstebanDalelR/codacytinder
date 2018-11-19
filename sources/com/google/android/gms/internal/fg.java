package com.google.android.gms.internal;

import java.util.concurrent.Callable;

final class fg implements Callable<Void> {
    /* renamed from: a */
    private /* synthetic */ Runnable f16053a;

    fg(Runnable runnable) {
        this.f16053a = runnable;
    }

    public final /* synthetic */ Object call() throws Exception {
        this.f16053a.run();
        return null;
    }
}
