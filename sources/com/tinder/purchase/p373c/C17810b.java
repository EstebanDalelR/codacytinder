package com.tinder.purchase.p373c;

import com.tinder.api.model.purchase.BillingReceipt;
import com.tinder.api.model.purchase.PurchaseValidationWrapper;
import rx.functions.Func1;

/* renamed from: com.tinder.purchase.c.b */
final /* synthetic */ class C17810b implements Func1 {
    /* renamed from: a */
    private final String f55536a;
    /* renamed from: b */
    private final BillingReceipt f55537b;

    C17810b(String str, BillingReceipt billingReceipt) {
        this.f55536a = str;
        this.f55537b = billingReceipt;
    }

    public Object call(Object obj) {
        return C14488a.m55334a(this.f55536a, this.f55537b, (PurchaseValidationWrapper) obj);
    }
}
