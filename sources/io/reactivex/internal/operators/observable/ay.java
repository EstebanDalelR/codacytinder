package io.reactivex.internal.operators.observable;

import io.reactivex.C15675d;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;

public final class ay<T> extends C18394a<T, C15675d<T>> {

    /* renamed from: io.reactivex.internal.operators.observable.ay$a */
    static final class C17467a<T> implements Observer<T>, Disposable {
        /* renamed from: a */
        final Observer<? super C15675d<T>> f53896a;
        /* renamed from: b */
        Disposable f53897b;

        C17467a(Observer<? super C15675d<T>> observer) {
            this.f53896a = observer;
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f53897b, disposable)) {
                this.f53897b = disposable;
                this.f53896a.onSubscribe(this);
            }
        }

        public void dispose() {
            this.f53897b.dispose();
        }

        public boolean isDisposed() {
            return this.f53897b.isDisposed();
        }

        public void onNext(T t) {
            this.f53896a.onNext(C15675d.m58831a((Object) t));
        }

        public void onError(Throwable th) {
            this.f53896a.onNext(C15675d.m58832a(th));
            this.f53896a.onComplete();
        }

        public void onComplete() {
            this.f53896a.onNext(C15675d.m58833f());
            this.f53896a.onComplete();
        }
    }

    public ay(ObservableSource<T> observableSource) {
        super(observableSource);
    }

    public void subscribeActual(Observer<? super C15675d<T>> observer) {
        this.a.subscribe(new C17467a(observer));
    }
}
