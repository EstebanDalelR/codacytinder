package io.reactivex.internal.operators.maybe;

import io.reactivex.C3958c;
import io.reactivex.MaybeSource;
import io.reactivex.internal.fuseable.HasUpstreamMaybeSource;

/* renamed from: io.reactivex.internal.operators.maybe.a */
abstract class C18385a<T, R> extends C3958c<R> implements HasUpstreamMaybeSource<T> {
    /* renamed from: a */
    protected final MaybeSource<T> f57154a;

    C18385a(MaybeSource<T> maybeSource) {
        this.f57154a = maybeSource;
    }

    public final MaybeSource<T> source() {
        return this.f57154a;
    }
}
