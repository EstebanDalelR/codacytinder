package com.tinder.purchase.register;

import com.tinder.api.model.purchase.BillingReceipt;
import rx.functions.Func1;

/* renamed from: com.tinder.purchase.register.a */
final /* synthetic */ class C17851a implements Func1 {
    /* renamed from: a */
    private final RegisterImpl f55688a;
    /* renamed from: b */
    private final String f55689b;

    C17851a(RegisterImpl registerImpl, String str) {
        this.f55688a = registerImpl;
        this.f55689b = str;
    }

    public Object call(Object obj) {
        return this.f55688a.m61373e(this.f55689b, (BillingReceipt) obj);
    }
}
