package io.reactivex.p491c;

import io.reactivex.C3959e;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.operators.observable.ObservableRefCount;
import io.reactivex.p079d.C2667a;

/* renamed from: io.reactivex.c.a */
public abstract class C18340a<T> extends C3959e<T> {
    /* renamed from: a */
    public abstract void mo14001a(@NonNull Consumer<? super Disposable> consumer);

    @NonNull
    /* renamed from: a */
    public C3959e<T> m66377a() {
        return C2667a.a(new ObservableRefCount(this));
    }
}
