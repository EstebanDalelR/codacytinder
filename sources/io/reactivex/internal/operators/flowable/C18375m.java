package io.reactivex.internal.operators.flowable;

import io.reactivex.C3957b;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

/* renamed from: io.reactivex.internal.operators.flowable.m */
public final class C18375m<T> extends C3957b<T> {
    /* renamed from: a */
    final Publisher<? extends T> f57118a;

    public C18375m(Publisher<? extends T> publisher) {
        this.f57118a = publisher;
    }

    /* renamed from: a */
    protected void m66473a(Subscriber<? super T> subscriber) {
        this.f57118a.subscribe(subscriber);
    }
}
