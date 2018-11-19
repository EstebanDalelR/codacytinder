package io.reactivex.internal.operators.flowable;

import io.reactivex.C3957b;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.C15678a;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.LongConsumer;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.p079d.C2667a;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* renamed from: io.reactivex.internal.operators.flowable.g */
public final class C19007g<T> extends C18364a<T, T> {
    /* renamed from: c */
    private final Consumer<? super Subscription> f58882c;
    /* renamed from: d */
    private final LongConsumer f58883d;
    /* renamed from: e */
    private final Action f58884e;

    /* renamed from: io.reactivex.internal.operators.flowable.g$a */
    static final class C18368a<T> implements FlowableSubscriber<T>, Subscription {
        /* renamed from: a */
        final Subscriber<? super T> f57095a;
        /* renamed from: b */
        final Consumer<? super Subscription> f57096b;
        /* renamed from: c */
        final LongConsumer f57097c;
        /* renamed from: d */
        final Action f57098d;
        /* renamed from: e */
        Subscription f57099e;

        C18368a(Subscriber<? super T> subscriber, Consumer<? super Subscription> consumer, LongConsumer longConsumer, Action action) {
            this.f57095a = subscriber;
            this.f57096b = consumer;
            this.f57098d = action;
            this.f57097c = longConsumer;
        }

        public void onSubscribe(Subscription subscription) {
            try {
                this.f57096b.accept(subscription);
                if (SubscriptionHelper.validate(this.f57099e, subscription)) {
                    this.f57099e = subscription;
                    this.f57095a.onSubscribe(this);
                }
            } catch (Throwable th) {
                C15678a.m58850b(th);
                subscription.cancel();
                this.f57099e = SubscriptionHelper.CANCELLED;
                EmptySubscription.error(th, this.f57095a);
            }
        }

        public void onNext(T t) {
            this.f57095a.onNext(t);
        }

        public void onError(Throwable th) {
            if (this.f57099e != SubscriptionHelper.CANCELLED) {
                this.f57095a.onError(th);
            } else {
                C2667a.a(th);
            }
        }

        public void onComplete() {
            if (this.f57099e != SubscriptionHelper.CANCELLED) {
                this.f57095a.onComplete();
            }
        }

        public void request(long j) {
            try {
                this.f57097c.accept(j);
            } catch (Throwable th) {
                C15678a.m58850b(th);
                C2667a.a(th);
            }
            this.f57099e.request(j);
        }

        public void cancel() {
            try {
                this.f57098d.run();
            } catch (Throwable th) {
                C15678a.m58850b(th);
                C2667a.a(th);
            }
            this.f57099e.cancel();
        }
    }

    public C19007g(C3957b<T> c3957b, Consumer<? super Subscription> consumer, LongConsumer longConsumer, Action action) {
        super(c3957b);
        this.f58882c = consumer;
        this.f58883d = longConsumer;
        this.f58884e = action;
    }

    /* renamed from: a */
    protected void m67609a(Subscriber<? super T> subscriber) {
        this.a.a(new C18368a(subscriber, this.f58882c, this.f58883d, this.f58884e));
    }
}
