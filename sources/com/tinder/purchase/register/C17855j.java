package com.tinder.purchase.register;

import com.tinder.purchase.model.PurchaseTransaction;
import rx.functions.Func1;

/* renamed from: com.tinder.purchase.register.j */
final /* synthetic */ class C17855j implements Func1 {
    /* renamed from: a */
    private final RegisterImpl f55718a;
    /* renamed from: b */
    private final RestorePurchaseType f55719b;

    C17855j(RegisterImpl registerImpl, RestorePurchaseType restorePurchaseType) {
        this.f55718a = registerImpl;
        this.f55719b = restorePurchaseType;
    }

    public Object call(Object obj) {
        return this.f55718a.m61352a(this.f55719b, (PurchaseTransaction) obj);
    }
}
