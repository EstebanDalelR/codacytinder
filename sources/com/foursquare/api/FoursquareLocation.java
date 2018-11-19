package com.foursquare.api;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import com.foursquare.internal.util.C1942d;
import com.google.gson.annotations.SerializedName;
import java.text.DateFormat;
import java.util.Calendar;

public final class FoursquareLocation implements Parcelable {
    public static final Creator<FoursquareLocation> CREATOR = new C18901();
    private static final float DEFAULT_SPEED_OR_HEADING_VALUE = -1.0f;
    @SerializedName(alternate = {"mAccuracy"}, value = "accuracy")
    private final float accuracy;
    @SerializedName(alternate = {"mAltitude"}, value = "altitude")
    private final double altitude;
    @SerializedName(alternate = {"mElapsedRealtimeNanos"}, value = "elapsedRealtimeNanos")
    private final long elapsedRealtimeNanos;
    @SerializedName(alternate = {"mHasAccuracy"}, value = "hasAccuracy")
    private final boolean hasAccuracy;
    @SerializedName(alternate = {"mHasAltitude"}, value = "hasAltitude")
    private final boolean hasAltitude;
    @SerializedName("hasHeading")
    private final boolean hasHeading;
    @SerializedName("hasSpeed")
    private final boolean hasSpeed;
    @SerializedName("heading")
    private final float heading;
    @SerializedName(alternate = {"mLat"}, value = "lat")
    private final double lat;
    @SerializedName(alternate = {"mLng"}, value = "lng")
    private final double lng;
    @Nullable
    @SerializedName(alternate = {"mProvider"}, value = "provider")
    private final String provider;
    @SerializedName(alternate = {"mSpeed"}, value = "speed")
    private final float speed;
    @SerializedName(alternate = {"mTime"}, value = "time")
    private final long time;

    /* renamed from: com.foursquare.api.FoursquareLocation$1 */
    class C18901 implements Creator<FoursquareLocation> {
        C18901() {
        }

        public FoursquareLocation createFromParcel(Parcel parcel) {
            return new FoursquareLocation(parcel);
        }

