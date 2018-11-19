package io.reactivex.internal.operators.completable;

import io.reactivex.C3956a;
import io.reactivex.CompletableObserver;
import io.reactivex.disposables.C15676b;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C15678a;
import io.reactivex.functions.Action;

/* renamed from: io.reactivex.internal.operators.completable.c */
public final class C18348c extends C3956a {
    /* renamed from: a */
    final Action f56823a;

    public C18348c(Action action) {
        this.f56823a = action;
    }

    /* renamed from: a */
    protected void m66391a(CompletableObserver completableObserver) {
        Disposable a = C15676b.m58839a();
        completableObserver.onSubscribe(a);
        try {
            this.f56823a.run();
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
