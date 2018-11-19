package io.reactivex.internal.operators.flowable;

import io.reactivex.C3957b;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* renamed from: io.reactivex.internal.operators.flowable.s */
public final class C19011s<T> extends C18364a<T, T> {
    /* renamed from: c */
    final long f58887c;

    /* renamed from: io.reactivex.internal.operators.flowable.s$a */
    static final class C18381a<T> implements FlowableSubscriber<T>, Subscription {
        /* renamed from: a */
        final Subscriber<? super T> f57131a;
        /* renamed from: b */
        long f57132b;
        /* renamed from: c */
        Subscription f57133c;

        C18381a(Subscriber<? super T> subscriber, long j) {
            this.f57131a = subscriber;
            this.f57132b = j;
        }

        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f57133c, subscription)) {
                long j = this.f57132b;
                this.f57133c = subscription;
                this.f57131a.onSubscribe(this);
                subscription.request(j);
            }
        }

        public void onNext(T t) {
            if (this.f57132b != 0) {
                this.f57132b--;
            } else {
                this.f57131a.onNext(t);
            }
        }

        public void onError(Throwable th) {
            this.f57131a.onError(th);
        }

        public void onComplete() {
            this.f57131a.onComplete();
        }

        public void request(long j) {
            this.f57133c.request(j);
        }

        public void cancel() {
            this.f57133c.cancel();
        }
    }

    public C19011s(C3957b<T> c3957b, long j) {
        super(c3957b);
        this.f58887c = j;
    }

    /* renamed from: a */
    protected void m67613a(Subscriber<? super T> subscriber) {
        this.a.a(new C18381a(subscriber, this.f58887c));
    }
}
