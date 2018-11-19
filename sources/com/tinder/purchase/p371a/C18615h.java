package com.tinder.purchase.p371a;

import java.util.List;
import rx.Observable;
import rx.Observable$Transformer;

/* renamed from: com.tinder.purchase.a.h */
final /* synthetic */ class C18615h implements Observable$Transformer {
    /* renamed from: a */
    private final C14479a f58045a;
    /* renamed from: b */
    private final List f58046b;

    C18615h(C14479a c14479a, List list) {
        this.f58045a = c14479a;
        this.f58046b = list;
    }

    public Object call(Object obj) {
        return this.f58045a.m55311a(this.f58046b, (Observable) obj);
    }
}
