package io.reactivex.internal.operators.single;

import io.reactivex.C3960g;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;

/* renamed from: io.reactivex.internal.operators.single.h */
public final class C18419h<T> extends C3960g<T> {
    /* renamed from: a */
    final SingleSource<T> f57339a;

    public C18419h(SingleSource<T> singleSource) {
        this.f57339a = singleSource;
    }

    /* renamed from: a */
    protected void m66547a(SingleObserver<? super T> singleObserver) {
        this.f57339a.subscribe(singleObserver);
    }
}
