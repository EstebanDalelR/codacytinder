package com.tinder.recs.analytics;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.recs.analytics.dedupe.RecsAllPhotosViewedDuplicateEventChecker;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class AddRecsAllPhotosViewedEvent_Factory implements Factory<AddRecsAllPhotosViewedEvent> {
    private final Provider<RecsAllPhotosViewedDuplicateEventChecker> duplicateEventsCheckerProvider;
    private final Provider<C2630h> fireworksProvider;

    public AddRecsAllPhotosViewedEvent_Factory(Provider<C2630h> provider, Provider<RecsAllPhotosViewedDuplicateEventChecker> provider2) {
        this.fireworksProvider = provider;
        this.duplicateEventsCheckerProvider = provider2;
    }

    public AddRecsAllPhotosViewedEvent get() {
        return provideInstance(this.fireworksProvider, this.duplicateEventsCheckerProvider);
    }

    public static AddRecsAllPhotosViewedEvent provideInstance(Provider<C2630h> provider, Provider<RecsAllPhotosViewedDuplicateEventChecker> provider2) {
        return new AddRecsAllPhotosViewedEvent((C2630h) provider.get(), (RecsAllPhotosViewedDuplicateEventChecker) provider2.get());
    }

    public static AddRecsAllPhotosViewedEvent_Factory create(Provider<C2630h> provider, Provider<RecsAllPhotosViewedDuplicateEventChecker> provider2) {
        return new AddRecsAllPhotosViewedEvent_Factory(provider, provider2);
    }

    public static AddRecsAllPhotosViewedEvent newAddRecsAllPhotosViewedEvent(C2630h c2630h, RecsAllPhotosViewedDuplicateEventChecker recsAllPhotosViewedDuplicateEventChecker) {
        return new AddRecsAllPhotosViewedEvent(c2630h, recsAllPhotosViewedDuplicateEventChecker);
    }
}
