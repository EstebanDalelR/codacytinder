package com.mapbox.android.telemetry;

public class SessionInterval {
    private static final int HIGH_INTERVAL_VALUE = 24;
    private static final String INTERVAL_NOT_IN_THE_RANGE = "The interval passed in must be an an integer in the range of 1 to 24 hours.";
    private static final int LOW_INTERVAL_VALUE = 1;
    private final int interval;

    public SessionInterval(int i) {
        check(i);
        this.interval = i;
    }

    private void check(int i) {
        if (i >= 1) {
            if (i <= 24) {
                return;
            }
        }
        throw new IllegalArgumentException(INTERVAL_NOT_IN_THE_RANGE);
    }

    int obtainInterval() {
        return this.interval;
    }
}
