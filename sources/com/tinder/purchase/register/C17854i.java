package com.tinder.purchase.register;

import com.tinder.purchase.model.PurchaseTransaction;
import rx.functions.Func1;

/* renamed from: com.tinder.purchase.register.i */
final /* synthetic */ class C17854i implements Func1 {
    /* renamed from: a */
    private final RegisterImpl f55716a;
    /* renamed from: b */
    private final RestorePurchaseType f55717b;

    C17854i(RegisterImpl registerImpl, RestorePurchaseType restorePurchaseType) {
        this.f55716a = registerImpl;
        this.f55717b = restorePurchaseType;
    }

    public Object call(Object obj) {
        return this.f55716a.m61365b(this.f55717b, (PurchaseTransaction) obj);
    }
}
