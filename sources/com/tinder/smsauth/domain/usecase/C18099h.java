package com.tinder.smsauth.domain.usecase;

import com.tinder.smsauth.core.C14964a;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.smsauth.domain.usecase.h */
public final class C18099h implements Factory<C18098g> {
    /* renamed from: a */
    private final Provider<C14964a> f56194a;

    public /* synthetic */ Object get() {
        return m65701a();
    }

    public C18099h(Provider<C14964a> provider) {
        this.f56194a = provider;
    }

    /* renamed from: a */
    public C18098g m65701a() {
        return C18099h.m65699a(this.f56194a);
    }

    /* renamed from: a */
    public static C18098g m65699a(Provider<C14964a> provider) {
        return new C18098g((C14964a) provider.get());
    }

    /* renamed from: b */
    public static C18099h m65700b(Provider<C14964a> provider) {
        return new C18099h(provider);
    }
}
