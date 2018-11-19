package com.tinder.purchase.register;

import rx.Observable;
import rx.Observable$Transformer;

/* renamed from: com.tinder.purchase.register.r */
final /* synthetic */ class C18638r implements Observable$Transformer {
    /* renamed from: a */
    private final RegisterImpl f58096a;

    C18638r(RegisterImpl registerImpl) {
        this.f58096a = registerImpl;
    }

    public Object call(Object obj) {
        return this.f58096a.m61357a((Observable) obj);
    }
}
