package com.mapbox.mapboxsdk.maps;

import android.content.Context;
import com.mapbox.android.telemetry.TelemetryEnabler;
import com.mapbox.android.telemetry.TelemetryEnabler.State;
import com.mapbox.mapboxsdk.Mapbox;
import com.tinder.module.ForApplication;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/mapbox/mapboxsdk/maps/MapboxTelemetryProvider;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "disableTelemetry", "", "enableTelemetry", "isTelemetryEnabled", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class MapboxTelemetryProvider {
    private final Context context;

    @Inject
    public MapboxTelemetryProvider(@NotNull @ForApplication Context context) {
        C2668g.b(context, "context");
        this.context = context;
        Mapbox.getInstance(this.context, "pk.eyJ1IjoidGluZGVybWFwcyIsImEiOiJjamVvbDEwN2U1anZ0MnZsbmg2d3BheGhjIn0.EGDbz_oMaARb1aRDXrGNVg");
    }

    public final boolean isTelemetryEnabled() {
        return TelemetryEnabler.retrieveTelemetryStateFromPreferences() == State.ENABLED;
    }

    public final void enableTelemetry() {
        TelemetryEnabler.updateTelemetryState(State.ENABLED);
        Telemetry.obtainTelemetry().enable();
    }

    public final void disableTelemetry() {
        TelemetryEnabler.updateTelemetryState(State.DISABLED);
        Telemetry.obtainTelemetry().disable();
    }
}
