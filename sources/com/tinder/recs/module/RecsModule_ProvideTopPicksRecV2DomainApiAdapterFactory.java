package com.tinder.recs.module;

import com.tinder.data.adapter.ah;
import com.tinder.data.adapter.ah.C10733a;
import com.tinder.domain.utils.AgeCalculator;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class RecsModule_ProvideTopPicksRecV2DomainApiAdapterFactory implements Factory<ah> {
    private final Provider<AgeCalculator> ageCalculatorProvider;
    private final RecsModule module;
    private final Provider<C10733a> recUserDomainApiAdapterProvider;

    public RecsModule_ProvideTopPicksRecV2DomainApiAdapterFactory(RecsModule recsModule, Provider<C10733a> provider, Provider<AgeCalculator> provider2) {
        this.module = recsModule;
        this.recUserDomainApiAdapterProvider = provider;
        this.ageCalculatorProvider = provider2;
    }

    public ah get() {
        return provideInstance(this.module, this.recUserDomainApiAdapterProvider, this.ageCalculatorProvider);
    }

    public static ah provideInstance(RecsModule recsModule, Provider<C10733a> provider, Provider<AgeCalculator> provider2) {
        return proxyProvideTopPicksRecV2DomainApiAdapter(recsModule, (C10733a) provider.get(), (AgeCalculator) provider2.get());
    }

    public static RecsModule_ProvideTopPicksRecV2DomainApiAdapterFactory create(RecsModule recsModule, Provider<C10733a> provider, Provider<AgeCalculator> provider2) {
        return new RecsModule_ProvideTopPicksRecV2DomainApiAdapterFactory(recsModule, provider, provider2);
    }

    public static ah proxyProvideTopPicksRecV2DomainApiAdapter(RecsModule recsModule, C10733a c10733a, AgeCalculator ageCalculator) {
        return (ah) C15521i.m58001a(recsModule.provideTopPicksRecV2DomainApiAdapter(c10733a, ageCalculator), "Cannot return null from a non-@Nullable @Provides method");
    }
}
