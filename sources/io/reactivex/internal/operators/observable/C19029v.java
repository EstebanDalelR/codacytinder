package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.EmptyComponent;

/* renamed from: io.reactivex.internal.operators.observable.v */
public final class C19029v<T> extends C18394a<T, T> {

    /* renamed from: io.reactivex.internal.operators.observable.v$a */
    static final class C17502a<T> implements Observer<T>, Disposable {
        /* renamed from: a */
        Observer<? super T> f54039a;
        /* renamed from: b */
        Disposable f54040b;

        C17502a(Observer<? super T> observer) {
            this.f54039a = observer;
        }

        public void dispose() {
            Disposable disposable = this.f54040b;
            this.f54040b = EmptyComponent.INSTANCE;
            this.f54039a = EmptyComponent.asObserver();
            disposable.dispose();
        }

        public boolean isDisposed() {
            return this.f54040b.isDisposed();
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f54040b, disposable)) {
                this.f54040b = disposable;
                this.f54039a.onSubscribe(this);
            }
        }

        public void onNext(T t) {
            this.f54039a.onNext(t);
        }

        public void onError(Throwable th) {
            Observer observer = this.f54039a;
            this.f54040b = EmptyComponent.INSTANCE;
            this.f54039a = EmptyComponent.asObserver();
            observer.onError(th);
        }

        public void onComplete() {
            Observer observer = this.f54039a;
            this.f54040b = EmptyComponent.INSTANCE;
            this.f54039a = EmptyComponent.asObserver();
            observer.onComplete();
        }
    }

    public C19029v(ObservableSource<T> observableSource) {
        super(observableSource);
    }

    protected void subscribeActual(Observer<? super T> observer) {
        this.a.subscribe(new C17502a(observer));
    }
}
