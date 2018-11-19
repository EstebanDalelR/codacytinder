package io.reactivex.disposables;

import io.reactivex.annotations.NonNull;
import io.reactivex.internal.functions.C15684a;
import java.util.concurrent.atomic.AtomicReference;

abstract class ReferenceDisposable<T> extends AtomicReference<T> implements Disposable {
    private static final long serialVersionUID = 6537757548749041217L;

    /* renamed from: a */
    protected abstract void mo13560a(@NonNull T t);

    ReferenceDisposable(T t) {
        super(C15684a.m58895a((Object) t, "value is null"));
    }

    public final void dispose() {
        if (get() != null) {
            Object andSet = getAndSet(null);
            if (andSet != null) {
                mo13560a(andSet);
            }
        }
    }

    public final boolean isDisposed() {
        return get() == null;
    }
}
