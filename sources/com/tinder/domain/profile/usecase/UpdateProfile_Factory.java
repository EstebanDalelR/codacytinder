package com.tinder.domain.profile.usecase;

import com.tinder.domain.profile.repository.ProfileLocalRepository;
import com.tinder.domain.profile.repository.ProfileRemoteRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class UpdateProfile_Factory implements Factory<UpdateProfile> {
    private final Provider<ProfileLocalRepository> profileLocalRepositoryProvider;
    private final Provider<ProfileRemoteRepository> profileRemoteRepositoryProvider;

    public UpdateProfile_Factory(Provider<ProfileLocalRepository> provider, Provider<ProfileRemoteRepository> provider2) {
        this.profileLocalRepositoryProvider = provider;
        this.profileRemoteRepositoryProvider = provider2;
    }

    public UpdateProfile get() {
        return provideInstance(this.profileLocalRepositoryProvider, this.profileRemoteRepositoryProvider);
    }

    public static UpdateProfile provideInstance(Provider<ProfileLocalRepository> provider, Provider<ProfileRemoteRepository> provider2) {
        return new UpdateProfile((ProfileLocalRepository) provider.get(), (ProfileRemoteRepository) provider2.get());
    }

    public static UpdateProfile_Factory create(Provider<ProfileLocalRepository> provider, Provider<ProfileRemoteRepository> provider2) {
        return new UpdateProfile_Factory(provider, provider2);
    }

    public static UpdateProfile newUpdateProfile(ProfileLocalRepository profileLocalRepository, ProfileRemoteRepository profileRemoteRepository) {
        return new UpdateProfile(profileLocalRepository, profileRemoteRepository);
    }
}
