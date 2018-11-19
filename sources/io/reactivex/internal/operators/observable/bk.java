package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public final class bk<T> extends C18394a<T, T> {
    /* renamed from: b */
    final long f59038b;

    /* renamed from: io.reactivex.internal.operators.observable.bk$a */
    static final class C17476a<T> implements Observer<T>, Disposable {
        /* renamed from: a */
        final Observer<? super T> f53935a;
        /* renamed from: b */
        long f53936b;
        /* renamed from: c */
        Disposable f53937c;

        C17476a(Observer<? super T> observer, long j) {
            this.f53935a = observer;
            this.f53936b = j;
        }

        public void onSubscribe(Disposable disposable) {
            this.f53937c = disposable;
            this.f53935a.onSubscribe(this);
        }

        public void onNext(T t) {
            if (this.f53936b != 0) {
                this.f53936b--;
            } else {
                this.f53935a.onNext(t);
            }
        }

        public void onError(Throwable th) {
            this.f53935a.onError(th);
        }

        public void onComplete() {
            this.f53935a.onComplete();
        }

        public void dispose() {
            this.f53937c.dispose();
        }

        public boolean isDisposed() {
            return this.f53937c.isDisposed();
        }
    }

    public bk(ObservableSource<T> observableSource, long j) {
        super(observableSource);
        this.f59038b = j;
    }

    public void subscribeActual(Observer<? super T> observer) {
        this.a.subscribe(new C17476a(observer, this.f59038b));
    }
}
