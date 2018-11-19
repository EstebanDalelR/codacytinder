package com.tinder.domain.toppicks.usecase;

import com.tinder.domain.toppicks.repo.TopPicksRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ObserveTopPicksResponse_Factory implements Factory<ObserveTopPicksResponse> {
    private final Provider<TopPicksRepository> topPicksRepositoryProvider;

    public ObserveTopPicksResponse_Factory(Provider<TopPicksRepository> provider) {
        this.topPicksRepositoryProvider = provider;
    }

    public ObserveTopPicksResponse get() {
        return provideInstance(this.topPicksRepositoryProvider);
    }

    public static ObserveTopPicksResponse provideInstance(Provider<TopPicksRepository> provider) {
        return new ObserveTopPicksResponse((TopPicksRepository) provider.get());
    }

    public static ObserveTopPicksResponse_Factory create(Provider<TopPicksRepository> provider) {
        return new ObserveTopPicksResponse_Factory(provider);
    }

    public static ObserveTopPicksResponse newObserveTopPicksResponse(TopPicksRepository topPicksRepository) {
        return new ObserveTopPicksResponse(topPicksRepository);
    }
}
