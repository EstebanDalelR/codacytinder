package com.tinder.recs.provider;

import dagger.internal.Factory;

public final class RecSourceProvider_Factory implements Factory<RecSourceProvider> {
    private static final RecSourceProvider_Factory INSTANCE = new RecSourceProvider_Factory();

    public RecSourceProvider get() {
        return provideInstance();
    }

    public static RecSourceProvider provideInstance() {
        return new RecSourceProvider();
    }

    public static RecSourceProvider_Factory create() {
        return INSTANCE;
    }

    public static RecSourceProvider newRecSourceProvider() {
        return new RecSourceProvider();
    }
}
