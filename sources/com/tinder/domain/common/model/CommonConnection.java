package com.tinder.domain.common.model;

import android.support.annotation.NonNull;

public abstract class CommonConnection {

    public static abstract class Builder {
        public abstract CommonConnection build();

        public abstract Builder degree(int i);

        public abstract Builder id(String str);

        public abstract Builder image(String str);

        public abstract Builder name(String str);
    }

    public abstract int degree();

    @NonNull
    public abstract String id();

    @NonNull
    public abstract String image();

    @NonNull
    public abstract String name();

    public static Builder builder() {
        return new Builder();
    }
}
