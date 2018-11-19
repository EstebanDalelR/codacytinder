package com.tinder.domain.profile.usecase;

import com.tinder.domain.profile.repository.ProfileRemoteRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ConfirmTutorialsViewed_Factory implements Factory<ConfirmTutorialsViewed> {
    private final Provider<CheckTutorialViewed> checkTutorialViewedProvider;
    private final Provider<ProfileRemoteRepository> profileRemoteRepositoryProvider;

    public ConfirmTutorialsViewed_Factory(Provider<CheckTutorialViewed> provider, Provider<ProfileRemoteRepository> provider2) {
        this.checkTutorialViewedProvider = provider;
        this.profileRemoteRepositoryProvider = provider2;
    }

    public ConfirmTutorialsViewed get() {
        return provideInstance(this.checkTutorialViewedProvider, this.profileRemoteRepositoryProvider);
    }

    public static ConfirmTutorialsViewed provideInstance(Provider<CheckTutorialViewed> provider, Provider<ProfileRemoteRepository> provider2) {
        return new ConfirmTutorialsViewed((CheckTutorialViewed) provider.get(), (ProfileRemoteRepository) provider2.get());
    }

    public static ConfirmTutorialsViewed_Factory create(Provider<CheckTutorialViewed> provider, Provider<ProfileRemoteRepository> provider2) {
        return new ConfirmTutorialsViewed_Factory(provider, provider2);
    }

    public static ConfirmTutorialsViewed newConfirmTutorialsViewed(CheckTutorialViewed checkTutorialViewed, ProfileRemoteRepository profileRemoteRepository) {
        return new ConfirmTutorialsViewed(checkTutorialViewed, profileRemoteRepository);
    }
}
