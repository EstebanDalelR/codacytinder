package com.tinder.purchase.register;

import com.tinder.boost.p178a.C10400d;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.data.fastmatch.usecase.C10771d;
import com.tinder.data.purchase.p091a.C3926a;
import com.tinder.domain.fastmatch.provider.FastMatchConfigProvider;
import com.tinder.domain.meta.gateway.MetaGateway;
import com.tinder.domain.profile.usecase.SyncProfileData;
import com.tinder.domain.purchase.SubscriptionProvider;
import com.tinder.purchase.billing.Biller;
import com.tinder.purchase.domain.repository.OfferRepository;
import com.tinder.purchase.logging.C14522a;
import com.tinder.purchase.p373c.C14488a;
import com.tinder.superlike.p419b.C15071e;
import com.tinder.tinderplus.p428a.C15193i;
import com.tinder.usecase.C17225j;
import com.tinder.usecase.C17226m;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class al implements Factory<RegisterImpl> {
    /* renamed from: a */
    private final Provider<Biller> f55697a;
    /* renamed from: b */
    private final Provider<OfferRepository> f55698b;
    /* renamed from: c */
    private final Provider<C14488a> f55699c;
    /* renamed from: d */
    private final Provider<C10400d> f55700d;
    /* renamed from: e */
    private final Provider<C15071e> f55701e;
    /* renamed from: f */
    private final Provider<C14522a> f55702f;
    /* renamed from: g */
    private final Provider<C15193i> f55703g;
    /* renamed from: h */
    private final Provider<SubscriptionProvider> f55704h;
    /* renamed from: i */
    private final Provider<C3926a> f55705i;
    /* renamed from: j */
    private final Provider<FastMatchConfigProvider> f55706j;
    /* renamed from: k */
    private final Provider<C10771d> f55707k;
    /* renamed from: l */
    private final Provider<C17225j> f55708l;
    /* renamed from: m */
    private final Provider<C17226m> f55709m;
    /* renamed from: n */
    private final Provider<SyncProfileData> f55710n;
    /* renamed from: o */
    private final Provider<AbTestUtility> f55711o;
    /* renamed from: p */
    private final Provider<MetaGateway> f55712p;

    public /* synthetic */ Object get() {
        return m65137a();
    }

    public al(Provider<Biller> provider, Provider<OfferRepository> provider2, Provider<C14488a> provider3, Provider<C10400d> provider4, Provider<C15071e> provider5, Provider<C14522a> provider6, Provider<C15193i> provider7, Provider<SubscriptionProvider> provider8, Provider<C3926a> provider9, Provider<FastMatchConfigProvider> provider10, Provider<C10771d> provider11, Provider<C17225j> provider12, Provider<C17226m> provider13, Provider<SyncProfileData> provider14, Provider<AbTestUtility> provider15, Provider<MetaGateway> provider16) {
        this.f55697a = provider;
        this.f55698b = provider2;
        this.f55699c = provider3;
        this.f55700d = provider4;
        this.f55701e = provider5;
        this.f55702f = provider6;
        this.f55703g = provider7;
        this.f55704h = provider8;
        this.f55705i = provider9;
        this.f55706j = provider10;
        this.f55707k = provider11;
        this.f55708l = provider12;
        this.f55709m = provider13;
        this.f55710n = provider14;
        this.f55711o = provider15;
        this.f55712p = provider16;
    }

    /* renamed from: a */
    public RegisterImpl m65137a() {
        return m65135a(this.f55697a, this.f55698b, this.f55699c, this.f55700d, this.f55701e, this.f55702f, this.f55703g, this.f55704h, this.f55705i, this.f55706j, this.f55707k, this.f55708l, this.f55709m, this.f55710n, this.f55711o, this.f55712p);
    }

    /* renamed from: a */
    public static RegisterImpl m65135a(Provider<Biller> provider, Provider<OfferRepository> provider2, Provider<C14488a> provider3, Provider<C10400d> provider4, Provider<C15071e> provider5, Provider<C14522a> provider6, Provider<C15193i> provider7, Provider<SubscriptionProvider> provider8, Provider<C3926a> provider9, Provider<FastMatchConfigProvider> provider10, Provider<C10771d> provider11, Provider<C17225j> provider12, Provider<C17226m> provider13, Provider<SyncProfileData> provider14, Provider<AbTestUtility> provider15, Provider<MetaGateway> provider16) {
        return new RegisterImpl((Biller) provider.get(), (OfferRepository) provider2.get(), (C14488a) provider3.get(), (C10400d) provider4.get(), (C15071e) provider5.get(), (C14522a) provider6.get(), (C15193i) provider7.get(), (SubscriptionProvider) provider8.get(), (C3926a) provider9.get(), (FastMatchConfigProvider) provider10.get(), (C10771d) provider11.get(), (C17225j) provider12.get(), (C17226m) provider13.get(), (SyncProfileData) provider14.get(), (AbTestUtility) provider15.get(), (MetaGateway) provider16.get());
    }

    /* renamed from: b */
    public static al m65136b(Provider<Biller> provider, Provider<OfferRepository> provider2, Provider<C14488a> provider3, Provider<C10400d> provider4, Provider<C15071e> provider5, Provider<C14522a> provider6, Provider<C15193i> provider7, Provider<SubscriptionProvider> provider8, Provider<C3926a> provider9, Provider<FastMatchConfigProvider> provider10, Provider<C10771d> provider11, Provider<C17225j> provider12, Provider<C17226m> provider13, Provider<SyncProfileData> provider14, Provider<AbTestUtility> provider15, Provider<MetaGateway> provider16) {
        return new al(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13, provider14, provider15, provider16);
    }
}
