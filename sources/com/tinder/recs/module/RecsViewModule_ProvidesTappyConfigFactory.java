package com.tinder.recs.module;

import com.tinder.recs.model.TappyConfig;
import com.tinder.recs.provider.TappyConfigProvider;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class RecsViewModule_ProvidesTappyConfigFactory implements Factory<TappyConfig> {
    private final RecsViewModule module;
    private final Provider<TappyConfigProvider> tappyConfigProvider;

    public RecsViewModule_ProvidesTappyConfigFactory(RecsViewModule recsViewModule, Provider<TappyConfigProvider> provider) {
        this.module = recsViewModule;
        this.tappyConfigProvider = provider;
    }

    public TappyConfig get() {
        return provideInstance(this.module, this.tappyConfigProvider);
    }

    public static TappyConfig provideInstance(RecsViewModule recsViewModule, Provider<TappyConfigProvider> provider) {
        return proxyProvidesTappyConfig(recsViewModule, (TappyConfigProvider) provider.get());
    }

    public static RecsViewModule_ProvidesTappyConfigFactory create(RecsViewModule recsViewModule, Provider<TappyConfigProvider> provider) {
        return new RecsViewModule_ProvidesTappyConfigFactory(recsViewModule, provider);
    }

    public static TappyConfig proxyProvidesTappyConfig(RecsViewModule recsViewModule, TappyConfigProvider tappyConfigProvider) {
        return (TappyConfig) C15521i.m58001a(recsViewModule.providesTappyConfig(tappyConfigProvider), "Cannot return null from a non-@Nullable @Provides method");
    }
}
