package com.tinder.tinderplus.p428a;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.api.TinderApiClient;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.managers.bk;
import com.tinder.purchase.domain.repository.OfferRepository;
import com.tinder.purchase.logging.C14522a;
import com.tinder.purchase.p371a.C14480k;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.tinderplus.a.h */
public final class C18204h implements Factory<C15192e> {
    /* renamed from: a */
    private final Provider<TinderApiClient> f56434a;
    /* renamed from: b */
    private final Provider<C15193i> f56435b;
    /* renamed from: c */
    private final Provider<bk> f56436c;
    /* renamed from: d */
    private final Provider<C2630h> f56437d;
    /* renamed from: e */
    private final Provider<OfferRepository> f56438e;
    /* renamed from: f */
    private final Provider<C14522a> f56439f;
    /* renamed from: g */
    private final Provider<C14480k> f56440g;
    /* renamed from: h */
    private final Provider<AbTestUtility> f56441h;

    public /* synthetic */ Object get() {
        return m66003a();
    }

    public C18204h(Provider<TinderApiClient> provider, Provider<C15193i> provider2, Provider<bk> provider3, Provider<C2630h> provider4, Provider<OfferRepository> provider5, Provider<C14522a> provider6, Provider<C14480k> provider7, Provider<AbTestUtility> provider8) {
        this.f56434a = provider;
        this.f56435b = provider2;
        this.f56436c = provider3;
        this.f56437d = provider4;
        this.f56438e = provider5;
        this.f56439f = provider6;
        this.f56440g = provider7;
        this.f56441h = provider8;
    }

    /* renamed from: a */
    public C15192e m66003a() {
        return C18204h.m66001a(this.f56434a, this.f56435b, this.f56436c, this.f56437d, this.f56438e, this.f56439f, this.f56440g, this.f56441h);
    }

    /* renamed from: a */
    public static C15192e m66001a(Provider<TinderApiClient> provider, Provider<C15193i> provider2, Provider<bk> provider3, Provider<C2630h> provider4, Provider<OfferRepository> provider5, Provider<C14522a> provider6, Provider<C14480k> provider7, Provider<AbTestUtility> provider8) {
        return new C15192e((TinderApiClient) provider.get(), (C15193i) provider2.get(), (bk) provider3.get(), (C2630h) provider4.get(), (OfferRepository) provider5.get(), (C14522a) provider6.get(), (C14480k) provider7.get(), (AbTestUtility) provider8.get());
    }

    /* renamed from: b */
    public static C18204h m66002b(Provider<TinderApiClient> provider, Provider<C15193i> provider2, Provider<bk> provider3, Provider<C2630h> provider4, Provider<OfferRepository> provider5, Provider<C14522a> provider6, Provider<C14480k> provider7, Provider<AbTestUtility> provider8) {
        return new C18204h(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }
}
