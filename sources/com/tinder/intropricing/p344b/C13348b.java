package com.tinder.intropricing.p344b;

import com.tinder.intropricing.domain.repo.IntroPricingApplicationRepository;
import com.tinder.purchase.domain.repository.OfferRepository;
import com.tinder.purchase.usecase.C16242a;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlin.jvm.functions.Function0;
import org.joda.time.DateTime;

/* renamed from: com.tinder.intropricing.b.b */
public final class C13348b implements Factory<C11884a> {
    /* renamed from: a */
    private final Provider<OfferRepository> f42347a;
    /* renamed from: b */
    private final Provider<IntroPricingApplicationRepository> f42348b;
    /* renamed from: c */
    private final Provider<C16242a> f42349c;
    /* renamed from: d */
    private final Provider<Function0<DateTime>> f42350d;

    public /* synthetic */ Object get() {
        return m51645a();
    }

    public C13348b(Provider<OfferRepository> provider, Provider<IntroPricingApplicationRepository> provider2, Provider<C16242a> provider3, Provider<Function0<DateTime>> provider4) {
        this.f42347a = provider;
        this.f42348b = provider2;
        this.f42349c = provider3;
        this.f42350d = provider4;
    }

    /* renamed from: a */
    public C11884a m51645a() {
        return C13348b.m51643a(this.f42347a, this.f42348b, this.f42349c, this.f42350d);
    }

    /* renamed from: a */
    public static C11884a m51643a(Provider<OfferRepository> provider, Provider<IntroPricingApplicationRepository> provider2, Provider<C16242a> provider3, Provider<Function0<DateTime>> provider4) {
        return new C11884a((OfferRepository) provider.get(), (IntroPricingApplicationRepository) provider2.get(), (C16242a) provider3.get(), (Function0) provider4.get());
    }

    /* renamed from: b */
    public static C13348b m51644b(Provider<OfferRepository> provider, Provider<IntroPricingApplicationRepository> provider2, Provider<C16242a> provider3, Provider<Function0<DateTime>> provider4) {
        return new C13348b(provider, provider2, provider3, provider4);
    }
}
