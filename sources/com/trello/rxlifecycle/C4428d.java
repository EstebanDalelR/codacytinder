package com.trello.rxlifecycle;

import javax.annotation.Nonnull;
import rx.Completable;
import rx.Completable.Transformer;
import rx.Observable;
import rx.functions.Func1;

/* renamed from: com.trello.rxlifecycle.d */
final class C4428d<T> implements Transformer {
    /* renamed from: a */
    final Observable<T> f14712a;
    /* renamed from: b */
    final Func1<T, T> f14713b;

    public /* synthetic */ Object call(Object obj) {
        return m18389a((Completable) obj);
    }

    public C4428d(@Nonnull Observable<T> observable, @Nonnull Func1<T, T> func1) {
        this.f14712a = observable;
        this.f14713b = func1;
    }

    /* renamed from: a */
    public Completable m18389a(Completable completable) {
        return Completable.m10369a(completable, C2663c.m10240a(this.f14712a, this.f14713b).h(C15488a.f47929c).b());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                C4428d c4428d = (C4428d) obj;
                if (this.f14712a.equals(c4428d.f14712a)) {
                    return this.f14713b.equals(c4428d.f14713b);
                }
                return false;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f14712a.hashCode() * 31) + this.f14713b.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("UntilCorrespondingEventCompletableTransformer{sharedLifecycle=");
        stringBuilder.append(this.f14712a);
        stringBuilder.append(", correspondingEvents=");
        stringBuilder.append(this.f14713b);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
