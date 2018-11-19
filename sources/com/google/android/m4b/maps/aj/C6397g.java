package com.google.android.m4b.maps.aj;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;

/* renamed from: com.google.android.m4b.maps.aj.g */
public final class C6397g<V> extends FutureTask<V> implements C4636f<V> {
    /* renamed from: a */
    private final C4633d f23726a = new C4633d();

    /* renamed from: a */
    public static <V> C6397g<V> m27915a(Callable<V> callable) {
        return new C6397g(callable);
    }

    /* renamed from: a */
    public static <V> C6397g<V> m27914a(Runnable runnable, V v) {
        return new C6397g(runnable, v);
    }

    private C6397g(Callable<V> callable) {
        super(callable);
    }

    private C6397g(Runnable runnable, V v) {
        super(runnable, v);
    }

    /* renamed from: a */
    public final void mo4860a(Runnable runnable, Executor executor) {
        this.f23726a.m20755a(runnable, executor);
    }

    protected final void done() {
        this.f23726a.m20754a();
    }
}
