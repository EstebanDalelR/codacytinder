package io.reactivex.internal.operators.flowable;

import io.reactivex.C3957b;
import io.reactivex.exceptions.C15678a;
import io.reactivex.internal.functions.C15684a;
import io.reactivex.internal.subscriptions.EmptySubscription;
import java.util.concurrent.Callable;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

/* renamed from: io.reactivex.internal.operators.flowable.c */
public final class C18366c<T> extends C3957b<T> {
    /* renamed from: a */
    final Callable<? extends Publisher<? extends T>> f57088a;

    public C18366c(Callable<? extends Publisher<? extends T>> callable) {
        this.f57088a = callable;
    }

    /* renamed from: a */
    public void m66468a(Subscriber<? super T> subscriber) {
        try {
            ((Publisher) C15684a.m58895a(this.f57088a.call(), "The publisher supplied is null")).subscribe(subscriber);
        } catch (Throwable th) {
            C15678a.m58850b(th);
            EmptySubscription.error(th, subscriber);
        }
    }
}
