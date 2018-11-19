package com.tinder.api.timeout;

import dagger.internal.Factory;

public final class PlacesTimeoutInterceptor_Factory implements Factory<PlacesTimeoutInterceptor> {
    private static final PlacesTimeoutInterceptor_Factory INSTANCE = new PlacesTimeoutInterceptor_Factory();

    public PlacesTimeoutInterceptor get() {
        return provideInstance();
    }

    public static PlacesTimeoutInterceptor provideInstance() {
        return new PlacesTimeoutInterceptor();
    }

    public static PlacesTimeoutInterceptor_Factory create() {
        return INSTANCE;
    }

    public static PlacesTimeoutInterceptor newPlacesTimeoutInterceptor() {
        return new PlacesTimeoutInterceptor();
    }
}
