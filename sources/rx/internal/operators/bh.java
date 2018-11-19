package rx.internal.operators;

import rx.C19566b;
import rx.Single.OnSubscribe;
import rx.functions.Action0;
import rx.p500e.C19407e;

public final class bh<T> implements OnSubscribe<T> {
    /* renamed from: a */
    final OnSubscribe<T> f62240a;
    /* renamed from: b */
    final Action0 f62241b;

    public /* synthetic */ void call(Object obj) {
        m71587a((C19566b) obj);
    }

    public bh(OnSubscribe<T> onSubscribe, Action0 action0) {
        this.f62240a = onSubscribe;
        this.f62241b = action0;
    }

    /* renamed from: a */
    public void m71587a(C19566b<? super T> c19566b) {
        c19566b.m70541a(C19407e.m69854a(this.f62241b));
        this.f62240a.call(c19566b);
    }
}
