package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public final class aq<T> extends C18394a<T, T> {

    /* renamed from: io.reactivex.internal.operators.observable.aq$a */
    static final class C17462a<T> implements Observer<T>, Disposable {
        /* renamed from: a */
        final Observer<? super T> f53880a;
        /* renamed from: b */
        Disposable f53881b;

        public void onNext(T t) {
        }

        C17462a(Observer<? super T> observer) {
            this.f53880a = observer;
        }

        public void onSubscribe(Disposable disposable) {
            this.f53881b = disposable;
            this.f53880a.onSubscribe(this);
        }

        public void onError(Throwable th) {
            this.f53880a.onError(th);
        }

        public void onComplete() {
            this.f53880a.onComplete();
        }

        public void dispose() {
            this.f53881b.dispose();
        }

        public boolean isDisposed() {
            return this.f53881b.isDisposed();
        }
    }

    public aq(ObservableSource<T> observableSource) {
        super(observableSource);
    }

    public void subscribeActual(Observer<? super T> observer) {
        this.a.subscribe(new C17462a(observer));
    }
}
