package com.tinder.domain.toppicks.usecase;

import com.tinder.common.logger.Logger;
import com.tinder.domain.recs.RecsEngineRegistry;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ResetScreenState_Factory implements Factory<ResetScreenState> {
    private final Provider<Logger> loggerProvider;
    private final Provider<ObserveTopPicksScreenState> observeTopPicksScreenStateProvider;
    private final Provider<RecsEngineRegistry> recsEngineRegistryProvider;
    private final Provider<ResetTopPickSession> resetTopPickSessionProvider;

    public ResetScreenState_Factory(Provider<RecsEngineRegistry> provider, Provider<ResetTopPickSession> provider2, Provider<ObserveTopPicksScreenState> provider3, Provider<Logger> provider4) {
        this.recsEngineRegistryProvider = provider;
        this.resetTopPickSessionProvider = provider2;
        this.observeTopPicksScreenStateProvider = provider3;
        this.loggerProvider = provider4;
    }

    public ResetScreenState get() {
        return provideInstance(this.recsEngineRegistryProvider, this.resetTopPickSessionProvider, this.observeTopPicksScreenStateProvider, this.loggerProvider);
    }

    public static ResetScreenState provideInstance(Provider<RecsEngineRegistry> provider, Provider<ResetTopPickSession> provider2, Provider<ObserveTopPicksScreenState> provider3, Provider<Logger> provider4) {
        return new ResetScreenState((RecsEngineRegistry) provider.get(), (ResetTopPickSession) provider2.get(), (ObserveTopPicksScreenState) provider3.get(), (Logger) provider4.get());
    }

    public static ResetScreenState_Factory create(Provider<RecsEngineRegistry> provider, Provider<ResetTopPickSession> provider2, Provider<ObserveTopPicksScreenState> provider3, Provider<Logger> provider4) {
        return new ResetScreenState_Factory(provider, provider2, provider3, provider4);
    }

    public static ResetScreenState newResetScreenState(RecsEngineRegistry recsEngineRegistry, ResetTopPickSession resetTopPickSession, ObserveTopPicksScreenState observeTopPicksScreenState, Logger logger) {
        return new ResetScreenState(recsEngineRegistry, resetTopPickSession, observeTopPicksScreenState, logger);
    }
}
