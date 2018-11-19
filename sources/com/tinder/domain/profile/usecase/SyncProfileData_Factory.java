package com.tinder.domain.profile.usecase;

import com.tinder.domain.profile.repository.ProfileRemoteRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class SyncProfileData_Factory implements Factory<SyncProfileData> {
    private final Provider<ProfileRemoteRepository> profileRemoteRepositoryProvider;

    public SyncProfileData_Factory(Provider<ProfileRemoteRepository> provider) {
        this.profileRemoteRepositoryProvider = provider;
    }

    public SyncProfileData get() {
        return provideInstance(this.profileRemoteRepositoryProvider);
    }

    public static SyncProfileData provideInstance(Provider<ProfileRemoteRepository> provider) {
        return new SyncProfileData((ProfileRemoteRepository) provider.get());
    }

    public static SyncProfileData_Factory create(Provider<ProfileRemoteRepository> provider) {
        return new SyncProfileData_Factory(provider);
    }

    public static SyncProfileData newSyncProfileData(ProfileRemoteRepository profileRemoteRepository) {
        return new SyncProfileData(profileRemoteRepository);
    }
}
