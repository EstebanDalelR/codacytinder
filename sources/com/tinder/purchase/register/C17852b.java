package com.tinder.purchase.register;

import com.tinder.api.model.purchase.BillingReceipt;
import rx.functions.Func1;

/* renamed from: com.tinder.purchase.register.b */
final /* synthetic */ class C17852b implements Func1 {
    /* renamed from: a */
    private final RegisterImpl f55713a;
    /* renamed from: b */
    private final String f55714b;

    C17852b(RegisterImpl registerImpl, String str) {
        this.f55713a = registerImpl;
        this.f55714b = str;
    }

    public Object call(Object obj) {
        return this.f55713a.m61372d(this.f55714b, (BillingReceipt) obj);
    }
}
