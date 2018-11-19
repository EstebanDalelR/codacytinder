package com.tinder.recs.analytics;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.recs.analytics.dedupe.RecsPhotoViewDuplicateEventChecker;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class AddRecsPhotoViewEvent_Factory implements Factory<AddRecsPhotoViewEvent> {
    private final Provider<RecsPhotoViewDuplicateEventChecker> duplicateEventsCheckerProvider;
    private final Provider<C2630h> fireworksProvider;

    public AddRecsPhotoViewEvent_Factory(Provider<C2630h> provider, Provider<RecsPhotoViewDuplicateEventChecker> provider2) {
        this.fireworksProvider = provider;
        this.duplicateEventsCheckerProvider = provider2;
    }

    public AddRecsPhotoViewEvent get() {
        return provideInstance(this.fireworksProvider, this.duplicateEventsCheckerProvider);
    }

    public static AddRecsPhotoViewEvent provideInstance(Provider<C2630h> provider, Provider<RecsPhotoViewDuplicateEventChecker> provider2) {
        return new AddRecsPhotoViewEvent((C2630h) provider.get(), (RecsPhotoViewDuplicateEventChecker) provider2.get());
    }

    public static AddRecsPhotoViewEvent_Factory create(Provider<C2630h> provider, Provider<RecsPhotoViewDuplicateEventChecker> provider2) {
        return new AddRecsPhotoViewEvent_Factory(provider, provider2);
    }

    public static AddRecsPhotoViewEvent newAddRecsPhotoViewEvent(C2630h c2630h, RecsPhotoViewDuplicateEventChecker recsPhotoViewDuplicateEventChecker) {
        return new AddRecsPhotoViewEvent(c2630h, recsPhotoViewDuplicateEventChecker);
    }
}
