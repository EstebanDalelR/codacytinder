package com.tinder.domain.toppicks.usecase;

import com.tinder.domain.toppicks.repo.TopPicksSessionRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class GetTopPicksSession_Factory implements Factory<GetTopPicksSession> {
    private final Provider<TopPicksSessionRepository> topPicksSessionRepositoryProvider;

    public GetTopPicksSession_Factory(Provider<TopPicksSessionRepository> provider) {
        this.topPicksSessionRepositoryProvider = provider;
    }

    public GetTopPicksSession get() {
        return provideInstance(this.topPicksSessionRepositoryProvider);
    }

    public static GetTopPicksSession provideInstance(Provider<TopPicksSessionRepository> provider) {
        return new GetTopPicksSession((TopPicksSessionRepository) provider.get());
    }

    public static GetTopPicksSession_Factory create(Provider<TopPicksSessionRepository> provider) {
        return new GetTopPicksSession_Factory(provider);
    }

    public static GetTopPicksSession newGetTopPicksSession(TopPicksSessionRepository topPicksSessionRepository) {
        return new GetTopPicksSession(topPicksSessionRepository);
    }
}
