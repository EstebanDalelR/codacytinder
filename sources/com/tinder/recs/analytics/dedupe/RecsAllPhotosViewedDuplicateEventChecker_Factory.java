package com.tinder.recs.analytics.dedupe;

import dagger.internal.Factory;

public final class RecsAllPhotosViewedDuplicateEventChecker_Factory implements Factory<RecsAllPhotosViewedDuplicateEventChecker> {
    private static final RecsAllPhotosViewedDuplicateEventChecker_Factory INSTANCE = new RecsAllPhotosViewedDuplicateEventChecker_Factory();

    public RecsAllPhotosViewedDuplicateEventChecker get() {
        return provideInstance();
    }

    public static RecsAllPhotosViewedDuplicateEventChecker provideInstance() {
        return new RecsAllPhotosViewedDuplicateEventChecker();
    }

    public static RecsAllPhotosViewedDuplicateEventChecker_Factory create() {
        return INSTANCE;
    }

    public static RecsAllPhotosViewedDuplicateEventChecker newRecsAllPhotosViewedDuplicateEventChecker() {
        return new RecsAllPhotosViewedDuplicateEventChecker();
    }
}
