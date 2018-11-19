package com.tinder.recs.provider;

import com.tinder.base.p172b.C8301a;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class SuperLikeRatingStatusProviderAndNotifier_Factory implements Factory<SuperLikeRatingStatusProviderAndNotifier> {
    private final Provider<C8301a> mainThreadExecutionVerifierProvider;

    public SuperLikeRatingStatusProviderAndNotifier_Factory(Provider<C8301a> provider) {
        this.mainThreadExecutionVerifierProvider = provider;
    }

    public SuperLikeRatingStatusProviderAndNotifier get() {
        return provideInstance(this.mainThreadExecutionVerifierProvider);
    }

    public static SuperLikeRatingStatusProviderAndNotifier provideInstance(Provider<C8301a> provider) {
        return new SuperLikeRatingStatusProviderAndNotifier((C8301a) provider.get());
    }

    public static SuperLikeRatingStatusProviderAndNotifier_Factory create(Provider<C8301a> provider) {
        return new SuperLikeRatingStatusProviderAndNotifier_Factory(provider);
    }

    public static SuperLikeRatingStatusProviderAndNotifier newSuperLikeRatingStatusProviderAndNotifier(C8301a c8301a) {
        return new SuperLikeRatingStatusProviderAndNotifier(c8301a);
    }
}
