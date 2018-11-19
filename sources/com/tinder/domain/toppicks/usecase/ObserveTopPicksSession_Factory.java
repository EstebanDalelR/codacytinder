package com.tinder.domain.toppicks.usecase;

import com.tinder.domain.toppicks.repo.TopPicksSessionRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ObserveTopPicksSession_Factory implements Factory<ObserveTopPicksSession> {
    private final Provider<TopPicksSessionRepository> topPicksSessionRepositoryProvider;

    public ObserveTopPicksSession_Factory(Provider<TopPicksSessionRepository> provider) {
        this.topPicksSessionRepositoryProvider = provider;
    }

    public ObserveTopPicksSession get() {
        return provideInstance(this.topPicksSessionRepositoryProvider);
    }

    public static ObserveTopPicksSession provideInstance(Provider<TopPicksSessionRepository> provider) {
        return new ObserveTopPicksSession((TopPicksSessionRepository) provider.get());
    }

    public static ObserveTopPicksSession_Factory create(Provider<TopPicksSessionRepository> provider) {
        return new ObserveTopPicksSession_Factory(provider);
    }

    public static ObserveTopPicksSession newObserveTopPicksSession(TopPicksSessionRepository topPicksSessionRepository) {
        return new ObserveTopPicksSession(topPicksSessionRepository);
    }
}
