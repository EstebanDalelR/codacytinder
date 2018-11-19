package com.tinder.intropricing.domain.p264a;

import com.tinder.intropricing.domain.repo.IntroPricingApplicationRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

/* renamed from: com.tinder.intropricing.domain.a.b */
public final class C13349b implements Factory<C9730a> {
    /* renamed from: a */
    private final Provider<IntroPricingApplicationRepository> f42351a;

    public /* synthetic */ Object get() {
        return m51648a();
    }

    public C13349b(Provider<IntroPricingApplicationRepository> provider) {
        this.f42351a = provider;
    }

    /* renamed from: a */
    public C9730a m51648a() {
        return C13349b.m51646a(this.f42351a);
    }

    /* renamed from: a */
    public static C9730a m51646a(Provider<IntroPricingApplicationRepository> provider) {
        return new C9730a((IntroPricingApplicationRepository) provider.get());
    }

    /* renamed from: b */
    public static C13349b m51647b(Provider<IntroPricingApplicationRepository> provider) {
        return new C13349b(provider);
    }
}
