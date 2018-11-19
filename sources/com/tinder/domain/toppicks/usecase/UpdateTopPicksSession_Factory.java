package com.tinder.domain.toppicks.usecase;

import com.tinder.domain.toppicks.repo.TopPicksSessionRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class UpdateTopPicksSession_Factory implements Factory<UpdateTopPicksSession> {
    private final Provider<TopPicksSessionRepository> topPicksSessionRepositoryProvider;

    public UpdateTopPicksSession_Factory(Provider<TopPicksSessionRepository> provider) {
        this.topPicksSessionRepositoryProvider = provider;
    }

    public UpdateTopPicksSession get() {
        return provideInstance(this.topPicksSessionRepositoryProvider);
    }

    public static UpdateTopPicksSession provideInstance(Provider<TopPicksSessionRepository> provider) {
        return new UpdateTopPicksSession((TopPicksSessionRepository) provider.get());
    }

    public static UpdateTopPicksSession_Factory create(Provider<TopPicksSessionRepository> provider) {
        return new UpdateTopPicksSession_Factory(provider);
    }

    public static UpdateTopPicksSession newUpdateTopPicksSession(TopPicksSessionRepository topPicksSessionRepository) {
        return new UpdateTopPicksSession(topPicksSessionRepository);
    }
}
