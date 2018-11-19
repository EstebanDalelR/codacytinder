package com.mapbox.android.telemetry;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import com.tinder.domain.config.model.ProfileEditingConfig;
import java.util.HashMap;
import java.util.Map;

public class TelemetryEnabler {
    private static final String KEY_META_DATA_ENABLED = "com.mapbox.EnableEvents";
    static final String MAPBOX_SHARED_PREFERENCE_KEY_TELEMETRY_STATE = "mapboxTelemetryState";
    private static final Map<String, State> STATES = new C58092();
    static final Map<State, Boolean> TELEMETRY_STATES = new C58081();
    private State currentTelemetryState = State.ENABLED;
    private boolean isFromPreferences = true;

    /* renamed from: com.mapbox.android.telemetry.TelemetryEnabler$1 */
    static class C58081 extends HashMap<State, Boolean> {
        C58081() {
            put(State.ENABLED, Boolean.valueOf(true));
            put(State.DISABLED, Boolean.valueOf(false));
        }
    }

    /* renamed from: com.mapbox.android.telemetry.TelemetryEnabler$2 */
    static class C58092 extends HashMap<String, State> {
        C58092() {
            put(State.ENABLED.name(), State.ENABLED);
            put(State.DISABLED.name(), State.DISABLED);
        }
    }

    public enum State {
        ENABLED,
        DISABLED
    }

    TelemetryEnabler(boolean z) {
        this.isFromPreferences = z;
    }

    public static State retrieveTelemetryStateFromPreferences() {
        return (State) STATES.get(TelemetryUtils.obtainSharedPreferences().getString(MAPBOX_SHARED_PREFERENCE_KEY_TELEMETRY_STATE, State.ENABLED.name()));
    }

    public static State updateTelemetryState(State state) {
        Editor edit = TelemetryUtils.obtainSharedPreferences().edit();
        edit.putString(MAPBOX_SHARED_PREFERENCE_KEY_TELEMETRY_STATE, state.name());
        edit.apply();
        return state;
    }

    State obtainTelemetryState() {
        if (this.isFromPreferences) {
            return retrieveTelemetryStateFromPreferences();
        }
        return this.currentTelemetryState;
    }

    State updatePreferences(State state) {
        if (this.isFromPreferences) {
            return updateTelemetryState(state);
        }
        this.currentTelemetryState = state;
        return this.currentTelemetryState;
    }

    static boolean isEventsEnabled(Context context) {
        try {
            context = context.getPackageManager().getApplicationInfo(context.getPackageName(), ProfileEditingConfig.DEFAULT_MAX_LENGTH);
            if (!(context == null || context.metaData == null)) {
                return context.metaData.getBoolean(KEY_META_DATA_ENABLED, true);
            }
        } catch (Context context2) {
            context2.printStackTrace();
        }
        return true;
    }
}
