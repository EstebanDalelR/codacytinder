package com.tinder.domain.toppicks.usecase;

import com.tinder.domain.toppicks.repo.TopPicksRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class BypassTopPicksEnd_Factory implements Factory<BypassTopPicksEnd> {
    private final Provider<TopPicksRepository> topPicksRepositoryProvider;

    public BypassTopPicksEnd_Factory(Provider<TopPicksRepository> provider) {
        this.topPicksRepositoryProvider = provider;
    }

    public BypassTopPicksEnd get() {
        return provideInstance(this.topPicksRepositoryProvider);
    }

    public static BypassTopPicksEnd provideInstance(Provider<TopPicksRepository> provider) {
        return new BypassTopPicksEnd((TopPicksRepository) provider.get());
    }

    public static BypassTopPicksEnd_Factory create(Provider<TopPicksRepository> provider) {
        return new BypassTopPicksEnd_Factory(provider);
    }

    public static BypassTopPicksEnd newBypassTopPicksEnd(TopPicksRepository topPicksRepository) {
        return new BypassTopPicksEnd(topPicksRepository);
    }
}
