package io.reactivex.internal.observers;

import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.reactivex.internal.observers.n */
public final class C17395n<T> implements SingleObserver<T> {
    /* renamed from: a */
    final AtomicReference<Disposable> f53174a;
    /* renamed from: b */
    final SingleObserver<? super T> f53175b;

    public C17395n(AtomicReference<Disposable> atomicReference, SingleObserver<? super T> singleObserver) {
        this.f53174a = atomicReference;
        this.f53175b = singleObserver;
    }

    public void onSubscribe(Disposable disposable) {
        DisposableHelper.replace(this.f53174a, disposable);
    }

    public void onSuccess(T t) {
        this.f53175b.onSuccess(t);
    }

    public void onError(Throwable th) {
        this.f53175b.onError(th);
    }
}
