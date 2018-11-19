package io.reactivex.internal.operators.single;

import io.reactivex.C3960g;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.exceptions.C15678a;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.C15684a;
import java.util.concurrent.Callable;

/* renamed from: io.reactivex.internal.operators.single.a */
public final class C18412a<T> extends C3960g<T> {
    /* renamed from: a */
    final Callable<? extends SingleSource<? extends T>> f57328a;

    public C18412a(Callable<? extends SingleSource<? extends T>> callable) {
        this.f57328a = callable;
    }

    /* renamed from: a */
    protected void m66540a(SingleObserver<? super T> singleObserver) {
        try {
            ((SingleSource) C15684a.m58895a(this.f57328a.call(), "The singleSupplier returned a null SingleSource")).subscribe(singleObserver);
        } catch (Throwable th) {
            C15678a.m58850b(th);
            EmptyDisposable.error(th, (SingleObserver) singleObserver);
        }
    }
}
