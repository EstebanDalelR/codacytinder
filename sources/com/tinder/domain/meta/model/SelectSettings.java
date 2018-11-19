package com.tinder.domain.meta.model;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import org.joda.time.DateTime;

public abstract class SelectSettings {

    public static abstract class Builder {
        public abstract SelectSettings build();

        public abstract Builder dateAdded(@Nullable DateTime dateTime);

        public abstract Builder invitationCount(int i);

        public abstract Builder isSelectedRecsEnabled(boolean z);
    }

    @Nullable
    public abstract DateTime dateAdded();

    public abstract int invitationCount();

    public abstract boolean isSelectedRecsEnabled();

    @NonNull
    public static Builder builder() {
        return new Builder();
    }
}
