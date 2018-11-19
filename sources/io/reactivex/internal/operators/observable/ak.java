package io.reactivex.internal.operators.observable;

import io.reactivex.C3959e;
import io.reactivex.Observer;
import io.reactivex.exceptions.C15678a;
import io.reactivex.internal.functions.C15684a;
import io.reactivex.internal.observers.DeferredScalarDisposable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public final class ak<T> extends C3959e<T> {
    /* renamed from: a */
    final Future<? extends T> f57240a;
    /* renamed from: b */
    final long f57241b;
    /* renamed from: c */
    final TimeUnit f57242c;

    public ak(Future<? extends T> future, long j, TimeUnit timeUnit) {
        this.f57240a = future;
        this.f57241b = j;
        this.f57242c = timeUnit;
    }

    public void subscribeActual(Observer<? super T> observer) {
        DeferredScalarDisposable deferredScalarDisposable = new DeferredScalarDisposable(observer);
        observer.onSubscribe(deferredScalarDisposable);
        if (!deferredScalarDisposable.isDisposed()) {
            try {
                deferredScalarDisposable.m68178a(C15684a.m58895a(this.f57242c != null ? this.f57240a.get(this.f57241b, this.f57242c) : this.f57240a.get(), "Future returned null"));
            } catch (Throwable th) {
                C15678a.m58850b(th);
                if (!deferredScalarDisposable.isDisposed()) {
                    observer.onError(th);
                }
            }
        }
    }
}
