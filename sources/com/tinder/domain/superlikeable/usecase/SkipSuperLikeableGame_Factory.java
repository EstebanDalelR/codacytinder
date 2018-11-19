package com.tinder.domain.superlikeable.usecase;

import com.tinder.common.logger.Logger;
import com.tinder.domain.superlikeable.SuperLikeableGameRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class SkipSuperLikeableGame_Factory implements Factory<SkipSuperLikeableGame> {
    private final Provider<SuperLikeableGameRepository> gameRepositoryProvider;
    private final Provider<Logger> loggerProvider;

    public SkipSuperLikeableGame_Factory(Provider<SuperLikeableGameRepository> provider, Provider<Logger> provider2) {
        this.gameRepositoryProvider = provider;
        this.loggerProvider = provider2;
    }

    public SkipSuperLikeableGame get() {
        return provideInstance(this.gameRepositoryProvider, this.loggerProvider);
    }

    public static SkipSuperLikeableGame provideInstance(Provider<SuperLikeableGameRepository> provider, Provider<Logger> provider2) {
        return new SkipSuperLikeableGame((SuperLikeableGameRepository) provider.get(), (Logger) provider2.get());
    }

    public static SkipSuperLikeableGame_Factory create(Provider<SuperLikeableGameRepository> provider, Provider<Logger> provider2) {
        return new SkipSuperLikeableGame_Factory(provider, provider2);
    }

    public static SkipSuperLikeableGame newSkipSuperLikeableGame(SuperLikeableGameRepository superLikeableGameRepository, Logger logger) {
        return new SkipSuperLikeableGame(superLikeableGameRepository, logger);
    }
}
