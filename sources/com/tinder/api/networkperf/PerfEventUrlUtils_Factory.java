package com.tinder.api.networkperf;

import dagger.internal.Factory;

public final class PerfEventUrlUtils_Factory implements Factory<PerfEventUrlUtils> {
    private static final PerfEventUrlUtils_Factory INSTANCE = new PerfEventUrlUtils_Factory();

    public PerfEventUrlUtils get() {
        return provideInstance();
    }

    public static PerfEventUrlUtils provideInstance() {
        return new PerfEventUrlUtils();
    }

    public static PerfEventUrlUtils_Factory create() {
        return INSTANCE;
    }

    public static PerfEventUrlUtils newPerfEventUrlUtils() {
        return new PerfEventUrlUtils();
    }
}
