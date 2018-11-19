package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C15678a;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.p079d.C2667a;

public final class br<T> extends C18394a<T, T> {
    /* renamed from: b */
    final Predicate<? super T> f59044b;

    /* renamed from: io.reactivex.internal.operators.observable.br$a */
    static final class C17484a<T> implements Observer<T>, Disposable {
        /* renamed from: a */
        final Observer<? super T> f53967a;
        /* renamed from: b */
        final Predicate<? super T> f53968b;
        /* renamed from: c */
        Disposable f53969c;
        /* renamed from: d */
        boolean f53970d;

        C17484a(Observer<? super T> observer, Predicate<? super T> predicate) {
            this.f53967a = observer;
            this.f53968b = predicate;
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f53969c, disposable)) {
                this.f53969c = disposable;
                this.f53967a.onSubscribe(this);
            }
        }

        public void dispose() {
            this.f53969c.dispose();
        }

        public boolean isDisposed() {
            return this.f53969c.isDisposed();
        }

        public void onNext(T t) {
            if (!this.f53970d) {
                try {
                    if (this.f53968b.test(t)) {
                        this.f53967a.onNext(t);
                        return;
                    }
                    this.f53970d = true;
                    this.f53969c.dispose();
                    this.f53967a.onComplete();
                } catch (T t2) {
                    C15678a.m58850b(t2);
                    this.f53969c.dispose();
                    onError(t2);
                }
            }
        }

        public void onError(Throwable th) {
            if (this.f53970d) {
                C2667a.a(th);
                return;
            }
            this.f53970d = true;
            this.f53967a.onError(th);
        }

        public void onComplete() {
            if (!this.f53970d) {
                this.f53970d = true;
                this.f53967a.onComplete();
            }
        }
    }

    public br(ObservableSource<T> observableSource, Predicate<? super T> predicate) {
        super(observableSource);
        this.f59044b = predicate;
    }

    public void subscribeActual(Observer<? super T> observer) {
        this.a.subscribe(new C17484a(observer, this.f59044b));
    }
}
