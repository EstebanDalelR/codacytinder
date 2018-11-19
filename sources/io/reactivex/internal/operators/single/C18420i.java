package io.reactivex.internal.operators.single;

import io.reactivex.C3960g;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.C15676b;

/* renamed from: io.reactivex.internal.operators.single.i */
public final class C18420i<T> extends C3960g<T> {
    /* renamed from: a */
    final T f57340a;

    public C18420i(T t) {
        this.f57340a = t;
    }

    /* renamed from: a */
    protected void m66548a(SingleObserver<? super T> singleObserver) {
        singleObserver.onSubscribe(C15676b.m58842b());
        singleObserver.onSuccess(this.f57340a);
    }
}
