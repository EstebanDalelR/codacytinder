package io.reactivex.p490b;

import io.reactivex.C3957b;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.operators.flowable.FlowableRefCount;
import io.reactivex.p079d.C2667a;

/* renamed from: io.reactivex.b.a */
public abstract class C18339a<T> extends C3957b<T> {
    /* renamed from: d */
    public abstract void mo13999d(@NonNull Consumer<? super Disposable> consumer);

    @NonNull
    /* renamed from: q */
    public C3957b<T> m66376q() {
        return C2667a.a(new FlowableRefCount(this));
    }
}
