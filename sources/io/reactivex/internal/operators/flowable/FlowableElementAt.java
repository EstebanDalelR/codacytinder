package io.reactivex.internal.operators.flowable;

import com.google.android.exoplayer2.Format;
import io.reactivex.C3957b;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.p079d.C2667a;
import java.util.NoSuchElementException;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public final class FlowableElementAt<T> extends C18364a<T, T> {
    /* renamed from: c */
    final long f58814c;
    /* renamed from: d */
    final T f58815d;
    /* renamed from: e */
    final boolean f58816e;

    static final class ElementAtSubscriber<T> extends DeferredScalarSubscription<T> implements FlowableSubscriber<T> {
        private static final long serialVersionUID = 4066607327284737757L;
        /* renamed from: a */
        final long f59898a;
        /* renamed from: b */
        final T f59899b;
        /* renamed from: c */
        final boolean f59900c;
        /* renamed from: d */
        Subscription f59901d;
        /* renamed from: e */
        long f59902e;
        /* renamed from: f */
        boolean f59903f;

        ElementAtSubscriber(Subscriber<? super T> subscriber, long j, T t, boolean z) {
            super(subscriber);
            this.f59898a = j;
            this.f59899b = t;
            this.f59900c = z;
        }

        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f59901d, subscription)) {
                this.f59901d = subscription;
                this.g.onSubscribe(this);
                subscription.request(Format.OFFSET_SAMPLE_RELATIVE);
            }
        }

        public void onNext(T t) {
            if (!this.f59903f) {
                long j = this.f59902e;
                if (j == this.f59898a) {
                    this.f59903f = true;
                    this.f59901d.cancel();
                    m68249a(t);
                    return;
                }
                this.f59902e = j + 1;
            }
        }

        public void onError(Throwable th) {
            if (this.f59903f) {
                C2667a.a(th);
                return;
            }
            this.f59903f = true;
            this.g.onError(th);
        }

        public void onComplete() {
            if (!this.f59903f) {
                this.f59903f = true;
                Object obj = this.f59899b;
                if (obj != null) {
                    m68249a(obj);
                } else if (this.f59900c) {
                    this.g.onError(new NoSuchElementException());
                } else {
                    this.g.onComplete();
                }
            }
        }

        public void cancel() {
            super.cancel();
            this.f59901d.cancel();
        }
    }

    public FlowableElementAt(C3957b<T> c3957b, long j, T t, boolean z) {
        super(c3957b);
        this.f58814c = j;
        this.f58815d = t;
        this.f58816e = z;
    }

    /* renamed from: a */
    protected void m67573a(Subscriber<? super T> subscriber) {
        this.a.a(new ElementAtSubscriber(subscriber, this.f58814c, this.f58815d, this.f58816e));
    }
}