        public FoursquareLocation[] newArray(int i) {
            return new FoursquareLocation[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public FoursquareLocation(double d, double d2, float f, boolean z, double d3, boolean z2, float f2, boolean z3, float f3, boolean z4, @Nullable String str, long j, long j2) {
        this.lat = d;
        this.lng = d2;
        this.accuracy = f;
        this.hasAccuracy = z;
        this.altitude = d3;
        this.hasAltitude = z2;
        this.speed = f2;
        this.hasSpeed = z3;
        this.heading = f3;
        this.hasHeading = z4;
        this.provider = str;
        this.time = j;
        this.elapsedRealtimeNanos = j2;
    }

    public FoursquareLocation(double d, double d2, float f, boolean z, double d3, boolean z2, float f2, @Nullable String str, long j, long j2) {
        this.lat = d;
        this.lng = d2;
        this.accuracy = f;
        this.hasAccuracy = z;
        this.altitude = d3;
        this.hasAltitude = z2;
        this.speed = f2;
        this.hasSpeed = false;
        this.heading = 0.0f;
        this.hasHeading = false;
        this.provider = str;
        this.time = j;
        this.elapsedRealtimeNanos = j2;
    }

    public FoursquareLocation(double d, double d2) {
        this(d, d2, 0, 0);
    }

    @VisibleForTesting
    public FoursquareLocation(double d, double d2, float f) {
        this(d, d2, f, false, 0.0d, false, 0.0f, null, 0, 0);
    }

    public FoursquareLocation(double d, double d2, long j, long j2) {
        this(d, d2, 0.0f, false, 0.0d, false, 0.0f, null, j, j2);
    }

    public FoursquareLocation(@NonNull Location location) {
        this(location.getLatitude(), location.getLongitude(), location.getAccuracy(), location.hasAccuracy(), location.getAltitude(), location.hasAltitude(), location.hasSpeed() ? location.getSpeed() : -1.0f, location.hasSpeed(), location.hasBearing() ? location.getBearing() : -1.0f, location.hasBearing(), location.getProvider(), location.getTime(), C1942d.m6823a() ? location.getElapsedRealtimeNanos() : 0);
    }

    public FoursquareLocation(FoursquareLocation foursquareLocation) {
        this.lat = foursquareLocation.getLat();
        this.lng = foursquareLocation.getLng();
        this.accuracy = foursquareLocation.getAccuracy();
        this.hasAccuracy = foursquareLocation.hasAccuracy();
        this.altitude = foursquareLocation.getAltitude();
        this.hasAltitude = foursquareLocation.hasAltitude();
        this.speed = foursquareLocation.getSpeed();
        this.hasSpeed = foursquareLocation.hasSpeed();
        this.heading = foursquareLocation.getHeading();
        this.hasHeading = foursquareLocation.hasHeading();
        this.provider = foursquareLocation.getProvider();
        this.time = foursquareLocation.getTime();
        this.elapsedRealtimeNanos = foursquareLocation.getElapsedRealtimeNanos();
    }

    public float getSpeed() {
        return this.speed;
    }

    public float getHeading() {
        return this.heading;
    }

    public boolean hasSpeed() {
        return this.hasSpeed;
    }

    public boolean hasHeading() {
        return this.hasHeading;
    }

    public double getLat() {
        return this.lat;
    }

    public double getLng() {
        return this.lng;
    }

    public float getAccuracy() {
        return this.accuracy;
    }

    public double getAltitude() {
        return this.altitude;
    }

    public long getTime() {
        return this.time;
    }

    public long getElapsedRealtimeNanos() {
        return this.elapsedRealtimeNanos;
    }

    @Nullable
    public String getProvider() {
        return this.provider;
    }

    public boolean hasAltitude() {
        return this.hasAltitude;
    }

    public boolean hasAccuracy() {
        return this.hasAccuracy;
    }

    public boolean isValid() {
        return (Double.isNaN(this.lat) || this.lat == 0.0d || Double.isNaN(this.lng) || this.lng == 0.0d) ? false : true;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("FoursquareLocation: { ");
        stringBuilder.append("lat,lng(");
        stringBuilder.append(getLat());
        stringBuilder.append(",");
        stringBuilder.append(getLng());
        stringBuilder.append(")");
        if (hasAccuracy()) {
            stringBuilder.append(", accuracy(");
            stringBuilder.append(getAccuracy());
            stringBuilder.append(")");
        }
        if (hasAltitude()) {
            stringBuilder.append(", altitude(");
            stringBuilder.append(getAltitude());
            stringBuilder.append(")");
        }
        if (hasSpeed()) {
            stringBuilder.append(", speed(");
            stringBuilder.append(getSpeed());
            stringBuilder.append(")");
        }
        if (hasHeading()) {
            stringBuilder.append(", heading(");
            stringBuilder.append(getHeading());
            stringBuilder.append(")");
        }
        stringBuilder.append(", time(");
        stringBuilder.append(getTime());
        stringBuilder.append(" - ");
        stringBuilder.append(formatTimestamp(getTime()));
        stringBuilder.append(")");
        stringBuilder.append(", elapsedNanos(");
        stringBuilder.append(this.elapsedRealtimeNanos);
        stringBuilder.append(")");
        stringBuilder.append(" }");
        return stringBuilder.toString();
    }

    private static String formatTimestamp(long j) {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        return DateFormat.getDateTimeInstance().format(instance.getTime());
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                FoursquareLocation foursquareLocation = (FoursquareLocation) obj;
                if (Double.compare(foursquareLocation.lat, this.lat) != 0 || Double.compare(foursquareLocation.lng, this.lng) != 0) {
                    return false;
                }
                if (Float.compare(foursquareLocation.accuracy, this.accuracy) != null) {
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
        return (((i * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + (this.accuracy != 0.0f ? Float.floatToIntBits(this.accuracy) : 0);
    }

    private FoursquareLocation(Parcel parcel) {
        this.lat = parcel.readDouble();
        this.lng = parcel.readDouble();
        this.accuracy = parcel.readFloat();
        boolean z = false;
        this.hasAccuracy = parcel.readByte() != (byte) 0;
        this.altitude = parcel.readDouble();
        this.hasAltitude = parcel.readByte() != (byte) 0;
        this.speed = parcel.readFloat();
        this.hasSpeed = parcel.readByte() != (byte) 0;
        this.heading = parcel.readFloat();
        if (parcel.readByte() != (byte) 0) {
            z = true;
        }
        this.hasHeading = z;
        this.provider = parcel.readString();
        this.time = parcel.readLong();
        this.elapsedRealtimeNanos = parcel.readLong();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.lat);
        parcel.writeDouble(this.lng);
        parcel.writeFloat(this.accuracy);
        parcel.writeByte((byte) this.hasAccuracy);
        parcel.writeDouble(this.altitude);
        parcel.writeByte((byte) this.hasAltitude);
        parcel.writeFloat(this.speed);
        parcel.writeByte((byte) this.hasSpeed);
        parcel.writeFloat(this.heading);
        parcel.writeByte((byte) this.hasHeading);
        parcel.writeString(this.provider);
        parcel.writeLong(this.time);
        parcel.writeLong(this.elapsedRealtimeNanos);
    }
}
