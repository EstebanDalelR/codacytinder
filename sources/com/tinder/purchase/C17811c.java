package com.tinder.purchase;

import com.tinder.purchase.domain.model.C14517l;
import com.tinder.purchase.p372b.C14482a;
import com.tinder.purchase.register.Register;
import com.tinder.purchase.usecase.C14539e;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.purchase.c */
public final class C17811c implements Factory<C14539e> {
    /* renamed from: a */
    private final PurchaseModule f55538a;
    /* renamed from: b */
    private final Provider<Register> f55539b;
    /* renamed from: c */
    private final Provider<C14517l> f55540c;
    /* renamed from: d */
    private final Provider<C14482a> f55541d;

    public /* synthetic */ Object get() {
        return m65020a();
    }

    /* renamed from: a */
    public C14539e m65020a() {
        return C17811c.m65019a(this.f55538a, this.f55539b, this.f55540c, this.f55541d);
    }

    /* renamed from: a */
    public static C14539e m65019a(PurchaseModule purchaseModule, Provider<Register> provider, Provider<C14517l> provider2, Provider<C14482a> provider3) {
        return C17811c.m65018a(purchaseModule, (Register) provider.get(), (C14517l) provider2.get(), (C14482a) provider3.get());
    }

    /* renamed from: a */
    public static C14539e m65018a(PurchaseModule purchaseModule, Register register, C14517l c14517l, C14482a c14482a) {
        return (C14539e) C15521i.m58001a(purchaseModule.m55299a(register, c14517l, c14482a), "Cannot return null from a non-@Nullable @Provides method");
    }
}
