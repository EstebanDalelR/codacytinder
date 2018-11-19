package com.tinder.recs.analytics;

import com.tinder.analytics.fireworks.C2630h;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class AddRecsProfileCloseEvent_Factory implements Factory<AddRecsProfileCloseEvent> {
    private final Provider<C2630h> fireworksProvider;

    public AddRecsProfileCloseEvent_Factory(Provider<C2630h> provider) {
        this.fireworksProvider = provider;
    }

    public AddRecsProfileCloseEvent get() {
        return provideInstance(this.fireworksProvider);
    }

    public static AddRecsProfileCloseEvent provideInstance(Provider<C2630h> provider) {
        return new AddRecsProfileCloseEvent((C2630h) provider.get());
    }

    public static AddRecsProfileCloseEvent_Factory create(Provider<C2630h> provider) {
        return new AddRecsProfileCloseEvent_Factory(provider);
    }

    public static AddRecsProfileCloseEvent newAddRecsProfileCloseEvent(C2630h c2630h) {
        return new AddRecsProfileCloseEvent(c2630h);
    }
}
