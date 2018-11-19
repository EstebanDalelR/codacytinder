package com.tinder.domain.meta.model;

final class AutoValue_Location extends Location {
    private final double lat;
    private final double lon;

    static final class Builder extends com.tinder.domain.meta.model.Location.Builder {
        private Double lat;
        private Double lon;

        Builder() {
        }

        Builder(Location location) {
            this.lat = Double.valueOf(location.lat());
            this.lon = Double.valueOf(location.lon());
        }

        public com.tinder.domain.meta.model.Location.Builder lat(double d) {
            this.lat = Double.valueOf(d);
            return this;
        }

        public com.tinder.domain.meta.model.Location.Builder lon(double d) {
            this.lon = Double.valueOf(d);
            return this;
        }

        public Location build() {
            String str = "";
            if (this.lat == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" lat");
                str = stringBuilder.toString();
            }
            if (this.lon == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" lon");
                str = stringBuilder.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_Location(this.lat.doubleValue(), this.lon.doubleValue());
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Missing required properties:");
            stringBuilder2.append(str);
            throw new IllegalStateException(stringBuilder2.toString());
        }
    }

    private AutoValue_Location(double d, double d2) {
        this.lat = d;
        this.lon = d2;
    }

    public double lat() {
        return this.lat;
    }

    public double lon() {
        return this.lon;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Location{lat=");
        stringBuilder.append(this.lat);
        stringBuilder.append(", lon=");
        stringBuilder.append(this.lon);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Location)) {
            return false;
        }
        Location location = (Location) obj;
        if (Double.doubleToLongBits(this.lat) != Double.doubleToLongBits(location.lat()) || Double.doubleToLongBits(this.lon) != Double.doubleToLongBits(location.lon())) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return (int) (((long) (((int) (((long) 1000003) ^ ((Double.doubleToLongBits(this.lat) >>> 32) ^ Double.doubleToLongBits(this.lat)))) * 1000003)) ^ ((Double.doubleToLongBits(this.lon) >>> 32) ^ Double.doubleToLongBits(this.lon)));
    }
}
