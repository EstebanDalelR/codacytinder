package io.reactivex.internal.operators.flowable;

import io.reactivex.C3957b;
import io.reactivex.functions.Function;
import io.reactivex.internal.util.ErrorMode;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

/* renamed from: io.reactivex.internal.operators.flowable.b */
public final class C18365b<T, R> extends C3957b<R> {
    /* renamed from: a */
    final Publisher<T> f57084a;
    /* renamed from: c */
    final Function<? super T, ? extends Publisher<? extends R>> f57085c;
    /* renamed from: d */
    final int f57086d;
    /* renamed from: e */
    final ErrorMode f57087e;

    public C18365b(Publisher<T> publisher, Function<? super T, ? extends Publisher<? extends R>> function, int i, ErrorMode errorMode) {
        this.f57084a = publisher;
        this.f57085c = function;
        this.f57086d = i;
        this.f57087e = errorMode;
    }

    /* renamed from: a */
    protected void m66467a(Subscriber<? super R> subscriber) {
        if (!C15696q.m58901a(this.f57084a, subscriber, this.f57085c)) {
            this.f57084a.subscribe(FlowableConcatMap.m67562a(subscriber, this.f57085c, this.f57086d, this.f57087e));
        }
    }
}
