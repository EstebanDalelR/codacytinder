package io.reactivex.internal.operators.observable;

import io.reactivex.C3958c;
import io.reactivex.MaybeObserver;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;

public final class at<T> extends C3958c<T> {
    /* renamed from: a */
    final ObservableSource<T> f57253a;

    /* renamed from: io.reactivex.internal.operators.observable.at$a */
    static final class C17464a<T> implements Observer<T>, Disposable {
        /* renamed from: a */
        final MaybeObserver<? super T> f53884a;
        /* renamed from: b */
        Disposable f53885b;
        /* renamed from: c */
        T f53886c;

        C17464a(MaybeObserver<? super T> maybeObserver) {
            this.f53884a = maybeObserver;
        }

        public void dispose() {
            this.f53885b.dispose();
            this.f53885b = DisposableHelper.DISPOSED;
        }

        public boolean isDisposed() {
            return this.f53885b == DisposableHelper.DISPOSED;
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f53885b, disposable)) {
                this.f53885b = disposable;
                this.f53884a.onSubscribe(this);
            }
        }

        public void onNext(T t) {
            this.f53886c = t;
        }

        public void onError(Throwable th) {
            this.f53885b = DisposableHelper.DISPOSED;
            this.f53886c = null;
            this.f53884a.onError(th);
        }

        public void onComplete() {
            this.f53885b = DisposableHelper.DISPOSED;
            Object obj = this.f53886c;
            if (obj != null) {
                this.f53886c = null;
                this.f53884a.onSuccess(obj);
                return;
            }
            this.f53884a.onComplete();
        }
    }

    public at(ObservableSource<T> observableSource) {
        this.f57253a = observableSource;
    }

    /* renamed from: a */
    protected void m66511a(MaybeObserver<? super T> maybeObserver) {
        this.f57253a.subscribe(new C17464a(maybeObserver));
    }
}
