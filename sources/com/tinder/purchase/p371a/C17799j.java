package com.tinder.purchase.p371a;

import com.tinder.purchase.billing.Biller;
import com.tinder.purchase.domain.repository.OfferRepository;
import com.tinder.purchase.logging.C14522a;
import com.tinder.purchase.model.p377a.C14529b;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.purchase.a.j */
public final class C17799j implements Factory<C14479a> {
    /* renamed from: a */
    private final Provider<C14529b> f55519a;
    /* renamed from: b */
    private final Provider<OfferRepository> f55520b;
    /* renamed from: c */
    private final Provider<Biller> f55521c;
    /* renamed from: d */
    private final Provider<C14522a> f55522d;

    public /* synthetic */ Object get() {
        return m65000a();
    }

    public C17799j(Provider<C14529b> provider, Provider<OfferRepository> provider2, Provider<Biller> provider3, Provider<C14522a> provider4) {
        this.f55519a = provider;
        this.f55520b = provider2;
        this.f55521c = provider3;
        this.f55522d = provider4;
    }

    /* renamed from: a */
    public C14479a m65000a() {
        return C17799j.m64998a(this.f55519a, this.f55520b, this.f55521c, this.f55522d);
    }

    /* renamed from: a */
    public static C14479a m64998a(Provider<C14529b> provider, Provider<OfferRepository> provider2, Provider<Biller> provider3, Provider<C14522a> provider4) {
        return new C14479a((C14529b) provider.get(), (OfferRepository) provider2.get(), (Biller) provider3.get(), (C14522a) provider4.get());
    }

    /* renamed from: b */
    public static C17799j m64999b(Provider<C14529b> provider, Provider<OfferRepository> provider2, Provider<Biller> provider3, Provider<C14522a> provider4) {
        return new C17799j(provider, provider2, provider3, provider4);
    }
}
