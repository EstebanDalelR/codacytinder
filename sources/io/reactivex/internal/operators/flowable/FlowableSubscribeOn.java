package io.reactivex.internal.operators.flowable;

import io.reactivex.C15679f;
import io.reactivex.C15679f.C17362c;
import io.reactivex.C3957b;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.C15735a;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class FlowableSubscribeOn<T> extends C18364a<T, T> {
    /* renamed from: c */
    final C15679f f58854c;
    /* renamed from: d */
    final boolean f58855d;

    static final class SubscribeOnSubscriber<T> extends AtomicReference<Thread> implements FlowableSubscriber<T>, Runnable, Subscription {
        private static final long serialVersionUID = 8094547886072529208L;
        /* renamed from: a */
        final Subscriber<? super T> f57023a;
        /* renamed from: b */
        final C17362c f57024b;
        /* renamed from: c */
        final AtomicReference<Subscription> f57025c = new AtomicReference();
        /* renamed from: d */
        final AtomicLong f57026d = new AtomicLong();
        /* renamed from: e */
        final boolean f57027e;
        /* renamed from: f */
        Publisher<T> f57028f;

        /* renamed from: io.reactivex.internal.operators.flowable.FlowableSubscribeOn$SubscribeOnSubscriber$a */
        static final class C15692a implements Runnable {
            /* renamed from: a */
            private final Subscription f48559a;
            /* renamed from: b */
            private final long f48560b;

            C15692a(Subscription subscription, long j) {
                this.f48559a = subscription;
                this.f48560b = j;
            }

            public void run() {
                this.f48559a.request(this.f48560b);
            }
        }

        SubscribeOnSubscriber(Subscriber<? super T> subscriber, C17362c c17362c, Publisher<T> publisher, boolean z) {
            this.f57023a = subscriber;
            this.f57024b = c17362c;
            this.f57028f = publisher;
            this.f57027e = z ^ 1;
        }

        public void run() {
            lazySet(Thread.currentThread());
            Publisher publisher = this.f57028f;
            this.f57028f = null;
            publisher.subscribe(this);
        }

        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.setOnce(this.f57025c, subscription)) {
                long andSet = this.f57026d.getAndSet(0);
                if (andSet != 0) {
                    m66461a(andSet, subscription);
                }
            }
        }

        public void onNext(T t) {
            this.f57023a.onNext(t);
        }

        public void onError(Throwable th) {
            this.f57023a.onError(th);
            this.f57024b.dispose();
        }

        public void onComplete() {
            this.f57023a.onComplete();
            this.f57024b.dispose();
        }

        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                Subscription subscription = (Subscription) this.f57025c.get();
                if (subscription != null) {
                    m66461a(j, subscription);
                    return;
                }
                C15735a.m58967a(this.f57026d, j);
                Subscription subscription2 = (Subscription) this.f57025c.get();
                if (subscription2 != null) {
                    long andSet = this.f57026d.getAndSet(0);
                    if (andSet != 0) {
                        m66461a(andSet, subscription2);
                    }
                }
            }
        }

        /* renamed from: a */
        void m66461a(long j, Subscription subscription) {
            if (!this.f57027e) {
                if (Thread.currentThread() != get()) {
                    this.f57024b.mo13593a(new C15692a(subscription, j));
                    return;
                }
            }
            subscription.request(j);
        }

        public void cancel() {
            SubscriptionHelper.cancel(this.f57025c);
            this.f57024b.dispose();
        }
    }

    public FlowableSubscribeOn(C3957b<T> c3957b, C15679f c15679f, boolean z) {
        super(c3957b);
        this.f58854c = c15679f;
        this.f58855d = z;
    }

    /* renamed from: a */
    public void m67597a(Subscriber<? super T> subscriber) {
        C17362c a = this.f58854c.mo12872a();
        Runnable subscribeOnSubscriber = new SubscribeOnSubscriber(subscriber, a, this.a, this.f58855d);
        subscriber.onSubscribe(subscribeOnSubscriber);
        a.mo13593a(subscribeOnSubscriber);
    }
}
