package com.tinder.superlike.p419b;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.common.provider.C2643c;
import com.tinder.purchase.domain.repository.OfferRepository;
import com.tinder.purchase.providers.BillerVersionCodeProvider;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.superlike.b.d */
public final class C18186d implements Factory<C15070b> {
    /* renamed from: a */
    private final Provider<C2630h> f56379a;
    /* renamed from: b */
    private final Provider<BillerVersionCodeProvider> f56380b;
    /* renamed from: c */
    private final Provider<C15071e> f56381c;
    /* renamed from: d */
    private final Provider<OfferRepository> f56382d;
    /* renamed from: e */
    private final Provider<C2643c> f56383e;

    public /* synthetic */ Object get() {
        return m65940a();
    }

    public C18186d(Provider<C2630h> provider, Provider<BillerVersionCodeProvider> provider2, Provider<C15071e> provider3, Provider<OfferRepository> provider4, Provider<C2643c> provider5) {
        this.f56379a = provider;
        this.f56380b = provider2;
        this.f56381c = provider3;
        this.f56382d = provider4;
        this.f56383e = provider5;
    }

    /* renamed from: a */
    public C15070b m65940a() {
        return C18186d.m65938a(this.f56379a, this.f56380b, this.f56381c, this.f56382d, this.f56383e);
    }

    /* renamed from: a */
    public static C15070b m65938a(Provider<C2630h> provider, Provider<BillerVersionCodeProvider> provider2, Provider<C15071e> provider3, Provider<OfferRepository> provider4, Provider<C2643c> provider5) {
        return new C15070b((C2630h) provider.get(), (BillerVersionCodeProvider) provider2.get(), (C15071e) provider3.get(), (OfferRepository) provider4.get(), (C2643c) provider5.get());
    }

    /* renamed from: b */
    public static C18186d m65939b(Provider<C2630h> provider, Provider<BillerVersionCodeProvider> provider2, Provider<C15071e> provider3, Provider<OfferRepository> provider4, Provider<C2643c> provider5) {
        return new C18186d(provider, provider2, provider3, provider4, provider5);
    }
}
