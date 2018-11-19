package com.tinder.smsauth.domain.usecase;

import com.tinder.smsauth.core.C14964a;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.smsauth.domain.usecase.f */
public final class C18097f implements Factory<C18096e> {
    /* renamed from: a */
    private final Provider<C14964a> f56192a;

    public /* synthetic */ Object get() {
        return m65697a();
    }

    public C18097f(Provider<C14964a> provider) {
        this.f56192a = provider;
    }

    /* renamed from: a */
    public C18096e m65697a() {
        return C18097f.m65695a(this.f56192a);
    }

    /* renamed from: a */
    public static C18096e m65695a(Provider<C14964a> provider) {
        return new C18096e((C14964a) provider.get());
    }

    /* renamed from: b */
    public static C18097f m65696b(Provider<C14964a> provider) {
        return new C18097f(provider);
    }
}
