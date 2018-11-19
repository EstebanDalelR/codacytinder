package com.tinder.recs.analytics;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.data.user.CurrentUserProvider;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class AddNewMatchEvent_Factory implements Factory<AddNewMatchEvent> {
    private final Provider<CurrentUserProvider> currentUserProvider;
    private final Provider<C2630h> fireworksProvider;

    public AddNewMatchEvent_Factory(Provider<C2630h> provider, Provider<CurrentUserProvider> provider2) {
        this.fireworksProvider = provider;
        this.currentUserProvider = provider2;
    }

    public AddNewMatchEvent get() {
        return provideInstance(this.fireworksProvider, this.currentUserProvider);
    }

    public static AddNewMatchEvent provideInstance(Provider<C2630h> provider, Provider<CurrentUserProvider> provider2) {
        return new AddNewMatchEvent((C2630h) provider.get(), (CurrentUserProvider) provider2.get());
    }

    public static AddNewMatchEvent_Factory create(Provider<C2630h> provider, Provider<CurrentUserProvider> provider2) {
        return new AddNewMatchEvent_Factory(provider, provider2);
    }

    public static AddNewMatchEvent newAddNewMatchEvent(C2630h c2630h, CurrentUserProvider currentUserProvider) {
        return new AddNewMatchEvent(c2630h, currentUserProvider);
    }
}
