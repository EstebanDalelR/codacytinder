package com.mapbox.android.telemetry;

import android.content.Context;
import android.os.Handler;
import com.mapbox.android.core.permissions.C5765a;

class PermissionCheckRunnable implements Runnable {
    private final Context context;
    private final ExponentialBackoff counter = new ExponentialBackoff();
    private final Handler handler = new Handler();
    private MapboxTelemetry mapboxTelemetry;

    PermissionCheckRunnable(Context context, MapboxTelemetry mapboxTelemetry) {
        this.context = context;
        this.mapboxTelemetry = mapboxTelemetry;
    }

    public void run() {
        if (C5765a.m25342a(this.context)) {
            this.mapboxTelemetry.optLocationIn();
            return;
        }
        this.handler.postDelayed(this, this.counter.nextBackOffMillis());
    }
}
