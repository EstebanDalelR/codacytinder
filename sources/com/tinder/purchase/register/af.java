package com.tinder.purchase.register;

import rx.Observable;
import rx.functions.Func1;

final /* synthetic */ class af implements Func1 {
    /* renamed from: a */
    private final RegisterImpl f55693a;
    /* renamed from: b */
    private final String f55694b;

    af(RegisterImpl registerImpl, String str) {
        this.f55693a = registerImpl;
        this.f55694b = str;
    }

    public Object call(Object obj) {
        return this.f55693a.m61354a(this.f55694b, (Observable) obj);
    }
}
