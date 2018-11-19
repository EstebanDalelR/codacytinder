package io.reactivex.internal.operators.flowable;

import com.google.android.exoplayer2.Format;
import io.reactivex.C3957b;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.p079d.C2667a;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class FlowableSingle<T> extends C18364a<T, T> {
    /* renamed from: c */
    final T f58853c;

    static final class SingleElementSubscriber<T> extends DeferredScalarSubscription<T> implements FlowableSubscriber<T> {
        private static final long serialVersionUID = -5526049321428043809L;
        /* renamed from: a */
        final T f59911a;
        /* renamed from: b */
        Subscription f59912b;
        /* renamed from: c */
        boolean f59913c;

        SingleElementSubscriber(Subscriber<? super T> subscriber, T t) {
            super(subscriber);
            this.f59911a = t;
        }

        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f59912b, subscription)) {
                this.f59912b = subscription;
                this.g.onSubscribe(this);
                subscription.request(Format.OFFSET_SAMPLE_RELATIVE);
            }
        }

        public void onNext(T t) {
            if (!this.f59913c) {
                if (this.h != null) {
                    this.f59913c = true;
                    this.f59912b.cancel();
                    this.g.onError(new IllegalArgumentException("Sequence contains more than one element!"));
                    return;
                }
                this.h = t;
            }
        }

        public void onError(Throwable th) {
            if (this.f59913c) {
                C2667a.a(th);
                return;
            }
            this.f59913c = true;
            this.g.onError(th);
        }

        public void onComplete() {
            if (!this.f59913c) {
                this.f59913c = true;
                Object obj = this.h;
                this.h = null;
                if (obj == null) {
                    obj = this.f59911a;
                }
                if (obj == null) {
                    this.g.onComplete();
                } else {
                    m68249a(obj);
                }
            }
        }

        public void cancel() {
            super.cancel();
            this.f59912b.cancel();
        }
    }

    public FlowableSingle(C3957b<T> c3957b, T t) {
        super(c3957b);
        this.f58853c = t;
    }

    /* renamed from: a */
    protected void m67596a(Subscriber<? super T> subscriber) {
        this.a.a(new SingleElementSubscriber(subscriber, this.f58853c));
    }
}
