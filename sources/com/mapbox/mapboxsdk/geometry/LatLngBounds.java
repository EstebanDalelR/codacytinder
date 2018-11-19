package com.mapbox.mapboxsdk.geometry;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.annotation.FloatRange;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.mapbox.mapboxsdk.exceptions.InvalidLatLngBoundsException;
import java.util.ArrayList;
import java.util.List;

public class LatLngBounds implements Parcelable {
    public static final Creator<LatLngBounds> CREATOR = new C58231();
    private final double latitudeNorth;
    private final double latitudeSouth;
    private final double longitudeEast;
    private final double longitudeWest;

    /* renamed from: com.mapbox.mapboxsdk.geometry.LatLngBounds$1 */
    static class C58231 implements Creator<LatLngBounds> {
        C58231() {
        }

        public LatLngBounds createFromParcel(Parcel parcel) {
            return LatLngBounds.readFromParcel(parcel);
        }

        public LatLngBounds[] newArray(int i) {
            return new LatLngBounds[i];
        }
    }

    public static final class Builder {
        private List<LatLng> latLngList = new ArrayList();

        public LatLngBounds build() {
            if (this.latLngList.size() >= 2) {
                return LatLngBounds.fromLatLngs(this.latLngList);
            }
            throw new InvalidLatLngBoundsException(this.latLngList.size());
        }

        public Builder includes(List<LatLng> list) {
            for (LatLng include : list) {
                include(include);
            }
            return this;
        }

        public Builder include(@NonNull LatLng latLng) {
            if (!this.latLngList.contains(latLng)) {
                this.latLngList.add(latLng);
            }
            return this;
        }
    }

    static boolean containsLongitude(double d, double d2, double d3) {
        boolean z = false;
        if (d >= d2) {
            if (d3 <= d && d3 >= d2) {
                z = true;
            }
            return z;
        }
        if (d3 < d || d3 > d2) {
            z = true;
        }
        return z;
    }

    public int describeContents() {
        return 0;
    }

    LatLngBounds(double d, double d2, double d3, double d4) {
        this.latitudeNorth = d;
        this.longitudeEast = d2;
        this.latitudeSouth = d3;
        this.longitudeWest = d4;
    }

    public static LatLngBounds world() {
        return from(90.0d, 180.0d, -90.0d, -180.0d);
    }

    public LatLng getCenter() {
        double d;
        double d2 = (this.latitudeNorth + this.latitudeSouth) / 2.0d;
        if (this.longitudeEast >= this.longitudeWest) {
            d = (this.longitudeEast + this.longitudeWest) / 2.0d;
        } else {
            double d3 = ((this.longitudeEast + 360.0d) - this.longitudeWest) / 2.0d;
            d = this.longitudeWest + d3;
            if (d >= 180.0d) {
                d = this.longitudeEast - d3;
            }
        }
        return new LatLng(d2, d);
    }

    public double getLatNorth() {
        return this.latitudeNorth;
    }

    public double getLatSouth() {
        return this.latitudeSouth;
    }

    public double getLonEast() {
        return this.longitudeEast;
    }

    public double getLonWest() {
        return this.longitudeWest;
    }

    public LatLng getSouthWest() {
        return new LatLng(this.latitudeSouth, this.longitudeWest);
    }

    public LatLng getNorthEast() {
        return new LatLng(this.latitudeNorth, this.longitudeEast);
    }

    public LatLng getSouthEast() {
        return new LatLng(this.latitudeSouth, this.longitudeEast);
    }

    public LatLng getNorthWest() {
        return new LatLng(this.latitudeNorth, this.longitudeWest);
    }

    public LatLngSpan getSpan() {
        return new LatLngSpan(getLatitudeSpan(), getLongitudeSpan());
    }

    public double getLatitudeSpan() {
        return Math.abs(this.latitudeNorth - this.latitudeSouth);
    }

    public double getLongitudeSpan() {
        double abs = Math.abs(this.longitudeEast - this.longitudeWest);
        return this.longitudeEast >= this.longitudeWest ? abs : 360.0d - abs;
    }

    static double getLongitudeSpan(double d, double d2) {
        double abs = Math.abs(d - d2);
        return d >= d2 ? abs : 360.0d - abs;
    }

