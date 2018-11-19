package io.reactivex.internal.operators.single;

import io.reactivex.C3957b;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import org.reactivestreams.Subscriber;

public final class SingleToFlowable<T> extends C3957b<T> {
    /* renamed from: a */
    final SingleSource<? extends T> f57325a;

    static final class SingleToFlowableObserver<T> extends DeferredScalarSubscription<T> implements SingleObserver<T> {
        private static final long serialVersionUID = 187782011903685568L;
        /* renamed from: a */
        Disposable f59917a;

        SingleToFlowableObserver(Subscriber<? super T> subscriber) {
            super(subscriber);
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f59917a, disposable)) {
                this.f59917a = disposable;
                this.g.onSubscribe(this);
            }
        }

        public void onSuccess(T t) {
            m68249a(t);
        }

        public void onError(Throwable th) {
            this.g.onError(th);
        }

        public void cancel() {
            super.cancel();
            this.f59917a.dispose();
        }
    }

    public SingleToFlowable(SingleSource<? extends T> singleSource) {
        this.f57325a = singleSource;
    }

    /* renamed from: a */
    public void m66538a(Subscriber<? super T> subscriber) {
        this.f57325a.subscribe(new SingleToFlowableObserver(subscriber));
    }
}
