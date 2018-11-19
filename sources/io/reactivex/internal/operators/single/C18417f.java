package io.reactivex.internal.operators.single;

import io.reactivex.C3960g;
import io.reactivex.SingleObserver;
import io.reactivex.exceptions.C15678a;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.C15684a;
import java.util.concurrent.Callable;

/* renamed from: io.reactivex.internal.operators.single.f */
public final class C18417f<T> extends C3960g<T> {
    /* renamed from: a */
    final Callable<? extends Throwable> f57337a;

    public C18417f(Callable<? extends Throwable> callable) {
        this.f57337a = callable;
    }

    /* renamed from: a */
    protected void m66545a(SingleObserver<? super T> singleObserver) {
        Throwable th;
        try {
            th = (Throwable) C15684a.m58895a(this.f57337a.call(), "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
        } catch (Throwable th2) {
            th = th2;
            C15678a.m58850b(th);
        }
        EmptyDisposable.error(th, (SingleObserver) singleObserver);
    }
}
