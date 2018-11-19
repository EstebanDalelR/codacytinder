package com.tinder.recs.module;

import com.tinder.api.TinderApi;
import com.tinder.data.adapter.ah;
import com.tinder.fastmatch.p244b.C11621a;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class RecsModule_ProvideFastMatchApiClientFactory implements Factory<C11621a> {
    private final RecsModule module;
    private final Provider<ah> recDomainApiAdapterProvider;
    private final Provider<TinderApi> tinderApiProvider;

    public RecsModule_ProvideFastMatchApiClientFactory(RecsModule recsModule, Provider<TinderApi> provider, Provider<ah> provider2) {
        this.module = recsModule;
        this.tinderApiProvider = provider;
        this.recDomainApiAdapterProvider = provider2;
    }

    public C11621a get() {
        return provideInstance(this.module, this.tinderApiProvider, this.recDomainApiAdapterProvider);
    }

    public static C11621a provideInstance(RecsModule recsModule, Provider<TinderApi> provider, Provider<ah> provider2) {
        return proxyProvideFastMatchApiClient(recsModule, (TinderApi) provider.get(), (ah) provider2.get());
    }

    public static RecsModule_ProvideFastMatchApiClientFactory create(RecsModule recsModule, Provider<TinderApi> provider, Provider<ah> provider2) {
        return new RecsModule_ProvideFastMatchApiClientFactory(recsModule, provider, provider2);
    }

    public static C11621a proxyProvideFastMatchApiClient(RecsModule recsModule, TinderApi tinderApi, ah ahVar) {
        return (C11621a) C15521i.m58001a(recsModule.provideFastMatchApiClient(tinderApi, ahVar), "Cannot return null from a non-@Nullable @Provides method");
    }
}
