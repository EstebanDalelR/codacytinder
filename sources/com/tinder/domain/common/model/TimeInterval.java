package com.tinder.domain.common.model;

public abstract class TimeInterval {
    public abstract int length();

    public abstract TimeUnit unit();

    public static TimeInterval create(int i, TimeUnit timeUnit) {
        return new AutoValue_TimeInterval(i, timeUnit);
    }
}
