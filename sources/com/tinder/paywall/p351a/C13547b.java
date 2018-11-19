package com.tinder.paywall.p351a;

import com.tinder.purchase.domain.repository.OfferRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.paywall.a.b */
public final class C13547b implements Factory<C12264a> {
    /* renamed from: a */
    private final Provider<OfferRepository> f43269a;

    public /* synthetic */ Object get() {
        return m52939a();
    }

    public C13547b(Provider<OfferRepository> provider) {
        this.f43269a = provider;
    }

    /* renamed from: a */
    public C12264a m52939a() {
        return C13547b.m52937a(this.f43269a);
    }

    /* renamed from: a */
    public static C12264a m52937a(Provider<OfferRepository> provider) {
        return new C12264a((OfferRepository) provider.get());
    }

    /* renamed from: b */
    public static C13547b m52938b(Provider<OfferRepository> provider) {
        return new C13547b(provider);
    }
}
