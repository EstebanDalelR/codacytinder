package com.tinder.analytics.fireworks;

import java.util.List;
import rx.Observable;
import rx.functions.Func1;

class a$1 implements Func1<List<C2632i>, Observable<?>> {
    /* renamed from: a */
    final /* synthetic */ C2628a f28631a;

    a$1(C2628a c2628a) {
        this.f28631a = c2628a;
    }

    public /* synthetic */ Object call(Object obj) {
        return m33908a((List) obj);
    }

    /* renamed from: a */
    public Observable<Boolean> m33908a(List<C2632i> list) {
        return C2628a.a(this.f28631a).sendEvents(list);
    }
}
