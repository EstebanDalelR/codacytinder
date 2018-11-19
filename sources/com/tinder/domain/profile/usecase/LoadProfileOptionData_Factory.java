package com.tinder.domain.profile.usecase;

import com.tinder.domain.profile.repository.ProfileLocalRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class LoadProfileOptionData_Factory implements Factory<LoadProfileOptionData> {
    private final Provider<ProfileLocalRepository> repositoryProvider;

    public LoadProfileOptionData_Factory(Provider<ProfileLocalRepository> provider) {
        this.repositoryProvider = provider;
    }

    public LoadProfileOptionData get() {
        return provideInstance(this.repositoryProvider);
    }

    public static LoadProfileOptionData provideInstance(Provider<ProfileLocalRepository> provider) {
        return new LoadProfileOptionData((ProfileLocalRepository) provider.get());
    }

    public static LoadProfileOptionData_Factory create(Provider<ProfileLocalRepository> provider) {
        return new LoadProfileOptionData_Factory(provider);
    }

    public static LoadProfileOptionData newLoadProfileOptionData(ProfileLocalRepository profileLocalRepository) {
        return new LoadProfileOptionData(profileLocalRepository);
    }
}
