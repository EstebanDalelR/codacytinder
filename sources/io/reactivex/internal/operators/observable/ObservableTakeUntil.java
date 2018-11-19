package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.ArrayCompositeDisposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.observers.C17530d;
import java.util.concurrent.atomic.AtomicBoolean;

public final class ObservableTakeUntil<T, U> extends C18394a<T, T> {
    /* renamed from: b */
    final ObservableSource<? extends U> f58999b;

    static final class TakeUntilObserver<T> extends AtomicBoolean implements Observer<T> {
        private static final long serialVersionUID = 3451719290311127173L;
        /* renamed from: a */
        final Observer<? super T> f53752a;
        /* renamed from: b */
        final ArrayCompositeDisposable f53753b;
        /* renamed from: c */
        Disposable f53754c;

        TakeUntilObserver(Observer<? super T> observer, ArrayCompositeDisposable arrayCompositeDisposable) {
            this.f53752a = observer;
            this.f53753b = arrayCompositeDisposable;
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f53754c, disposable)) {
                this.f53754c = disposable;
                this.f53753b.m63456a(0, disposable);
            }
        }

        public void onNext(T t) {
            this.f53752a.onNext(t);
        }

        public void onError(Throwable th) {
            this.f53753b.dispose();
            this.f53752a.onError(th);
        }

        public void onComplete() {
            this.f53753b.dispose();
            this.f53752a.onComplete();
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableTakeUntil$a */
    final class C17451a implements Observer<U> {
        /* renamed from: a */
        final /* synthetic */ ObservableTakeUntil f53755a;
        /* renamed from: b */
        private final ArrayCompositeDisposable f53756b;
        /* renamed from: c */
        private final C17530d<T> f53757c;

        C17451a(ObservableTakeUntil observableTakeUntil, ArrayCompositeDisposable arrayCompositeDisposable, C17530d<T> c17530d) {
            this.f53755a = observableTakeUntil;
            this.f53756b = arrayCompositeDisposable;
            this.f53757c = c17530d;
        }

        public void onSubscribe(Disposable disposable) {
            this.f53756b.m63456a(1, disposable);
        }

        public void onNext(U u) {
            this.f53756b.dispose();
            this.f53757c.onComplete();
        }

        public void onError(Throwable th) {
            this.f53756b.dispose();
            this.f53757c.onError(th);
        }

        public void onComplete() {
            this.f53756b.dispose();
            this.f53757c.onComplete();
        }
    }

    public ObservableTakeUntil(ObservableSource<T> observableSource, ObservableSource<? extends U> observableSource2) {
        super(observableSource);
        this.f58999b = observableSource2;
    }

    public void subscribeActual(Observer<? super T> observer) {
        Object c17530d = new C17530d(observer);
        Object arrayCompositeDisposable = new ArrayCompositeDisposable(2);
        Observer takeUntilObserver = new TakeUntilObserver(c17530d, arrayCompositeDisposable);
        observer.onSubscribe(arrayCompositeDisposable);
        this.f58999b.subscribe(new C17451a(this, arrayCompositeDisposable, c17530d));
        this.a.subscribe(takeUntilObserver);
    }
}
