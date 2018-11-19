package com.tinder.domain.profile.usecase;

import com.tinder.domain.profile.repository.WebProfileRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class DeleteWebProfileUsername_Factory implements Factory<DeleteWebProfileUsername> {
    private final Provider<WebProfileRepository> repositoryProvider;

    public DeleteWebProfileUsername_Factory(Provider<WebProfileRepository> provider) {
        this.repositoryProvider = provider;
    }

    public DeleteWebProfileUsername get() {
        return provideInstance(this.repositoryProvider);
    }

    public static DeleteWebProfileUsername provideInstance(Provider<WebProfileRepository> provider) {
        return new DeleteWebProfileUsername((WebProfileRepository) provider.get());
    }

    public static DeleteWebProfileUsername_Factory create(Provider<WebProfileRepository> provider) {
        return new DeleteWebProfileUsername_Factory(provider);
    }

    public static DeleteWebProfileUsername newDeleteWebProfileUsername(WebProfileRepository webProfileRepository) {
        return new DeleteWebProfileUsername(webProfileRepository);
    }
}
