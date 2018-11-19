package io.reactivex.internal.operators.maybe;

import io.reactivex.C3959e;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.HasUpstreamMaybeSource;
import io.reactivex.internal.observers.DeferredScalarDisposable;

public final class MaybeToObservable<T> extends C3959e<T> implements HasUpstreamMaybeSource<T> {
    /* renamed from: a */
    final MaybeSource<T> f57151a;

    static final class MaybeToFlowableSubscriber<T> extends DeferredScalarDisposable<T> implements MaybeObserver<T> {
        private static final long serialVersionUID = 7603343402964826922L;
        /* renamed from: c */
        Disposable f59916c;

        MaybeToFlowableSubscriber(Observer<? super T> observer) {
            super(observer);
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f59916c, disposable)) {
                this.f59916c = disposable;
                this.a.onSubscribe(this);
            }
        }

        public void onSuccess(T t) {
            m68178a((Object) t);
        }

        public void onError(Throwable th) {
            m68179a(th);
        }

        public void onComplete() {
            m68177a();
        }

        public void dispose() {
            super.dispose();
            this.f59916c.dispose();
        }
    }

    public MaybeToObservable(MaybeSource<T> maybeSource) {
        this.f57151a = maybeSource;
    }

    public MaybeSource<T> source() {
        return this.f57151a;
    }

    protected void subscribeActual(Observer<? super T> observer) {
        this.f57151a.subscribe(new MaybeToFlowableSubscriber(observer));
    }
}
