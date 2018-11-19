package io.reactivex.internal.operators.observable;

import io.reactivex.C3959e;
import io.reactivex.Observer;
import io.reactivex.exceptions.C15678a;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.C15684a;
import java.util.concurrent.Callable;

public final class af<T> extends C3959e<T> {
    /* renamed from: a */
    final Callable<? extends Throwable> f57237a;

    public af(Callable<? extends Throwable> callable) {
        this.f57237a = callable;
    }

    public void subscribeActual(Observer<? super T> observer) {
        Throwable th;
        try {
            th = (Throwable) C15684a.m58895a(this.f57237a.call(), "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
        } catch (Throwable th2) {
            th = th2;
            C15678a.m58850b(th);
        }
        EmptyDisposable.error(th, (Observer) observer);
    }
}
