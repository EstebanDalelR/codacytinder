package com.tinder.purchase.register;

import com.tinder.api.model.purchase.BillingReceipt;
import java.util.List;
import rx.functions.Func1;

/* renamed from: com.tinder.purchase.register.w */
final /* synthetic */ class C17861w implements Func1 {
    /* renamed from: a */
    private final RegisterImpl f55729a;
    /* renamed from: b */
    private final String f55730b;
    /* renamed from: c */
    private final BillingReceipt f55731c;

    C17861w(RegisterImpl registerImpl, String str, BillingReceipt billingReceipt) {
        this.f55729a = registerImpl;
        this.f55730b = str;
        this.f55731c = billingReceipt;
    }

    public Object call(Object obj) {
        return this.f55729a.m61359a(this.f55730b, this.f55731c, (List) obj);
    }
}
