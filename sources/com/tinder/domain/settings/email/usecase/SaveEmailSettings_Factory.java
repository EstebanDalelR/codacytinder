package com.tinder.domain.settings.email.usecase;

import com.tinder.common.logger.Logger;
import com.tinder.domain.profile.repository.ProfileRemoteRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class SaveEmailSettings_Factory implements Factory<SaveEmailSettings> {
    private final Provider<Logger> loggerProvider;
    private final Provider<ProfileRemoteRepository> profileRemoteRepositoryProvider;

    public SaveEmailSettings_Factory(Provider<ProfileRemoteRepository> provider, Provider<Logger> provider2) {
        this.profileRemoteRepositoryProvider = provider;
        this.loggerProvider = provider2;
    }

    public SaveEmailSettings get() {
        return provideInstance(this.profileRemoteRepositoryProvider, this.loggerProvider);
    }

    public static SaveEmailSettings provideInstance(Provider<ProfileRemoteRepository> provider, Provider<Logger> provider2) {
        return new SaveEmailSettings((ProfileRemoteRepository) provider.get(), (Logger) provider2.get());
    }

    public static SaveEmailSettings_Factory create(Provider<ProfileRemoteRepository> provider, Provider<Logger> provider2) {
        return new SaveEmailSettings_Factory(provider, provider2);
    }

    public static SaveEmailSettings newSaveEmailSettings(ProfileRemoteRepository profileRemoteRepository, Logger logger) {
        return new SaveEmailSettings(profileRemoteRepository, logger);
    }
}
