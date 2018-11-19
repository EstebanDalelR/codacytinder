package io.reactivex.internal.operators.flowable;

import com.google.android.exoplayer2.Format;
import io.reactivex.C3957b;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicBoolean;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class FlowableTake<T> extends C18364a<T, T> {
    /* renamed from: c */
    final long f58859c;

    static final class TakeSubscriber<T> extends AtomicBoolean implements FlowableSubscriber<T>, Subscription {
        private static final long serialVersionUID = -5636543848937116287L;
        /* renamed from: a */
        boolean f57047a;
        /* renamed from: b */
        Subscription f57048b;
        /* renamed from: c */
        final Subscriber<? super T> f57049c;
        /* renamed from: d */
        final long f57050d;
        /* renamed from: e */
        long f57051e;

        TakeSubscriber(Subscriber<? super T> subscriber, long j) {
            this.f57049c = subscriber;
            this.f57050d = j;
            this.f57051e = j;
        }

        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f57048b, subscription)) {
                this.f57048b = subscription;
                if (this.f57050d == 0) {
                    subscription.cancel();
                    this.f57047a = true;
                    EmptySubscription.complete(this.f57049c);
                    return;
                }
                this.f57049c.onSubscribe(this);
            }
        }

        public void onNext(T t) {
            if (!this.f57047a) {
                long j = this.f57051e;
                this.f57051e = j - 1;
                if (j > 0) {
                    Object obj = this.f57051e == 0 ? 1 : null;
                    this.f57049c.onNext(t);
                    if (obj != null) {
                        this.f57048b.cancel();
                        onComplete();
                    }
                }
            }
        }

        public void onError(Throwable th) {
            if (!this.f57047a) {
                this.f57047a = true;
                this.f57048b.cancel();
                this.f57049c.onError(th);
            }
        }

        public void onComplete() {
            if (!this.f57047a) {
                this.f57047a = true;
                this.f57049c.onComplete();
            }
        }

        public void request(long j) {
            if (!SubscriptionHelper.validate(j)) {
                return;
            }
            if (get() || !compareAndSet(false, true) || j < this.f57050d) {
                this.f57048b.request(j);
            } else {
                this.f57048b.request(Format.OFFSET_SAMPLE_RELATIVE);
            }
        }

        public void cancel() {
            this.f57048b.cancel();
        }
    }

    public FlowableTake(C3957b<T> c3957b, long j) {
        super(c3957b);
        this.f58859c = j;
    }

    /* renamed from: a */
    protected void m67599a(Subscriber<? super T> subscriber) {
        this.a.a(new TakeSubscriber(subscriber, this.f58859c));
    }
}
