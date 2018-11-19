package com.tinder.domain.meta.model;

import android.support.annotation.Nullable;
import org.joda.time.DateTime;

public abstract class Configuration {

    public static abstract class Builder {
        public abstract Configuration build();

        public abstract Builder isPhotoInProcessing(boolean z);

        public abstract Builder location(Location location);

        public abstract Builder pingTime(DateTime dateTime);
    }

    public abstract boolean isPhotoInProcessing();

    @Nullable
    public abstract Location location();

    @Nullable
    public abstract DateTime pingTime();

    public static Builder builder() {
        return new Builder();
    }
}
