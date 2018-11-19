package io.reactivex.internal.operators.completable;

import io.reactivex.C3956a;
import io.reactivex.CompletableObserver;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/* renamed from: io.reactivex.internal.operators.completable.e */
public final class C18350e<T> extends C3956a {
    /* renamed from: a */
    final ObservableSource<T> f56825a;

    /* renamed from: io.reactivex.internal.operators.completable.e$a */
    static final class C17398a<T> implements Observer<T> {
        /* renamed from: a */
        final CompletableObserver f53196a;

        public void onNext(T t) {
        }

        C17398a(CompletableObserver completableObserver) {
            this.f53196a = completableObserver;
        }

        public void onSubscribe(Disposable disposable) {
            this.f53196a.onSubscribe(disposable);
        }

        public void onError(Throwable th) {
            this.f53196a.onError(th);
        }

        public void onComplete() {
            this.f53196a.onComplete();
        }
    }

    public C18350e(ObservableSource<T> observableSource) {
        this.f56825a = observableSource;
    }

    /* renamed from: a */
    protected void m66393a(CompletableObserver completableObserver) {
        this.f56825a.subscribe(new C17398a(completableObserver));
    }
}
