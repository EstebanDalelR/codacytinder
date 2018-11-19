package com.tinder.purchase.usecase;

import com.tinder.purchase.C14481a;
import com.tinder.purchase.billing.Biller;
import com.tinder.purchase.domain.model.p375a.C14503a;
import com.tinder.purchase.domain.repository.OfferRepository;
import com.tinder.purchase.logging.C14522a;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.purchase.usecase.d */
public final class C17869d implements Factory<C16245c> {
    /* renamed from: a */
    private final Provider<C14503a> f55743a;
    /* renamed from: b */
    private final Provider<OfferRepository> f55744b;
    /* renamed from: c */
    private final Provider<C14522a> f55745c;
    /* renamed from: d */
    private final Provider<Biller> f55746d;
    /* renamed from: e */
    private final Provider<C14481a> f55747e;

    public /* synthetic */ Object get() {
        return m65147a();
    }

    public C17869d(Provider<C14503a> provider, Provider<OfferRepository> provider2, Provider<C14522a> provider3, Provider<Biller> provider4, Provider<C14481a> provider5) {
        this.f55743a = provider;
        this.f55744b = provider2;
        this.f55745c = provider3;
        this.f55746d = provider4;
        this.f55747e = provider5;
    }

    /* renamed from: a */
    public C16245c m65147a() {
        return C17869d.m65145a(this.f55743a, this.f55744b, this.f55745c, this.f55746d, this.f55747e);
    }

    /* renamed from: a */
    public static C16245c m65145a(Provider<C14503a> provider, Provider<OfferRepository> provider2, Provider<C14522a> provider3, Provider<Biller> provider4, Provider<C14481a> provider5) {
        return new C16245c((C14503a) provider.get(), (OfferRepository) provider2.get(), (C14522a) provider3.get(), (Biller) provider4.get(), (C14481a) provider5.get());
    }

    /* renamed from: b */
    public static C17869d m65146b(Provider<C14503a> provider, Provider<OfferRepository> provider2, Provider<C14522a> provider3, Provider<Biller> provider4, Provider<C14481a> provider5) {
        return new C17869d(provider, provider2, provider3, provider4, provider5);
    }
}
