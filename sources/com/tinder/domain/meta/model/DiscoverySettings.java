package com.tinder.domain.meta.model;

import android.support.annotation.NonNull;

public abstract class DiscoverySettings {
    public static final int DEFAULT_DISTANCE_FILTER = 1;
    public static final GenderFilter DEFAULT_GENDER_FILTER = GenderFilter.BOTH;
    public static final int DEFAULT_MAX_AGE_FILTER = 55;
    public static final int DEFAULT_MIN_AGE_FILTER = 18;

    public static abstract class Builder {
        abstract DiscoverySettings autoBuild();

        public abstract Builder distanceFilter(int i);

        public abstract Builder genderFilter(GenderFilter genderFilter);

        public abstract Builder isDiscoverable(boolean z);

        public abstract Builder maxAgeFilter(int i);

        public abstract Builder minAgeFilter(int i);

        public DiscoverySettings build() {
            return autoBuild();
        }
    }

    public enum GenderFilter {
        MALE(0),
        FEMALE(1),
        BOTH(-1);
        
        private final int value;

        public static GenderFilter fromValue(int i) {
            for (GenderFilter genderFilter : values()) {
                if (genderFilter.value == i) {
                    return genderFilter;
                }
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unknown value ");
            stringBuilder.append(i);
            throw new IllegalArgumentException(stringBuilder.toString());
        }

        public static GenderFilter fromToggles(boolean z, boolean z2) {
            if (z && z2) {
                return BOTH;
            }
            if (z) {
                return MALE;
            }
            if (z2) {
                return FEMALE;
            }
            throw new IllegalArgumentException("Must like either males or females");
        }

        private GenderFilter(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    public abstract int distanceFilter();

    @NonNull
    public abstract GenderFilter genderFilter();

    public abstract boolean isDiscoverable();

    public abstract int maxAgeFilter();

    public abstract int minAgeFilter();

    public abstract Builder toBuilder();

    public static Builder builder() {
        return new Builder();
    }
}
