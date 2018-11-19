package io.reactivex.internal.operators.observable;

import io.reactivex.C3959e;
import io.reactivex.Observer;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.fuseable.ScalarCallable;

public final class ae extends C3959e<Object> implements ScalarCallable<Object> {
    /* renamed from: a */
    public static final C3959e<Object> f57236a = new ae();

    public Object call() {
        return null;
    }

    private ae() {
    }

    protected void subscribeActual(Observer<? super Object> observer) {
        EmptyDisposable.complete((Observer) observer);
    }
}
