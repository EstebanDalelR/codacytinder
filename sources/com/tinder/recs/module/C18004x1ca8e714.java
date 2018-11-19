package com.tinder.recs.module;

import com.tinder.superlikeable.provider.SuperLikeableViewStateProviderAndNotifier;
import dagger.internal.C15521i;
import dagger.internal.Factory;

/* renamed from: com.tinder.recs.module.RecsViewModule_ProvideSuperLikeableViewStateProviderAndNotifierFactory */
public final class C18004x1ca8e714 implements Factory<SuperLikeableViewStateProviderAndNotifier> {
    private final RecsViewModule module;

    public C18004x1ca8e714(RecsViewModule recsViewModule) {
        this.module = recsViewModule;
    }

    public SuperLikeableViewStateProviderAndNotifier get() {
        return C18004x1ca8e714.provideInstance(this.module);
    }

    public static SuperLikeableViewStateProviderAndNotifier provideInstance(RecsViewModule recsViewModule) {
        return C18004x1ca8e714.proxyProvideSuperLikeableViewStateProviderAndNotifier(recsViewModule);
    }

    public static C18004x1ca8e714 create(RecsViewModule recsViewModule) {
        return new C18004x1ca8e714(recsViewModule);
    }

    public static SuperLikeableViewStateProviderAndNotifier proxyProvideSuperLikeableViewStateProviderAndNotifier(RecsViewModule recsViewModule) {
        return (SuperLikeableViewStateProviderAndNotifier) C15521i.m58001a(recsViewModule.provideSuperLikeableViewStateProviderAndNotifier(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
