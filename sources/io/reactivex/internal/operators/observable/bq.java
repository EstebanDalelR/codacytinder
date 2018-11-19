package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C15678a;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.p079d.C2667a;

public final class bq<T> extends C18394a<T, T> {
    /* renamed from: b */
    final Predicate<? super T> f59043b;

    /* renamed from: io.reactivex.internal.operators.observable.bq$a */
    static final class C17483a<T> implements Observer<T>, Disposable {
        /* renamed from: a */
        final Observer<? super T> f53963a;
        /* renamed from: b */
        final Predicate<? super T> f53964b;
        /* renamed from: c */
        Disposable f53965c;
        /* renamed from: d */
        boolean f53966d;

        C17483a(Observer<? super T> observer, Predicate<? super T> predicate) {
            this.f53963a = observer;
            this.f53964b = predicate;
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f53965c, disposable)) {
                this.f53965c = disposable;
                this.f53963a.onSubscribe(this);
            }
        }

        public void dispose() {
            this.f53965c.dispose();
        }

        public boolean isDisposed() {
            return this.f53965c.isDisposed();
        }

        public void onNext(T t) {
            if (!this.f53966d) {
                this.f53963a.onNext(t);
                try {
                    if (this.f53964b.test(t) != null) {
                        this.f53966d = true;
                        this.f53965c.dispose();
                        this.f53963a.onComplete();
                    }
                } catch (T t2) {
                    C15678a.m58850b(t2);
                    this.f53965c.dispose();
                    onError(t2);
                }
            }
        }

        public void onError(Throwable th) {
            if (this.f53966d) {
                C2667a.a(th);
                return;
            }
            this.f53966d = true;
            this.f53963a.onError(th);
        }

        public void onComplete() {
            if (!this.f53966d) {
                this.f53966d = true;
                this.f53963a.onComplete();
            }
        }
    }

    public bq(ObservableSource<T> observableSource, Predicate<? super T> predicate) {
        super(observableSource);
        this.f59043b = predicate;
    }

    public void subscribeActual(Observer<? super T> observer) {
        this.a.subscribe(new C17483a(observer, this.f59043b));
    }
}
