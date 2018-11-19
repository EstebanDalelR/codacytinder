package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;

/* renamed from: io.reactivex.internal.operators.observable.o */
public final class C19025o<T> extends C18394a<T, Long> {

    /* renamed from: io.reactivex.internal.operators.observable.o$a */
    static final class C17495a implements Observer<Object>, Disposable {
        /* renamed from: a */
        final Observer<? super Long> f54013a;
        /* renamed from: b */
        Disposable f54014b;
        /* renamed from: c */
        long f54015c;

        C17495a(Observer<? super Long> observer) {
            this.f54013a = observer;
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f54014b, disposable)) {
                this.f54014b = disposable;
                this.f54013a.onSubscribe(this);
            }
        }

        public void dispose() {
            this.f54014b.dispose();
        }

        public boolean isDisposed() {
            return this.f54014b.isDisposed();
        }

        public void onNext(Object obj) {
            this.f54015c++;
        }

        public void onError(Throwable th) {
            this.f54013a.onError(th);
        }

        public void onComplete() {
            this.f54013a.onNext(Long.valueOf(this.f54015c));
            this.f54013a.onComplete();
        }
    }

    public C19025o(ObservableSource<T> observableSource) {
        super(observableSource);
    }

    public void subscribeActual(Observer<? super Long> observer) {
        this.a.subscribe(new C17495a(observer));
    }
}
