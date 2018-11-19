package com.tinder.intropricing.p263a.p343a;

import com.tinder.intropricing.p263a.C9727a;
import com.tinder.purchase.domain.repository.OfferRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.intropricing.a.a.b */
public final class C13346b implements Factory<C11878a> {
    /* renamed from: a */
    private final Provider<OfferRepository> f42344a;
    /* renamed from: b */
    private final Provider<C9727a> f42345b;

    public /* synthetic */ Object get() {
        return m51639a();
    }

    public C13346b(Provider<OfferRepository> provider, Provider<C9727a> provider2) {
        this.f42344a = provider;
        this.f42345b = provider2;
    }

    /* renamed from: a */
    public C11878a m51639a() {
        return C13346b.m51637a(this.f42344a, this.f42345b);
    }

    /* renamed from: a */
    public static C11878a m51637a(Provider<OfferRepository> provider, Provider<C9727a> provider2) {
        return new C11878a((OfferRepository) provider.get(), (C9727a) provider2.get());
    }

    /* renamed from: b */
    public static C13346b m51638b(Provider<OfferRepository> provider, Provider<C9727a> provider2) {
        return new C13346b(provider, provider2);
    }
}
