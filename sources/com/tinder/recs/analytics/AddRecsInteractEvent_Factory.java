package com.tinder.recs.analytics;

import com.tinder.analytics.fireworks.C2630h;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class AddRecsInteractEvent_Factory implements Factory<AddRecsInteractEvent> {
    private final Provider<C2630h> fireworksProvider;

    public AddRecsInteractEvent_Factory(Provider<C2630h> provider) {
        this.fireworksProvider = provider;
    }

    public AddRecsInteractEvent get() {
        return provideInstance(this.fireworksProvider);
    }

    public static AddRecsInteractEvent provideInstance(Provider<C2630h> provider) {
        return new AddRecsInteractEvent((C2630h) provider.get());
    }

    public static AddRecsInteractEvent_Factory create(Provider<C2630h> provider) {
        return new AddRecsInteractEvent_Factory(provider);
    }

    public static AddRecsInteractEvent newAddRecsInteractEvent(C2630h c2630h) {
        return new AddRecsInteractEvent(c2630h);
    }
}
