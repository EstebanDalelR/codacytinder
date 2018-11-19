package com.mapbox.mapboxsdk.geometry;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.annotation.NonNull;

public class LatLngSpan implements Parcelable {
    public static final Creator<LatLngSpan> CREATOR = new C58251();
    private double mLatitudeSpan;
    private double mLongitudeSpan;

    /* renamed from: com.mapbox.mapboxsdk.geometry.LatLngSpan$1 */
    static class C58251 implements Creator<LatLngSpan> {
        C58251() {
        }

        public LatLngSpan createFromParcel(Parcel parcel) {
            return new LatLngSpan(parcel);
        }

        public LatLngSpan[] newArray(int i) {
            return new LatLngSpan[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    private LatLngSpan(@NonNull Parcel parcel) {
        this.mLatitudeSpan = parcel.readDouble();
        this.mLongitudeSpan = parcel.readDouble();
    }

    public LatLngSpan(double d, double d2) {
        this.mLatitudeSpan = d;
        this.mLongitudeSpan = d2;
    }

    public double getLatitudeSpan() {
        return this.mLatitudeSpan;
    }

    public void setLatitudeSpan(double d) {
        this.mLatitudeSpan = d;
    }

    public double getLongitudeSpan() {
        return this.mLongitudeSpan;
    }

    public void setLongitudeSpan(double d) {
        this.mLongitudeSpan = d;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLngSpan)) {
            return false;
        }
        LatLngSpan latLngSpan = (LatLngSpan) obj;
        if (this.mLongitudeSpan != latLngSpan.getLongitudeSpan() || this.mLatitudeSpan != latLngSpan.getLatitudeSpan()) {
            z = false;
        }
        return z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.mLatitudeSpan);
        parcel.writeDouble(this.mLongitudeSpan);
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.mLatitudeSpan);
        int i = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        long doubleToLongBits2 = Double.doubleToLongBits(this.mLongitudeSpan);
        return (i * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
    }

    static double getLongitudeSpan(double d, double d2) {
        double abs = Math.abs(d - d2);
        return d > d2 ? abs : 360.0d - abs;
    }
}
