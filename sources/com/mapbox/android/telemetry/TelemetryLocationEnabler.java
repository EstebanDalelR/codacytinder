package com.mapbox.android.telemetry;

import android.content.SharedPreferences.Editor;
import java.util.HashMap;
import java.util.Map;

class TelemetryLocationEnabler {
    private static final Map<String, LocationState> LOCATION_STATES = new C58101();
    private static final String MAPBOX_SHARED_PREFERENCE_KEY_TELEMETRY_STATE = "mapboxTelemetryLocationState";
    private LocationState currentTelemetryLocationState = LocationState.DISABLED;
    private boolean isFromPreferences = true;

    /* renamed from: com.mapbox.android.telemetry.TelemetryLocationEnabler$1 */
    static class C58101 extends HashMap<String, LocationState> {
        C58101() {
            put(LocationState.ENABLED.name(), LocationState.ENABLED);
            put(LocationState.DISABLED.name(), LocationState.DISABLED);
        }
    }

    enum LocationState {
        ENABLED,
        DISABLED
    }

    TelemetryLocationEnabler(boolean z) {
        this.isFromPreferences = z;
    }

    LocationState obtainTelemetryLocationState() {
        if (this.isFromPreferences) {
            return retrieveTelemetryLocationStateFromPreferences();
        }
        return this.currentTelemetryLocationState;
    }

    LocationState updateTelemetryLocationState(LocationState locationState) {
        if (this.isFromPreferences) {
            return updateLocationPreferences(locationState);
        }
        this.currentTelemetryLocationState = locationState;
        return this.currentTelemetryLocationState;
    }

    void injectTelemetryLocationState(LocationState locationState) {
        this.currentTelemetryLocationState = locationState;
    }

    private LocationState retrieveTelemetryLocationStateFromPreferences() {
        return (LocationState) LOCATION_STATES.get(TelemetryUtils.obtainSharedPreferences().getString(MAPBOX_SHARED_PREFERENCE_KEY_TELEMETRY_STATE, LocationState.DISABLED.name()));
    }

    private LocationState updateLocationPreferences(LocationState locationState) {
        Editor edit = TelemetryUtils.obtainSharedPreferences().edit();
        edit.putString(MAPBOX_SHARED_PREFERENCE_KEY_TELEMETRY_STATE, locationState.name());
        edit.apply();
        return locationState;
    }
}
