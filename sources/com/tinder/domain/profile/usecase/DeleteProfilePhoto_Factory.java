package com.tinder.domain.profile.usecase;

import com.tinder.domain.profile.repository.ProfilePhotoRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class DeleteProfilePhoto_Factory implements Factory<DeleteProfilePhoto> {
    private final Provider<ProfilePhotoRepository> profilePhotoRepositoryProvider;

    public DeleteProfilePhoto_Factory(Provider<ProfilePhotoRepository> provider) {
        this.profilePhotoRepositoryProvider = provider;
    }

    public DeleteProfilePhoto get() {
        return provideInstance(this.profilePhotoRepositoryProvider);
    }

    public static DeleteProfilePhoto provideInstance(Provider<ProfilePhotoRepository> provider) {
        return new DeleteProfilePhoto((ProfilePhotoRepository) provider.get());
    }

    public static DeleteProfilePhoto_Factory create(Provider<ProfilePhotoRepository> provider) {
        return new DeleteProfilePhoto_Factory(provider);
    }

    public static DeleteProfilePhoto newDeleteProfilePhoto(ProfilePhotoRepository profilePhotoRepository) {
        return new DeleteProfilePhoto(profilePhotoRepository);
    }
}
