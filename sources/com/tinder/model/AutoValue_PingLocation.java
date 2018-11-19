package com.tinder.model;

final class AutoValue_PingLocation extends PingLocation {
    private final double displacementInMeters;
    private final double latitude;
    private final double longitude;

    AutoValue_PingLocation(double d, double d2, double d3) {
        this.latitude = d;
        this.longitude = d2;
        this.displacementInMeters = d3;
    }

    public double latitude() {
        return this.latitude;
    }

    public double longitude() {
        return this.longitude;
    }

    public double displacementInMeters() {
        return this.displacementInMeters;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PingLocation{latitude=");
        stringBuilder.append(this.latitude);
        stringBuilder.append(", longitude=");
        stringBuilder.append(this.longitude);
        stringBuilder.append(", displacementInMeters=");
        stringBuilder.append(this.displacementInMeters);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PingLocation)) {
            return false;
        }
        PingLocation pingLocation = (PingLocation) obj;
        if (Double.doubleToLongBits(this.latitude) != Double.doubleToLongBits(pingLocation.latitude()) || Double.doubleToLongBits(this.longitude) != Double.doubleToLongBits(pingLocation.longitude()) || Double.doubleToLongBits(this.displacementInMeters) != Double.doubleToLongBits(pingLocation.displacementInMeters())) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return (int) (((long) (((int) (((long) (((int) (((long) 1000003) ^ ((Double.doubleToLongBits(this.latitude) >>> 32) ^ Double.doubleToLongBits(this.latitude)))) * 1000003)) ^ ((Double.doubleToLongBits(this.longitude) >>> 32) ^ Double.doubleToLongBits(this.longitude)))) * 1000003)) ^ ((Double.doubleToLongBits(this.displacementInMeters) >>> 32) ^ Double.doubleToLongBits(this.displacementInMeters)));
    }
}
