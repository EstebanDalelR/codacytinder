package io.reactivex.internal.operators.completable;

import io.reactivex.C3956a;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;

/* renamed from: io.reactivex.internal.operators.completable.h */
public final class C18354h extends C3956a {
    /* renamed from: a */
    final CompletableSource f56830a;

    public C18354h(CompletableSource completableSource) {
        this.f56830a = completableSource;
    }

    /* renamed from: a */
    protected void m66396a(CompletableObserver completableObserver) {
        this.f56830a.subscribe(completableObserver);
    }
}
