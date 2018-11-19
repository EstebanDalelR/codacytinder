package com.tinder.domain.tinderplus;

public abstract class LikeStatus {
    public static final long DEFAULT_RATE_LIMIT_UNTIL_MILLIS = 0;
    public static final int DEFAULT_REMAINING_LIKES = 100;

    public abstract int likesPercentRemaining();

    public abstract long millisRateLimitedUntil();

    public static LikeStatus create(int i, long j) {
        return new AutoValue_LikeStatus(i, j);
    }
}
