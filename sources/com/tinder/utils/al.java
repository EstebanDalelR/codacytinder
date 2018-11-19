package com.tinder.utils;

import rx.Completable;
import rx.Completable.Transformer;

final /* synthetic */ class al implements Transformer {
    /* renamed from: a */
    private final RxUtils$b f58741a;

    al(RxUtils$b rxUtils$b) {
        this.f58741a = rxUtils$b;
    }

    public Object call(Object obj) {
        return this.f58741a.m67516a((Completable) obj);
    }
}
