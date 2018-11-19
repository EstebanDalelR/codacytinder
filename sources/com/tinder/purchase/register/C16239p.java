package com.tinder.purchase.register;

import com.tinder.purchase.model.PurchaseTransaction;
import java8.util.function.Predicate;

/* renamed from: com.tinder.purchase.register.p */
final /* synthetic */ class C16239p implements Predicate {
    /* renamed from: a */
    private final RegisterImpl f50603a;

    C16239p(RegisterImpl registerImpl) {
        this.f50603a = registerImpl;
    }

    public boolean test(Object obj) {
        return this.f50603a.m61364a((PurchaseTransaction) obj);
    }
}
