package com.tinder.recs.analytics;

import com.tinder.analytics.fireworks.C2630h;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class AddRecsDiscoveryEvent_Factory implements Factory<AddRecsDiscoveryEvent> {
    private final Provider<C2630h> fireworksProvider;

    public AddRecsDiscoveryEvent_Factory(Provider<C2630h> provider) {
        this.fireworksProvider = provider;
    }

    public AddRecsDiscoveryEvent get() {
        return provideInstance(this.fireworksProvider);
    }

    public static AddRecsDiscoveryEvent provideInstance(Provider<C2630h> provider) {
        return new AddRecsDiscoveryEvent((C2630h) provider.get());
    }

    public static AddRecsDiscoveryEvent_Factory create(Provider<C2630h> provider) {
        return new AddRecsDiscoveryEvent_Factory(provider);
    }

    public static AddRecsDiscoveryEvent newAddRecsDiscoveryEvent(C2630h c2630h) {
        return new AddRecsDiscoveryEvent(c2630h);
    }
}
