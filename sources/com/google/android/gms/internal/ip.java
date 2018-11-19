package com.google.android.gms.internal;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;

@zzzv
final class ip<V> extends FutureTask<V> implements zzakv<V> {
    /* renamed from: a */
    private final in f23327a = new in();

    ip(Runnable runnable, V v) {
        super(runnable, v);
    }

    ip(Callable<V> callable) {
        super(callable);
    }

    protected final void done() {
        this.f23327a.m19932a();
    }

    public final void zza(Runnable runnable, Executor executor) {
        this.f23327a.m19933a(runnable, executor);
    }
}
