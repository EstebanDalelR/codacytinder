package com.tinder.domain.profile.usecase;

import com.tinder.domain.profile.repository.ProfileLocalRepository;
import com.tinder.domain.profile.repository.WebProfileRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class UpdateWebProfileUsername_Factory implements Factory<UpdateWebProfileUsername> {
    private final Provider<ProfileLocalRepository> profileLocalRepositoryProvider;
    private final Provider<WebProfileRepository> repositoryProvider;

    public UpdateWebProfileUsername_Factory(Provider<WebProfileRepository> provider, Provider<ProfileLocalRepository> provider2) {
        this.repositoryProvider = provider;
        this.profileLocalRepositoryProvider = provider2;
    }

    public UpdateWebProfileUsername get() {
        return provideInstance(this.repositoryProvider, this.profileLocalRepositoryProvider);
    }

    public static UpdateWebProfileUsername provideInstance(Provider<WebProfileRepository> provider, Provider<ProfileLocalRepository> provider2) {
        return new UpdateWebProfileUsername((WebProfileRepository) provider.get(), (ProfileLocalRepository) provider2.get());
    }

    public static UpdateWebProfileUsername_Factory create(Provider<WebProfileRepository> provider, Provider<ProfileLocalRepository> provider2) {
        return new UpdateWebProfileUsername_Factory(provider, provider2);
    }

    public static UpdateWebProfileUsername newUpdateWebProfileUsername(WebProfileRepository webProfileRepository, ProfileLocalRepository profileLocalRepository) {
        return new UpdateWebProfileUsername(webProfileRepository, profileLocalRepository);
    }
}
