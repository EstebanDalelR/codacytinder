package com.tinder.recs.engine;

import dagger.internal.Factory;

public final class RecsEngineProvider_Factory implements Factory<RecsEngineProvider> {
    private static final RecsEngineProvider_Factory INSTANCE = new RecsEngineProvider_Factory();

    public RecsEngineProvider get() {
        return provideInstance();
    }

    public static RecsEngineProvider provideInstance() {
        return new RecsEngineProvider();
    }

    public static RecsEngineProvider_Factory create() {
        return INSTANCE;
    }

    public static RecsEngineProvider newRecsEngineProvider() {
        return new RecsEngineProvider();
    }
}
