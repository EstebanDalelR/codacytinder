package com.tinder.recs.module;

import com.tinder.recs.provider.SuperLikeRatingStatusProvider;
import com.tinder.recs.provider.SuperLikeRatingStatusProviderAndNotifier;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class RecsModule_ProvideSuperLikeRatingStatusProviderFactory implements Factory<SuperLikeRatingStatusProvider> {
    private final RecsModule module;
    private final Provider<SuperLikeRatingStatusProviderAndNotifier> superLikeRatingStatusProviderAndNotifierProvider;

    public RecsModule_ProvideSuperLikeRatingStatusProviderFactory(RecsModule recsModule, Provider<SuperLikeRatingStatusProviderAndNotifier> provider) {
        this.module = recsModule;
        this.superLikeRatingStatusProviderAndNotifierProvider = provider;
    }

    public SuperLikeRatingStatusProvider get() {
        return provideInstance(this.module, this.superLikeRatingStatusProviderAndNotifierProvider);
    }

    public static SuperLikeRatingStatusProvider provideInstance(RecsModule recsModule, Provider<SuperLikeRatingStatusProviderAndNotifier> provider) {
        return proxyProvideSuperLikeRatingStatusProvider(recsModule, (SuperLikeRatingStatusProviderAndNotifier) provider.get());
    }

    public static RecsModule_ProvideSuperLikeRatingStatusProviderFactory create(RecsModule recsModule, Provider<SuperLikeRatingStatusProviderAndNotifier> provider) {
        return new RecsModule_ProvideSuperLikeRatingStatusProviderFactory(recsModule, provider);
    }

    public static SuperLikeRatingStatusProvider proxyProvideSuperLikeRatingStatusProvider(RecsModule recsModule, SuperLikeRatingStatusProviderAndNotifier superLikeRatingStatusProviderAndNotifier) {
        return (SuperLikeRatingStatusProvider) C15521i.m58001a(recsModule.provideSuperLikeRatingStatusProvider(superLikeRatingStatusProviderAndNotifier), "Cannot return null from a non-@Nullable @Provides method");
    }
}
