package com.tinder.domain.loops.usecase;

import com.tinder.domain.settings.loops.repository.AutoPlayVideoSettingsRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class UpdateAutoPlayLoopsSettingsOption_Factory implements Factory<UpdateAutoPlayLoopsSettingsOption> {
    private final Provider<AutoPlayVideoSettingsRepository> autoPlayVideoSettingsRepositoryProvider;

    public UpdateAutoPlayLoopsSettingsOption_Factory(Provider<AutoPlayVideoSettingsRepository> provider) {
        this.autoPlayVideoSettingsRepositoryProvider = provider;
    }

    public UpdateAutoPlayLoopsSettingsOption get() {
        return provideInstance(this.autoPlayVideoSettingsRepositoryProvider);
    }

    public static UpdateAutoPlayLoopsSettingsOption provideInstance(Provider<AutoPlayVideoSettingsRepository> provider) {
        return new UpdateAutoPlayLoopsSettingsOption((AutoPlayVideoSettingsRepository) provider.get());
    }

    public static UpdateAutoPlayLoopsSettingsOption_Factory create(Provider<AutoPlayVideoSettingsRepository> provider) {
        return new UpdateAutoPlayLoopsSettingsOption_Factory(provider);
    }

    public static UpdateAutoPlayLoopsSettingsOption newUpdateAutoPlayLoopsSettingsOption(AutoPlayVideoSettingsRepository autoPlayVideoSettingsRepository) {
        return new UpdateAutoPlayLoopsSettingsOption(autoPlayVideoSettingsRepository);
    }
}
