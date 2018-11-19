package com.tinder.domain.fastmatch.usecase;

import com.tinder.domain.fastmatch.provider.FastMatchConfigProvider;
import com.tinder.domain.fastmatch.provider.FastMatchStatusProvider;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ObserveHasFastMatches_Factory implements Factory<ObserveHasFastMatches> {
    private final Provider<FastMatchConfigProvider> fastMatchConfigProvider;
    private final Provider<FastMatchStatusProvider> fastMatchStatusProvider;

    public ObserveHasFastMatches_Factory(Provider<FastMatchConfigProvider> provider, Provider<FastMatchStatusProvider> provider2) {
        this.fastMatchConfigProvider = provider;
        this.fastMatchStatusProvider = provider2;
    }

    public ObserveHasFastMatches get() {
        return provideInstance(this.fastMatchConfigProvider, this.fastMatchStatusProvider);
    }

    public static ObserveHasFastMatches provideInstance(Provider<FastMatchConfigProvider> provider, Provider<FastMatchStatusProvider> provider2) {
        return new ObserveHasFastMatches((FastMatchConfigProvider) provider.get(), (FastMatchStatusProvider) provider2.get());
    }

    public static ObserveHasFastMatches_Factory create(Provider<FastMatchConfigProvider> provider, Provider<FastMatchStatusProvider> provider2) {
        return new ObserveHasFastMatches_Factory(provider, provider2);
    }

    public static ObserveHasFastMatches newObserveHasFastMatches(FastMatchConfigProvider fastMatchConfigProvider, FastMatchStatusProvider fastMatchStatusProvider) {
        return new ObserveHasFastMatches(fastMatchConfigProvider, fastMatchStatusProvider);
    }
}
