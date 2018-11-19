package com.tinder.purchase.register;

import com.tinder.api.model.purchase.BillingReceipt;
import rx.functions.Func1;

/* renamed from: com.tinder.purchase.register.x */
final /* synthetic */ class C17862x implements Func1 {
    /* renamed from: a */
    private final RegisterImpl f55732a;
    /* renamed from: b */
    private final String f55733b;

    C17862x(RegisterImpl registerImpl, String str) {
        this.f55732a = registerImpl;
        this.f55733b = str;
    }

    public Object call(Object obj) {
        return this.f55732a.m61370c(this.f55733b, (BillingReceipt) obj);
    }
}
