package io.reactivex.internal.operators.observable;

import io.reactivex.C3959e;
import io.reactivex.Observer;
import io.reactivex.internal.disposables.EmptyDisposable;

public final class az extends C3959e<Object> {
    /* renamed from: a */
    public static final C3959e<Object> f57256a = new az();

    private az() {
    }

    protected void subscribeActual(Observer<? super Object> observer) {
        observer.onSubscribe(EmptyDisposable.NEVER);
    }
}
