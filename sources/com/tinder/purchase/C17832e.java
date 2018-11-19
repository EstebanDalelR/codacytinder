package com.tinder.purchase;

import com.tinder.purchase.domain.model.C14517l;
import com.tinder.purchase.p372b.C14483c;
import com.tinder.purchase.register.Register;
import com.tinder.purchase.usecase.C14541j;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.purchase.e */
public final class C17832e implements Factory<C14541j> {
    /* renamed from: a */
    private final PurchaseModule f55645a;
    /* renamed from: b */
    private final Provider<Register> f55646b;
    /* renamed from: c */
    private final Provider<C14517l> f55647c;
    /* renamed from: d */
    private final Provider<C14483c> f55648d;

    public /* synthetic */ Object get() {
        return m65115a();
    }

    /* renamed from: a */
    public C14541j m65115a() {
        return C17832e.m65114a(this.f55645a, this.f55646b, this.f55647c, this.f55648d);
    }

    /* renamed from: a */
    public static C14541j m65114a(PurchaseModule purchaseModule, Provider<Register> provider, Provider<C14517l> provider2, Provider<C14483c> provider3) {
        return C17832e.m65113a(purchaseModule, (Register) provider.get(), (C14517l) provider2.get(), (C14483c) provider3.get());
    }

    /* renamed from: a */
    public static C14541j m65113a(PurchaseModule purchaseModule, Register register, C14517l c14517l, C14483c c14483c) {
        return (C14541j) C15521i.m58001a(purchaseModule.m55301a(register, c14517l, c14483c), "Cannot return null from a non-@Nullable @Provides method");
    }
}
