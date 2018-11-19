package com.crashlytics.android.answers;

import io.fabric.sdk.android.services.concurrency.internal.Backoff;
import java.util.Random;

class RandomBackoff implements Backoff {
    final Backoff backoff;
    final double jitterPercent;
    final Random random;

    public RandomBackoff(Backoff backoff, double d) {
        this(backoff, d, new Random());
    }

    public RandomBackoff(Backoff backoff, double d, Random random) {
        if (d >= 0.0d) {
            if (d <= 1.0d) {
                if (backoff == null) {
                    throw new NullPointerException("backoff must not be null");
                } else if (random == null) {
                    throw new NullPointerException("random must not be null");
                } else {
                    this.backoff = backoff;
                    this.jitterPercent = d;
                    this.random = random;
                    return;
                }
            }
        }
        throw new IllegalArgumentException("jitterPercent must be between 0.0 and 1.0");
    }

    public long getDelayMillis(int i) {
        return (long) (randomJitter() * ((double) this.backoff.getDelayMillis(i)));
    }

    double randomJitter() {
        double d = 1.0d - this.jitterPercent;
        return d + (((this.jitterPercent + 1.0d) - d) * this.random.nextDouble());
    }
}
