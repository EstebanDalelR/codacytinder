package com.tinder.module;

import com.tinder.purchase.providers.BillerVersionCodeProvider;
import com.tinder.purchase.register.RegisterImpl;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class aw implements Factory<BillerVersionCodeProvider> {
    /* renamed from: a */
    private final au f42789a;
    /* renamed from: b */
    private final Provider<RegisterImpl> f42790b;

    public /* synthetic */ Object get() {
        return m52130a();
    }

    public aw(au auVar, Provider<RegisterImpl> provider) {
        this.f42789a = auVar;
        this.f42790b = provider;
    }

    /* renamed from: a */
    public BillerVersionCodeProvider m52130a() {
        return m52128a(this.f42789a, this.f42790b);
    }

    /* renamed from: a */
    public static BillerVersionCodeProvider m52128a(au auVar, Provider<RegisterImpl> provider) {
        return m52127a(auVar, (RegisterImpl) provider.get());
    }

    /* renamed from: b */
    public static aw m52129b(au auVar, Provider<RegisterImpl> provider) {
        return new aw(auVar, provider);
    }

    /* renamed from: a */
    public static BillerVersionCodeProvider m52127a(au auVar, RegisterImpl registerImpl) {
        return (BillerVersionCodeProvider) C15521i.a(auVar.m40787b(registerImpl), "Cannot return null from a non-@Nullable @Provides method");
    }
}
