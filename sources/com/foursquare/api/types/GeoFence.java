package com.foursquare.api.types;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class GeoFence implements Parcelable, FoursquareType {
    public static final Creator<GeoFence> CREATOR = new C18941();
    private double lat;
    private double lng;
    private double radius;

    /* renamed from: com.foursquare.api.types.GeoFence$1 */
    class C18941 implements Creator<GeoFence> {
        C18941() {
        }

        public GeoFence createFromParcel(Parcel parcel) {
            return new GeoFence(parcel);
        }

        public GeoFence[] newArray(int i) {
            return new GeoFence[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public GeoFence(double d, double d2, double d3) {
        this.lat = d;
        this.lng = d2;
        this.radius = d3;
    }

    public GeoFence(Parcel parcel) {
        this.lat = parcel.readDouble();
        this.lng = parcel.readDouble();
        this.radius = parcel.readDouble();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.lat);
        parcel.writeDouble(this.lng);
        parcel.writeDouble(this.radius);
    }

    public double getLat() {
        return this.lat;
    }

    public double getLng() {
        return this.lng;
    }

    public double getRadius() {
        return this.radius;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                GeoFence geoFence = (GeoFence) obj;
                if (Double.compare(geoFence.lat, this.lat) != 0 || Double.compare(geoFence.lng, this.lng) != 0) {
                    return false;
                }
                if (Double.compare(geoFence.radius, this.radius) != null) {
                    z = false;
                }
                return z;
            }
        }
        return false;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.lat);
        int i = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        long doubleToLongBits2 = Double.doubleToLongBits(this.lng);
        i = (i * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
        doubleToLongBits2 = Double.doubleToLongBits(this.radius);
        return (i * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("GeoFence{lat=");
        stringBuilder.append(this.lat);
        stringBuilder.append(", lng=");
        stringBuilder.append(this.lng);
        stringBuilder.append(", radius=");
        stringBuilder.append(this.radius);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
