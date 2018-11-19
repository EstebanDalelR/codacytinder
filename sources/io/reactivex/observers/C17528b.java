package io.reactivex.observers;

import io.reactivex.Observer;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.C15737d;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.reactivex.observers.b */
public abstract class C17528b<T> implements Observer<T>, Disposable {
    /* renamed from: f */
    final AtomicReference<Disposable> f54152f = new AtomicReference();

    /* renamed from: c */
    protected void m63755c() {
    }

    public final void onSubscribe(@NonNull Disposable disposable) {
        if (C15737d.m58976a(this.f54152f, disposable, getClass()) != null) {
            m63755c();
        }
    }

    public final boolean isDisposed() {
        return this.f54152f.get() == DisposableHelper.DISPOSED;
    }

    public final void dispose() {
        DisposableHelper.dispose(this.f54152f);
    }
}
