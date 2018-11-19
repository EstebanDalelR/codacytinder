package com.tinder.domain.toppicks.usecase;

import com.tinder.domain.toppicks.TopPicksCountUpdater;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class IncrementTopPicksCount_Factory implements Factory<IncrementTopPicksCount> {
    private final Provider<TopPicksCountUpdater> topPicksCountUpdaterProvider;

    public IncrementTopPicksCount_Factory(Provider<TopPicksCountUpdater> provider) {
        this.topPicksCountUpdaterProvider = provider;
    }

    public IncrementTopPicksCount get() {
        return provideInstance(this.topPicksCountUpdaterProvider);
    }

    public static IncrementTopPicksCount provideInstance(Provider<TopPicksCountUpdater> provider) {
        return new IncrementTopPicksCount((TopPicksCountUpdater) provider.get());
    }

    public static IncrementTopPicksCount_Factory create(Provider<TopPicksCountUpdater> provider) {
        return new IncrementTopPicksCount_Factory(provider);
    }

    public static IncrementTopPicksCount newIncrementTopPicksCount(TopPicksCountUpdater topPicksCountUpdater) {
        return new IncrementTopPicksCount(topPicksCountUpdater);
    }
}
