package io.reactivex.internal.operators.observable;

import io.reactivex.C3959e;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;

public final class an<T> extends C3959e<T> {
    /* renamed from: a */
    final ObservableSource<T> f57247a;

    public an(ObservableSource<T> observableSource) {
        this.f57247a = observableSource;
    }

    protected void subscribeActual(Observer<? super T> observer) {
        this.f57247a.subscribe(observer);
    }
}
