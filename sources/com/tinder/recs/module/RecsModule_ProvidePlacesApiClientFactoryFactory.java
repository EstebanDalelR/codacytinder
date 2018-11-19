package com.tinder.recs.module;

import com.tinder.api.TinderApi;
import com.tinder.api.moshi.ResponseErrorAdapter;
import com.tinder.data.adapter.ah.C10733a;
import com.tinder.data.places.PlacesRecsApiClient.C8736b;
import com.tinder.domain.utils.AgeCalculator;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class RecsModule_ProvidePlacesApiClientFactoryFactory implements Factory<C8736b> {
    private final Provider<AgeCalculator> ageCalculatorProvider;
    private final RecsModule module;
    private final Provider<C10733a> recUserDomainApiAdapterProvider;
    private final Provider<ResponseErrorAdapter> responseErrorAdapterProvider;
    private final Provider<TinderApi> tinderApiProvider;

    public RecsModule_ProvidePlacesApiClientFactoryFactory(RecsModule recsModule, Provider<TinderApi> provider, Provider<C10733a> provider2, Provider<AgeCalculator> provider3, Provider<ResponseErrorAdapter> provider4) {
        this.module = recsModule;
        this.tinderApiProvider = provider;
        this.recUserDomainApiAdapterProvider = provider2;
        this.ageCalculatorProvider = provider3;
        this.responseErrorAdapterProvider = provider4;
    }

    public C8736b get() {
        return provideInstance(this.module, this.tinderApiProvider, this.recUserDomainApiAdapterProvider, this.ageCalculatorProvider, this.responseErrorAdapterProvider);
    }

    public static C8736b provideInstance(RecsModule recsModule, Provider<TinderApi> provider, Provider<C10733a> provider2, Provider<AgeCalculator> provider3, Provider<ResponseErrorAdapter> provider4) {
        return proxyProvidePlacesApiClientFactory(recsModule, (TinderApi) provider.get(), (C10733a) provider2.get(), (AgeCalculator) provider3.get(), (ResponseErrorAdapter) provider4.get());
    }

    public static RecsModule_ProvidePlacesApiClientFactoryFactory create(RecsModule recsModule, Provider<TinderApi> provider, Provider<C10733a> provider2, Provider<AgeCalculator> provider3, Provider<ResponseErrorAdapter> provider4) {
        return new RecsModule_ProvidePlacesApiClientFactoryFactory(recsModule, provider, provider2, provider3, provider4);
    }

    public static C8736b proxyProvidePlacesApiClientFactory(RecsModule recsModule, TinderApi tinderApi, C10733a c10733a, AgeCalculator ageCalculator, ResponseErrorAdapter responseErrorAdapter) {
        return (C8736b) C15521i.m58001a(recsModule.providePlacesApiClientFactory(tinderApi, c10733a, ageCalculator, responseErrorAdapter), "Cannot return null from a non-@Nullable @Provides method");
    }
}
