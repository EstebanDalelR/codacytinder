package com.crashlytics.android.answers;

import io.fabric.sdk.android.services.concurrency.internal.C15642c;

class RetryManager {
    private static final long NANOSECONDS_IN_MS = 1000000;
    long lastRetry;
    private C15642c retryState;

    public RetryManager(C15642c c15642c) {
        if (c15642c == null) {
            throw new NullPointerException("retryState must not be null");
        }
        this.retryState = c15642c;
    }

    public boolean canRetry(long j) {
        return j - this.lastRetry >= this.retryState.a() * NANOSECONDS_IN_MS ? 1 : 0;
    }

    public void recordRetry(long j) {
        this.lastRetry = j;
        this.retryState = this.retryState.b();
    }

    public void reset() {
        this.lastRetry = 0;
        this.retryState = this.retryState.c();
    }
}
