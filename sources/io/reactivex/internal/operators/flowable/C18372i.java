package io.reactivex.internal.operators.flowable;

import com.google.android.exoplayer2.Format;
import io.reactivex.C3957b;
import io.reactivex.C3960g;
import io.reactivex.FlowableSubscriber;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.fuseable.FuseToFlowable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.p079d.C2667a;
import java.util.NoSuchElementException;
import org.reactivestreams.Subscription;

/* renamed from: io.reactivex.internal.operators.flowable.i */
public final class C18372i<T> extends C3960g<T> implements FuseToFlowable<T> {
    /* renamed from: a */
    final C3957b<T> f57113a;
    /* renamed from: b */
    final long f57114b;
    /* renamed from: c */
    final T f57115c;

    /* renamed from: io.reactivex.internal.operators.flowable.i$a */
    static final class C18371a<T> implements FlowableSubscriber<T>, Disposable {
        /* renamed from: a */
        final SingleObserver<? super T> f57107a;
        /* renamed from: b */
        final long f57108b;
        /* renamed from: c */
        final T f57109c;
        /* renamed from: d */
        Subscription f57110d;
        /* renamed from: e */
        long f57111e;
        /* renamed from: f */
        boolean f57112f;

        C18371a(SingleObserver<? super T> singleObserver, long j, T t) {
            this.f57107a = singleObserver;
            this.f57108b = j;
            this.f57109c = t;
        }

        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f57110d, subscription)) {
                this.f57110d = subscription;
                this.f57107a.onSubscribe(this);
                subscription.request(Format.OFFSET_SAMPLE_RELATIVE);
            }
        }

        public void onNext(T t) {
            if (!this.f57112f) {
                long j = this.f57111e;
                if (j == this.f57108b) {
                    this.f57112f = true;
                    this.f57110d.cancel();
                    this.f57110d = SubscriptionHelper.CANCELLED;
                    this.f57107a.onSuccess(t);
                    return;
                }
                this.f57111e = j + 1;
            }
        }

        public void onError(Throwable th) {
            if (this.f57112f) {
                C2667a.a(th);
                return;
            }
            this.f57112f = true;
            this.f57110d = SubscriptionHelper.CANCELLED;
            this.f57107a.onError(th);
        }

        public void onComplete() {
            this.f57110d = SubscriptionHelper.CANCELLED;
            if (!this.f57112f) {
                this.f57112f = true;
                Object obj = this.f57109c;
                if (obj != null) {
                    this.f57107a.onSuccess(obj);
                } else {
                    this.f57107a.onError(new NoSuchElementException());
                }
            }
        }

        public void dispose() {
            this.f57110d.cancel();
            this.f57110d = SubscriptionHelper.CANCELLED;
        }

        public boolean isDisposed() {
            return this.f57110d == SubscriptionHelper.CANCELLED;
        }
    }

    public C18372i(C3957b<T> c3957b, long j, T t) {
        this.f57113a = c3957b;
        this.f57114b = j;
        this.f57115c = t;
    }

    /* renamed from: a */
    protected void m66470a(SingleObserver<? super T> singleObserver) {
        this.f57113a.a(new C18371a(singleObserver, this.f57114b, this.f57115c));
    }

    public C3957b<T> fuseToFlowable() {
        return C2667a.a(new FlowableElementAt(this.f57113a, this.f57114b, this.f57115c, true));
    }
}
