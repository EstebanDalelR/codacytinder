package io.reactivex.internal.operators.flowable;

import io.reactivex.C3957b;
import io.reactivex.internal.fuseable.ScalarCallable;
import io.reactivex.internal.subscriptions.ScalarSubscription;
import org.reactivestreams.Subscriber;

/* renamed from: io.reactivex.internal.operators.flowable.o */
public final class C18377o<T> extends C3957b<T> implements ScalarCallable<T> {
    /* renamed from: a */
    private final T f57121a;

    public C18377o(T t) {
        this.f57121a = t;
    }

    /* renamed from: a */
    protected void m66474a(Subscriber<? super T> subscriber) {
        subscriber.onSubscribe(new ScalarSubscription(subscriber, this.f57121a));
    }

    public T call() {
        return this.f57121a;
    }
}
