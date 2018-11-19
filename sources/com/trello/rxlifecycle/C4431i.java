package com.trello.rxlifecycle;

import javax.annotation.Nonnull;
import rx.Observable;
import rx.Single;
import rx.Single$Transformer;

/* renamed from: com.trello.rxlifecycle.i */
final class C4431i<T, R> implements Single$Transformer<T, T> {
    /* renamed from: a */
    final Observable<R> f14718a;
    /* renamed from: b */
    final R f14719b;

    public /* synthetic */ Object call(Object obj) {
        return m18392a((Single) obj);
    }

    public C4431i(@Nonnull Observable<R> observable, @Nonnull R r) {
        this.f14718a = observable;
        this.f14719b = r;
    }

    /* renamed from: a */
    public Single<T> m18392a(Single<T> single) {
        return single.a(C2663c.m10239a(this.f14718a, this.f14719b));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                C4431i c4431i = (C4431i) obj;
                if (this.f14718a.equals(c4431i.f14718a)) {
                    return this.f14719b.equals(c4431i.f14719b);
                }
                return false;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f14718a.hashCode() * 31) + this.f14719b.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("UntilEventSingleTransformer{lifecycle=");
        stringBuilder.append(this.f14718a);
        stringBuilder.append(", event=");
        stringBuilder.append(this.f14719b);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
