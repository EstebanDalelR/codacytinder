package com.tinder.recs.module;

import com.tinder.domain.recs.RecsEngine.Configurator;
import com.tinder.domain.recs.RecsEngineRegistry;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class RecsModule_ProvideRecsEngineRegistryFactory implements Factory<RecsEngineRegistry> {
    private final RecsModule module;
    private final Provider<Configurator.Factory> recsEngineConfiguratorFactoryProvider;

    public RecsModule_ProvideRecsEngineRegistryFactory(RecsModule recsModule, Provider<Configurator.Factory> provider) {
        this.module = recsModule;
        this.recsEngineConfiguratorFactoryProvider = provider;
    }

    public RecsEngineRegistry get() {
        return provideInstance(this.module, this.recsEngineConfiguratorFactoryProvider);
    }

    public static RecsEngineRegistry provideInstance(RecsModule recsModule, Provider<Configurator.Factory> provider) {
        return proxyProvideRecsEngineRegistry(recsModule, (Configurator.Factory) provider.get());
    }

    public static RecsModule_ProvideRecsEngineRegistryFactory create(RecsModule recsModule, Provider<Configurator.Factory> provider) {
        return new RecsModule_ProvideRecsEngineRegistryFactory(recsModule, provider);
    }

    public static RecsEngineRegistry proxyProvideRecsEngineRegistry(RecsModule recsModule, Configurator.Factory factory) {
        return (RecsEngineRegistry) C15521i.m58001a(recsModule.provideRecsEngineRegistry(factory), "Cannot return null from a non-@Nullable @Provides method");
    }
}
