package com.tinder.domain.profile.usecase;

import com.tinder.domain.profile.repository.ProfilePhotoRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class UploadPhoto_Factory implements Factory<UploadPhoto> {
    private final Provider<ProfilePhotoRepository> profilePhotoRepositoryProvider;

    public UploadPhoto_Factory(Provider<ProfilePhotoRepository> provider) {
        this.profilePhotoRepositoryProvider = provider;
    }

    public UploadPhoto get() {
        return provideInstance(this.profilePhotoRepositoryProvider);
    }

    public static UploadPhoto provideInstance(Provider<ProfilePhotoRepository> provider) {
        return new UploadPhoto((ProfilePhotoRepository) provider.get());
    }

    public static UploadPhoto_Factory create(Provider<ProfilePhotoRepository> provider) {
        return new UploadPhoto_Factory(provider);
    }

    public static UploadPhoto newUploadPhoto(ProfilePhotoRepository profilePhotoRepository) {
        return new UploadPhoto(profilePhotoRepository);
    }
}
