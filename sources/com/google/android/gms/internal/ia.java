package com.google.android.gms.internal;

import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;

@zzzv
public abstract class ia extends AbstractExecutorService implements ExecutorService {
    protected final <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t) {
        return new ip(runnable, t);
    }

    protected final <T> RunnableFuture<T> newTaskFor(Callable<T> callable) {
        return new ip(callable);
    }

    public /* synthetic */ Future submit(Runnable runnable) {
        return (zzakv) super.submit(runnable);
    }

    public /* synthetic */ Future submit(Runnable runnable, Object obj) {
        return (zzakv) super.submit(runnable, obj);
    }

    public /* synthetic */ Future submit(Callable callable) {
        return (zzakv) super.submit(callable);
    }
}
