package com.tinder.purchase;

import com.tinder.purchase.domain.model.TransactionSuccessMessageTypeFactory;
import dagger.internal.C15521i;
import dagger.internal.Factory;

/* renamed from: com.tinder.purchase.g */
public final class C17834g implements Factory<TransactionSuccessMessageTypeFactory> {
    /* renamed from: a */
    private final PurchaseModule f55652a;

    public /* synthetic */ Object get() {
        return m65123a();
    }

    public C17834g(PurchaseModule purchaseModule) {
        this.f55652a = purchaseModule;
    }

    /* renamed from: a */
    public TransactionSuccessMessageTypeFactory m65123a() {
        return C17834g.m65120a(this.f55652a);
    }

    /* renamed from: a */
    public static TransactionSuccessMessageTypeFactory m65120a(PurchaseModule purchaseModule) {
        return C17834g.m65122c(purchaseModule);
    }

    /* renamed from: b */
    public static C17834g m65121b(PurchaseModule purchaseModule) {
        return new C17834g(purchaseModule);
    }

    /* renamed from: c */
    public static TransactionSuccessMessageTypeFactory m65122c(PurchaseModule purchaseModule) {
        return (TransactionSuccessMessageTypeFactory) C15521i.m58001a(purchaseModule.m55298a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
