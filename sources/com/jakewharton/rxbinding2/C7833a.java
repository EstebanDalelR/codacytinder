package com.jakewharton.rxbinding2;

import io.reactivex.C3959e;
import io.reactivex.Observer;

/* renamed from: com.jakewharton.rxbinding2.a */
public abstract class C7833a<T> extends C3959e<T> {
    /* renamed from: a */
    protected abstract T mo7603a();

    /* renamed from: a */
    protected abstract void mo7604a(Observer<? super T> observer);

    protected final void subscribeActual(Observer<? super T> observer) {
        mo7604a(observer);
        observer.onNext(mo7603a());
    }
}
