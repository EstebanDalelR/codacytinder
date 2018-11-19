package com.tinder.domain.meta.model;

public abstract class Location {

    public static abstract class Builder {
        public abstract Location build();

        public abstract Builder lat(double d);

        public abstract Builder lon(double d);
    }

    public abstract double lat();

    public abstract double lon();

    public static Builder builder() {
        return new Builder();
    }
}
