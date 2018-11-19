package com.tinder.recs.analytics;

import com.tinder.analytics.fireworks.C2630h;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class AddRecsSessionEvent_Factory implements Factory<AddRecsSessionEvent> {
    private final Provider<C2630h> fireworksProvider;

    public AddRecsSessionEvent_Factory(Provider<C2630h> provider) {
        this.fireworksProvider = provider;
    }

    public AddRecsSessionEvent get() {
        return provideInstance(this.fireworksProvider);
    }

    public static AddRecsSessionEvent provideInstance(Provider<C2630h> provider) {
        return new AddRecsSessionEvent((C2630h) provider.get());
    }

    public static AddRecsSessionEvent_Factory create(Provider<C2630h> provider) {
        return new AddRecsSessionEvent_Factory(provider);
    }

    public static AddRecsSessionEvent newAddRecsSessionEvent(C2630h c2630h) {
        return new AddRecsSessionEvent(c2630h);
    }
}
