package com.tinder.api.model.location;

import com.squareup.moshi.Json;

/* renamed from: com.tinder.api.model.location.$AutoValue_LocationDetails */
abstract class C$AutoValue_LocationDetails extends LocationDetails {
    private final String longName;
    private final String shortName;

    C$AutoValue_LocationDetails(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null shortName");
        }
        this.shortName = str;
        if (str2 == null) {
            throw new NullPointerException("Null longName");
        }
        this.longName = str2;
    }

    @Json(name = "short_name")
    public String shortName() {
        return this.shortName;
    }

    @Json(name = "long_name")
    public String longName() {
        return this.longName;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("LocationDetails{shortName=");
        stringBuilder.append(this.shortName);
        stringBuilder.append(", longName=");
        stringBuilder.append(this.longName);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LocationDetails)) {
            return false;
        }
        LocationDetails locationDetails = (LocationDetails) obj;
        if (!this.shortName.equals(locationDetails.shortName()) || this.longName.equals(locationDetails.longName()) == null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((this.shortName.hashCode() ^ 1000003) * 1000003) ^ this.longName.hashCode();
    }
}
