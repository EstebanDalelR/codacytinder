package com.tinder.purchase.p371a;

import java.util.List;
import rx.Observable;
import rx.Observable$Transformer;

/* renamed from: com.tinder.purchase.a.f */
final /* synthetic */ class C18613f implements Observable$Transformer {
    /* renamed from: a */
    private final C14479a f58042a;
    /* renamed from: b */
    private final List f58043b;

    C18613f(C14479a c14479a, List list) {
        this.f58042a = c14479a;
        this.f58043b = list;
    }

    public Object call(Object obj) {
        return this.f58042a.m55315b(this.f58043b, (Observable) obj);
    }
}
