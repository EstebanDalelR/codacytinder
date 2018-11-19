package io.reactivex.internal.operators.observable;

import io.reactivex.C3960g;
import io.reactivex.ObservableSource;
import io.reactivex.SingleObserver;
import io.reactivex.exceptions.C15678a;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.C15684a;
import io.reactivex.internal.operators.observable.bd.C17471a;
import java.util.concurrent.Callable;

public final class be<T, R> extends C3960g<R> {
    /* renamed from: a */
    final ObservableSource<T> f57265a;
    /* renamed from: b */
    final Callable<R> f57266b;
    /* renamed from: c */
    final BiFunction<R, ? super T, R> f57267c;

    public be(ObservableSource<T> observableSource, Callable<R> callable, BiFunction<R, ? super T, R> biFunction) {
        this.f57265a = observableSource;
        this.f57266b = callable;
        this.f57267c = biFunction;
    }

    /* renamed from: a */
    protected void m66516a(SingleObserver<? super R> singleObserver) {
        try {
            this.f57265a.subscribe(new C17471a(singleObserver, this.f57267c, C15684a.m58895a(this.f57266b.call(), "The seedSupplier returned a null value")));
        } catch (Throwable th) {
            C15678a.m58850b(th);
            EmptyDisposable.error(th, (SingleObserver) singleObserver);
        }
    }
}
