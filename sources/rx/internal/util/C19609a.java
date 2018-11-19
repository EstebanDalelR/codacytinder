package rx.internal.util;

import rx.Observer;
import rx.functions.Action0;
import rx.functions.Action1;

/* renamed from: rx.internal.util.a */
public final class C19609a<T> implements Observer<T> {
    /* renamed from: a */
    final Action1<? super T> f61284a;
    /* renamed from: b */
    final Action1<? super Throwable> f61285b;
    /* renamed from: c */
    final Action0 f61286c;

    public C19609a(Action1<? super T> action1, Action1<? super Throwable> action12, Action0 action0) {
        this.f61284a = action1;
        this.f61285b = action12;
        this.f61286c = action0;
    }

    public void onNext(T t) {
        this.f61284a.call(t);
    }

    public void onError(Throwable th) {
        this.f61285b.call(th);
    }

    public void onCompleted() {
        this.f61286c.call();
    }
}
