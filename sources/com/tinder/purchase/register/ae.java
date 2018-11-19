package com.tinder.purchase.register;

import com.tinder.api.model.purchase.BillingReceipt;
import rx.functions.Func1;

final /* synthetic */ class ae implements Func1 {
    /* renamed from: a */
    private final BillingReceipt f55692a;

    ae(BillingReceipt billingReceipt) {
        this.f55692a = billingReceipt;
    }

    public Object call(Object obj) {
        return RegisterImpl.m61330b(this.f55692a, (String) obj);
    }
}
