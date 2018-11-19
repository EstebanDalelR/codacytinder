package io.reactivex.internal.schedulers;

import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.Functions;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.reactivex.internal.schedulers.c */
final class C17515c implements Disposable, Callable<Void> {
    /* renamed from: f */
    static final FutureTask<Void> f54115f = new FutureTask(Functions.f48540b, null);
    /* renamed from: a */
    final Runnable f54116a;
    /* renamed from: b */
    final AtomicReference<Future<?>> f54117b = new AtomicReference();
    /* renamed from: c */
    final AtomicReference<Future<?>> f54118c = new AtomicReference();
    /* renamed from: d */
    final ExecutorService f54119d;
    /* renamed from: e */
    Thread f54120e;

    public /* synthetic */ Object call() throws Exception {
        return m63732a();
    }

    C17515c(Runnable runnable, ExecutorService executorService) {
        this.f54116a = runnable;
        this.f54119d = executorService;
    }

    /* renamed from: a */
    public Void m63732a() throws Exception {
        try {
            this.f54120e = Thread.currentThread();
            this.f54116a.run();
            m63734b(this.f54119d.submit(this));
        } catch (Throwable th) {
            this.f54120e = null;
        }
        this.f54120e = null;
        return null;
    }

    public void dispose() {
        Future future = (Future) this.f54118c.getAndSet(f54115f);
        boolean z = false;
        if (!(future == null || future == f54115f)) {
            future.cancel(this.f54120e != Thread.currentThread());
        }
        future = (Future) this.f54117b.getAndSet(f54115f);
        if (future != null && future != f54115f) {
            if (this.f54120e != Thread.currentThread()) {
                z = true;
            }
            future.cancel(z);
        }
    }

    public boolean isDisposed() {
        return this.f54118c.get() == f54115f;
    }

    /* renamed from: a */
    void m63733a(Future<?> future) {
        Future future2;
        do {
            future2 = (Future) this.f54118c.get();
            if (future2 == f54115f) {
                future.cancel(this.f54120e != Thread.currentThread());
            }
        } while (!this.f54118c.compareAndSet(future2, future));
    }

    /* renamed from: b */
    void m63734b(Future<?> future) {
        Future future2;
        do {
            future2 = (Future) this.f54117b.get();
            if (future2 == f54115f) {
                future.cancel(this.f54120e != Thread.currentThread());
            }
        } while (!this.f54117b.compareAndSet(future2, future));
    }
}
