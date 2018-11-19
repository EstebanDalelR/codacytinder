package com.tinder.recs.module;

import com.squareup.moshi.C5987p;
import com.tinder.analytics.performance.C8151o;
import com.tinder.api.TinderApi;
import com.tinder.common.provider.C2643c;
import com.tinder.data.adapter.ah;
import com.tinder.domain.recs.RecsApiClient;
import com.tinder.managers.bj;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class RecsModule_ProvideCoreRecsApiClientFactory implements Factory<RecsApiClient> {
    private final Provider<C2643c> defaultLocaleProvider;
    private final Provider<bj> managerSettingsProvider;
    private final RecsModule module;
    private final Provider<C5987p> moshiProvider;
    private final Provider<ah> recV2DomainApiAdapterProvider;
    private final Provider<C8151o> recsEventProvider;
    private final Provider<TinderApi> tinderApiProvider;

    public RecsModule_ProvideCoreRecsApiClientFactory(RecsModule recsModule, Provider<TinderApi> provider, Provider<bj> provider2, Provider<C8151o> provider3, Provider<ah> provider4, Provider<C5987p> provider5, Provider<C2643c> provider6) {
        this.module = recsModule;
        this.tinderApiProvider = provider;
        this.managerSettingsProvider = provider2;
        this.recsEventProvider = provider3;
        this.recV2DomainApiAdapterProvider = provider4;
        this.moshiProvider = provider5;
        this.defaultLocaleProvider = provider6;
    }

    public RecsApiClient get() {
        return provideInstance(this.module, this.tinderApiProvider, this.managerSettingsProvider, this.recsEventProvider, this.recV2DomainApiAdapterProvider, this.moshiProvider, this.defaultLocaleProvider);
    }

    public static RecsApiClient provideInstance(RecsModule recsModule, Provider<TinderApi> provider, Provider<bj> provider2, Provider<C8151o> provider3, Provider<ah> provider4, Provider<C5987p> provider5, Provider<C2643c> provider6) {
        return proxyProvideCoreRecsApiClient(recsModule, (TinderApi) provider.get(), (bj) provider2.get(), (C8151o) provider3.get(), (ah) provider4.get(), (C5987p) provider5.get(), (C2643c) provider6.get());
    }

    public static RecsModule_ProvideCoreRecsApiClientFactory create(RecsModule recsModule, Provider<TinderApi> provider, Provider<bj> provider2, Provider<C8151o> provider3, Provider<ah> provider4, Provider<C5987p> provider5, Provider<C2643c> provider6) {
        return new RecsModule_ProvideCoreRecsApiClientFactory(recsModule, provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static RecsApiClient proxyProvideCoreRecsApiClient(RecsModule recsModule, TinderApi tinderApi, bj bjVar, C8151o c8151o, ah ahVar, C5987p c5987p, C2643c c2643c) {
        return (RecsApiClient) C15521i.m58001a(recsModule.provideCoreRecsApiClient(tinderApi, bjVar, c8151o, ahVar, c5987p, c2643c), "Cannot return null from a non-@Nullable @Provides method");
    }
}
