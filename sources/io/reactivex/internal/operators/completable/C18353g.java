package io.reactivex.internal.operators.completable;

import io.reactivex.C3956a;
import io.reactivex.CompletableObserver;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;

/* renamed from: io.reactivex.internal.operators.completable.g */
public final class C18353g<T> extends C3956a {
    /* renamed from: a */
    final SingleSource<T> f56829a;

    /* renamed from: io.reactivex.internal.operators.completable.g$a */
    static final class C17399a<T> implements SingleObserver<T> {
        /* renamed from: a */
        final CompletableObserver f53197a;

        C17399a(CompletableObserver completableObserver) {
            this.f53197a = completableObserver;
        }

        public void onError(Throwable th) {
            this.f53197a.onError(th);
        }

        public void onSubscribe(Disposable disposable) {
            this.f53197a.onSubscribe(disposable);
        }

        public void onSuccess(T t) {
            this.f53197a.onComplete();
        }
    }

    public C18353g(SingleSource<T> singleSource) {
        this.f56829a = singleSource;
    }

    /* renamed from: a */
    protected void m66395a(CompletableObserver completableObserver) {
        this.f56829a.subscribe(new C17399a(completableObserver));
    }
}
