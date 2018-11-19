package io.reactivex.internal.operators.observable;

import io.reactivex.C3959e;
import io.reactivex.Observer;
import io.reactivex.observers.C17530d;

public final class bh<T> extends C18394a<T, T> {
    public bh(C3959e<T> c3959e) {
        super(c3959e);
    }

    protected void subscribeActual(Observer<? super T> observer) {
        this.a.subscribe(new C17530d(observer));
    }
}
