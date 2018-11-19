package rx.internal.operators;

import rx.C19571c;
import rx.Observable.OnSubscribe;
import rx.Single;
import rx.Subscription;
import rx.internal.operators.bk.C19720a;

public final class bs<T> implements OnSubscribe<T> {
    /* renamed from: a */
    final Single.OnSubscribe<T> f62260a;

    public /* synthetic */ void call(Object obj) {
        m71601a((C19571c) obj);
    }

    public bs(Single.OnSubscribe<T> onSubscribe) {
        this.f62260a = onSubscribe;
    }

    /* renamed from: a */
    public void m71601a(C19571c<? super T> c19571c) {
        Subscription c19720a = new C19720a(c19571c);
        c19571c.add(c19720a);
        this.f62260a.call(c19720a);
    }
}
