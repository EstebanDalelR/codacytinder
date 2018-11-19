package io.reactivex.internal.operators.completable;

import io.reactivex.C3959e;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/* renamed from: io.reactivex.internal.operators.completable.o */
public final class C18361o<T> extends C3959e<T> {
    /* renamed from: a */
    final CompletableSource f56845a;

    /* renamed from: io.reactivex.internal.operators.completable.o$a */
    static final class C17405a implements CompletableObserver {
        /* renamed from: a */
        private final Observer<?> f53211a;

        C17405a(Observer<?> observer) {
            this.f53211a = observer;
        }

        public void onComplete() {
            this.f53211a.onComplete();
        }

        public void onError(Throwable th) {
            this.f53211a.onError(th);
        }

        public void onSubscribe(Disposable disposable) {
            this.f53211a.onSubscribe(disposable);
        }
    }

    public C18361o(CompletableSource completableSource) {
        this.f56845a = completableSource;
    }

    protected void subscribeActual(Observer<? super T> observer) {
        this.f56845a.subscribe(new C17405a(observer));
    }
}
