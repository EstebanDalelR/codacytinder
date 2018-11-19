package io.reactivex.internal.operators.flowable;

import io.reactivex.C3957b;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* renamed from: io.reactivex.internal.operators.flowable.n */
public final class C19009n<T> extends C18364a<T, T> {

    /* renamed from: io.reactivex.internal.operators.flowable.n$a */
    static final class C18376a<T> implements FlowableSubscriber<T>, Subscription {
        /* renamed from: a */
        final Subscriber<? super T> f57119a;
        /* renamed from: b */
        Subscription f57120b;

        C18376a(Subscriber<? super T> subscriber) {
            this.f57119a = subscriber;
        }

        public void request(long j) {
            this.f57120b.request(j);
        }

        public void cancel() {
            this.f57120b.cancel();
        }

        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f57120b, subscription)) {
                this.f57120b = subscription;
                this.f57119a.onSubscribe(this);
            }
        }

        public void onNext(T t) {
            this.f57119a.onNext(t);
        }

        public void onError(Throwable th) {
            this.f57119a.onError(th);
        }

        public void onComplete() {
            this.f57119a.onComplete();
        }
    }

    public C19009n(C3957b<T> c3957b) {
        super(c3957b);
    }

    /* renamed from: a */
    protected void m67611a(Subscriber<? super T> subscriber) {
        this.a.a(new C18376a(subscriber));
    }
}
