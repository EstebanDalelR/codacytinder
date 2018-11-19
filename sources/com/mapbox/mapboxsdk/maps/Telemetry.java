package com.mapbox.mapboxsdk.maps;

import com.mapbox.android.telemetry.MapboxTelemetry;
import com.mapbox.android.telemetry.SessionInterval;
import com.mapbox.android.telemetry.TelemetryEnabler;
import com.mapbox.android.telemetry.TelemetryEnabler.State;
import com.mapbox.mapboxsdk.BuildConfig;
import com.mapbox.mapboxsdk.Mapbox;

public class Telemetry {
    static final String DOUBLE_TAP = "DoubleTap";
    static final String PAN = "Pan";
    static final String PINCH = "Pinch";
    static final String PITCH = "Pitch";
    static final String ROTATION = "Rotation";
    static final String SINGLE_TAP = "SingleTap";
    static final String TWO_FINGER_TAP = "TwoFingerTap";
    private MapboxTelemetry telemetry;

    private static class TelemetryHolder {
        private static final Telemetry INSTANCE = new Telemetry();

        private TelemetryHolder() {
        }
    }

    private Telemetry() {
        this.telemetry = new MapboxTelemetry(Mapbox.getApplicationContext(), Mapbox.getAccessToken(), BuildConfig.MAPBOX_EVENTS_USER_AGENT);
        if (State.ENABLED.equals(TelemetryEnabler.retrieveTelemetryStateFromPreferences())) {
            this.telemetry.enable();
        }
    }

    public static void initialize() {
        obtainTelemetry();
    }

    public static void updateDebugLoggingEnabled(boolean z) {
        TelemetryHolder.INSTANCE.telemetry.updateDebugLoggingEnabled(z);
    }

    public static boolean updateSessionIdRotationInterval(SessionInterval sessionInterval) {
        return TelemetryHolder.INSTANCE.telemetry.updateSessionIdRotationInterval(sessionInterval);
    }

    static MapboxTelemetry obtainTelemetry() {
        return TelemetryHolder.INSTANCE.telemetry;
    }
}
