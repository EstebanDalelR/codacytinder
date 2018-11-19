package com.tinder.api.model.profile;

import com.tinder.api.model.profile.Travel.TravelPosition;

/* renamed from: com.tinder.api.model.profile.$AutoValue_Travel_TravelPosition */
abstract class C$AutoValue_Travel_TravelPosition extends TravelPosition {
    private final Double lat;
    private final Double lon;

    C$AutoValue_Travel_TravelPosition(Double d, Double d2) {
        if (d == null) {
            throw new NullPointerException("Null lat");
        }
        this.lat = d;
        if (d2 == null) {
            throw new NullPointerException("Null lon");
        }
        this.lon = d2;
    }

    public Double lat() {
        return this.lat;
    }

    public Double lon() {
        return this.lon;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TravelPosition{lat=");
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
        if (!(obj instanceof TravelPosition)) {
            return false;
        }
        TravelPosition travelPosition = (TravelPosition) obj;
        if (!this.lat.equals(travelPosition.lat()) || this.lon.equals(travelPosition.lon()) == null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((this.lat.hashCode() ^ 1000003) * 1000003) ^ this.lon.hashCode();
    }
}
