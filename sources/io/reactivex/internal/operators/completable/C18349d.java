package io.reactivex.internal.operators.completable;

import io.reactivex.C3956a;
import io.reactivex.CompletableObserver;
import io.reactivex.disposables.C15676b;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C15678a;
import java.util.concurrent.Callable;

/* renamed from: io.reactivex.internal.operators.completable.d */
public final class C18349d extends C3956a {
    /* renamed from: a */
    final Callable<?> f56824a;

    public C18349d(Callable<?> callable) {
        this.f56824a = callable;
    }

    /* renamed from: a */
    protected void m66392a(CompletableObserver completableObserver) {
        Disposable a = C15676b.m58839a();
        completableObserver.onSubscribe(a);
        try {
            this.f56824a.call();
            if (!a.isDisposed()) {
                completableObserver.onComplete();
            }
        } catch (Throwable th) {
            C15678a.m58850b(th);
            if (!a.isDisposed()) {
                completableObserver.onError(th);
            }
        }
    }
}
