package io.reactivex.internal.schedulers;

import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.Functions;
import io.reactivex.schedulers.SchedulerRunnableIntrospection;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

abstract class AbstractDirectTask extends AtomicReference<Future<?>> implements Disposable, SchedulerRunnableIntrospection {
    /* renamed from: c */
    protected static final FutureTask<Void> f54092c = new FutureTask(Functions.f48540b, null);
    /* renamed from: d */
    protected static final FutureTask<Void> f54093d = new FutureTask(Functions.f48540b, null);
    private static final long serialVersionUID = 1811839108042568751L;
    /* renamed from: a */
    protected final Runnable f54094a;
    /* renamed from: b */
    protected Thread f54095b;

    AbstractDirectTask(Runnable runnable) {
        this.f54094a = runnable;
    }

    public final void dispose() {
        Future future = (Future) get();
        if (future != f54092c && future != f54093d && compareAndSet(future, f54093d) && future != null) {
            future.cancel(this.f54095b != Thread.currentThread());
        }
    }

    public final boolean isDisposed() {
        Future future = (Future) get();
        if (future != f54092c) {
            if (future != f54093d) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public final void m63719a(Future<?> future) {
        Future future2;
        do {
            future2 = (Future) get();
            if (future2 != f54092c) {
                if (future2 == f54093d) {
                    future.cancel(this.f54095b != Thread.currentThread());
                    return;
                }
            } else {
                return;
            }
        } while (!compareAndSet(future2, future));
    }

    public Runnable getWrappedRunnable() {
        return this.f54094a;
    }
}
