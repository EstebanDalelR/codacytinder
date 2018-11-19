package com.trello.rxlifecycle;

import javax.annotation.Nonnull;
import rx.Completable.Transformer;
import rx.Observable;
import rx.Single$Transformer;

/* renamed from: com.trello.rxlifecycle.h */
final class C4452h<T, R> implements LifecycleTransformer<T> {
    /* renamed from: a */
    final Observable<R> f14818a;
    /* renamed from: b */
    final R f14819b;

    public /* synthetic */ Object call(Object obj) {
        return m18604a((Observable) obj);
    }

    public C4452h(@Nonnull Observable<R> observable, @Nonnull R r) {
        this.f14818a = observable;
        this.f14819b = r;
    }

    /* renamed from: a */
    public Observable<T> m18604a(Observable<T> observable) {
        return observable.j(C2663c.m10239a(this.f14818a, this.f14819b));
    }

    @Nonnull
    public Single$Transformer<T, T> forSingle() {
        return new C4431i(this.f14818a, this.f14819b);
    }

    @Nonnull
    public Transformer forCompletable() {
        return new C4430g(this.f14818a, this.f14819b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                C4452h c4452h = (C4452h) obj;
                if (this.f14818a.equals(c4452h.f14818a)) {
                    return this.f14819b.equals(c4452h.f14819b);
                }
                return false;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f14818a.hashCode() * 31) + this.f14819b.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("UntilEventObservableTransformer{lifecycle=");
        stringBuilder.append(this.f14818a);
        stringBuilder.append(", event=");
        stringBuilder.append(this.f14819b);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
