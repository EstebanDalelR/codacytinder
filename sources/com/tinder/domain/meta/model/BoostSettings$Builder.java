package com.tinder.domain.meta.model;

import org.joda.time.DateTime;

public abstract class BoostSettings$Builder {
    public abstract BoostSettings$Builder boostRefreshAmount(int i);

    public abstract BoostSettings$Builder boostRefreshInterval(int i);

    public abstract BoostSettings$Builder boostRefreshIntervalUnit(BoostSettings$Unit boostSettings$Unit);

    public abstract BoostSettings build();

    public abstract BoostSettings$Builder duration(long j);

    public abstract BoostSettings$Builder expireAt(DateTime dateTime);

    public abstract BoostSettings$Builder id(String str);

    public abstract BoostSettings$Builder multiplier(double d);

    public abstract BoostSettings$Builder remaining(int i);

    public abstract BoostSettings$Builder resetAt(DateTime dateTime);
}
