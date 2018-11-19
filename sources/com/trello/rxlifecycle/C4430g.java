package com.trello.rxlifecycle;

import javax.annotation.Nonnull;
import rx.Completable;
import rx.Completable.Transformer;
import rx.Observable;

/* renamed from: com.trello.rxlifecycle.g */
final class C4430g<T> implements Transformer {
    /* renamed from: a */
    final Observable<T> f14716a;
    /* renamed from: b */
    final T f14717b;

    public /* synthetic */ Object call(Object obj) {
        return m18391a((Completable) obj);
    }

    public C4430g(@Nonnull Observable<T> observable, @Nonnull T t) {
        this.f14716a = observable;
        this.f14717b = t;
    }

    /* renamed from: a */
    public Completable m18391a(Completable completable) {
        return Completable.m10369a(completable, C2663c.m10239a(this.f14716a, this.f14717b).h(C15488a.f47929c).b());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                C4430g c4430g = (C4430g) obj;
                if (this.f14716a.equals(c4430g.f14716a)) {
                    return this.f14717b.equals(c4430g.f14717b);
                }
                return false;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f14716a.hashCode() * 31) + this.f14717b.hashCode();
    }
}
