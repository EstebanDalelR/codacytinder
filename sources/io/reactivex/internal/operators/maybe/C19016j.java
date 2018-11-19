package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;

/* renamed from: io.reactivex.internal.operators.maybe.j */
public final class C19016j<T> extends C18385a<T, T> {
    public C19016j(MaybeSource<T> maybeSource) {
        super(maybeSource);
    }

    /* renamed from: a */
    protected void m67622a(MaybeObserver<? super T> maybeObserver) {
        this.a.subscribe(maybeObserver);
    }
}
