package com.tinder.recs.analytics;

import com.tinder.recs.analytics.RecsSessionTracker.RecsSessionFactory;
import dagger.internal.Factory;

public final class RecsSessionTracker_RecsSessionFactory_Factory implements Factory<RecsSessionFactory> {
    private static final RecsSessionTracker_RecsSessionFactory_Factory INSTANCE = new RecsSessionTracker_RecsSessionFactory_Factory();

    public RecsSessionFactory get() {
        return provideInstance();
    }

    public static RecsSessionFactory provideInstance() {
        return new RecsSessionFactory();
    }

    public static RecsSessionTracker_RecsSessionFactory_Factory create() {
        return INSTANCE;
    }

    public static RecsSessionFactory newRecsSessionFactory() {
        return new RecsSessionFactory();
    }
}
