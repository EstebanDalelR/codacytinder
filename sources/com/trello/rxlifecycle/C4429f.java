package com.trello.rxlifecycle;

import javax.annotation.Nonnull;
import rx.Observable;
import rx.Single;
import rx.Single$Transformer;
import rx.functions.Func1;

/* renamed from: com.trello.rxlifecycle.f */
final class C4429f<T, R> implements Single$Transformer<T, T> {
    /* renamed from: a */
    final Observable<R> f14714a;
    /* renamed from: b */
    final Func1<R, R> f14715b;

    public /* synthetic */ Object call(Object obj) {
        return m18390a((Single) obj);
    }

    public C4429f(@Nonnull Observable<R> observable, @Nonnull Func1<R, R> func1) {
        this.f14714a = observable;
        this.f14715b = func1;
    }

    /* renamed from: a */
    public Single<T> m18390a(Single<T> single) {
        return single.a(C2663c.m10240a(this.f14714a, this.f14715b));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                C4429f c4429f = (C4429f) obj;
                if (this.f14714a.equals(c4429f.f14714a)) {
                    return this.f14715b.equals(c4429f.f14715b);
                }
                return false;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f14714a.hashCode() * 31) + this.f14715b.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("UntilCorrespondingEventSingleTransformer{sharedLifecycle=");
        stringBuilder.append(this.f14714a);
        stringBuilder.append(", correspondingEvents=");
        stringBuilder.append(this.f14715b);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
