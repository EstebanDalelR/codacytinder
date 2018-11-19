package com.tinder.domain.meta.model;

import android.support.annotation.NonNull;
import com.tinder.domain.boost.model.BoostStatus;
import com.tinder.domain.meta.model.AutoValue_BoostSettings.Builder;
import kotlin.Deprecated;
import org.joda.time.DateTime;

public abstract class BoostSettings implements BoostStatus {
    public abstract int boostRefreshAmount();

    public abstract int boostRefreshInterval();

    @NonNull
    public abstract BoostSettings$Unit boostRefreshIntervalUnit();

    public abstract long duration();

    @NonNull
    public abstract DateTime expireAt();

    public int getConsumedFrom() {
        return 0;
    }

    @Deprecated(message = "Shouldn't use this value.")
    public long getResultViewedAt() {
        return 0;
    }

    @NonNull
    public abstract String id();

    @Deprecated(message = "We should always calculate this based on expiresAt")
    public boolean isBoostEnded() {
        return false;
    }

    @Deprecated(message = "This is only used in an error case where a user already in a boost and trying to boost again.")
    public boolean isStillInBoost() {
        return false;
    }

    public abstract double multiplier();

    public abstract int remaining();

    @NonNull
    public abstract DateTime resetAt();

    public int getRemaining() {
        return remaining();
    }

    public long getResetAt() {
        return resetAt().getMillis();
    }

    public long getExpiresAt() {
        return expireAt().getMillis();
    }

    public String getBoostId() {
        return id();
    }

    public double getMultiplier() {
        return multiplier();
    }

    public int getRefreshAmount() {
        return boostRefreshAmount();
    }

    public int getRefreshInterval() {
        return boostRefreshInterval();
    }

    @NonNull
    public BoostSettings$Unit getRefreshIntervalUnit() {
        return boostRefreshIntervalUnit();
    }

    public static BoostSettings$Builder builder() {
        return new Builder();
    }
}
