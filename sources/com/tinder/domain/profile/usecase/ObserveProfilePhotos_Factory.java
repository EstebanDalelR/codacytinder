package com.tinder.domain.profile.usecase;

import com.tinder.domain.profile.repository.ProfilePhotoRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ObserveProfilePhotos_Factory implements Factory<ObserveProfilePhotos> {
    private final Provider<ProfilePhotoRepository> profilePhotosRepositoryProvider;

    public ObserveProfilePhotos_Factory(Provider<ProfilePhotoRepository> provider) {
        this.profilePhotosRepositoryProvider = provider;
    }

    public ObserveProfilePhotos get() {
        return provideInstance(this.profilePhotosRepositoryProvider);
    }

    public static ObserveProfilePhotos provideInstance(Provider<ProfilePhotoRepository> provider) {
        return new ObserveProfilePhotos((ProfilePhotoRepository) provider.get());
    }

    public static ObserveProfilePhotos_Factory create(Provider<ProfilePhotoRepository> provider) {
        return new ObserveProfilePhotos_Factory(provider);
    }

    public static ObserveProfilePhotos newObserveProfilePhotos(ProfilePhotoRepository profilePhotoRepository) {
        return new ObserveProfilePhotos(profilePhotoRepository);
    }
}
