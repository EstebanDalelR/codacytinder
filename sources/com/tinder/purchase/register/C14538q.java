package com.tinder.purchase.register;

import com.tinder.purchase.model.PurchaseTransaction;
import java.util.Comparator;

/* renamed from: com.tinder.purchase.register.q */
final /* synthetic */ class C14538q implements Comparator {
    /* renamed from: a */
    static final Comparator f45944a = new C14538q();

    private C14538q() {
    }

    public int compare(Object obj, Object obj2) {
        return RegisterImpl.m61311a((PurchaseTransaction) obj, (PurchaseTransaction) obj2);
    }
}
