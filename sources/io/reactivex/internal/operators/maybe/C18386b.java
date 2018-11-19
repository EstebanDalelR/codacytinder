package io.reactivex.internal.operators.maybe;

import io.reactivex.C3958c;
import io.reactivex.MaybeObserver;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.fuseable.ScalarCallable;

/* renamed from: io.reactivex.internal.operators.maybe.b */
public final class C18386b extends C3958c<Object> implements ScalarCallable<Object> {
    /* renamed from: a */
    public static final C18386b f57155a = new C18386b();

    public Object call() {
        return null;
    }

    /* renamed from: a */
    protected void m66484a(MaybeObserver<? super Object> maybeObserver) {
        EmptyDisposable.complete((MaybeObserver) maybeObserver);
    }
}
