package com.tinder.domain.toppicks;

import com.tinder.domain.profile.usecase.CheckTutorialViewed;
import com.tinder.domain.toppicks.repo.TopPicksApplicationRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ShouldShowTopPicksTutorial_Factory implements Factory<ShouldShowTopPicksTutorial> {
    private final Provider<CheckTutorialViewed> checkTutorialViewedProvider;
    private final Provider<TopPicksApplicationRepository> topPicksApplicationRepositoryProvider;

    public ShouldShowTopPicksTutorial_Factory(Provider<TopPicksApplicationRepository> provider, Provider<CheckTutorialViewed> provider2) {
        this.topPicksApplicationRepositoryProvider = provider;
        this.checkTutorialViewedProvider = provider2;
    }

    public ShouldShowTopPicksTutorial get() {
        return provideInstance(this.topPicksApplicationRepositoryProvider, this.checkTutorialViewedProvider);
    }

    public static ShouldShowTopPicksTutorial provideInstance(Provider<TopPicksApplicationRepository> provider, Provider<CheckTutorialViewed> provider2) {
        return new ShouldShowTopPicksTutorial((TopPicksApplicationRepository) provider.get(), (CheckTutorialViewed) provider2.get());
    }

    public static ShouldShowTopPicksTutorial_Factory create(Provider<TopPicksApplicationRepository> provider, Provider<CheckTutorialViewed> provider2) {
        return new ShouldShowTopPicksTutorial_Factory(provider, provider2);
    }

    public static ShouldShowTopPicksTutorial newShouldShowTopPicksTutorial(TopPicksApplicationRepository topPicksApplicationRepository, CheckTutorialViewed checkTutorialViewed) {
        return new ShouldShowTopPicksTutorial(topPicksApplicationRepository, checkTutorialViewed);
    }
}
