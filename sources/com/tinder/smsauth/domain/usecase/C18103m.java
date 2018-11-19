package com.tinder.smsauth.domain.usecase;

import com.tinder.smsauth.entity.SmsRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.smsauth.domain.usecase.m */
public final class C18103m implements Factory<C18102k> {
    /* renamed from: a */
    private final Provider<SmsRepository> f56198a;

    public /* synthetic */ Object get() {
        return m65711a();
    }

    public C18103m(Provider<SmsRepository> provider) {
        this.f56198a = provider;
    }

    /* renamed from: a */
    public C18102k m65711a() {
        return C18103m.m65709a(this.f56198a);
    }

    /* renamed from: a */
    public static C18102k m65709a(Provider<SmsRepository> provider) {
        return new C18102k((SmsRepository) provider.get());
    }

    /* renamed from: b */
    public static C18103m m65710b(Provider<SmsRepository> provider) {
        return new C18103m(provider);
    }
}
