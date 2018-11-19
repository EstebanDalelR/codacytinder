package com.tinder.domain.toppicks.usecase;

import com.tinder.domain.toppicks.TopPicksCountUpdater;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class DecrementTopPicksCount_Factory implements Factory<DecrementTopPicksCount> {
    private final Provider<TopPicksCountUpdater> topPicksCountUpdaterProvider;

    public DecrementTopPicksCount_Factory(Provider<TopPicksCountUpdater> provider) {
        this.topPicksCountUpdaterProvider = provider;
    }

    public DecrementTopPicksCount get() {
        return provideInstance(this.topPicksCountUpdaterProvider);
    }

    public static DecrementTopPicksCount provideInstance(Provider<TopPicksCountUpdater> provider) {
        return new DecrementTopPicksCount((TopPicksCountUpdater) provider.get());
    }

    public static DecrementTopPicksCount_Factory create(Provider<TopPicksCountUpdater> provider) {
        return new DecrementTopPicksCount_Factory(provider);
    }

    public static DecrementTopPicksCount newDecrementTopPicksCount(TopPicksCountUpdater topPicksCountUpdater) {
        return new DecrementTopPicksCount(topPicksCountUpdater);
    }
}
