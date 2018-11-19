package io.reactivex.internal.operators.observable;

import io.reactivex.C3959e;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.observers.C17391g;

public final class aa<T> extends C18394a<T, T> {
    /* renamed from: b */
    private final Consumer<? super Disposable> f59020b;
    /* renamed from: c */
    private final Action f59021c;

    public aa(C3959e<T> c3959e, Consumer<? super Disposable> consumer, Action action) {
        super(c3959e);
        this.f59020b = consumer;
        this.f59021c = action;
    }

    protected void subscribeActual(Observer<? super T> observer) {
        this.a.subscribe(new C17391g(observer, this.f59020b, this.f59021c));
    }
}
