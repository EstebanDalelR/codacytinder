package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C15678a;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.disposables.DisposableHelper;

public final class bm<T> extends C18394a<T, T> {
    /* renamed from: b */
    final Predicate<? super T> f59040b;

    /* renamed from: io.reactivex.internal.operators.observable.bm$a */
    static final class C17479a<T> implements Observer<T>, Disposable {
        /* renamed from: a */
        final Observer<? super T> f53948a;
        /* renamed from: b */
        final Predicate<? super T> f53949b;
        /* renamed from: c */
        Disposable f53950c;
        /* renamed from: d */
        boolean f53951d;

        C17479a(Observer<? super T> observer, Predicate<? super T> predicate) {
            this.f53948a = observer;
            this.f53949b = predicate;
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f53950c, disposable)) {
                this.f53950c = disposable;
                this.f53948a.onSubscribe(this);
            }
        }

        public void dispose() {
            this.f53950c.dispose();
        }

        public boolean isDisposed() {
            return this.f53950c.isDisposed();
        }

        public void onNext(T t) {
            if (this.f53951d) {
                this.f53948a.onNext(t);
            } else {
                try {
                    if (!this.f53949b.test(t)) {
                        this.f53951d = true;
                        this.f53948a.onNext(t);
                    }
                } catch (T t2) {
                    C15678a.m58850b(t2);
                    this.f53950c.dispose();
                    this.f53948a.onError(t2);
                }
            }
        }

        public void onError(Throwable th) {
            this.f53948a.onError(th);
        }

        public void onComplete() {
            this.f53948a.onComplete();
        }
    }

    public bm(ObservableSource<T> observableSource, Predicate<? super T> predicate) {
        super(observableSource);
        this.f59040b = predicate;
    }

    public void subscribeActual(Observer<? super T> observer) {
        this.a.subscribe(new C17479a(observer, this.f59040b));
    }
}
