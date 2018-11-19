package com.tinder.domain.places;

import dagger.internal.Factory;

public final class PlacesLoadedStateProvider_Factory implements Factory<PlacesLoadedStateProvider> {
    private static final PlacesLoadedStateProvider_Factory INSTANCE = new PlacesLoadedStateProvider_Factory();

    public PlacesLoadedStateProvider get() {
        return provideInstance();
    }

    public static PlacesLoadedStateProvider provideInstance() {
        return new PlacesLoadedStateProvider();
    }

    public static PlacesLoadedStateProvider_Factory create() {
        return INSTANCE;
    }

    public static PlacesLoadedStateProvider newPlacesLoadedStateProvider() {
        return new PlacesLoadedStateProvider();
    }
}
