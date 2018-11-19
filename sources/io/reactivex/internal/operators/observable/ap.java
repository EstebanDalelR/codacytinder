package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;

public final class ap<T> extends C18394a<T, T> {

    /* renamed from: io.reactivex.internal.operators.observable.ap$a */
    static final class C17461a<T> implements Observer<T>, Disposable {
        /* renamed from: a */
        final Observer<? super T> f53878a;
        /* renamed from: b */
        Disposable f53879b;

        C17461a(Observer<? super T> observer) {
            this.f53878a = observer;
        }

        public void dispose() {
            this.f53879b.dispose();
        }

        public boolean isDisposed() {
            return this.f53879b.isDisposed();
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f53879b, disposable)) {
                this.f53879b = disposable;
                this.f53878a.onSubscribe(this);
            }
        }

        public void onNext(T t) {
            this.f53878a.onNext(t);
        }

        public void onError(Throwable th) {
            this.f53878a.onError(th);
        }

        public void onComplete() {
            this.f53878a.onComplete();
        }
    }

    public ap(ObservableSource<T> observableSource) {
        super(observableSource);
    }

    protected void subscribeActual(Observer<? super T> observer) {
        this.a.subscribe(new C17461a(observer));
    }
}
