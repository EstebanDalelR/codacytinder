package com.tinder.recs.module;

import com.tinder.recs.provider.SuperLikeRatingStatusNotifier;
import com.tinder.recs.provider.SuperLikeRatingStatusProviderAndNotifier;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class RecsModule_ProvideSuperLikeRatingStatusNotifierFactory implements Factory<SuperLikeRatingStatusNotifier> {
    private final RecsModule module;
    private final Provider<SuperLikeRatingStatusProviderAndNotifier> superLikeRatingStatusProviderAndNotifierProvider;

    public RecsModule_ProvideSuperLikeRatingStatusNotifierFactory(RecsModule recsModule, Provider<SuperLikeRatingStatusProviderAndNotifier> provider) {
        this.module = recsModule;
        this.superLikeRatingStatusProviderAndNotifierProvider = provider;
    }

    public SuperLikeRatingStatusNotifier get() {
        return provideInstance(this.module, this.superLikeRatingStatusProviderAndNotifierProvider);
    }

    public static SuperLikeRatingStatusNotifier provideInstance(RecsModule recsModule, Provider<SuperLikeRatingStatusProviderAndNotifier> provider) {
        return proxyProvideSuperLikeRatingStatusNotifier(recsModule, (SuperLikeRatingStatusProviderAndNotifier) provider.get());
    }

    public static RecsModule_ProvideSuperLikeRatingStatusNotifierFactory create(RecsModule recsModule, Provider<SuperLikeRatingStatusProviderAndNotifier> provider) {
        return new RecsModule_ProvideSuperLikeRatingStatusNotifierFactory(recsModule, provider);
    }

    public static SuperLikeRatingStatusNotifier proxyProvideSuperLikeRatingStatusNotifier(RecsModule recsModule, SuperLikeRatingStatusProviderAndNotifier superLikeRatingStatusProviderAndNotifier) {
        return (SuperLikeRatingStatusNotifier) C15521i.m58001a(recsModule.provideSuperLikeRatingStatusNotifier(superLikeRatingStatusProviderAndNotifier), "Cannot return null from a non-@Nullable @Provides method");
    }
}
