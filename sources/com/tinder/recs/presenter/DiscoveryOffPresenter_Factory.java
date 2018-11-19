package com.tinder.recs.presenter;

import com.tinder.domain.profile.usecase.SetDiscoverability;
import com.tinder.recs.analytics.AddRecsDiscoveryEvent;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class DiscoveryOffPresenter_Factory implements Factory<DiscoveryOffPresenter> {
    private final Provider<AddRecsDiscoveryEvent> addRecsDiscoveryEventProvider;
    private final Provider<SetDiscoverability> setDiscoverabilityProvider;

    public DiscoveryOffPresenter_Factory(Provider<SetDiscoverability> provider, Provider<AddRecsDiscoveryEvent> provider2) {
        this.setDiscoverabilityProvider = provider;
        this.addRecsDiscoveryEventProvider = provider2;
    }

    public DiscoveryOffPresenter get() {
        return provideInstance(this.setDiscoverabilityProvider, this.addRecsDiscoveryEventProvider);
    }

    public static DiscoveryOffPresenter provideInstance(Provider<SetDiscoverability> provider, Provider<AddRecsDiscoveryEvent> provider2) {
        return new DiscoveryOffPresenter((SetDiscoverability) provider.get(), (AddRecsDiscoveryEvent) provider2.get());
    }

    public static DiscoveryOffPresenter_Factory create(Provider<SetDiscoverability> provider, Provider<AddRecsDiscoveryEvent> provider2) {
        return new DiscoveryOffPresenter_Factory(provider, provider2);
    }

    public static DiscoveryOffPresenter newDiscoveryOffPresenter(SetDiscoverability setDiscoverability, AddRecsDiscoveryEvent addRecsDiscoveryEvent) {
        return new DiscoveryOffPresenter(setDiscoverability, addRecsDiscoveryEvent);
    }
}
