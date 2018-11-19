package com.tinder.domain.boost.model;

import android.support.annotation.NonNull;
import com.tinder.domain.meta.model.BoostSettings$Unit;

public interface BoostStatus {
    String getBoostId();

    int getConsumedFrom();

    long getExpiresAt();

    double getMultiplier();

    int getRefreshAmount();

    int getRefreshInterval();

    @NonNull
    BoostSettings$Unit getRefreshIntervalUnit();

    int getRemaining();

    long getResetAt();

    long getResultViewedAt();

    boolean isBoostEnded();

    boolean isStillInBoost();
}
