package com.tinder.recs.analytics;

import com.tinder.analytics.fireworks.C2630h;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class AddIntroCardShakeEvent_Factory implements Factory<AddIntroCardShakeEvent> {
    private final Provider<C2630h> fireworksProvider;

    public AddIntroCardShakeEvent_Factory(Provider<C2630h> provider) {
        this.fireworksProvider = provider;
    }

    public AddIntroCardShakeEvent get() {
        return provideInstance(this.fireworksProvider);
    }

    public static AddIntroCardShakeEvent provideInstance(Provider<C2630h> provider) {
        return new AddIntroCardShakeEvent((C2630h) provider.get());
    }

    public static AddIntroCardShakeEvent_Factory create(Provider<C2630h> provider) {
        return new AddIntroCardShakeEvent_Factory(provider);
    }

    public static AddIntroCardShakeEvent newAddIntroCardShakeEvent(C2630h c2630h) {
        return new AddIntroCardShakeEvent(c2630h);
    }
}
