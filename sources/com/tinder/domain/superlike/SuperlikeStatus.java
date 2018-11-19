package com.tinder.domain.superlike;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.domain.common.model.TimeInterval;
import com.tinder.domain.common.model.TimeUnit;
import org.joda.time.DateTime;

public abstract class SuperlikeStatus {
    public static final boolean DEFAULT_HAS_SUPERLIKES = false;
    public static final long DEFAULT_MILLIS_UNTIL_RESET_DATE = 0;
    public static final int DEFAULT_REFRESH_AMOUNT = 1;
    public static final int DEFAULT_REMAINING_COUNT = 0;
    public static final long DEFAULT_RESET_DATE_MILLIS = 0;
    public static final TimeInterval DEFAULT_TIME_INTERVAL = TimeInterval.create(1, TimeUnit.DAY);

    public static abstract class Builder {
        public abstract SuperlikeStatus build();

        public abstract Builder hasSuperlikes(boolean z);

        public abstract Builder millisUntilResetDate(long j);

        public abstract Builder refreshAmount(int i);

        public abstract Builder refreshInterval(TimeInterval timeInterval);

        public abstract Builder remainingCount(int i);

        public abstract Builder resetDate(DateTime dateTime);

        public abstract Builder resetDateInMillis(long j);
    }

    public abstract boolean hasSuperlikes();

    public abstract long millisUntilResetDate();

    public abstract int refreshAmount();

    @NonNull
    public abstract TimeInterval refreshInterval();

    public abstract int remainingCount();

    @Nullable
    public abstract DateTime resetDate();

    public abstract long resetDateInMillis();

    public abstract Builder toBuilder();

    public static Builder builder() {
        return new Builder();
    }
}
