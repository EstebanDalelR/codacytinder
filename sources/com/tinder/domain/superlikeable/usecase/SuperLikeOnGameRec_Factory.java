package com.tinder.domain.superlikeable.usecase;

import com.tinder.common.logger.Logger;
import com.tinder.domain.superlikeable.SuperLikeableGameRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class SuperLikeOnGameRec_Factory implements Factory<SuperLikeOnGameRec> {
    private final Provider<Logger> loggerProvider;
    private final Provider<SuperLikeableGameRepository> superLikeableGameRepositoryProvider;

    public SuperLikeOnGameRec_Factory(Provider<SuperLikeableGameRepository> provider, Provider<Logger> provider2) {
        this.superLikeableGameRepositoryProvider = provider;
        this.loggerProvider = provider2;
    }

    public SuperLikeOnGameRec get() {
        return provideInstance(this.superLikeableGameRepositoryProvider, this.loggerProvider);
    }

    public static SuperLikeOnGameRec provideInstance(Provider<SuperLikeableGameRepository> provider, Provider<Logger> provider2) {
        return new SuperLikeOnGameRec((SuperLikeableGameRepository) provider.get(), (Logger) provider2.get());
    }

    public static SuperLikeOnGameRec_Factory create(Provider<SuperLikeableGameRepository> provider, Provider<Logger> provider2) {
        return new SuperLikeOnGameRec_Factory(provider, provider2);
    }

    public static SuperLikeOnGameRec newSuperLikeOnGameRec(SuperLikeableGameRepository superLikeableGameRepository, Logger logger) {
        return new SuperLikeOnGameRec(superLikeableGameRepository, logger);
    }
}
