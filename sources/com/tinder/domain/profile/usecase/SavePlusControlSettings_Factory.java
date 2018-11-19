package com.tinder.domain.profile.usecase;

import com.tinder.domain.profile.repository.ProfileRemoteRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class SavePlusControlSettings_Factory implements Factory<SavePlusControlSettings> {
    private final Provider<LoadProfileOptionData> loadProfileOptionDataProvider;
    private final Provider<ProfileRemoteRepository> profileRemoteRepositoryProvider;

    public SavePlusControlSettings_Factory(Provider<LoadProfileOptionData> provider, Provider<ProfileRemoteRepository> provider2) {
        this.loadProfileOptionDataProvider = provider;
        this.profileRemoteRepositoryProvider = provider2;
    }

    public SavePlusControlSettings get() {
        return provideInstance(this.loadProfileOptionDataProvider, this.profileRemoteRepositoryProvider);
    }

    public static SavePlusControlSettings provideInstance(Provider<LoadProfileOptionData> provider, Provider<ProfileRemoteRepository> provider2) {
        return new SavePlusControlSettings((LoadProfileOptionData) provider.get(), (ProfileRemoteRepository) provider2.get());
    }

    public static SavePlusControlSettings_Factory create(Provider<LoadProfileOptionData> provider, Provider<ProfileRemoteRepository> provider2) {
        return new SavePlusControlSettings_Factory(provider, provider2);
    }

    public static SavePlusControlSettings newSavePlusControlSettings(LoadProfileOptionData loadProfileOptionData, ProfileRemoteRepository profileRemoteRepository) {
        return new SavePlusControlSettings(loadProfileOptionData, profileRemoteRepository);
    }
}
