package com.tinder.domain.profile.usecase;

import com.tinder.managers.ManagerProfile;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class SetDiscoverability_Factory implements Factory<SetDiscoverability> {
    private final Provider<ManagerProfile> profileManagerProvider;

    public SetDiscoverability_Factory(Provider<ManagerProfile> provider) {
        this.profileManagerProvider = provider;
    }

    public SetDiscoverability get() {
        return provideInstance(this.profileManagerProvider);
    }

    public static SetDiscoverability provideInstance(Provider<ManagerProfile> provider) {
        return new SetDiscoverability((ManagerProfile) provider.get());
    }

    public static SetDiscoverability_Factory create(Provider<ManagerProfile> provider) {
        return new SetDiscoverability_Factory(provider);
    }

    public static SetDiscoverability newSetDiscoverability(ManagerProfile managerProfile) {
        return new SetDiscoverability(managerProfile);
    }
}
