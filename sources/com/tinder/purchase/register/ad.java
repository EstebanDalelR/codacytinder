package com.tinder.purchase.register;

import com.tinder.purchase.model.PurchaseTransaction;
import rx.functions.Func1;

final /* synthetic */ class ad implements Func1 {
    /* renamed from: a */
    private final PurchaseTransaction f55691a;

    ad(PurchaseTransaction purchaseTransaction) {
        this.f55691a = purchaseTransaction;
    }

    public Object call(Object obj) {
        return RegisterImpl.m61313a(this.f55691a, (String) obj);
    }
}
