package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.ArrayCompositeDisposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.observers.C17530d;

public final class bl<T, U> extends C18394a<T, T> {
    /* renamed from: b */
    final ObservableSource<U> f59039b;

    /* renamed from: io.reactivex.internal.operators.observable.bl$a */
    final class C17477a implements Observer<U> {
        /* renamed from: a */
        Disposable f53938a;
        /* renamed from: b */
        final /* synthetic */ bl f53939b;
        /* renamed from: c */
        private final ArrayCompositeDisposable f53940c;
        /* renamed from: d */
        private final C17478b<T> f53941d;
        /* renamed from: e */
        private final C17530d<T> f53942e;

        C17477a(bl blVar, ArrayCompositeDisposable arrayCompositeDisposable, C17478b<T> c17478b, C17530d<T> c17530d) {
            this.f53939b = blVar;
            this.f53940c = arrayCompositeDisposable;
            this.f53941d = c17478b;
            this.f53942e = c17530d;
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f53938a, disposable)) {
                this.f53938a = disposable;
                this.f53940c.m63456a(1, disposable);
            }
        }

        public void onNext(U u) {
            this.f53938a.dispose();
            this.f53941d.f53946d = true;
        }

        public void onError(Throwable th) {
            this.f53940c.dispose();
            this.f53942e.onError(th);
        }

        public void onComplete() {
            this.f53941d.f53946d = true;
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.bl$b */
    static final class C17478b<T> implements Observer<T> {
        /* renamed from: a */
        final Observer<? super T> f53943a;
        /* renamed from: b */
        final ArrayCompositeDisposable f53944b;
        /* renamed from: c */
        Disposable f53945c;
        /* renamed from: d */
        volatile boolean f53946d;
        /* renamed from: e */
        boolean f53947e;

        C17478b(Observer<? super T> observer, ArrayCompositeDisposable arrayCompositeDisposable) {
            this.f53943a = observer;
            this.f53944b = arrayCompositeDisposable;
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f53945c, disposable)) {
                this.f53945c = disposable;
                this.f53944b.m63456a(0, disposable);
            }
        }

        public void onNext(T t) {
            if (this.f53947e) {
                this.f53943a.onNext(t);
            } else if (this.f53946d) {
                this.f53947e = true;
                this.f53943a.onNext(t);
            }
        }

        public void onError(Throwable th) {
            this.f53944b.dispose();
            this.f53943a.onError(th);
        }

        public void onComplete() {
            this.f53944b.dispose();
            this.f53943a.onComplete();
        }
    }

    public bl(ObservableSource<T> observableSource, ObservableSource<U> observableSource2) {
        super(observableSource);
        this.f59039b = observableSource2;
    }

    public void subscribeActual(Observer<? super T> observer) {
        Object c17530d = new C17530d(observer);
        observer = new ArrayCompositeDisposable(2);
        c17530d.onSubscribe(observer);
        Observer c17478b = new C17478b(c17530d, observer);
        this.f59039b.subscribe(new C17477a(this, observer, c17478b, c17530d));
        this.a.subscribe(c17478b);
    }
}
