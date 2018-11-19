package io.reactivex.internal.observers;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.C15736b;
import io.reactivex.p079d.C2667a;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.reactivex.internal.observers.i */
public final class C17393i<T> extends CountDownLatch implements Observer<T>, Disposable, Future<T> {
    /* renamed from: a */
    T f53170a;
    /* renamed from: b */
    Throwable f53171b;
    /* renamed from: c */
    final AtomicReference<Disposable> f53172c = new AtomicReference();

    public void dispose() {
    }

    public C17393i() {
        super(1);
    }

    public boolean cancel(boolean z) {
        DisposableHelper disposableHelper;
        do {
            disposableHelper = (Disposable) this.f53172c.get();
            if (disposableHelper != this) {
                if (disposableHelper == DisposableHelper.DISPOSED) {
                }
            }
            return false;
        } while (!this.f53172c.compareAndSet(disposableHelper, DisposableHelper.DISPOSED));
        if (disposableHelper != null) {
            disposableHelper.dispose();
        }
        countDown();
        return true;
    }

    public boolean isCancelled() {
        return DisposableHelper.isDisposed((Disposable) this.f53172c.get());
    }

    public boolean isDone() {
        return getCount() == 0;
    }

    public T get() throws InterruptedException, ExecutionException {
        if (getCount() != 0) {
            C15736b.m58971a();
            await();
        }
        if (isCancelled()) {
            throw new CancellationException();
        }
        Throwable th = this.f53171b;
        if (th == null) {
            return this.f53170a;
        }
        throw new ExecutionException(th);
    }

    public T get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        if (getCount() != 0) {
            C15736b.m58971a();
            if (await(j, timeUnit) == null) {
                throw new TimeoutException();
            }
        }
        if (isCancelled() != null) {
            throw new CancellationException();
        }
        j = this.f53171b;
        if (j == null) {
            return this.f53170a;
        }
        throw new ExecutionException(j);
    }

    public void onSubscribe(Disposable disposable) {
        DisposableHelper.setOnce(this.f53172c, disposable);
    }

    public void onNext(T t) {
        if (this.f53170a != null) {
            ((Disposable) this.f53172c.get()).dispose();
            onError(new IndexOutOfBoundsException("More than one element received"));
            return;
        }
        this.f53170a = t;
    }

    public void onError(Throwable th) {
        if (this.f53171b == null) {
            this.f53171b = th;
            DisposableHelper disposableHelper;
            do {
                disposableHelper = (Disposable) this.f53172c.get();
                if (disposableHelper != this) {
                    if (disposableHelper == DisposableHelper.DISPOSED) {
                    }
                }
                C2667a.a(th);
                return;
            } while (!this.f53172c.compareAndSet(disposableHelper, this));
            countDown();
            return;
        }
        C2667a.a(th);
    }

    public void onComplete() {
        if (this.f53170a == null) {
            onError(new NoSuchElementException("The source is empty"));
            return;
        }
        DisposableHelper disposableHelper;
        do {
            disposableHelper = (Disposable) this.f53172c.get();
            if (disposableHelper != this) {
                if (disposableHelper == DisposableHelper.DISPOSED) {
                }
            }
            return;
        } while (!this.f53172c.compareAndSet(disposableHelper, this));
        countDown();
    }

    public boolean isDisposed() {
        return isDone();
    }
}
