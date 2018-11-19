package rx.internal.util;

import rx.C19571c;
import rx.functions.Action0;
import rx.functions.Action1;

/* renamed from: rx.internal.util.b */
public final class C19775b<T> extends C19571c<T> {
    /* renamed from: a */
    final Action1<? super T> f61848a;
    /* renamed from: b */
    final Action1<Throwable> f61849b;
    /* renamed from: c */
    final Action0 f61850c;

    public C19775b(Action1<? super T> action1, Action1<Throwable> action12, Action0 action0) {
        this.f61848a = action1;
        this.f61849b = action12;
        this.f61850c = action0;
    }

    public void onNext(T t) {
        this.f61848a.call(t);
    }

    public void onError(Throwable th) {
        this.f61849b.call(th);
    }

    public void onCompleted() {
        this.f61850c.call();
    }
}
