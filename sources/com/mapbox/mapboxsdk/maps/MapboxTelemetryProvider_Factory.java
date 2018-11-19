package com.mapbox.mapboxsdk.maps;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class MapboxTelemetryProvider_Factory implements Factory<MapboxTelemetryProvider> {
    private final Provider<Context> contextProvider;

    public MapboxTelemetryProvider_Factory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    public MapboxTelemetryProvider get() {
        return provideInstance(this.contextProvider);
    }

    public static MapboxTelemetryProvider provideInstance(Provider<Context> provider) {
        return new MapboxTelemetryProvider((Context) provider.get());
    }

    public static MapboxTelemetryProvider_Factory create(Provider<Context> provider) {
        return new MapboxTelemetryProvider_Factory(provider);
    }

    public static MapboxTelemetryProvider newMapboxTelemetryProvider(Context context) {
        return new MapboxTelemetryProvider(context);
    }
}
