package com.tinder.smsauth.domain.usecase;

import com.tinder.smsauth.core.C14964a;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.smsauth.domain.usecase.u */
public final class C18111u implements Factory<C18110t> {
    /* renamed from: a */
    private final Provider<C14964a> f56206a;

    public /* synthetic */ Object get() {
        return m65727a();
    }

    public C18111u(Provider<C14964a> provider) {
        this.f56206a = provider;
    }

    /* renamed from: a */
    public C18110t m65727a() {
        return C18111u.m65725a(this.f56206a);
    }

    /* renamed from: a */
    public static C18110t m65725a(Provider<C14964a> provider) {
        return new C18110t((C14964a) provider.get());
    }

    /* renamed from: b */
    public static C18111u m65726b(Provider<C14964a> provider) {
        return new C18111u(provider);
    }
}
