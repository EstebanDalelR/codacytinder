package com.tinder.purchase.p371a;

import com.tinder.purchase.domain.repository.OfferRepository;
import com.tinder.purchase.logging.C14522a;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.purchase.a.o */
public final class C17801o implements Factory<C14480k> {
    /* renamed from: a */
    private final Provider<OfferRepository> f55525a;
    /* renamed from: b */
    private final Provider<C14522a> f55526b;

    public /* synthetic */ Object get() {
        return m65003a();
    }

    public C17801o(Provider<OfferRepository> provider, Provider<C14522a> provider2) {
        this.f55525a = provider;
        this.f55526b = provider2;
    }

    /* renamed from: a */
    public C14480k m65003a() {
        return C17801o.m65001a(this.f55525a, this.f55526b);
    }

    /* renamed from: a */
    public static C14480k m65001a(Provider<OfferRepository> provider, Provider<C14522a> provider2) {
        return new C14480k((OfferRepository) provider.get(), (C14522a) provider2.get());
    }

    /* renamed from: b */
    public static C17801o m65002b(Provider<OfferRepository> provider, Provider<C14522a> provider2) {
        return new C17801o(provider, provider2);
    }
}
