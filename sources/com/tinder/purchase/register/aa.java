package com.tinder.purchase.register;

import com.tinder.api.model.purchase.BillingReceipt;
import rx.functions.Action1;

final /* synthetic */ class aa implements Action1 {
    /* renamed from: a */
    private final RegisterImpl f58069a;
    /* renamed from: b */
    private final String f58070b;
    /* renamed from: c */
    private final BillingReceipt f58071c;

    aa(RegisterImpl registerImpl, String str, BillingReceipt billingReceipt) {
        this.f58069a = registerImpl;
        this.f58070b = str;
        this.f58071c = billingReceipt;
    }

    public void call(Object obj) {
        this.f58069a.m61361a(this.f58070b, this.f58071c, (Throwable) obj);
    }
}
