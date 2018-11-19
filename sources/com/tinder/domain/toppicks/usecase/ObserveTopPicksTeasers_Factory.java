package com.tinder.domain.toppicks.usecase;

import com.tinder.domain.toppicks.repo.TopPicksRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ObserveTopPicksTeasers_Factory implements Factory<ObserveTopPicksTeasers> {
    private final Provider<TopPicksRepository> topPicksRepositoryProvider;

    public ObserveTopPicksTeasers_Factory(Provider<TopPicksRepository> provider) {
        this.topPicksRepositoryProvider = provider;
    }

    public ObserveTopPicksTeasers get() {
        return provideInstance(this.topPicksRepositoryProvider);
    }

    public static ObserveTopPicksTeasers provideInstance(Provider<TopPicksRepository> provider) {
        return new ObserveTopPicksTeasers((TopPicksRepository) provider.get());
    }

    public static ObserveTopPicksTeasers_Factory create(Provider<TopPicksRepository> provider) {
        return new ObserveTopPicksTeasers_Factory(provider);
    }

    public static ObserveTopPicksTeasers newObserveTopPicksTeasers(TopPicksRepository topPicksRepository) {
        return new ObserveTopPicksTeasers(topPicksRepository);
    }
}
