package com.tinder.smsauth.domain.usecase;

import com.tinder.smsauth.core.C14964a;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.smsauth.domain.usecase.q */
public final class C18107q implements Factory<C18106p> {
    /* renamed from: a */
    private final Provider<C14964a> f56202a;

    public /* synthetic */ Object get() {
        return m65719a();
    }

    public C18107q(Provider<C14964a> provider) {
        this.f56202a = provider;
    }

    /* renamed from: a */
    public C18106p m65719a() {
        return C18107q.m65717a(this.f56202a);
    }

    /* renamed from: a */
    public static C18106p m65717a(Provider<C14964a> provider) {
        return new C18106p((C14964a) provider.get());
    }

    /* renamed from: b */
    public static C18107q m65718b(Provider<C14964a> provider) {
        return new C18107q(provider);
    }
}
