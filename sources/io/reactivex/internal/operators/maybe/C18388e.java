package io.reactivex.internal.operators.maybe;

import io.reactivex.C3958c;
import io.reactivex.MaybeObserver;
import io.reactivex.disposables.C15676b;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C15678a;
import io.reactivex.p079d.C2667a;
import java.util.concurrent.Callable;

/* renamed from: io.reactivex.internal.operators.maybe.e */
public final class C18388e<T> extends C3958c<T> implements Callable<T> {
    /* renamed from: a */
    final Callable<? extends T> f57158a;

    public C18388e(Callable<? extends T> callable) {
        this.f57158a = callable;
    }

    /* renamed from: a */
    protected void m66486a(MaybeObserver<? super T> maybeObserver) {
        Disposable a = C15676b.m58839a();
        maybeObserver.onSubscribe(a);
        if (!a.isDisposed()) {
            try {
                Object call = this.f57158a.call();
                if (!a.isDisposed()) {
                    if (call == null) {
                        maybeObserver.onComplete();
                    } else {
                        maybeObserver.onSuccess(call);
                    }
                }
            } catch (Throwable th) {
                C15678a.m58850b(th);
                if (a.isDisposed()) {
                    C2667a.a(th);
                } else {
                    maybeObserver.onError(th);
                }
            }
        }
    }

    public T call() throws Exception {
        return this.f57158a.call();
    }
}
