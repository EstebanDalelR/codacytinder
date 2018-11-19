package com.mapbox.android.telemetry;

class ExponentialBackoff {
    private static final int DEFAULT_INITIAL_INTERVAL_MILLIS = 10000;
    private static final int DEFAULT_MAX_INTERVAL_MILLIS = 600000;
    private static final double DEFAULT_MULTIPLIER = 2.0d;
    private static final int NANO_TO_MILLIS_CONVERSION_NUMBER = 1000000;
    private int currentIntervalMillis;
    private int initialIntervalMillis = 10000;
    private int maxIntervalMillis = DEFAULT_MAX_INTERVAL_MILLIS;
    private double multiplier = DEFAULT_MULTIPLIER;
    private long startTimeNanos;

    ExponentialBackoff() {
        reset();
    }

    final void reset() {
        this.currentIntervalMillis = this.initialIntervalMillis;
        this.startTimeNanos = System.nanoTime();
    }

    long nextBackOffMillis() {
        int i = this.currentIntervalMillis;
        incrementCurrentInterval();
        return (long) i;
    }

    final int getInitialIntervalMillis() {
        return this.initialIntervalMillis;
    }

    final int getCurrentIntervalMillis() {
        return this.currentIntervalMillis;
    }

    final double getMultiplier() {
        return this.multiplier;
    }

    final int getMaxIntervalMillis() {
        return this.maxIntervalMillis;
    }

    final long getElapsedTimeMillis() {
        return (System.nanoTime() - this.startTimeNanos) / 1000000;
    }

    private void incrementCurrentInterval() {
        if (((double) this.currentIntervalMillis) >= ((double) this.maxIntervalMillis) / this.multiplier) {
            this.currentIntervalMillis = this.maxIntervalMillis;
        } else {
            this.currentIntervalMillis = (int) (((double) this.currentIntervalMillis) * this.multiplier);
        }
    }
}
