package com.tinder.typingindicator.p440f;

import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.typingindicator.f.d */
public final class C18251d implements Factory<C18250c> {
    /* renamed from: a */
    private final Provider<C18252e> f56568a;

    public /* synthetic */ Object get() {
        return m66139a();
    }

    public C18251d(Provider<C18252e> provider) {
        this.f56568a = provider;
    }

    /* renamed from: a */
    public C18250c m66139a() {
        return C18251d.m66137a(this.f56568a);
    }

    /* renamed from: a */
    public static C18250c m66137a(Provider<C18252e> provider) {
        return new C18250c((C18252e) provider.get());
    }

    /* renamed from: b */
    public static C18251d m66138b(Provider<C18252e> provider) {
        return new C18251d(provider);
    }
}
