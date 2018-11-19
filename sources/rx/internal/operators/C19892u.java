package rx.internal.operators;

import rx.C19571c;
import rx.Observable.OnSubscribe;

/* renamed from: rx.internal.operators.u */
public final class C19892u<T> implements OnSubscribe<T> {
    /* renamed from: a */
    private final Throwable f62298a;

    public /* synthetic */ void call(Object obj) {
        m71630a((C19571c) obj);
    }

    public C19892u(Throwable th) {
        this.f62298a = th;
    }

    /* renamed from: a */
    public void m71630a(C19571c<? super T> c19571c) {
        c19571c.onError(this.f62298a);
    }
}
