package com.tinder.domain.profile.usecase;

import com.tinder.domain.profile.repository.ProfileLocalRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class GetProfileOptionData_Factory implements Factory<GetProfileOptionData> {
    private final Provider<ProfileLocalRepository> repositoryProvider;

    public GetProfileOptionData_Factory(Provider<ProfileLocalRepository> provider) {
        this.repositoryProvider = provider;
    }

    public GetProfileOptionData get() {
        return provideInstance(this.repositoryProvider);
    }

    public static GetProfileOptionData provideInstance(Provider<ProfileLocalRepository> provider) {
        return new GetProfileOptionData((ProfileLocalRepository) provider.get());
    }

    public static GetProfileOptionData_Factory create(Provider<ProfileLocalRepository> provider) {
        return new GetProfileOptionData_Factory(provider);
    }

    public static GetProfileOptionData newGetProfileOptionData(ProfileLocalRepository profileLocalRepository) {
        return new GetProfileOptionData(profileLocalRepository);
    }
}
