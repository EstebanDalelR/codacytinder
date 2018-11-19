package com.tinder.recs.usecase;

import com.tinder.managers.ManagerProfile;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class UpdateDiscoverySettings_Factory implements Factory<UpdateDiscoverySettings> {
    private final Provider<ManagerProfile> managerProfileProvider;

    public UpdateDiscoverySettings_Factory(Provider<ManagerProfile> provider) {
        this.managerProfileProvider = provider;
    }

    public UpdateDiscoverySettings get() {
        return provideInstance(this.managerProfileProvider);
    }

    public static UpdateDiscoverySettings provideInstance(Provider<ManagerProfile> provider) {
        return new UpdateDiscoverySettings((ManagerProfile) provider.get());
    }

    public static UpdateDiscoverySettings_Factory create(Provider<ManagerProfile> provider) {
        return new UpdateDiscoverySettings_Factory(provider);
    }

    public static UpdateDiscoverySettings newUpdateDiscoverySettings(ManagerProfile managerProfile) {
        return new UpdateDiscoverySettings(managerProfile);
    }
}
