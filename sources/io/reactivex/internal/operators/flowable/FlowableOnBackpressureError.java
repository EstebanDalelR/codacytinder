package io.reactivex.internal.operators.flowable;

import com.google.android.exoplayer2.Format;
import io.reactivex.C3957b;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.C15735a;
import io.reactivex.p079d.C2667a;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class FlowableOnBackpressureError<T> extends C18364a<T, T> {

    static final class BackpressureErrorSubscriber<T> extends AtomicLong implements FlowableSubscriber<T>, Subscription {
        private static final long serialVersionUID = -3176480756392482682L;
        /* renamed from: a */
        final Subscriber<? super T> f56971a;
        /* renamed from: b */
        Subscription f56972b;
        /* renamed from: c */
        boolean f56973c;

        BackpressureErrorSubscriber(Subscriber<? super T> subscriber) {
            this.f56971a = subscriber;
        }

        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f56972b, subscription)) {
                this.f56972b = subscription;
                this.f56971a.onSubscribe(this);
                subscription.request(Format.OFFSET_SAMPLE_RELATIVE);
            }
        }

        public void onNext(T t) {
            if (!this.f56973c) {
                if (get() != 0) {
                    this.f56971a.onNext(t);
                    C15735a.m58969c(this, 1);
                } else {
                    onError(new MissingBackpressureException("could not emit value due to lack of requests"));
                }
            }
        }

        public void onError(Throwable th) {
            if (this.f56973c) {
                C2667a.a(th);
                return;
            }
            this.f56973c = true;
            this.f56971a.onError(th);
        }

        public void onComplete() {
            if (!this.f56973c) {
                this.f56973c = true;
                this.f56971a.onComplete();
            }
        }

        public void request(long j) {
            if (SubscriptionHelper.validate(j)) {
                C15735a.m58967a((AtomicLong) this, j);
            }
        }

        public void cancel() {
            this.f56972b.cancel();
        }
    }

    public FlowableOnBackpressureError(C3957b<T> c3957b) {
        super(c3957b);
    }

    /* renamed from: a */
    protected void m67582a(Subscriber<? super T> subscriber) {
        this.a.a(new BackpressureErrorSubscriber(subscriber));
    }
}
