package com.mapbox.android.telemetry;

import android.os.SystemClock;

class Clock {
    Clock() {
    }

    long giveMeTheElapsedRealtime() {
        return SystemClock.elapsedRealtime();
    }
}
