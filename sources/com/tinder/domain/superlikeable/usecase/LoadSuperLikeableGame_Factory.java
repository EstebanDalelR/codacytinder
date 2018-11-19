package com.tinder.domain.superlikeable.usecase;

import com.tinder.domain.superlikeable.SuperLikeableGameRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class LoadSuperLikeableGame_Factory implements Factory<LoadSuperLikeableGame> {
    private final Provider<SuperLikeableGameRepository> superLikeableGameRepositoryProvider;

    public LoadSuperLikeableGame_Factory(Provider<SuperLikeableGameRepository> provider) {
        this.superLikeableGameRepositoryProvider = provider;
    }

    public LoadSuperLikeableGame get() {
        return provideInstance(this.superLikeableGameRepositoryProvider);
    }

    public static LoadSuperLikeableGame provideInstance(Provider<SuperLikeableGameRepository> provider) {
        return new LoadSuperLikeableGame((SuperLikeableGameRepository) provider.get());
    }

    public static LoadSuperLikeableGame_Factory create(Provider<SuperLikeableGameRepository> provider) {
        return new LoadSuperLikeableGame_Factory(provider);
    }

    public static LoadSuperLikeableGame newLoadSuperLikeableGame(SuperLikeableGameRepository superLikeableGameRepository) {
        return new LoadSuperLikeableGame(superLikeableGameRepository);
    }
}
