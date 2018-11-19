package com.tinder.domain.profile.usecase;

import com.tinder.domain.profile.repository.ProfilePhotoRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class UpdateProfilePhotoOrder_Factory implements Factory<UpdateProfilePhotoOrder> {
    private final Provider<ProfilePhotoRepository> profilePhotoRepositoryProvider;

    public UpdateProfilePhotoOrder_Factory(Provider<ProfilePhotoRepository> provider) {
        this.profilePhotoRepositoryProvider = provider;
    }

    public UpdateProfilePhotoOrder get() {
        return provideInstance(this.profilePhotoRepositoryProvider);
    }

    public static UpdateProfilePhotoOrder provideInstance(Provider<ProfilePhotoRepository> provider) {
        return new UpdateProfilePhotoOrder((ProfilePhotoRepository) provider.get());
    }

    public static UpdateProfilePhotoOrder_Factory create(Provider<ProfilePhotoRepository> provider) {
        return new UpdateProfilePhotoOrder_Factory(provider);
    }

    public static UpdateProfilePhotoOrder newUpdateProfilePhotoOrder(ProfilePhotoRepository profilePhotoRepository) {
        return new UpdateProfilePhotoOrder(profilePhotoRepository);
    }
}
