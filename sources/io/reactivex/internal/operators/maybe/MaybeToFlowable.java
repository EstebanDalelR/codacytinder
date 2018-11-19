package io.reactivex.internal.operators.maybe;

import io.reactivex.C3957b;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.HasUpstreamMaybeSource;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import org.reactivestreams.Subscriber;

public final class MaybeToFlowable<T> extends C3957b<T> implements HasUpstreamMaybeSource<T> {
    /* renamed from: a */
    final MaybeSource<T> f57150a;

    static final class MaybeToFlowableSubscriber<T> extends DeferredScalarSubscription<T> implements MaybeObserver<T> {
        private static final long serialVersionUID = 7603343402964826922L;
        /* renamed from: a */
        Disposable f59915a;

        MaybeToFlowableSubscriber(Subscriber<? super T> subscriber) {
            super(subscriber);
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f59915a, disposable)) {
                this.f59915a = disposable;
                this.g.onSubscribe(this);
            }
        }

        public void onSuccess(T t) {
            m68249a(t);
        }

        public void onError(Throwable th) {
            this.g.onError(th);
        }

        public void onComplete() {
            this.g.onComplete();
        }

        public void cancel() {
            super.cancel();
            this.f59915a.dispose();
        }
    }

    public MaybeToFlowable(MaybeSource<T> maybeSource) {
        this.f57150a = maybeSource;
    }

    public MaybeSource<T> source() {
        return this.f57150a;
    }

    /* renamed from: a */
    protected void m66482a(Subscriber<? super T> subscriber) {
        this.f57150a.subscribe(new MaybeToFlowableSubscriber(subscriber));
    }
}
