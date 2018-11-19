package com.tinder.domain.toppicks.usecase;

import com.tinder.domain.toppicks.TopPicksCountUpdater;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class SetTopPicksCount_Factory implements Factory<SetTopPicksCount> {
    private final Provider<TopPicksCountUpdater> topPicksCountUpdaterProvider;

    public SetTopPicksCount_Factory(Provider<TopPicksCountUpdater> provider) {
        this.topPicksCountUpdaterProvider = provider;
    }

    public SetTopPicksCount get() {
        return provideInstance(this.topPicksCountUpdaterProvider);
    }

    public static SetTopPicksCount provideInstance(Provider<TopPicksCountUpdater> provider) {
        return new SetTopPicksCount((TopPicksCountUpdater) provider.get());
    }

    public static SetTopPicksCount_Factory create(Provider<TopPicksCountUpdater> provider) {
        return new SetTopPicksCount_Factory(provider);
    }

    public static SetTopPicksCount newSetTopPicksCount(TopPicksCountUpdater topPicksCountUpdater) {
        return new SetTopPicksCount(topPicksCountUpdater);
    }
}
