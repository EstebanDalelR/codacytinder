package com.tinder.recs.rule;

import com.tinder.tinderplus.provider.LikeStatusProvider;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class LocalOutOfLikesBouncerRule_Factory implements Factory<LocalOutOfLikesBouncerRule> {
    private final Provider<LikeStatusProvider> likeStatusProvider;

    public LocalOutOfLikesBouncerRule_Factory(Provider<LikeStatusProvider> provider) {
        this.likeStatusProvider = provider;
    }

    public LocalOutOfLikesBouncerRule get() {
        return provideInstance(this.likeStatusProvider);
    }

    public static LocalOutOfLikesBouncerRule provideInstance(Provider<LikeStatusProvider> provider) {
        return new LocalOutOfLikesBouncerRule((LikeStatusProvider) provider.get());
    }

    public static LocalOutOfLikesBouncerRule_Factory create(Provider<LikeStatusProvider> provider) {
        return new LocalOutOfLikesBouncerRule_Factory(provider);
    }

    public static LocalOutOfLikesBouncerRule newLocalOutOfLikesBouncerRule(LikeStatusProvider likeStatusProvider) {
        return new LocalOutOfLikesBouncerRule(likeStatusProvider);
    }
}
