package com.tinder.recs.module;

import com.tinder.recs.domain.repository.RewindsAvailableRepository;
import com.tinder.recs.domain.usecase.ObserveRewindsAvailable;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class RecsModule_ProvideObserveRewindsAvailableFactory implements Factory<ObserveRewindsAvailable> {
    private final RecsModule module;
    private final Provider<RewindsAvailableRepository> rewindsAvailableRepositoryProvider;

    public RecsModule_ProvideObserveRewindsAvailableFactory(RecsModule recsModule, Provider<RewindsAvailableRepository> provider) {
        this.module = recsModule;
        this.rewindsAvailableRepositoryProvider = provider;
    }

    public ObserveRewindsAvailable get() {
        return provideInstance(this.module, this.rewindsAvailableRepositoryProvider);
    }

    public static ObserveRewindsAvailable provideInstance(RecsModule recsModule, Provider<RewindsAvailableRepository> provider) {
        return proxyProvideObserveRewindsAvailable(recsModule, (RewindsAvailableRepository) provider.get());
    }

    public static RecsModule_ProvideObserveRewindsAvailableFactory create(RecsModule recsModule, Provider<RewindsAvailableRepository> provider) {
        return new RecsModule_ProvideObserveRewindsAvailableFactory(recsModule, provider);
    }

    public static ObserveRewindsAvailable proxyProvideObserveRewindsAvailable(RecsModule recsModule, RewindsAvailableRepository rewindsAvailableRepository) {
        return (ObserveRewindsAvailable) C15521i.m58001a(recsModule.provideObserveRewindsAvailable(rewindsAvailableRepository), "Cannot return null from a non-@Nullable @Provides method");
    }
}
