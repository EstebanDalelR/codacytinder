package com.google.android.gms.internal;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

@zzzv
final class im<T> implements zzakv<T> {
    /* renamed from: a */
    private final T f23325a;
    /* renamed from: b */
    private final in f23326b = new in();

    im(T t) {
        this.f23325a = t;
        this.f23326b.m19932a();
    }

    public final boolean cancel(boolean z) {
        return false;
    }

    public final T get() {
        return this.f23325a;
    }

    public final T get(long j, TimeUnit timeUnit) {
        return this.f23325a;
    }

    public final boolean isCancelled() {
        return false;
    }

    public final boolean isDone() {
        return true;
    }

    public final void zza(Runnable runnable, Executor executor) {
        this.f23326b.m19933a(runnable, executor);
    }
}
