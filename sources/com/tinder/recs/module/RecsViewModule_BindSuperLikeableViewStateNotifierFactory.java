package com.tinder.recs.module;

import com.tinder.superlikeable.provider.SuperLikeableViewStateNotifier;
import com.tinder.superlikeable.provider.SuperLikeableViewStateProviderAndNotifier;
import dagger.internal.C15521i;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class RecsViewModule_BindSuperLikeableViewStateNotifierFactory implements Factory<SuperLikeableViewStateNotifier> {
    private final RecsViewModule module;
    private final Provider<SuperLikeableViewStateProviderAndNotifier> providerAndNotifierProvider;

    public RecsViewModule_BindSuperLikeableViewStateNotifierFactory(RecsViewModule recsViewModule, Provider<SuperLikeableViewStateProviderAndNotifier> provider) {
        this.module = recsViewModule;
        this.providerAndNotifierProvider = provider;
    }

    public SuperLikeableViewStateNotifier get() {
        return provideInstance(this.module, this.providerAndNotifierProvider);
    }

    public static SuperLikeableViewStateNotifier provideInstance(RecsViewModule recsViewModule, Provider<SuperLikeableViewStateProviderAndNotifier> provider) {
        return proxyBindSuperLikeableViewStateNotifier(recsViewModule, (SuperLikeableViewStateProviderAndNotifier) provider.get());
    }

    public static RecsViewModule_BindSuperLikeableViewStateNotifierFactory create(RecsViewModule recsViewModule, Provider<SuperLikeableViewStateProviderAndNotifier> provider) {
        return new RecsViewModule_BindSuperLikeableViewStateNotifierFactory(recsViewModule, provider);
    }

    public static SuperLikeableViewStateNotifier proxyBindSuperLikeableViewStateNotifier(RecsViewModule recsViewModule, SuperLikeableViewStateProviderAndNotifier superLikeableViewStateProviderAndNotifier) {
        return (SuperLikeableViewStateNotifier) C15521i.m58001a(recsViewModule.bindSuperLikeableViewStateNotifier(superLikeableViewStateProviderAndNotifier), "Cannot return null from a non-@Nullable @Provides method");
    }
}
