package io.reactivex.observers;

import io.reactivex.Observer;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.util.C15737d;

/* renamed from: io.reactivex.observers.a */
public abstract class C17527a<T> implements Observer<T> {
    /* renamed from: a */
    private Disposable f54151a;

    /* renamed from: b */
    protected void m63754b() {
    }

    public final void onSubscribe(@NonNull Disposable disposable) {
        if (C15737d.m58975a(this.f54151a, disposable, getClass())) {
            this.f54151a = disposable;
            m63754b();
        }
    }
}
