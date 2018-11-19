package com.mapbox.android.telemetry;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;

class TelemetryReceiver extends BroadcastReceiver {
    private static final String BACKGROUND_RECEIVED_INTENT_KEY = "background_received";
    private static final String FOREGROUND_RECEIVED_INTENT_KEY = "foreground_received";
    private static final String ON_BACKGROUND_INTENT_EXTRA = "onBackground";
    private static final String ON_FOREGROUND_INTENT_EXTRA = "onForeground";
    static final String TELEMETRY_RECEIVER_INTENT = "com.mapbox.telemetry_receiver";
    private final TelemetryCallback callback;

    TelemetryReceiver(@NonNull TelemetryCallback telemetryCallback) {
        this.callback = telemetryCallback;
    }

    public void onReceive(Context context, Intent intent) {
        if (ON_BACKGROUND_INTENT_EXTRA.equals(intent.getStringExtra(BACKGROUND_RECEIVED_INTENT_KEY)) != null) {
            this.callback.onBackground();
        }
        if (ON_FOREGROUND_INTENT_EXTRA.equals(intent.getStringExtra(FOREGROUND_RECEIVED_INTENT_KEY)) != null) {
            this.callback.onForeground();
        }
    }

    Intent supplyBackgroundIntent() {
        Intent intent = new Intent(TELEMETRY_RECEIVER_INTENT);
        intent.putExtra(BACKGROUND_RECEIVED_INTENT_KEY, ON_BACKGROUND_INTENT_EXTRA);
        return intent;
    }

    Intent supplyForegroundIntent() {
        Intent intent = new Intent(TELEMETRY_RECEIVER_INTENT);
        intent.putExtra(FOREGROUND_RECEIVED_INTENT_KEY, ON_FOREGROUND_INTENT_EXTRA);
        return intent;
    }
}
