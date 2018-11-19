package io.reactivex.internal.schedulers;

import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableContainer;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;

public final class ScheduledRunnable extends AtomicReferenceArray<Object> implements Disposable, Runnable, Callable<Object> {
    /* renamed from: b */
    static final Object f54101b = new Object();
    /* renamed from: c */
    static final Object f54102c = new Object();
    /* renamed from: d */
    static final Object f54103d = new Object();
    /* renamed from: e */
    static final Object f54104e = new Object();
    private static final long serialVersionUID = -6120223772001106981L;
    /* renamed from: a */
    final Runnable f54105a;

    public ScheduledRunnable(Runnable runnable, DisposableContainer disposableContainer) {
        super(3);
        this.f54105a = runnable;
        lazySet(null, disposableContainer);
    }

    public Object call() {
        run();
        return null;
    }

    public void run() {
        Object obj;
        lazySet(2, Thread.currentThread());
        try {
            this.f54105a.run();
        } catch (Throwable th) {
            lazySet(2, null);
            obj = get(0);
            if (!(obj == f54101b || !compareAndSet(0, obj, f54104e) || obj == null)) {
                ((DisposableContainer) obj).delete(this);
            }
            do {
                obj = get(1);
                if (obj == f54102c || obj == f54103d) {
                }
            } while (!compareAndSet(1, obj, f54104e));
        }
        lazySet(2, null);
        obj = get(0);
        if (!(obj == f54101b || !compareAndSet(0, obj, f54104e) || obj == null)) {
            ((DisposableContainer) obj).delete(this);
        }
        do {
            obj = get(1);
            if (obj == f54102c || obj == f54103d) {
                return;
            }
        } while (!compareAndSet(1, obj, f54104e));
    }

    /* renamed from: a */
    public void m63724a(Future<?> future) {
        Object obj;
        do {
            obj = get(1);
            if (obj != f54104e) {
                if (obj == f54102c) {
                    future.cancel(false);
                    return;
                } else if (obj == f54103d) {
                    future.cancel(true);
                    return;
                }
            } else {
                return;
            }
        } while (!compareAndSet(1, obj, future));
    }

    public void dispose() {
        Object obj;
        Object obj2;
        boolean z;
        do {
            obj = get(1);
            if (obj == f54104e || obj == f54102c) {
                break;
            } else if (obj == f54103d) {
                break;
            } else {
                z = get(2) != Thread.currentThread();
            }
        } while (!compareAndSet(1, obj, z ? f54103d : f54102c));
        if (obj != null) {
            ((Future) obj).cancel(z);
        }
        do {
            obj2 = get(0);
            if (!(obj2 == f54104e || obj2 == f54101b)) {
                if (obj2 == null) {
                }
            }
            return;
        } while (!compareAndSet(0, obj2, f54101b));
        ((DisposableContainer) obj2).delete(this);
    }

    public boolean isDisposed() {
        Object obj = get(0);
        if (obj == f54101b || obj == f54104e) {
            return true;
        }
        return false;
    }
}
