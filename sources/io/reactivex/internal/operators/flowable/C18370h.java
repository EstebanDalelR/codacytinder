package io.reactivex.internal.operators.flowable;

import com.google.android.exoplayer2.Format;
import io.reactivex.C3957b;
import io.reactivex.C3958c;
import io.reactivex.FlowableSubscriber;
import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.fuseable.FuseToFlowable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.p079d.C2667a;
import org.reactivestreams.Subscription;

/* renamed from: io.reactivex.internal.operators.flowable.h */
public final class C18370h<T> extends C3958c<T> implements FuseToFlowable<T> {
    /* renamed from: a */
    final C3957b<T> f57105a;
    /* renamed from: b */
    final long f57106b;

    /* renamed from: io.reactivex.internal.operators.flowable.h$a */
    static final class C18369a<T> implements FlowableSubscriber<T>, Disposable {
        /* renamed from: a */
        final MaybeObserver<? super T> f57100a;
        /* renamed from: b */
        final long f57101b;
        /* renamed from: c */
        Subscription f57102c;
        /* renamed from: d */
        long f57103d;
        /* renamed from: e */
        boolean f57104e;

        C18369a(MaybeObserver<? super T> maybeObserver, long j) {
            this.f57100a = maybeObserver;
            this.f57101b = j;
        }

        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f57102c, subscription)) {
                this.f57102c = subscription;
                this.f57100a.onSubscribe(this);
                subscription.request(Format.OFFSET_SAMPLE_RELATIVE);
            }
        }

        public void onNext(T t) {
            if (!this.f57104e) {
                long j = this.f57103d;
                if (j == this.f57101b) {
                    this.f57104e = true;
                    this.f57102c.cancel();
                    this.f57102c = SubscriptionHelper.CANCELLED;
                    this.f57100a.onSuccess(t);
                    return;
                }
                this.f57103d = j + 1;
            }
        }

        public void onError(Throwable th) {
            if (this.f57104e) {
                C2667a.a(th);
                return;
            }
            this.f57104e = true;
            this.f57102c = SubscriptionHelper.CANCELLED;
            this.f57100a.onError(th);
        }

        public void onComplete() {
            this.f57102c = SubscriptionHelper.CANCELLED;
            if (!this.f57104e) {
                this.f57104e = true;
                this.f57100a.onComplete();
            }
        }

        public void dispose() {
            this.f57102c.cancel();
            this.f57102c = SubscriptionHelper.CANCELLED;
        }

        public boolean isDisposed() {
            return this.f57102c == SubscriptionHelper.CANCELLED;
        }
    }

    public C18370h(C3957b<T> c3957b, long j) {
        this.f57105a = c3957b;
        this.f57106b = j;
    }

    /* renamed from: a */
    protected void m66469a(MaybeObserver<? super T> maybeObserver) {
        this.f57105a.a(new C18369a(maybeObserver, this.f57106b));
    }

    public C3957b<T> fuseToFlowable() {
        return C2667a.a(new FlowableElementAt(this.f57105a, this.f57106b, null, false));
    }
}
