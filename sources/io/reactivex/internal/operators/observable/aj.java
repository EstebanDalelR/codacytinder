package io.reactivex.internal.operators.observable;

import io.reactivex.C3959e;
import io.reactivex.Observer;
import io.reactivex.exceptions.C15678a;
import io.reactivex.internal.functions.C15684a;
import io.reactivex.internal.observers.DeferredScalarDisposable;
import io.reactivex.p079d.C2667a;
import java.util.concurrent.Callable;

public final class aj<T> extends C3959e<T> implements Callable<T> {
    /* renamed from: a */
    final Callable<? extends T> f57239a;

    public aj(Callable<? extends T> callable) {
        this.f57239a = callable;
    }

    public void subscribeActual(Observer<? super T> observer) {
        DeferredScalarDisposable deferredScalarDisposable = new DeferredScalarDisposable(observer);
        observer.onSubscribe(deferredScalarDisposable);
        if (!deferredScalarDisposable.isDisposed()) {
            try {
                deferredScalarDisposable.m68178a(C15684a.m58895a(this.f57239a.call(), "Callable returned null"));
            } catch (Throwable th) {
                C15678a.m58850b(th);
                if (deferredScalarDisposable.isDisposed()) {
                    C2667a.a(th);
                } else {
                    observer.onError(th);
                }
            }
        }
    }

    public T call() throws Exception {
        return C15684a.m58895a(this.f57239a.call(), "The callable returned a null value");
    }
}
