package io.reactivex.internal.operators.observable;

import io.reactivex.C3959e;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.exceptions.C15678a;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.C15684a;
import java.util.concurrent.Callable;

/* renamed from: io.reactivex.internal.operators.observable.r */
public final class C18410r<T> extends C3959e<T> {
    /* renamed from: a */
    final Callable<? extends ObservableSource<? extends T>> f57303a;

    public C18410r(Callable<? extends ObservableSource<? extends T>> callable) {
        this.f57303a = callable;
    }

    public void subscribeActual(Observer<? super T> observer) {
        try {
            ((ObservableSource) C15684a.m58895a(this.f57303a.call(), "null ObservableSource supplied")).subscribe(observer);
        } catch (Throwable th) {
            C15678a.m58850b(th);
            EmptyDisposable.error(th, (Observer) observer);
        }
    }
}
