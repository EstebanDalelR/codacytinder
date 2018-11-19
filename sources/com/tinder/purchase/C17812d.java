package com.tinder.purchase;

import com.tinder.purchase.p372b.C14482a;
import com.tinder.purchase.p372b.C14483c;
import com.tinder.purchase.usecase.C16248i;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.purchase.d */
public final class C17812d implements Factory<C16248i> {
    /* renamed from: a */
    private final PurchaseModule f55542a;
    /* renamed from: b */
    private final Provider<C14482a> f55543b;
    /* renamed from: c */
    private final Provider<C14483c> f55544c;

    public /* synthetic */ Object get() {
        return m65024a();
    }

    public C17812d(PurchaseModule purchaseModule, Provider<C14482a> provider, Provider<C14483c> provider2) {
        this.f55542a = purchaseModule;
        this.f55543b = provider;
        this.f55544c = provider2;
    }

    /* renamed from: a */
    public C16248i m65024a() {
        return C17812d.m65022a(this.f55542a, this.f55543b, this.f55544c);
    }

    /* renamed from: a */
    public static C16248i m65022a(PurchaseModule purchaseModule, Provider<C14482a> provider, Provider<C14483c> provider2) {
        return C17812d.m65021a(purchaseModule, (C14482a) provider.get(), (C14483c) provider2.get());
    }

    /* renamed from: b */
    public static C17812d m65023b(PurchaseModule purchaseModule, Provider<C14482a> provider, Provider<C14483c> provider2) {
        return new C17812d(purchaseModule, provider, provider2);
    }

    /* renamed from: a */
    public static C16248i m65021a(PurchaseModule purchaseModule, C14482a c14482a, C14483c c14483c) {
        return (C16248i) C15521i.m58001a(purchaseModule.m55300a(c14482a, c14483c), "Cannot return null from a non-@Nullable @Provides method");
    }
}
