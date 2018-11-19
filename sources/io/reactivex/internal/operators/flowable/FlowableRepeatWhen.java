package io.reactivex.internal.operators.flowable;

import io.reactivex.C3957b;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.C15678a;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.C15684a;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.processors.C18430a;
import io.reactivex.processors.UnicastProcessor;
import io.reactivex.subscribers.C18434b;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class FlowableRepeatWhen<T> extends C18364a<T, T> {
    /* renamed from: c */
    final Function<? super C3957b<Object>, ? extends Publisher<?>> f58849c;

    static final class WhenReceiver<T, U> extends AtomicInteger implements FlowableSubscriber<Object>, Subscription {
        private static final long serialVersionUID = 2827772011130406689L;
        /* renamed from: a */
        final Publisher<T> f57003a;
        /* renamed from: b */
        final AtomicReference<Subscription> f57004b = new AtomicReference();
        /* renamed from: c */
        final AtomicLong f57005c = new AtomicLong();
        /* renamed from: d */
        WhenSourceSubscriber<T, U> f57006d;

        WhenReceiver(Publisher<T> publisher) {
            this.f57003a = publisher;
        }

        public void onSubscribe(Subscription subscription) {
            SubscriptionHelper.deferredSetOnce(this.f57004b, this.f57005c, subscription);
        }

        public void onNext(Object obj) {
            if (getAndIncrement() == null) {
                while (SubscriptionHelper.isCancelled((Subscription) this.f57004b.get()) == null) {
                    this.f57003a.subscribe(this.f57006d);
                    if (decrementAndGet() == null) {
                    }
                }
            }
        }

        public void onError(Throwable th) {
            this.f57006d.cancel();
            this.f57006d.f57007a.onError(th);
        }

        public void onComplete() {
            this.f57006d.cancel();
            this.f57006d.f57007a.onComplete();
        }

        public void request(long j) {
            SubscriptionHelper.deferredRequest(this.f57004b, this.f57005c, j);
        }

        public void cancel() {
            SubscriptionHelper.cancel(this.f57004b);
        }
    }

    static abstract class WhenSourceSubscriber<T, U> extends SubscriptionArbiter implements FlowableSubscriber<T> {
        private static final long serialVersionUID = -5604623027276966720L;
        /* renamed from: a */
        protected final Subscriber<? super T> f57007a;
        /* renamed from: b */
        protected final C18430a<U> f57008b;
        /* renamed from: c */
        protected final Subscription f57009c;
        /* renamed from: d */
        private long f57010d;

        WhenSourceSubscriber(Subscriber<? super T> subscriber, C18430a<U> c18430a, Subscription subscription) {
            this.f57007a = subscriber;
            this.f57008b = c18430a;
            this.f57009c = subscription;
        }

        public final void onSubscribe(Subscription subscription) {
            m63749a(subscription);
        }

        public final void onNext(T t) {
            this.f57010d++;
            this.f57007a.onNext(t);
        }

        /* renamed from: a */
        protected final void m66459a(U u) {
            long j = this.f57010d;
            if (j != 0) {
                this.f57010d = 0;
                m63748a(j);
            }
            this.f57009c.request(1);
            this.f57008b.onNext(u);
        }

        public final void cancel() {
            super.cancel();
            this.f57009c.cancel();
        }
    }

    static final class RepeatWhenSubscriber<T> extends WhenSourceSubscriber<T, Object> {
        private static final long serialVersionUID = -2680129890138081029L;

        RepeatWhenSubscriber(Subscriber<? super T> subscriber, C18430a<Object> c18430a, Subscription subscription) {
            super(subscriber, c18430a, subscription);
        }

        public void onError(Throwable th) {
            this.c.cancel();
            this.a.onError(th);
        }

        public void onComplete() {
            m66459a(Integer.valueOf(0));
        }
    }

    /* renamed from: a */
    public void m67593a(Subscriber<? super T> subscriber) {
        Subscriber c18434b = new C18434b(subscriber);
        C18430a u = UnicastProcessor.m67668b(8).m66603u();
        try {
            Publisher publisher = (Publisher) C15684a.m58895a(this.f58849c.apply(u), "handler returned a null Publisher");
            Object whenReceiver = new WhenReceiver(this.a);
            Subscription repeatWhenSubscriber = new RepeatWhenSubscriber(c18434b, u, whenReceiver);
            whenReceiver.f57006d = repeatWhenSubscriber;
            subscriber.onSubscribe(repeatWhenSubscriber);
            publisher.subscribe(whenReceiver);
            whenReceiver.onNext(Integer.valueOf(null));
        } catch (Throwable th) {
            C15678a.m58850b(th);
            EmptySubscription.error(th, subscriber);
        }
    }
}
