package io.reactivex.internal.schedulers;

import io.reactivex.disposables.Disposable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: io.reactivex.internal.schedulers.b */
final class C15728b implements Future<Object> {
    /* renamed from: a */
    final Disposable f48631a;

    public Object get() throws InterruptedException, ExecutionException {
        return null;
    }

    public Object get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return null;
    }

    public boolean isCancelled() {
        return false;
    }

    public boolean isDone() {
        return false;
    }

    C15728b(Disposable disposable) {
        this.f48631a = disposable;
    }

    public boolean cancel(boolean z) {
        this.f48631a.dispose();
        return false;
    }
}
