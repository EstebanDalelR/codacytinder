package com.tinder.domain.common.model;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import org.joda.time.DateTime;

public abstract class Interest {

    public static abstract class Builder {
        public abstract Interest build();

        public abstract Builder createdTime(DateTime dateTime);

        public abstract Builder id(String str);

        public abstract Builder name(String str);
    }

    @Nullable
    public abstract DateTime createdTime();

    @NonNull
    public abstract String id();

    @NonNull
    public abstract String name();

    public static Builder builder() {
        return new Builder();
    }
}
