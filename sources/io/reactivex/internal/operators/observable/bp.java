package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;

public final class bp<T> extends C18394a<T, T> {

    /* renamed from: io.reactivex.internal.operators.observable.bp$a */
    static final class C17482a<T> implements Observer<T>, Disposable {
        /* renamed from: a */
        final Observer<? super T> f53960a;
        /* renamed from: b */
        Disposable f53961b;
        /* renamed from: c */
        T f53962c;

        C17482a(Observer<? super T> observer) {
            this.f53960a = observer;
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f53961b, disposable)) {
                this.f53961b = disposable;
                this.f53960a.onSubscribe(this);
            }
        }

        public void onNext(T t) {
            this.f53962c = t;
        }

        public void onError(Throwable th) {
            this.f53962c = null;
            this.f53960a.onError(th);
        }

        public void onComplete() {
            m63708a();
        }

        /* renamed from: a */
        void m63708a() {
            Object obj = this.f53962c;
            if (obj != null) {
                this.f53962c = null;
                this.f53960a.onNext(obj);
            }
            this.f53960a.onComplete();
        }

        public void dispose() {
            this.f53962c = null;
            this.f53961b.dispose();
        }

        public boolean isDisposed() {
            return this.f53961b.isDisposed();
        }
    }

    public bp(ObservableSource<T> observableSource) {
        super(observableSource);
    }

    public void subscribeActual(Observer<? super T> observer) {
        this.a.subscribe(new C17482a(observer));
    }
}
