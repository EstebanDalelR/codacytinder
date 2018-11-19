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

/* renamed from: io.reactivex.internal.operators.flowable.r */
public final class C18380r<T> extends C3960g<T> implements FuseToFlowable<T> {
    /* renamed from: a */
    final C3957b<T> f57129a;
    /* renamed from: b */
    final T f57130b;

    /* renamed from: io.reactivex.internal.operators.flowable.r$a */
    static final class C18379a<T> implements FlowableSubscriber<T>, Disposable {
        /* renamed from: a */
        final SingleObserver<? super T> f57124a;
        /* renamed from: b */
        final T f57125b;
        /* renamed from: c */
        Subscription f57126c;
        /* renamed from: d */
        boolean f57127d;
        /* renamed from: e */
        T f57128e;

        C18379a(SingleObserver<? super T> singleObserver, T t) {
            this.f57124a = singleObserver;
            this.f57125b = t;
        }

        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f57126c, subscription)) {
                this.f57126c = subscription;
                this.f57124a.onSubscribe(this);
                subscription.request(Format.OFFSET_SAMPLE_RELATIVE);
            }
        }

        public void onNext(T t) {
            if (!this.f57127d) {
                if (this.f57128e != null) {
                    this.f57127d = true;
                    this.f57126c.cancel();
                    this.f57126c = SubscriptionHelper.CANCELLED;
                    this.f57124a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
                    return;
                }
                this.f57128e = t;
            }
        }

        public void onError(Throwable th) {
            if (this.f57127d) {
                C2667a.a(th);
                return;
            }
            this.f57127d = true;
            this.f57126c = SubscriptionHelper.CANCELLED;
            this.f57124a.onError(th);
        }

        public void onComplete() {
            if (!this.f57127d) {
                this.f57127d = true;
                this.f57126c = SubscriptionHelper.CANCELLED;
                Object obj = this.f57128e;
                this.f57128e = null;
                if (obj == null) {
                    obj = this.f57125b;
                }
                if (obj != null) {
                    this.f57124a.onSuccess(obj);
                } else {
                    this.f57124a.onError(new NoSuchElementException());
                }
            }
        }

        public void dispose() {
            this.f57126c.cancel();
            this.f57126c = SubscriptionHelper.CANCELLED;
        }

        public boolean isDisposed() {
            return this.f57126c == SubscriptionHelper.CANCELLED;
        }
    }

    public C18380r(C3957b<T> c3957b, T t) {
        this.f57129a = c3957b;
        this.f57130b = t;
    }

    /* renamed from: a */
    protected void m66476a(SingleObserver<? super T> singleObserver) {
        this.f57129a.a(new C18379a(singleObserver, this.f57130b));
    }

    public C3957b<T> fuseToFlowable() {
        return C2667a.a(new FlowableSingle(this.f57129a, this.f57130b));
    }
}
