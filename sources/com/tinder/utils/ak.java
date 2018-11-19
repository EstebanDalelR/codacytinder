package com.tinder.utils;

import rx.Single;
import rx.Single$Transformer;

final /* synthetic */ class ak implements Single$Transformer {
    /* renamed from: a */
    private final RxUtils$b f58740a;

    ak(RxUtils$b rxUtils$b) {
        this.f58740a = rxUtils$b;
    }

    public Object call(Object obj) {
        return this.f58740a.m67519a((Single) obj);
    }
}
