package com.tinder.purchase.register;

import com.tinder.api.model.purchase.BillingReceipt;
import rx.functions.Func1;

final /* synthetic */ class ai implements Func1 {
    /* renamed from: a */
    private final String f55695a;

    ai(String str) {
        this.f55695a = str;
    }

    public Object call(Object obj) {
        return RegisterImpl.m61314a(this.f55695a, (BillingReceipt) obj);
    }
}
