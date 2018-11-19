package io.reactivex.internal.operators.completable;

import io.reactivex.C3957b;
import io.reactivex.CompletableSource;
import io.reactivex.internal.observers.C17396o;
import org.reactivestreams.Subscriber;

/* renamed from: io.reactivex.internal.operators.completable.n */
public final class C18360n<T> extends C3957b<T> {
    /* renamed from: a */
    final CompletableSource f56844a;

    public C18360n(CompletableSource completableSource) {
        this.f56844a = completableSource;
    }

    /* renamed from: a */
    protected void m66402a(Subscriber<? super T> subscriber) {
        this.f56844a.subscribe(new C17396o(subscriber));
    }
}
