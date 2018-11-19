package com.tinder.domain.profile.usecase;

import com.tinder.domain.profile.repository.ProfilePhotoRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class AddPendingFacebookPhoto_Factory implements Factory<AddPendingFacebookPhoto> {
    private final Provider<ProfilePhotoRepository> profilePhotoRepositoryProvider;

    public AddPendingFacebookPhoto_Factory(Provider<ProfilePhotoRepository> provider) {
        this.profilePhotoRepositoryProvider = provider;
    }

    public AddPendingFacebookPhoto get() {
        return provideInstance(this.profilePhotoRepositoryProvider);
    }

    public static AddPendingFacebookPhoto provideInstance(Provider<ProfilePhotoRepository> provider) {
        return new AddPendingFacebookPhoto((ProfilePhotoRepository) provider.get());
    }

    public static AddPendingFacebookPhoto_Factory create(Provider<ProfilePhotoRepository> provider) {
        return new AddPendingFacebookPhoto_Factory(provider);
    }

    public static AddPendingFacebookPhoto newAddPendingFacebookPhoto(ProfilePhotoRepository profilePhotoRepository) {
        return new AddPendingFacebookPhoto(profilePhotoRepository);
    }
}
