package com.tinder.purchase.domain.repository;

import java.util.List;
import java.util.Map;
import rx.Observable;
import rx.functions.Func1;

/* renamed from: com.tinder.purchase.domain.repository.g */
final /* synthetic */ class C17826g implements Func1 {
    /* renamed from: a */
    static final Func1 f55639a = new C17826g();

    private C17826g() {
    }

    public Object call(Object obj) {
        return ((List) Observable.a(((Map) obj).values()).h(C17824e.f55637a).v().u().b());
    }
}
