package com.tinder.domain.settings.feed.usecase;

import com.tinder.common.logger.Logger;
import com.tinder.domain.profile.repository.ProfileRemoteRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class SaveFeedSettings_Factory implements Factory<SaveFeedSettings> {
    private final Provider<Logger> loggerProvider;
    private final Provider<ProfileRemoteRepository> profileRemoteRepositoryProvider;

    public SaveFeedSettings_Factory(Provider<ProfileRemoteRepository> provider, Provider<Logger> provider2) {
        this.profileRemoteRepositoryProvider = provider;
        this.loggerProvider = provider2;
    }

    public SaveFeedSettings get() {
        return provideInstance(this.profileRemoteRepositoryProvider, this.loggerProvider);
    }

    public static SaveFeedSettings provideInstance(Provider<ProfileRemoteRepository> provider, Provider<Logger> provider2) {
        return new SaveFeedSettings((ProfileRemoteRepository) provider.get(), (Logger) provider2.get());
    }

    public static SaveFeedSettings_Factory create(Provider<ProfileRemoteRepository> provider, Provider<Logger> provider2) {
        return new SaveFeedSettings_Factory(provider, provider2);
    }

    public static SaveFeedSettings newSaveFeedSettings(ProfileRemoteRepository profileRemoteRepository, Logger logger) {
        return new SaveFeedSettings(profileRemoteRepository, logger);
    }
}
