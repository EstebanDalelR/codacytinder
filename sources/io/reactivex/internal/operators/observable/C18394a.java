package io.reactivex.internal.operators.observable;

import io.reactivex.C3959e;
import io.reactivex.ObservableSource;
import io.reactivex.internal.fuseable.HasUpstreamObservableSource;

/* renamed from: io.reactivex.internal.operators.observable.a */
abstract class C18394a<T, U> extends C3959e<U> implements HasUpstreamObservableSource<T> {
    /* renamed from: a */
    protected final ObservableSource<T> f57230a;

    C18394a(ObservableSource<T> observableSource) {
        this.f57230a = observableSource;
    }

    public final ObservableSource<T> source() {
        return this.f57230a;
    }
}
