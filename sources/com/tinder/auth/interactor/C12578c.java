package com.tinder.auth.interactor;

import com.facebook.accountkit.ui.AccountKitConfiguration;
import com.tinder.auth.accountkit.C10326a;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.auth.interactor.c */
public final class C12578c implements Factory<C8276b> {
    /* renamed from: a */
    private final Provider<AccountKitConfiguration> f40641a;
    /* renamed from: b */
    private final Provider<AccountKitConfiguration> f40642b;
    /* renamed from: c */
    private final Provider<C10326a> f40643c;

    public /* synthetic */ Object get() {
        return m49720a();
    }

    public C12578c(Provider<AccountKitConfiguration> provider, Provider<AccountKitConfiguration> provider2, Provider<C10326a> provider3) {
        this.f40641a = provider;
        this.f40642b = provider2;
        this.f40643c = provider3;
    }

    /* renamed from: a */
    public C8276b m49720a() {
        return C12578c.m49718a(this.f40641a, this.f40642b, this.f40643c);
    }

    /* renamed from: a */
    public static C8276b m49718a(Provider<AccountKitConfiguration> provider, Provider<AccountKitConfiguration> provider2, Provider<C10326a> provider3) {
        return new C8276b((AccountKitConfiguration) provider.get(), (AccountKitConfiguration) provider2.get(), (C10326a) provider3.get());
    }

    /* renamed from: b */
    public static C12578c m49719b(Provider<AccountKitConfiguration> provider, Provider<AccountKitConfiguration> provider2, Provider<C10326a> provider3) {
        return new C12578c(provider, provider2, provider3);
    }
}
