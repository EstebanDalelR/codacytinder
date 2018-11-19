package com.mapbox.mapboxsdk.geometry;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.annotation.FloatRange;

public class LatLng implements Parcelable, ILatLng {
    public static final Creator<LatLng> CREATOR = new C58221();
    private double altitude;
    private double latitude;
    private double longitude;

    /* renamed from: com.mapbox.mapboxsdk.geometry.LatLng$1 */
    static class C58221 implements Creator<LatLng> {
        C58221() {
        }

        public LatLng createFromParcel(Parcel parcel) {
            return new LatLng(parcel);
        }

        public LatLng[] newArray(int i) {
            return new LatLng[i];
        }
    }

    static double wrap(double d, double d2, double d3) {
        double d4 = d3 - d2;
        double d5 = (((d - d2) % d4) + d4) % d4;
        return (d < d3 || d5 != 0.0d) ? d5 + d2 : d3;
    }

    public int describeContents() {
        return 0;
    }

    public LatLng() {
        this.altitude = 0.0d;
        this.latitude = 0.0d;
        this.longitude = 0.0d;
    }

    public LatLng(double d, double d2) {
        this.altitude = 0.0d;
        setLatitude(d);
        setLongitude(d2);
    }

    public LatLng(double d, double d2, double d3) {
        this.altitude = 0.0d;
        setLatitude(d);
        setLongitude(d2);
        setAltitude(d3);
    }

    public LatLng(Location location) {
        this(location.getLatitude(), location.getLongitude(), location.getAltitude());
    }

    public LatLng(LatLng latLng) {
        this.altitude = 0.0d;
        this.latitude = latLng.latitude;
        this.longitude = latLng.longitude;
        this.altitude = latLng.altitude;
    }

    protected LatLng(Parcel parcel) {
        this.altitude = 0.0d;
        setLatitude(parcel.readDouble());
        setLongitude(parcel.readDouble());
        setAltitude(parcel.readDouble());
    }

    public void setLatitude(@FloatRange(from = -90.0d, to = 90.0d) double d) {
        if (Double.isNaN(d)) {
            throw new IllegalArgumentException("latitude must not be NaN");
        } else if (Math.abs(d) > 90.0d) {
            throw new IllegalArgumentException("latitude must be between -90 and 90");
        } else {
            this.latitude = d;
        }
    }

    public double getLatitude() {
        return this.latitude;
    }

    public void setLongitude(@FloatRange(from = -180.0d, to = 180.0d) double d) {
        if (Double.isNaN(d)) {
            throw new IllegalArgumentException("longitude must not be NaN");
        } else if (Double.isInfinite(d)) {
            throw new IllegalArgumentException("longitude must not be infinite");
        } else {
            this.longitude = d;
        }
    }

    public double getLongitude() {
        return this.longitude;
    }

    public void setAltitude(double d) {
        this.altitude = d;
    }

    public double getAltitude() {
        return this.altitude;
    }

    public LatLng wrap() {
        return new LatLng(this.latitude, wrap(this.longitude, -180.0d, 180.0d));
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                LatLng latLng = (LatLng) obj;
                if (Double.compare(latLng.altitude, this.altitude) != 0 || Double.compare(latLng.latitude, this.latitude) != 0 || Double.compare(latLng.longitude, this.longitude) != null) {
                    z = false;
                }
                return z;
            }
        }
        return false;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.latitude);
        int i = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        long doubleToLongBits2 = Double.doubleToLongBits(this.longitude);
        i = (i * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
        doubleToLongBits2 = Double.doubleToLongBits(this.altitude);
        return (i * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("LatLng [latitude=");
        stringBuilder.append(this.latitude);
        stringBuilder.append(", longitude=");
        stringBuilder.append(this.longitude);
        stringBuilder.append(", altitude=");
        stringBuilder.append(this.altitude);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.latitude);
        parcel.writeDouble(this.longitude);
        parcel.writeDouble(this.altitude);
    }

    public double distanceTo(LatLng latLng) {
        LatLng latLng2 = latLng;
        if (this.latitude == latLng2.latitude && r0.longitude == latLng2.longitude) {
            return 0.0d;
        }
        double toRadians = Math.toRadians(r0.latitude);
        double toRadians2 = Math.toRadians(r0.longitude);
        double toRadians3 = Math.toRadians(latLng.getLatitude());
        double toRadians4 = Math.toRadians(latLng.getLongitude());
        double cos = Math.cos(toRadians);
        double cos2 = Math.cos(toRadians3);
        return Math.acos(((((Math.cos(toRadians2) * cos) * cos2) * Math.cos(toRadians4)) + (((cos * Math.sin(toRadians2)) * cos2) * Math.sin(toRadians4))) + (Math.sin(toRadians) * Math.sin(toRadians3))) * 6378137.0d;
    }
}
