package com.tinder.recs.module;

import com.tinder.recs.domain.repository.RewindsAvailableRepository;
import com.tinder.recs.domain.usecase.IncrementRewindsAvailable;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class RecsModule_ProvideIncrementRewindsAvailableFactory implements Factory<IncrementRewindsAvailable> {
    private final RecsModule module;
    private final Provider<RewindsAvailableRepository> rewindsAvailableRepositoryProvider;

    public RecsModule_ProvideIncrementRewindsAvailableFactory(RecsModule recsModule, Provider<RewindsAvailableRepository> provider) {
        this.module = recsModule;
        this.rewindsAvailableRepositoryProvider = provider;
    }

    public IncrementRewindsAvailable get() {
        return provideInstance(this.module, this.rewindsAvailableRepositoryProvider);
    }

    public static IncrementRewindsAvailable provideInstance(RecsModule recsModule, Provider<RewindsAvailableRepository> provider) {
        return proxyProvideIncrementRewindsAvailable(recsModule, (RewindsAvailableRepository) provider.get());
    }

    public static RecsModule_ProvideIncrementRewindsAvailableFactory create(RecsModule recsModule, Provider<RewindsAvailableRepository> provider) {
        return new RecsModule_ProvideIncrementRewindsAvailableFactory(recsModule, provider);
    }

    public static IncrementRewindsAvailable proxyProvideIncrementRewindsAvailable(RecsModule recsModule, RewindsAvailableRepository rewindsAvailableRepository) {
        return (IncrementRewindsAvailable) C15521i.m58001a(recsModule.provideIncrementRewindsAvailable(rewindsAvailableRepository), "Cannot return null from a non-@Nullable @Provides method");
    }
}
