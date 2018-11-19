package com.tinder.recs.analytics;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.managers.bk;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class AddRecsViewEvent_Factory implements Factory<AddRecsViewEvent> {
    private final Provider<C2630h> fireworksProvider;
    private final Provider<bk> managerSharedPreferencesProvider;

    public AddRecsViewEvent_Factory(Provider<C2630h> provider, Provider<bk> provider2) {
        this.fireworksProvider = provider;
        this.managerSharedPreferencesProvider = provider2;
    }

    public AddRecsViewEvent get() {
        return provideInstance(this.fireworksProvider, this.managerSharedPreferencesProvider);
    }

    public static AddRecsViewEvent provideInstance(Provider<C2630h> provider, Provider<bk> provider2) {
        return new AddRecsViewEvent((C2630h) provider.get(), (bk) provider2.get());
    }

    public static AddRecsViewEvent_Factory create(Provider<C2630h> provider, Provider<bk> provider2) {
        return new AddRecsViewEvent_Factory(provider, provider2);
    }

    public static AddRecsViewEvent newAddRecsViewEvent(C2630h c2630h, bk bkVar) {
        return new AddRecsViewEvent(c2630h, bkVar);
    }
}
