package com.tinder.purchase.register;

import com.tinder.api.model.purchase.BillingReceipt;
import rx.functions.Action1;

final /* synthetic */ class ag implements Action1 {
    /* renamed from: a */
    private final RegisterImpl f58076a;
    /* renamed from: b */
    private final String f58077b;

    ag(RegisterImpl registerImpl, String str) {
        this.f58076a = registerImpl;
        this.f58077b = str;
    }

    public void call(Object obj) {
        this.f58076a.m61368b(this.f58077b, (BillingReceipt) obj);
    }
}