    public boolean isEmptySpan() {
        if (getLongitudeSpan() != 0.0d) {
            if (getLatitudeSpan() != 0.0d) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("N:");
        stringBuilder.append(this.latitudeNorth);
        stringBuilder.append("; E:");
        stringBuilder.append(this.longitudeEast);
        stringBuilder.append("; S:");
        stringBuilder.append(this.latitudeSouth);
        stringBuilder.append("; W:");
        stringBuilder.append(this.longitudeWest);
        return stringBuilder.toString();
    }

    static LatLngBounds fromLatLngs(List<? extends ILatLng> list) {
        double d;
        double d2;
        double d3;
        double d4;
        double latitude;
        double longitude;
        double d5;
        List<? extends ILatLng> list2 = list;
        double longitude2 = ((ILatLng) list2.get(0)).getLongitude();
        double longitude3 = ((ILatLng) list2.get(1)).getLongitude();
        if (Math.abs(longitude2 - longitude3) < 180.0d) {
            if (longitude2 < longitude3) {
                d = longitude2;
                d2 = 90.0d;
                d3 = -90.0d;
                d4 = longitude3;
                for (ILatLng iLatLng : list) {
                    latitude = iLatLng.getLatitude();
                    d2 = Math.min(d2, latitude);
                    d3 = Math.max(d3, latitude);
                    longitude = iLatLng.getLongitude();
                    d5 = longitude;
                    if (containsLongitude(d4, d, longitude)) {
                        longitude2 = d5;
                        if (getLongitudeSpan(longitude2, d) <= getLongitudeSpan(d4, longitude2)) {
                            d4 = longitude2;
                        } else {
                            d = longitude2;
                        }
                    }
                }
                return new LatLngBounds(d3, d4, d2, d);
            }
        } else if (longitude3 < longitude2) {
            d = longitude2;
            d2 = 90.0d;
            d3 = -90.0d;
            d4 = longitude3;
            for (ILatLng iLatLng2 : list) {
                latitude = iLatLng2.getLatitude();
                d2 = Math.min(d2, latitude);
                d3 = Math.max(d3, latitude);
                longitude = iLatLng2.getLongitude();
                d5 = longitude;
                if (containsLongitude(d4, d, longitude)) {
                    longitude2 = d5;
                    if (getLongitudeSpan(longitude2, d) <= getLongitudeSpan(d4, longitude2)) {
                        d = longitude2;
                    } else {
                        d4 = longitude2;
                    }
                }
            }
            return new LatLngBounds(d3, d4, d2, d);
        }
        double d6 = longitude2;
        longitude2 = longitude3;
        longitude3 = d6;
        d = longitude2;
        d2 = 90.0d;
        d3 = -90.0d;
        d4 = longitude3;
        for (ILatLng iLatLng22 : list) {
            latitude = iLatLng22.getLatitude();
            d2 = Math.min(d2, latitude);
            d3 = Math.max(d3, latitude);
            longitude = iLatLng22.getLongitude();
            d5 = longitude;
            if (containsLongitude(d4, d, longitude)) {
                longitude2 = d5;
                if (getLongitudeSpan(longitude2, d) <= getLongitudeSpan(d4, longitude2)) {
                    d4 = longitude2;
                } else {
                    d = longitude2;
                }
            }
        }
        return new LatLngBounds(d3, d4, d2, d);
    }

    public LatLng[] toLatLngs() {
        return new LatLng[]{getNorthEast(), getSouthWest()};
    }

    public static LatLngBounds from(@FloatRange(from = -90.0d, to = 90.0d) double d, double d2, @FloatRange(from = -90.0d, to = 90.0d) double d3, double d4) {
        if (!Double.isNaN(d)) {
            if (!Double.isNaN(d3)) {
                if (!Double.isNaN(d2)) {
                    if (!Double.isNaN(d4)) {
                        if (!Double.isInfinite(d2)) {
                            if (!Double.isInfinite(d4)) {
                                if (d <= 90.0d && d >= -90.0d && d3 <= 90.0d) {
                                    if (d3 >= -90.0d) {
                                        if (d < d3) {
                                            throw new IllegalArgumentException("LatSouth cannot be less than latNorth");
                                        }
                                        return new LatLngBounds(d, LatLng.wrap(d2, -180.0d, 180.0d), d3, LatLng.wrap(d4, -180.0d, 180.0d));
                                    }
                                }
                                throw new IllegalArgumentException("latitude must be between -90 and 90");
                            }
                        }
                        throw new IllegalArgumentException("longitude must not be infinite");
                    }
                }
                throw new IllegalArgumentException("longitude must not be NaN");
            }
        }
        throw new IllegalArgumentException("latitude must not be NaN");
    }

    private static double lat_(int i, int i2) {
        i = 1413754136 - ((((double) i2) * 6.283185307179586d) / Math.pow(2.0d, (double) i));
        return Math.toDegrees(Math.atan((Math.exp(i) - Math.exp(-i)) * 0));
    }

    private static double lon_(int i, int i2) {
        return ((((double) i2) / Math.pow(2.0d, (double) i)) * 0) - 0;
    }

    public static LatLngBounds from(int i, int i2, int i3) {
        return new LatLngBounds(lat_(i, i3), lon_(i, i2 + 1), lat_(i, i3 + 1), lon_(i, i2));
    }

    public LatLngBounds include(LatLng latLng) {
        return new Builder().include(getNorthEast()).include(getSouthWest()).include(latLng).build();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLngBounds)) {
            return false;
        }
        LatLngBounds latLngBounds = (LatLngBounds) obj;
        if (this.latitudeNorth != latLngBounds.getLatNorth() || this.latitudeSouth != latLngBounds.getLatSouth() || this.longitudeEast != latLngBounds.getLonEast() || this.longitudeWest != latLngBounds.getLonWest()) {
            z = false;
        }
        return z;
    }

    private boolean containsLatitude(double d) {
        return (d > this.latitudeNorth || d < this.latitudeSouth) ? 0.0d : Double.MIN_VALUE;
    }

    private boolean containsLongitude(double d) {
        return containsLongitude(this.longitudeEast, this.longitudeWest, d);
    }

    public boolean contains(ILatLng iLatLng) {
        return (!containsLatitude(iLatLng.getLatitude()) || containsLongitude(iLatLng.getLongitude()) == null) ? null : true;
    }

    public boolean contains(LatLngBounds latLngBounds) {
        return (!contains(latLngBounds.getNorthEast()) || contains(latLngBounds.getSouthWest()) == null) ? null : true;
    }

    public LatLngBounds union(LatLngBounds latLngBounds) {
        return union(latLngBounds.getLatNorth(), latLngBounds.getLonEast(), latLngBounds.getLatSouth(), latLngBounds.getLonWest());
    }

    public LatLngBounds union(double d, double d2, double d3, double d4) {
        double d5 = this.latitudeNorth < d ? d : r0.latitudeNorth;
        double d6 = r0.latitudeSouth > d3 ? d3 : r0.latitudeSouth;
        double d7 = d2;
        double d8 = d4;
        if (LatLngSpan.getLongitudeSpan(d7, r0.longitudeWest) < LatLngSpan.getLongitudeSpan(r0.longitudeEast, d8)) {
            return new LatLngBounds(d5, d7, d6, r0.longitudeWest);
        }
        return new LatLngBounds(d5, r0.longitudeEast, d6, d8);
    }

    @Nullable
    public LatLngBounds intersect(LatLngBounds latLngBounds) {
        double max = Math.max(getLonWest(), latLngBounds.getLonWest());
        double min = Math.min(getLonEast(), latLngBounds.getLonEast());
        if (min > max) {
            double max2 = Math.max(getLatSouth(), latLngBounds.getLatSouth());
            double min2 = Math.min(getLatNorth(), latLngBounds.getLatNorth());
            if (min2 > max2) {
                return new LatLngBounds(min2, min, max2, max);
            }
        }
        return null;
    }

    public LatLngBounds intersect(double d, double d2, double d3, double d4) {
        return intersect(new LatLngBounds(d, d2, d3, d4));
    }

    public int hashCode() {
        return (int) ((((this.latitudeNorth + 90.0d) + ((this.latitudeSouth + 90.0d) * 1000.0d)) + ((this.longitudeEast + 180.0d) * 1000000.0d)) + ((this.longitudeEast + 180.0d) * 1.0E9d));
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.latitudeNorth);
        parcel.writeDouble(this.longitudeEast);
        parcel.writeDouble(this.latitudeSouth);
        parcel.writeDouble(this.longitudeWest);
    }

    private static LatLngBounds readFromParcel(Parcel parcel) {
        return new LatLngBounds(parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble());
    }
}
