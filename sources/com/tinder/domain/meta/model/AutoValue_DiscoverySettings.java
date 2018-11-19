package com.tinder.domain.meta.model;

import android.support.annotation.NonNull;
import com.tinder.domain.meta.model.DiscoverySettings.GenderFilter;

final class AutoValue_DiscoverySettings extends DiscoverySettings {
    private final int distanceFilter;
    private final GenderFilter genderFilter;
    private final boolean isDiscoverable;
    private final int maxAgeFilter;
    private final int minAgeFilter;

    static final class Builder extends com.tinder.domain.meta.model.DiscoverySettings.Builder {
        private Integer distanceFilter;
        private GenderFilter genderFilter;
        private Boolean isDiscoverable;
        private Integer maxAgeFilter;
        private Integer minAgeFilter;

        Builder() {
        }

        Builder(DiscoverySettings discoverySettings) {
            this.minAgeFilter = Integer.valueOf(discoverySettings.minAgeFilter());
            this.maxAgeFilter = Integer.valueOf(discoverySettings.maxAgeFilter());
            this.isDiscoverable = Boolean.valueOf(discoverySettings.isDiscoverable());
            this.distanceFilter = Integer.valueOf(discoverySettings.distanceFilter());
            this.genderFilter = discoverySettings.genderFilter();
        }

        public com.tinder.domain.meta.model.DiscoverySettings.Builder minAgeFilter(int i) {
            this.minAgeFilter = Integer.valueOf(i);
            return this;
        }

        public com.tinder.domain.meta.model.DiscoverySettings.Builder maxAgeFilter(int i) {
            this.maxAgeFilter = Integer.valueOf(i);
            return this;
        }

        public com.tinder.domain.meta.model.DiscoverySettings.Builder isDiscoverable(boolean z) {
            this.isDiscoverable = Boolean.valueOf(z);
            return this;
        }

        public com.tinder.domain.meta.model.DiscoverySettings.Builder distanceFilter(int i) {
            this.distanceFilter = Integer.valueOf(i);
            return this;
        }

        public com.tinder.domain.meta.model.DiscoverySettings.Builder genderFilter(GenderFilter genderFilter) {
            this.genderFilter = genderFilter;
            return this;
        }

        public DiscoverySettings autoBuild() {
            String str = "";
            if (this.minAgeFilter == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" minAgeFilter");
                str = stringBuilder.toString();
            }
            if (this.maxAgeFilter == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" maxAgeFilter");
                str = stringBuilder.toString();
            }
            if (this.isDiscoverable == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" isDiscoverable");
                str = stringBuilder.toString();
            }
            if (this.distanceFilter == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" distanceFilter");
                str = stringBuilder.toString();
            }
            if (this.genderFilter == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" genderFilter");
                str = stringBuilder.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_DiscoverySettings(this.minAgeFilter.intValue(), this.maxAgeFilter.intValue(), this.isDiscoverable.booleanValue(), this.distanceFilter.intValue(), this.genderFilter);
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Missing required properties:");
            stringBuilder2.append(str);
            throw new IllegalStateException(stringBuilder2.toString());
        }
    }

    private AutoValue_DiscoverySettings(int i, int i2, boolean z, int i3, GenderFilter genderFilter) {
        this.minAgeFilter = i;
        this.maxAgeFilter = i2;
        this.isDiscoverable = z;
        this.distanceFilter = i3;
        this.genderFilter = genderFilter;
    }

    public int minAgeFilter() {
        return this.minAgeFilter;
    }

    public int maxAgeFilter() {
        return this.maxAgeFilter;
    }

    public boolean isDiscoverable() {
        return this.isDiscoverable;
    }

    public int distanceFilter() {
        return this.distanceFilter;
    }

    @NonNull
    public GenderFilter genderFilter() {
        return this.genderFilter;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DiscoverySettings{minAgeFilter=");
        stringBuilder.append(this.minAgeFilter);
        stringBuilder.append(", maxAgeFilter=");
        stringBuilder.append(this.maxAgeFilter);
        stringBuilder.append(", isDiscoverable=");
        stringBuilder.append(this.isDiscoverable);
        stringBuilder.append(", distanceFilter=");
        stringBuilder.append(this.distanceFilter);
        stringBuilder.append(", genderFilter=");
        stringBuilder.append(this.genderFilter);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DiscoverySettings)) {
            return false;
        }
        DiscoverySettings discoverySettings = (DiscoverySettings) obj;
        if (this.minAgeFilter != discoverySettings.minAgeFilter() || this.maxAgeFilter != discoverySettings.maxAgeFilter() || this.isDiscoverable != discoverySettings.isDiscoverable() || this.distanceFilter != discoverySettings.distanceFilter() || this.genderFilter.equals(discoverySettings.genderFilter()) == null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((((((((this.minAgeFilter ^ 1000003) * 1000003) ^ this.maxAgeFilter) * 1000003) ^ (this.isDiscoverable ? 1231 : 1237)) * 1000003) ^ this.distanceFilter) * 1000003) ^ this.genderFilter.hashCode();
    }

    public com.tinder.domain.meta.model.DiscoverySettings.Builder toBuilder() {
        return new Builder(this);
    }
}
