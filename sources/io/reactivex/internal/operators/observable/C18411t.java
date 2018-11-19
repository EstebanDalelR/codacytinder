package io.reactivex.internal.operators.observable;

import io.reactivex.C3959e;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.p079d.C2667a;

/* renamed from: io.reactivex.internal.operators.observable.t */
public final class C18411t<T, U> extends C3959e<T> {
    /* renamed from: a */
    final ObservableSource<? extends T> f57304a;
    /* renamed from: b */
    final ObservableSource<U> f57305b;

    /* renamed from: io.reactivex.internal.operators.observable.t$a */
    final class C17500a implements Observer<U> {
        /* renamed from: a */
        final SequentialDisposable f54032a;
        /* renamed from: b */
        final Observer<? super T> f54033b;
        /* renamed from: c */
        boolean f54034c;
        /* renamed from: d */
        final /* synthetic */ C18411t f54035d;

        /* renamed from: io.reactivex.internal.operators.observable.t$a$a */
        final class C17499a implements Observer<T> {
            /* renamed from: a */
            final /* synthetic */ C17500a f54031a;

            C17499a(C17500a c17500a) {
                this.f54031a = c17500a;
            }

            public void onSubscribe(Disposable disposable) {
                this.f54031a.f54032a.m63457a(disposable);
            }

            public void onNext(T t) {
                this.f54031a.f54033b.onNext(t);
            }

            public void onError(Throwable th) {
                this.f54031a.f54033b.onError(th);
            }

            public void onComplete() {
                this.f54031a.f54033b.onComplete();
            }
        }

        C17500a(C18411t c18411t, SequentialDisposable sequentialDisposable, Observer<? super T> observer) {
            this.f54035d = c18411t;
            this.f54032a = sequentialDisposable;
            this.f54033b = observer;
        }

        public void onSubscribe(Disposable disposable) {
            this.f54032a.m63457a(disposable);
        }

        public void onNext(U u) {
            onComplete();
        }

        public void onError(Throwable th) {
            if (this.f54034c) {
                C2667a.a(th);
                return;
            }
            this.f54034c = true;
            this.f54033b.onError(th);
        }

        public void onComplete() {
            if (!this.f54034c) {
                this.f54034c = true;
                this.f54035d.f57304a.subscribe(new C17499a(this));
            }
        }
    }

    public C18411t(ObservableSource<? extends T> observableSource, ObservableSource<U> observableSource2) {
        this.f57304a = observableSource;
        this.f57305b = observableSource2;
    }

    public void subscribeActual(Observer<? super T> observer) {
        Object sequentialDisposable = new SequentialDisposable();
        observer.onSubscribe(sequentialDisposable);
        this.f57305b.subscribe(new C17500a(this, sequentialDisposable, observer));
    }
}
