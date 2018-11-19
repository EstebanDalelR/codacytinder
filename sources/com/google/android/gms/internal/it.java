package com.google.android.gms.internal;

import java.util.concurrent.Executor;

final class it implements Executor {
    it() {
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
