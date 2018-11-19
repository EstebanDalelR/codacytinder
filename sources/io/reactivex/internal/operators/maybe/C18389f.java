package io.reactivex.internal.operators.maybe;

import io.reactivex.C3958c;
import io.reactivex.MaybeObserver;
import io.reactivex.disposables.C15676b;
import io.reactivex.internal.fuseable.ScalarCallable;

/* renamed from: io.reactivex.internal.operators.maybe.f */
public final class C18389f<T> extends C3958c<T> implements ScalarCallable<T> {
    /* renamed from: a */
    final T f57159a;

    public C18389f(T t) {
        this.f57159a = t;
    }

    /* renamed from: a */
    protected void m66487a(MaybeObserver<? super T> maybeObserver) {
        maybeObserver.onSubscribe(C15676b.m58842b());
        maybeObserver.onSuccess(this.f57159a);
    }

    public T call() {
        return this.f57159a;
    }
}
