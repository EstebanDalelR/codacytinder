package io.reactivex.internal.operators.single;

import io.reactivex.C3960g;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.C15676b;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.C15678a;
import io.reactivex.internal.functions.C15684a;
import io.reactivex.p079d.C2667a;
import java.util.concurrent.Callable;

/* renamed from: io.reactivex.internal.operators.single.g */
public final class C18418g<T> extends C3960g<T> {
    /* renamed from: a */
    final Callable<? extends T> f57338a;

    public C18418g(Callable<? extends T> callable) {
        this.f57338a = callable;
    }

    /* renamed from: a */
    protected void m66546a(SingleObserver<? super T> singleObserver) {
        Disposable a = C15676b.m58839a();
        singleObserver.onSubscribe(a);
        if (!a.isDisposed()) {
            try {
                Object a2 = C15684a.m58895a(this.f57338a.call(), "The callable returned a null value");
                if (!a.isDisposed()) {
                    singleObserver.onSuccess(a2);
                }
            } catch (Throwable th) {
                C15678a.m58850b(th);
                if (a.isDisposed()) {
                    C2667a.a(th);
                } else {
                    singleObserver.onError(th);
                }
            }
        }
    }
}
