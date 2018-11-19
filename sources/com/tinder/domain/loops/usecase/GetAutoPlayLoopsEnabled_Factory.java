package com.tinder.domain.loops.usecase;

import com.tinder.domain.connectivity.ConnectivityRepository;
import com.tinder.domain.settings.loops.repository.AutoPlayVideoSettingsRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class GetAutoPlayLoopsEnabled_Factory implements Factory<GetAutoPlayLoopsEnabled> {
    private final Provider<ConnectivityRepository> connectivityRepositoryProvider;
    private final Provider<AutoPlayVideoSettingsRepository> settingsRepositoryProvider;

    public GetAutoPlayLoopsEnabled_Factory(Provider<AutoPlayVideoSettingsRepository> provider, Provider<ConnectivityRepository> provider2) {
        this.settingsRepositoryProvider = provider;
        this.connectivityRepositoryProvider = provider2;
    }

    public GetAutoPlayLoopsEnabled get() {
        return provideInstance(this.settingsRepositoryProvider, this.connectivityRepositoryProvider);
    }

    public static GetAutoPlayLoopsEnabled provideInstance(Provider<AutoPlayVideoSettingsRepository> provider, Provider<ConnectivityRepository> provider2) {
        return new GetAutoPlayLoopsEnabled((AutoPlayVideoSettingsRepository) provider.get(), (ConnectivityRepository) provider2.get());
    }

    public static GetAutoPlayLoopsEnabled_Factory create(Provider<AutoPlayVideoSettingsRepository> provider, Provider<ConnectivityRepository> provider2) {
        return new GetAutoPlayLoopsEnabled_Factory(provider, provider2);
    }

    public static GetAutoPlayLoopsEnabled newGetAutoPlayLoopsEnabled(AutoPlayVideoSettingsRepository autoPlayVideoSettingsRepository, ConnectivityRepository connectivityRepository) {
        return new GetAutoPlayLoopsEnabled(autoPlayVideoSettingsRepository, connectivityRepository);
    }
}
