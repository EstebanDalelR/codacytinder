package com.tinder.ads;

import com.tinder.core.p201a.C8589c;
import com.tinder.domain.meta.gateway.MetaGateway;
import com.tinder.domain.utils.AgeCalculator;
import com.tinder.recs.card.CardSizeProvider;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class DfpFieldsResolverImpl_Factory implements Factory<DfpFieldsResolverImpl> {
    private final Provider<AgeCalculator> ageCalculatorProvider;
    private final Provider<CardSizeProvider> cardSizeProvider;
    private final Provider<C8589c> locationProvider;
    private final Provider<MetaGateway> metaGatewayProvider;

    public DfpFieldsResolverImpl_Factory(Provider<C8589c> provider, Provider<CardSizeProvider> provider2, Provider<MetaGateway> provider3, Provider<AgeCalculator> provider4) {
        this.locationProvider = provider;
        this.cardSizeProvider = provider2;
        this.metaGatewayProvider = provider3;
        this.ageCalculatorProvider = provider4;
    }

    public DfpFieldsResolverImpl get() {
        return provideInstance(this.locationProvider, this.cardSizeProvider, this.metaGatewayProvider, this.ageCalculatorProvider);
    }

    public static DfpFieldsResolverImpl provideInstance(Provider<C8589c> provider, Provider<CardSizeProvider> provider2, Provider<MetaGateway> provider3, Provider<AgeCalculator> provider4) {
        return new DfpFieldsResolverImpl((C8589c) provider.get(), (CardSizeProvider) provider2.get(), (MetaGateway) provider3.get(), (AgeCalculator) provider4.get());
    }

    public static DfpFieldsResolverImpl_Factory create(Provider<C8589c> provider, Provider<CardSizeProvider> provider2, Provider<MetaGateway> provider3, Provider<AgeCalculator> provider4) {
        return new DfpFieldsResolverImpl_Factory(provider, provider2, provider3, provider4);
    }

    public static DfpFieldsResolverImpl newDfpFieldsResolverImpl(C8589c c8589c, CardSizeProvider cardSizeProvider, MetaGateway metaGateway, AgeCalculator ageCalculator) {
        return new DfpFieldsResolverImpl(c8589c, cardSizeProvider, metaGateway, ageCalculator);
    }
}
