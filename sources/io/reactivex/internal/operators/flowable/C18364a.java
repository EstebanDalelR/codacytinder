package io.reactivex.internal.operators.flowable;

import io.reactivex.C3957b;
import io.reactivex.internal.functions.C15684a;
import io.reactivex.internal.fuseable.HasUpstreamPublisher;
import org.reactivestreams.Publisher;

/* renamed from: io.reactivex.internal.operators.flowable.a */
abstract class C18364a<T, R> extends C3957b<R> implements HasUpstreamPublisher<T> {
    /* renamed from: a */
    protected final C3957b<T> f57083a;

    C18364a(C3957b<T> c3957b) {
        this.f57083a = (C3957b) C15684a.m58895a((Object) c3957b, "source is null");
    }

    public final Publisher<T> source() {
        return this.f57083a;
    }
}
