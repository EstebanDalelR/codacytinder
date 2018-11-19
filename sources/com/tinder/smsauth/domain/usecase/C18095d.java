package com.tinder.smsauth.domain.usecase;

import com.tinder.smsauth.entity.CountryCodeRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.smsauth.domain.usecase.d */
public final class C18095d implements Factory<C18094c> {
    /* renamed from: a */
    private final Provider<CountryCodeRepository> f56190a;

    public /* synthetic */ Object get() {
        return m65693a();
    }

    public C18095d(Provider<CountryCodeRepository> provider) {
        this.f56190a = provider;
    }

    /* renamed from: a */
    public C18094c m65693a() {
        return C18095d.m65691a(this.f56190a);
    }

    /* renamed from: a */
    public static C18094c m65691a(Provider<CountryCodeRepository> provider) {
        return new C18094c((CountryCodeRepository) provider.get());
    }

    /* renamed from: b */
    public static C18095d m65692b(Provider<CountryCodeRepository> provider) {
        return new C18095d(provider);
    }
}
