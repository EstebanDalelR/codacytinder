package com.tinder.domain.settings.feed.usecase;

import com.tinder.domain.profile.repository.ProfileLocalRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class LoadFeedSettings_Factory implements Factory<LoadFeedSettings> {
    private final Provider<ProfileLocalRepository> profileLocalRepositoryProvider;

    public LoadFeedSettings_Factory(Provider<ProfileLocalRepository> provider) {
        this.profileLocalRepositoryProvider = provider;
    }

    public LoadFeedSettings get() {
        return provideInstance(this.profileLocalRepositoryProvider);
    }

    public static LoadFeedSettings provideInstance(Provider<ProfileLocalRepository> provider) {
        return new LoadFeedSettings((ProfileLocalRepository) provider.get());
    }

    public static LoadFeedSettings_Factory create(Provider<ProfileLocalRepository> provider) {
        return new LoadFeedSettings_Factory(provider);
    }

    public static LoadFeedSettings newLoadFeedSettings(ProfileLocalRepository profileLocalRepository) {
        return new LoadFeedSettings(profileLocalRepository);
    }
}
