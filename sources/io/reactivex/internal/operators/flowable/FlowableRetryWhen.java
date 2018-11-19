package io.reactivex.internal.operators.flowable;

import io.reactivex.C3957b;
import io.reactivex.exceptions.C15678a;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.C15684a;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.processors.C18430a;
import io.reactivex.processors.UnicastProcessor;
import io.reactivex.subscribers.C18434b;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class FlowableRetryWhen<T> extends C18364a<T, T> {
    /* renamed from: c */
    final Function<? super C3957b<Throwable>, ? extends Publisher<?>> f58850c;

    static final class RetryWhenSubscriber<T> extends WhenSourceSubscriber<T, Throwable> {
        private static final long serialVersionUID = -2680129890138081029L;

        RetryWhenSubscriber(Subscriber<? super T> subscriber, C18430a<Throwable> c18430a, Subscription subscription) {
            super(subscriber, c18430a, subscription);
        }

        public void onError(Throwable th) {
            m66459a(th);
        }

        public void onComplete() {
            this.c.cancel();
            this.a.onComplete();
        }
    }

    public FlowableRetryWhen(C3957b<T> c3957b, Function<? super C3957b<Throwable>, ? extends Publisher<?>> function) {
        super(c3957b);
        this.f58850c = function;
    }

    /* renamed from: a */
    public void m67594a(Subscriber<? super T> subscriber) {
        Subscriber c18434b = new C18434b(subscriber);
        C18430a u = UnicastProcessor.m67668b(8).m66603u();
        try {
            Publisher publisher = (Publisher) C15684a.m58895a(this.f58850c.apply(u), "handler returned a null Publisher");
            Object whenReceiver = new WhenReceiver(this.a);
            Subscription retryWhenSubscriber = new RetryWhenSubscriber(c18434b, u, whenReceiver);
            whenReceiver.f57006d = retryWhenSubscriber;
            subscriber.onSubscribe(retryWhenSubscriber);
            publisher.subscribe(whenReceiver);
            whenReceiver.onNext(Integer.valueOf(null));
        } catch (Throwable th) {
            C15678a.m58850b(th);
            EmptySubscription.error(th, subscriber);
        }
    }
}
