package io.reactivex.internal.observers;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.C19000e;
import io.reactivex.internal.disposables.DisposableHelper;

/* renamed from: io.reactivex.internal.observers.h */
public final class C17392h<T> implements Observer<T> {
    /* renamed from: a */
    final C19000e<T> f53168a;
    /* renamed from: b */
    Disposable f53169b;

    public C17392h(C19000e<T> c19000e) {
        this.f53168a = c19000e;
    }

    public void onSubscribe(Disposable disposable) {
        if (DisposableHelper.validate(this.f53169b, disposable)) {
            this.f53169b = disposable;
            this.f53168a.m67543a(disposable);
        }
    }

    public void onNext(T t) {
        this.f53168a.m67544a((Object) t, this.f53169b);
    }

    public void onError(Throwable th) {
        this.f53168a.m67542a(th, this.f53169b);
    }

    public void onComplete() {
        this.f53168a.m67546b(this.f53169b);
    }
}
