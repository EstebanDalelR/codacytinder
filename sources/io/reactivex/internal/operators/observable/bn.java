package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.SequentialDisposable;

public final class bn<T> extends C18394a<T, T> {
    /* renamed from: b */
    final ObservableSource<? extends T> f59041b;

    /* renamed from: io.reactivex.internal.operators.observable.bn$a */
    static final class C17480a<T> implements Observer<T> {
        /* renamed from: a */
        final Observer<? super T> f53952a;
        /* renamed from: b */
        final ObservableSource<? extends T> f53953b;
        /* renamed from: c */
        final SequentialDisposable f53954c = new SequentialDisposable();
        /* renamed from: d */
        boolean f53955d = true;

        C17480a(Observer<? super T> observer, ObservableSource<? extends T> observableSource) {
            this.f53952a = observer;
            this.f53953b = observableSource;
        }

        public void onSubscribe(Disposable disposable) {
            this.f53954c.m63457a(disposable);
        }

        public void onNext(T t) {
            if (this.f53955d) {
                this.f53955d = false;
            }
            this.f53952a.onNext(t);
        }

        public void onError(Throwable th) {
            this.f53952a.onError(th);
        }

        public void onComplete() {
            if (this.f53955d) {
                this.f53955d = false;
                this.f53953b.subscribe(this);
                return;
            }
            this.f53952a.onComplete();
        }
    }

    public bn(ObservableSource<T> observableSource, ObservableSource<? extends T> observableSource2) {
        super(observableSource);
        this.f59041b = observableSource2;
    }

    public void subscribeActual(Observer<? super T> observer) {
        Observer c17480a = new C17480a(observer, this.f59041b);
        observer.onSubscribe(c17480a.f53954c);
        this.a.subscribe(c17480a);
    }
}
