package com.tinder.domain.common.model;

import android.support.annotation.Nullable;

public abstract class School {

    public static abstract class Builder {
        public abstract School build();

        public abstract Builder displayed(boolean z);

        public abstract Builder id(String str);

        public abstract Builder name(String str);
    }

    public abstract boolean displayed();

    @Nullable
    public abstract String id();

    public abstract String name();

    public abstract Builder toBuilder();

    public static Builder builder() {
        return new Builder();
    }
}
