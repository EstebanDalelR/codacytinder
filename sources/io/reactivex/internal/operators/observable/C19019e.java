package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C15678a;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.p079d.C2667a;

/* renamed from: io.reactivex.internal.operators.observable.e */
public final class C19019e<T> extends C18394a<T, Boolean> {
    /* renamed from: b */
    final Predicate<? super T> f59062b;

    /* renamed from: io.reactivex.internal.operators.observable.e$a */
    static final class C17489a<T> implements Observer<T>, Disposable {
        /* renamed from: a */
        final Observer<? super Boolean> f53987a;
        /* renamed from: b */
        final Predicate<? super T> f53988b;
        /* renamed from: c */
        Disposable f53989c;
        /* renamed from: d */
        boolean f53990d;

        C17489a(Observer<? super Boolean> observer, Predicate<? super T> predicate) {
            this.f53987a = observer;
            this.f53988b = predicate;
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f53989c, disposable)) {
                this.f53989c = disposable;
                this.f53987a.onSubscribe(this);
            }
        }

        public void onNext(T t) {
            if (!this.f53990d) {
                try {
                    if (this.f53988b.test(t) == null) {
                        this.f53990d = true;
                        this.f53989c.dispose();
                        this.f53987a.onNext(Boolean.valueOf(false));
                        this.f53987a.onComplete();
                    }
                } catch (T t2) {
                    C15678a.m58850b(t2);
                    this.f53989c.dispose();
                    onError(t2);
                }
            }
        }

        public void onError(Throwable th) {
            if (this.f53990d) {
                C2667a.a(th);
                return;
            }
            this.f53990d = true;
            this.f53987a.onError(th);
        }

        public void onComplete() {
            if (!this.f53990d) {
                this.f53990d = true;
                this.f53987a.onNext(Boolean.valueOf(true));
                this.f53987a.onComplete();
            }
        }

        public void dispose() {
            this.f53989c.dispose();
        }

        public boolean isDisposed() {
            return this.f53989c.isDisposed();
        }
    }

    public C19019e(ObservableSource<T> observableSource, Predicate<? super T> predicate) {
        super(observableSource);
        this.f59062b = predicate;
    }

    protected void subscribeActual(Observer<? super Boolean> observer) {
        this.a.subscribe(new C17489a(observer, this.f59062b));
    }
}
