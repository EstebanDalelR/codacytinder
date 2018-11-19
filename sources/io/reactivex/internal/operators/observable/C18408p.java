package io.reactivex.internal.operators.observable;

import io.reactivex.C3959e;
import io.reactivex.C3960g;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.FuseToObservable;
import io.reactivex.p079d.C2667a;

/* renamed from: io.reactivex.internal.operators.observable.p */
public final class C18408p<T> extends C3960g<Long> implements FuseToObservable<Long> {
    /* renamed from: a */
    final ObservableSource<T> f57297a;

    /* renamed from: io.reactivex.internal.operators.observable.p$a */
    static final class C17496a implements Observer<Object>, Disposable {
        /* renamed from: a */
        final SingleObserver<? super Long> f54016a;
        /* renamed from: b */
        Disposable f54017b;
        /* renamed from: c */
        long f54018c;

        C17496a(SingleObserver<? super Long> singleObserver) {
            this.f54016a = singleObserver;
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f54017b, disposable)) {
                this.f54017b = disposable;
                this.f54016a.onSubscribe(this);
            }
        }

        public void dispose() {
            this.f54017b.dispose();
            this.f54017b = DisposableHelper.DISPOSED;
        }

        public boolean isDisposed() {
            return this.f54017b.isDisposed();
        }

        public void onNext(Object obj) {
            this.f54018c++;
        }

        public void onError(Throwable th) {
            this.f54017b = DisposableHelper.DISPOSED;
            this.f54016a.onError(th);
        }

        public void onComplete() {
            this.f54017b = DisposableHelper.DISPOSED;
            this.f54016a.onSuccess(Long.valueOf(this.f54018c));
        }
    }

    public C18408p(ObservableSource<T> observableSource) {
        this.f57297a = observableSource;
    }

    /* renamed from: a */
    public void m66527a(SingleObserver<? super Long> singleObserver) {
        this.f57297a.subscribe(new C17496a(singleObserver));
    }

    public C3959e<Long> fuseToObservable() {
        return C2667a.a(new C19025o(this.f57297a));
    }
}
