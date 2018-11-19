package com.tinder.smsauth.domain.usecase;

import com.tinder.smsauth.core.C14964a;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.smsauth.domain.usecase.s */
public final class C18109s implements Factory<C18108r> {
    /* renamed from: a */
    private final Provider<C14964a> f56204a;

    public /* synthetic */ Object get() {
        return m65723a();
    }

    public C18109s(Provider<C14964a> provider) {
        this.f56204a = provider;
    }

    /* renamed from: a */
    public C18108r m65723a() {
        return C18109s.m65721a(this.f56204a);
    }

    /* renamed from: a */
    public static C18108r m65721a(Provider<C14964a> provider) {
        return new C18108r((C14964a) provider.get());
    }

    /* renamed from: b */
    public static C18109s m65722b(Provider<C14964a> provider) {
        return new C18109s(provider);
    }
}
