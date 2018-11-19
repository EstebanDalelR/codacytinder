package com.tinder.recs.analytics;

import com.tinder.analytics.fireworks.C2630h;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class AddRecsProfileOpenEvent_Factory implements Factory<AddRecsProfileOpenEvent> {
    private final Provider<C2630h> fireworksProvider;

    public AddRecsProfileOpenEvent_Factory(Provider<C2630h> provider) {
        this.fireworksProvider = provider;
    }

    public AddRecsProfileOpenEvent get() {
        return provideInstance(this.fireworksProvider);
    }

    public static AddRecsProfileOpenEvent provideInstance(Provider<C2630h> provider) {
        return new AddRecsProfileOpenEvent((C2630h) provider.get());
    }

    public static AddRecsProfileOpenEvent_Factory create(Provider<C2630h> provider) {
        return new AddRecsProfileOpenEvent_Factory(provider);
    }

    public static AddRecsProfileOpenEvent newAddRecsProfileOpenEvent(C2630h c2630h) {
        return new AddRecsProfileOpenEvent(c2630h);
    }
}
