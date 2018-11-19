package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C15678a;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.p079d.C2667a;

public final class ba<T> extends C18394a<T, T> {
    /* renamed from: b */
    final Function<? super Throwable, ? extends ObservableSource<? extends T>> f59032b;
    /* renamed from: c */
    final boolean f59033c;

    /* renamed from: io.reactivex.internal.operators.observable.ba$a */
    static final class C17468a<T> implements Observer<T> {
        /* renamed from: a */
        final Observer<? super T> f53898a;
        /* renamed from: b */
        final Function<? super Throwable, ? extends ObservableSource<? extends T>> f53899b;
        /* renamed from: c */
        final boolean f53900c;
        /* renamed from: d */
        final SequentialDisposable f53901d = new SequentialDisposable();
        /* renamed from: e */
        boolean f53902e;
        /* renamed from: f */
        boolean f53903f;

        C17468a(Observer<? super T> observer, Function<? super Throwable, ? extends ObservableSource<? extends T>> function, boolean z) {
            this.f53898a = observer;
            this.f53899b = function;
            this.f53900c = z;
        }

        public void onSubscribe(Disposable disposable) {
            this.f53901d.m63458b(disposable);
        }

        public void onNext(T t) {
            if (!this.f53903f) {
                this.f53898a.onNext(t);
            }
        }

        public void onError(Throwable th) {
            if (!this.f53902e) {
                this.f53902e = true;
                if (!this.f53900c || (th instanceof Exception)) {
                    try {
                        ObservableSource observableSource = (ObservableSource) this.f53899b.apply(th);
                        if (observableSource == null) {
                            Throwable nullPointerException = new NullPointerException("Observable is null");
                            nullPointerException.initCause(th);
                            this.f53898a.onError(nullPointerException);
                            return;
                        }
                        observableSource.subscribe(this);
                        return;
                    } catch (Throwable th2) {
                        C15678a.m58850b(th2);
                        this.f53898a.onError(new CompositeException(th, th2));
                        return;
                    }
                }
                this.f53898a.onError(th);
            } else if (this.f53903f) {
                C2667a.a(th);
            } else {
                this.f53898a.onError(th);
            }
        }

        public void onComplete() {
            if (!this.f53903f) {
                this.f53903f = true;
                this.f53902e = true;
                this.f53898a.onComplete();
            }
        }
    }

    public ba(ObservableSource<T> observableSource, Function<? super Throwable, ? extends ObservableSource<? extends T>> function, boolean z) {
        super(observableSource);
        this.f59032b = function;
        this.f59033c = z;
    }

    public void subscribeActual(Observer<? super T> observer) {
        Observer c17468a = new C17468a(observer, this.f59032b, this.f59033c);
        observer.onSubscribe(c17468a.f53901d);
        this.a.subscribe(c17468a);
    }
}
