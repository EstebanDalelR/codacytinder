package com.tinder.purchase.register;

import com.tinder.purchase.model.PurchaseTransaction;
import rx.functions.Action1;

final /* synthetic */ class ak implements Action1 {
    /* renamed from: a */
    private final RegisterImpl f58079a;

    ak(RegisterImpl registerImpl) {
        this.f58079a = registerImpl;
    }

    public void call(Object obj) {
        this.f58079a.m61367b((PurchaseTransaction) obj);
    }
}
