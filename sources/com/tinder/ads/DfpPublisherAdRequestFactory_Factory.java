package com.tinder.ads;

import com.tinder.core.p201a.C8589c;
import com.tinder.domain.meta.gateway.MetaGateway;
import com.tinder.domain.utils.AgeCalculator;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class DfpPublisherAdRequestFactory_Factory implements Factory<DfpPublisherAdRequestFactory> {
    private final Provider<AgeCalculator> ageCalculatorProvider;
    private final Provider<C8589c> locationProvider;
    private final Provider<MetaGateway> metaGatewayProvider;

    public DfpPublisherAdRequestFactory_Factory(Provider<C8589c> provider, Provider<MetaGateway> provider2, Provider<AgeCalculator> provider3) {
        this.locationProvider = provider;
        this.metaGatewayProvider = provider2;
        this.ageCalculatorProvider = provider3;
    }

    public DfpPublisherAdRequestFactory get() {
        return provideInstance(this.locationProvider, this.metaGatewayProvider, this.ageCalculatorProvider);
    }

    public static DfpPublisherAdRequestFactory provideInstance(Provider<C8589c> provider, Provider<MetaGateway> provider2, Provider<AgeCalculator> provider3) {
        return new DfpPublisherAdRequestFactory((C8589c) provider.get(), (MetaGateway) provider2.get(), (AgeCalculator) provider3.get());
    }

    public static DfpPublisherAdRequestFactory_Factory create(Provider<C8589c> provider, Provider<MetaGateway> provider2, Provider<AgeCalculator> provider3) {
        return new DfpPublisherAdRequestFactory_Factory(provider, provider2, provider3);
    }

    public static DfpPublisherAdRequestFactory newDfpPublisherAdRequestFactory(C8589c c8589c, MetaGateway metaGateway, AgeCalculator ageCalculator) {
        return new DfpPublisherAdRequestFactory(c8589c, metaGateway, ageCalculator);
    }
}
