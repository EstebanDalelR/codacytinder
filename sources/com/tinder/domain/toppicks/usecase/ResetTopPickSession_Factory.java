package com.tinder.domain.toppicks.usecase;

import com.tinder.domain.recs.RecsEngineRegistry;
import com.tinder.domain.toppicks.repo.TopPicksSessionRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ResetTopPickSession_Factory implements Factory<ResetTopPickSession> {
    private final Provider<RecsEngineRegistry> recsEngineRegistryProvider;
    private final Provider<TopPicksSessionRepository> topPicksSessionRepositoryProvider;

    public ResetTopPickSession_Factory(Provider<TopPicksSessionRepository> provider, Provider<RecsEngineRegistry> provider2) {
        this.topPicksSessionRepositoryProvider = provider;
        this.recsEngineRegistryProvider = provider2;
    }

    public ResetTopPickSession get() {
        return provideInstance(this.topPicksSessionRepositoryProvider, this.recsEngineRegistryProvider);
    }

    public static ResetTopPickSession provideInstance(Provider<TopPicksSessionRepository> provider, Provider<RecsEngineRegistry> provider2) {
        return new ResetTopPickSession((TopPicksSessionRepository) provider.get(), (RecsEngineRegistry) provider2.get());
    }

    public static ResetTopPickSession_Factory create(Provider<TopPicksSessionRepository> provider, Provider<RecsEngineRegistry> provider2) {
        return new ResetTopPickSession_Factory(provider, provider2);
    }

    public static ResetTopPickSession newResetTopPickSession(TopPicksSessionRepository topPicksSessionRepository, RecsEngineRegistry recsEngineRegistry) {
        return new ResetTopPickSession(topPicksSessionRepository, recsEngineRegistry);
    }
}
