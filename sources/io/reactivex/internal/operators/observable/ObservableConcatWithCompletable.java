package io.reactivex.internal.operators.observable;

import io.reactivex.C3959e;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

public final class ObservableConcatWithCompletable<T> extends C18394a<T, T> {
    /* renamed from: b */
    final CompletableSource f58916b;

    static final class ConcatWithObserver<T> extends AtomicReference<Disposable> implements CompletableObserver, Observer<T>, Disposable {
        private static final long serialVersionUID = -1953724749712440952L;
        /* renamed from: a */
        final Observer<? super T> f53416a;
        /* renamed from: b */
        CompletableSource f53417b;
        /* renamed from: c */
        boolean f53418c;

        ConcatWithObserver(Observer<? super T> observer, CompletableSource completableSource) {
            this.f53416a = observer;
            this.f53417b = completableSource;
        }

        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.setOnce(this, disposable) != null && this.f53418c == null) {
                this.f53416a.onSubscribe(this);
            }
        }

        public void onNext(T t) {
            this.f53416a.onNext(t);
        }

        public void onError(Throwable th) {
            this.f53416a.onError(th);
        }

        public void onComplete() {
            if (this.f53418c) {
                this.f53416a.onComplete();
                return;
            }
            this.f53418c = true;
            DisposableHelper.replace(this, null);
            CompletableSource completableSource = this.f53417b;
            this.f53417b = null;
            completableSource.subscribe(this);
        }

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        public boolean isDisposed() {
            return DisposableHelper.isDisposed((Disposable) get());
        }
    }

    public ObservableConcatWithCompletable(C3959e<T> c3959e, CompletableSource completableSource) {
        super(c3959e);
        this.f58916b = completableSource;
    }

    protected void subscribeActual(Observer<? super T> observer) {
        this.a.subscribe(new ConcatWithObserver(observer, this.f58916b));
    }
}
