package com.tinder.domain.fastmatch.provider;

import dagger.internal.Factory;

public final class FastMatchStatusProvider_Factory implements Factory<FastMatchStatusProvider> {
    private static final FastMatchStatusProvider_Factory INSTANCE = new FastMatchStatusProvider_Factory();

    public FastMatchStatusProvider get() {
        return provideInstance();
    }

    public static FastMatchStatusProvider provideInstance() {
        return new FastMatchStatusProvider();
    }

    public static FastMatchStatusProvider_Factory create() {
        return INSTANCE;
    }

    public static FastMatchStatusProvider newFastMatchStatusProvider() {
        return new FastMatchStatusProvider();
    }
}
