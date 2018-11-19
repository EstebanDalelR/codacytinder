package com.mapbox.android.telemetry;

import android.util.Log;

class Logger {
    Logger() {
    }

    int debug(String str, String str2) {
        return Log.d(str, str2);
    }

    int error(String str, String str2) {
        return Log.e(str, str2);
    }
}
