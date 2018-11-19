package com.tinder.domain.toppicks.usecase;

import com.tinder.domain.toppicks.TopPicksCountUpdatesObserver;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ObserveTopPicksCount_Factory implements Factory<ObserveTopPicksCount> {
    private final Provider<TopPicksCountUpdatesObserver> topPicksCountUpdatesObserverProvider;

    public ObserveTopPicksCount_Factory(Provider<TopPicksCountUpdatesObserver> provider) {
        this.topPicksCountUpdatesObserverProvider = provider;
    }

    public ObserveTopPicksCount get() {
        return provideInstance(this.topPicksCountUpdatesObserverProvider);
    }

    public static ObserveTopPicksCount provideInstance(Provider<TopPicksCountUpdatesObserver> provider) {
        return new ObserveTopPicksCount((TopPicksCountUpdatesObserver) provider.get());
    }

    public static ObserveTopPicksCount_Factory create(Provider<TopPicksCountUpdatesObserver> provider) {
        return new ObserveTopPicksCount_Factory(provider);
    }

    public static ObserveTopPicksCount newObserveTopPicksCount(TopPicksCountUpdatesObserver topPicksCountUpdatesObserver) {
        return new ObserveTopPicksCount(topPicksCountUpdatesObserver);
    }
}
