package io.reactivex.internal.operators.observable;

import io.reactivex.C3960g;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.NoSuchElementException;

public final class au<T> extends C3960g<T> {
    /* renamed from: a */
    final ObservableSource<T> f57254a;
    /* renamed from: b */
    final T f57255b;

    /* renamed from: io.reactivex.internal.operators.observable.au$a */
    static final class C17465a<T> implements Observer<T>, Disposable {
        /* renamed from: a */
        final SingleObserver<? super T> f53887a;
        /* renamed from: b */
        final T f53888b;
        /* renamed from: c */
        Disposable f53889c;
        /* renamed from: d */
        T f53890d;

        C17465a(SingleObserver<? super T> singleObserver, T t) {
            this.f53887a = singleObserver;
            this.f53888b = t;
        }

        public void dispose() {
            this.f53889c.dispose();
            this.f53889c = DisposableHelper.DISPOSED;
        }

        public boolean isDisposed() {
            return this.f53889c == DisposableHelper.DISPOSED;
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f53889c, disposable)) {
                this.f53889c = disposable;
                this.f53887a.onSubscribe(this);
            }
        }

        public void onNext(T t) {
            this.f53890d = t;
        }

        public void onError(Throwable th) {
            this.f53889c = DisposableHelper.DISPOSED;
            this.f53890d = null;
            this.f53887a.onError(th);
        }

        public void onComplete() {
            this.f53889c = DisposableHelper.DISPOSED;
            Object obj = this.f53890d;
            if (obj != null) {
                this.f53890d = null;
                this.f53887a.onSuccess(obj);
                return;
            }
            obj = this.f53888b;
            if (obj != null) {
                this.f53887a.onSuccess(obj);
            } else {
                this.f53887a.onError(new NoSuchElementException());
            }
        }
    }

    public au(ObservableSource<T> observableSource, T t) {
        this.f57254a = observableSource;
        this.f57255b = t;
    }

    /* renamed from: a */
    protected void m66512a(SingleObserver<? super T> singleObserver) {
        this.f57254a.subscribe(new C17465a(singleObserver, this.f57255b));
    }
}
