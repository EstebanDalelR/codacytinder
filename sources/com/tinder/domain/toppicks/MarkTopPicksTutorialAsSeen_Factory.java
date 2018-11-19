package com.tinder.domain.toppicks;

import com.tinder.domain.toppicks.repo.TopPicksApplicationRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class MarkTopPicksTutorialAsSeen_Factory implements Factory<MarkTopPicksTutorialAsSeen> {
    private final Provider<TopPicksApplicationRepository> topPicksApplicationRepositoryProvider;

    public MarkTopPicksTutorialAsSeen_Factory(Provider<TopPicksApplicationRepository> provider) {
        this.topPicksApplicationRepositoryProvider = provider;
    }

    public MarkTopPicksTutorialAsSeen get() {
        return provideInstance(this.topPicksApplicationRepositoryProvider);
    }

    public static MarkTopPicksTutorialAsSeen provideInstance(Provider<TopPicksApplicationRepository> provider) {
        return new MarkTopPicksTutorialAsSeen((TopPicksApplicationRepository) provider.get());
    }

    public static MarkTopPicksTutorialAsSeen_Factory create(Provider<TopPicksApplicationRepository> provider) {
        return new MarkTopPicksTutorialAsSeen_Factory(provider);
    }

    public static MarkTopPicksTutorialAsSeen newMarkTopPicksTutorialAsSeen(TopPicksApplicationRepository topPicksApplicationRepository) {
        return new MarkTopPicksTutorialAsSeen(topPicksApplicationRepository);
    }
}
