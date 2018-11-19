package com.tinder.recs.module;

import com.tinder.recs.domain.repository.RewindsAvailableRepository;
import com.tinder.recs.domain.usecase.DecrementRewindsAvailable;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class RecsModule_ProvideDescrementRewindsAvailableFactory implements Factory<DecrementRewindsAvailable> {
    private final RecsModule module;
    private final Provider<RewindsAvailableRepository> rewindsAvailableRepositoryProvider;

    public RecsModule_ProvideDescrementRewindsAvailableFactory(RecsModule recsModule, Provider<RewindsAvailableRepository> provider) {
        this.module = recsModule;
        this.rewindsAvailableRepositoryProvider = provider;
    }

    public DecrementRewindsAvailable get() {
        return provideInstance(this.module, this.rewindsAvailableRepositoryProvider);
    }

    public static DecrementRewindsAvailable provideInstance(RecsModule recsModule, Provider<RewindsAvailableRepository> provider) {
        return proxyProvideDescrementRewindsAvailable(recsModule, (RewindsAvailableRepository) provider.get());
    }

    public static RecsModule_ProvideDescrementRewindsAvailableFactory create(RecsModule recsModule, Provider<RewindsAvailableRepository> provider) {
        return new RecsModule_ProvideDescrementRewindsAvailableFactory(recsModule, provider);
    }

    public static DecrementRewindsAvailable proxyProvideDescrementRewindsAvailable(RecsModule recsModule, RewindsAvailableRepository rewindsAvailableRepository) {
        return (DecrementRewindsAvailable) C15521i.m58001a(recsModule.provideDescrementRewindsAvailable(rewindsAvailableRepository), "Cannot return null from a non-@Nullable @Provides method");
    }
}
