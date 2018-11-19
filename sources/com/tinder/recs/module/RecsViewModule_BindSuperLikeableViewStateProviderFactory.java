package com.tinder.recs.module;

import com.tinder.superlikeable.provider.SuperLikeableViewStateProvider;
import com.tinder.superlikeable.provider.SuperLikeableViewStateProviderAndNotifier;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class RecsViewModule_BindSuperLikeableViewStateProviderFactory implements Factory<SuperLikeableViewStateProvider> {
    private final RecsViewModule module;
    private final Provider<SuperLikeableViewStateProviderAndNotifier> providerAndNotifierProvider;

    public RecsViewModule_BindSuperLikeableViewStateProviderFactory(RecsViewModule recsViewModule, Provider<SuperLikeableViewStateProviderAndNotifier> provider) {
        this.module = recsViewModule;
        this.providerAndNotifierProvider = provider;
    }

    public SuperLikeableViewStateProvider get() {
        return provideInstance(this.module, this.providerAndNotifierProvider);
    }

    public static SuperLikeableViewStateProvider provideInstance(RecsViewModule recsViewModule, Provider<SuperLikeableViewStateProviderAndNotifier> provider) {
        return proxyBindSuperLikeableViewStateProvider(recsViewModule, (SuperLikeableViewStateProviderAndNotifier) provider.get());
    }

    public static RecsViewModule_BindSuperLikeableViewStateProviderFactory create(RecsViewModule recsViewModule, Provider<SuperLikeableViewStateProviderAndNotifier> provider) {
        return new RecsViewModule_BindSuperLikeableViewStateProviderFactory(recsViewModule, provider);
    }

    public static SuperLikeableViewStateProvider proxyBindSuperLikeableViewStateProvider(RecsViewModule recsViewModule, SuperLikeableViewStateProviderAndNotifier superLikeableViewStateProviderAndNotifier) {
        return (SuperLikeableViewStateProvider) C15521i.m58001a(recsViewModule.bindSuperLikeableViewStateProvider(superLikeableViewStateProviderAndNotifier), "Cannot return null from a non-@Nullable @Provides method");
    }
}
