package com.trello.rxlifecycle;

import javax.annotation.Nonnull;
import rx.Completable.Transformer;
import rx.Observable;
import rx.Single$Transformer;
import rx.functions.Func1;

/* renamed from: com.trello.rxlifecycle.e */
final class C4451e<T, R> implements LifecycleTransformer<T> {
    /* renamed from: a */
    final Observable<R> f14816a;
    /* renamed from: b */
    final Func1<R, R> f14817b;

    public /* synthetic */ Object call(Object obj) {
        return m18603a((Observable) obj);
    }

    public C4451e(@Nonnull Observable<R> observable, @Nonnull Func1<R, R> func1) {
        this.f14816a = observable;
        this.f14817b = func1;
    }

    /* renamed from: a */
    public Observable<T> m18603a(Observable<T> observable) {
        return observable.j(C2663c.m10240a(this.f14816a, this.f14817b));
    }

    @Nonnull
    public Single$Transformer<T, T> forSingle() {
        return new C4429f(this.f14816a, this.f14817b);
    }

    @Nonnull
    public Transformer forCompletable() {
        return new C4428d(this.f14816a, this.f14817b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                C4451e c4451e = (C4451e) obj;
                if (this.f14816a.equals(c4451e.f14816a)) {
                    return this.f14817b.equals(c4451e.f14817b);
                }
                return false;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f14816a.hashCode() * 31) + this.f14817b.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("UntilCorrespondingEventObservableTransformer{sharedLifecycle=");
        stringBuilder.append(this.f14816a);
        stringBuilder.append(", correspondingEvents=");
        stringBuilder.append(this.f14817b);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
