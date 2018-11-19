package com.tinder.typingindicator.p440f;

import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.typingindicator.f.k */
public final class C18257k implements Factory<C18256j> {
    /* renamed from: a */
    private final Provider<C18248a> f56572a;

    public /* synthetic */ Object get() {
        return m66151a();
    }

    public C18257k(Provider<C18248a> provider) {
        this.f56572a = provider;
    }

    /* renamed from: a */
    public C18256j m66151a() {
        return C18257k.m66149a(this.f56572a);
    }

    /* renamed from: a */
    public static C18256j m66149a(Provider<C18248a> provider) {
        return new C18256j((C18248a) provider.get());
    }

    /* renamed from: b */
    public static C18257k m66150b(Provider<C18248a> provider) {
        return new C18257k(provider);
    }
}
