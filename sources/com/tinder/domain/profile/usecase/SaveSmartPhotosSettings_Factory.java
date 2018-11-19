package com.tinder.domain.profile.usecase;

import com.tinder.domain.profile.repository.ProfileRemoteRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class SaveSmartPhotosSettings_Factory implements Factory<SaveSmartPhotosSettings> {
    private final Provider<ProfileRemoteRepository> profileRemoteRepositoryProvider;

    public SaveSmartPhotosSettings_Factory(Provider<ProfileRemoteRepository> provider) {
        this.profileRemoteRepositoryProvider = provider;
    }

    public SaveSmartPhotosSettings get() {
        return provideInstance(this.profileRemoteRepositoryProvider);
    }

    public static SaveSmartPhotosSettings provideInstance(Provider<ProfileRemoteRepository> provider) {
        return new SaveSmartPhotosSettings((ProfileRemoteRepository) provider.get());
    }

    public static SaveSmartPhotosSettings_Factory create(Provider<ProfileRemoteRepository> provider) {
        return new SaveSmartPhotosSettings_Factory(provider);
    }

    public static SaveSmartPhotosSettings newSaveSmartPhotosSettings(ProfileRemoteRepository profileRemoteRepository) {
        return new SaveSmartPhotosSettings(profileRemoteRepository);
    }
}
