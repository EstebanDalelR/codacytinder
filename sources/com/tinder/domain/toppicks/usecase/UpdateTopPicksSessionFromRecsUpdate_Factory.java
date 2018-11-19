package com.tinder.domain.toppicks.usecase;

import com.tinder.domain.toppicks.repo.TopPicksSessionRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class UpdateTopPicksSessionFromRecsUpdate_Factory implements Factory<UpdateTopPicksSessionFromRecsUpdate> {
    private final Provider<TopPicksSessionRepository> topPicksSessionRepositoryProvider;

    public UpdateTopPicksSessionFromRecsUpdate_Factory(Provider<TopPicksSessionRepository> provider) {
        this.topPicksSessionRepositoryProvider = provider;
    }

    public UpdateTopPicksSessionFromRecsUpdate get() {
        return provideInstance(this.topPicksSessionRepositoryProvider);
    }

    public static UpdateTopPicksSessionFromRecsUpdate provideInstance(Provider<TopPicksSessionRepository> provider) {
        return new UpdateTopPicksSessionFromRecsUpdate((TopPicksSessionRepository) provider.get());
    }

    public static UpdateTopPicksSessionFromRecsUpdate_Factory create(Provider<TopPicksSessionRepository> provider) {
        return new UpdateTopPicksSessionFromRecsUpdate_Factory(provider);
    }

    public static UpdateTopPicksSessionFromRecsUpdate newUpdateTopPicksSessionFromRecsUpdate(TopPicksSessionRepository topPicksSessionRepository) {
        return new UpdateTopPicksSessionFromRecsUpdate(topPicksSessionRepository);
    }
}
