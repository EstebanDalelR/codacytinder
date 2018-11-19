package com.mapbox.android.telemetry;

import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.SerializedName;
import com.mapbox.android.telemetry.Event.Type;

class LocationEvent extends Event implements Parcelable {
    public static final Creator<LocationEvent> CREATOR = new C57831();
    private static final String LOCATION = "location";
    private static final String OPERATING_SYSTEM;
    private static final String SOURCE_MAPBOX = "mapbox";
    @SerializedName("horizontalAccuracy")
    private Float accuracy;
    @SerializedName("altitude")
    private Double altitude;
    @SerializedName("applicationState")
    private String applicationState;
    @SerializedName("created")
    private final String created;
    @SerializedName("event")
    private final String event;
    @SerializedName("lat")
    private final double latitude;
    @SerializedName("lng")
    private final double longitude;
    @SerializedName("operatingSystem")
    private String operatingSystem;
    @SerializedName("sessionId")
    private final String sessionId;
    @SerializedName("source")
    private String source;

    /* renamed from: com.mapbox.android.telemetry.LocationEvent$1 */
    static class C57831 implements Creator<LocationEvent> {
        C57831() {
        }

        public LocationEvent createFromParcel(Parcel parcel) {
            return new LocationEvent(parcel);
        }

        public LocationEvent[] newArray(int i) {
            return new LocationEvent[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    static {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Android - ");
        stringBuilder.append(VERSION.RELEASE);
        OPERATING_SYSTEM = stringBuilder.toString();
    }

    public LocationEvent(String str, double d, double d2) {
        this.altitude = null;
        this.accuracy = null;
        this.event = LOCATION;
        this.created = TelemetryUtils.obtainCurrentDate();
        this.source = SOURCE_MAPBOX;
        this.sessionId = str;
        this.latitude = d;
        this.longitude = d2;
        this.operatingSystem = OPERATING_SYSTEM;
        this.applicationState = TelemetryUtils.obtainApplicationState();
    }

    Type obtainType() {
        return Type.LOCATION;
    }

    String getEvent() {
        return this.event;
    }

    String getSource() {
        return this.source;
    }

    double getLatitude() {
        return this.latitude;
    }

    double getLongitude() {
        return this.longitude;
    }

    Double getAltitude() {
        return this.altitude;
    }

    public void setAltitude(Double d) {
        this.altitude = d;
    }

    String getOperatingSystem() {
        return this.operatingSystem;
    }

    Float getAccuracy() {
        return this.accuracy;
    }

    public void setAccuracy(Float f) {
        this.accuracy = f;
    }

    private LocationEvent(Parcel parcel) {
        Float f = null;
        this.altitude = null;
        this.accuracy = null;
        this.event = parcel.readString();
        this.created = parcel.readString();
        this.source = parcel.readString();
        this.sessionId = parcel.readString();
        this.latitude = parcel.readDouble();
        this.longitude = parcel.readDouble();
        this.altitude = parcel.readByte() == (byte) 0 ? null : Double.valueOf(parcel.readDouble());
        this.operatingSystem = parcel.readString();
        this.applicationState = parcel.readString();
        if (parcel.readByte() != (byte) 0) {
            f = Float.valueOf(parcel.readFloat());
        }
        this.accuracy = f;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.event);
        parcel.writeString(this.created);
        parcel.writeString(this.source);
        parcel.writeString(this.sessionId);
        parcel.writeDouble(this.latitude);
        parcel.writeDouble(this.longitude);
        if (this.altitude == 0) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeDouble(this.altitude.doubleValue());
        }
        parcel.writeString(this.operatingSystem);
        parcel.writeString(this.applicationState);
        if (this.accuracy == 0) {
            parcel.writeByte((byte) 0);
            return;
        }
        parcel.writeByte((byte) 1);
        parcel.writeFloat(this.accuracy.floatValue());
    }
}
