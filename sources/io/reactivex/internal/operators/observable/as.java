package io.reactivex.internal.operators.observable;

import io.reactivex.C3959e;
import io.reactivex.Observer;
import io.reactivex.internal.fuseable.ScalarCallable;
import io.reactivex.internal.operators.observable.ObservableScalarXMap.ScalarDisposable;

public final class as<T> extends C3959e<T> implements ScalarCallable<T> {
    /* renamed from: a */
    private final T f57252a;

    public as(T t) {
        this.f57252a = t;
    }

    protected void subscribeActual(Observer<? super T> observer) {
        Object scalarDisposable = new ScalarDisposable(observer, this.f57252a);
        observer.onSubscribe(scalarDisposable);
        scalarDisposable.run();
    }

    public T call() {
        return this.f57252a;
    }
}
