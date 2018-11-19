package io.reactivex.internal.operators.flowable;

import com.google.android.exoplayer2.Format;
import io.reactivex.C3957b;
import io.reactivex.C3960g;
import io.reactivex.FlowableSubscriber;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C15678a;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.C15684a;
import io.reactivex.internal.fuseable.FuseToFlowable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.ArrayListSupplier;
import io.reactivex.p079d.C2667a;
import java.util.Collection;
import java.util.concurrent.Callable;
import org.reactivestreams.Subscription;

/* renamed from: io.reactivex.internal.operators.flowable.u */
public final class C18384u<T, U extends Collection<? super T>> extends C3960g<U> implements FuseToFlowable<U> {
    /* renamed from: a */
    final C3957b<T> f57141a;
    /* renamed from: b */
    final Callable<U> f57142b;

    /* renamed from: io.reactivex.internal.operators.flowable.u$a */
    static final class C18383a<T, U extends Collection<? super T>> implements FlowableSubscriber<T>, Disposable {
        /* renamed from: a */
        final SingleObserver<? super U> f57138a;
        /* renamed from: b */
        Subscription f57139b;
        /* renamed from: c */
        U f57140c;

        C18383a(SingleObserver<? super U> singleObserver, U u) {
            this.f57138a = singleObserver;
            this.f57140c = u;
        }

        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f57139b, subscription)) {
                this.f57139b = subscription;
                this.f57138a.onSubscribe(this);
                subscription.request(Format.OFFSET_SAMPLE_RELATIVE);
            }
        }

        public void onNext(T t) {
            this.f57140c.add(t);
        }

        public void onError(Throwable th) {
            this.f57140c = null;
            this.f57139b = SubscriptionHelper.CANCELLED;
            this.f57138a.onError(th);
        }

        public void onComplete() {
            this.f57139b = SubscriptionHelper.CANCELLED;
            this.f57138a.onSuccess(this.f57140c);
        }

        public void dispose() {
            this.f57139b.cancel();
            this.f57139b = SubscriptionHelper.CANCELLED;
        }

        public boolean isDisposed() {
            return this.f57139b == SubscriptionHelper.CANCELLED;
        }
    }

    public C18384u(C3957b<T> c3957b) {
        this(c3957b, ArrayListSupplier.asCallable());
    }

    public C18384u(C3957b<T> c3957b, Callable<U> callable) {
        this.f57141a = c3957b;
        this.f57142b = callable;
    }

    /* renamed from: a */
    protected void m66477a(SingleObserver<? super U> singleObserver) {
        try {
            this.f57141a.a(new C18383a(singleObserver, (Collection) C15684a.m58895a(this.f57142b.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th) {
            C15678a.m58850b(th);
            EmptyDisposable.error(th, (SingleObserver) singleObserver);
        }
    }

    public C3957b<U> fuseToFlowable() {
        return C2667a.a(new FlowableToList(this.f57141a, this.f57142b));
    }
}
