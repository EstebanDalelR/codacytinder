package com.google.android.m4b.maps.model;

import android.os.Parcel;
import com.google.android.m4b.maps.p111k.C5468c;

public final class LatLng implements C5468c {
    public static final LatLngCreator CREATOR = new LatLngCreator();
    /* renamed from: a */
    private final int f25149a;
    public final double latitude;
    public final double longitude;

    public final int describeContents() {
        return 0;
    }

    LatLng(int i, double d, double d2) {
        this.f25149a = i;
        if (-180.0d > d2 || d2 >= 180.0d) {
            this.longitude = ((((d2 - 180.0d) % 360.0d) + 360.0d) % 360.0d) - 180.0d;
        } else {
            this.longitude = d2;
        }
        this.latitude = Math.max(-90.0d, Math.min(90.0d, d));
    }

    public LatLng(double d, double d2) {
        this(1, d, d2);
    }

    /* renamed from: a */
    final int m29990a() {
        return this.f25149a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        LatLngCreator.m23866a(this, parcel);
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.latitude);
        int i = ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31;
        long doubleToLongBits2 = Double.doubleToLongBits(this.longitude);
        return (i * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLng)) {
            return false;
        }
        LatLng latLng = (LatLng) obj;
        return Double.doubleToLongBits(this.latitude) == Double.doubleToLongBits(latLng.latitude) && Double.doubleToLongBits(this.longitude) == Double.doubleToLongBits(latLng.longitude);
    }

    public final String toString() {
        double d = this.latitude;
        double d2 = this.longitude;
        StringBuilder stringBuilder = new StringBuilder(60);
        stringBuilder.append("lat/lng: (");
        stringBuilder.append(d);
        stringBuilder.append(",");
        stringBuilder.append(d2);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
