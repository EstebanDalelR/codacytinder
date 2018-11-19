package com.mapbox.android.telemetry;

import android.os.Build;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.SerializedName;
import com.mapbox.android.telemetry.Event.Type;

class MapLoadEvent extends Event implements Parcelable {
    public static final Creator<MapLoadEvent> CREATOR = new C57881();
    private static final String MAP_LOAD = "map.load";
    private static final String OPERATING_SYSTEM;
    @SerializedName("accessibilityFontScale")
    private Float accessibilityFontScale;
    @SerializedName("batteryLevel")
    private Integer batteryLevel;
    @SerializedName("carrier")
    private String carrier;
    @SerializedName("cellularNetworkType")
    private String cellularNetworkType;
    @SerializedName("created")
    private String created;
    @SerializedName("event")
    private final String event;
    @SerializedName("model")
    private String model;
    @SerializedName("operatingSystem")
    private String operatingSystem;
    @SerializedName("orientation")
    private String orientation;
    @SerializedName("pluggedIn")
    private Boolean pluggedIn;
    @SerializedName("resolution")
    private Float resolution;
    @SerializedName("userId")
    private String userId;
    @SerializedName("wifi")
    private Boolean wifi;

    /* renamed from: com.mapbox.android.telemetry.MapLoadEvent$1 */
    static class C57881 implements Creator<MapLoadEvent> {
        C57881() {
        }

        public MapLoadEvent createFromParcel(Parcel parcel) {
            return new MapLoadEvent(parcel);
        }

        public MapLoadEvent[] newArray(int i) {
            return new MapLoadEvent[i];
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

    MapLoadEvent(String str) {
        this.model = null;
        this.operatingSystem = null;
        this.resolution = null;
        this.accessibilityFontScale = null;
        this.orientation = null;
        this.carrier = null;
        this.wifi = null;
        this.event = MAP_LOAD;
        this.model = Build.MODEL;
        this.operatingSystem = OPERATING_SYSTEM;
        this.created = TelemetryUtils.obtainCurrentDate();
        this.userId = str;
        this.batteryLevel = Integer.valueOf(TelemetryUtils.obtainBatteryLevel());
        this.pluggedIn = Boolean.valueOf(TelemetryUtils.isPluggedIn());
        this.cellularNetworkType = TelemetryUtils.obtainCellularNetworkType();
    }

    Type obtainType() {
        return Type.MAP_LOAD;
    }

    void setResolution(float f) {
        this.resolution = Float.valueOf(f);
    }

    void setAccessibilityFontScale(float f) {
        this.accessibilityFontScale = Float.valueOf(f);
    }

    void setOrientation(String str) {
        this.orientation = str;
    }

    void setCarrier(String str) {
        this.carrier = str;
    }

    void setWifi(boolean z) {
        this.wifi = Boolean.valueOf(z);
    }

    private MapLoadEvent(Parcel parcel) {
        Boolean bool = null;
        this.model = null;
        this.operatingSystem = null;
        this.resolution = null;
        this.accessibilityFontScale = null;
        this.orientation = null;
        this.carrier = null;
        this.wifi = null;
        this.event = parcel.readString();
        this.created = parcel.readString();
        this.userId = parcel.readString();
        this.model = parcel.readString();
        this.operatingSystem = parcel.readString();
        this.resolution = parcel.readByte() == (byte) 0 ? null : Float.valueOf(parcel.readFloat());
        this.accessibilityFontScale = parcel.readByte() == (byte) 0 ? null : Float.valueOf(parcel.readFloat());
        this.orientation = parcel.readString();
        this.batteryLevel = Integer.valueOf(parcel.readInt());
        boolean z = false;
        this.pluggedIn = Boolean.valueOf(parcel.readByte() != (byte) 0);
        this.carrier = parcel.readString();
        this.cellularNetworkType = parcel.readString();
        parcel = parcel.readByte();
        if (parcel != 2) {
            if (parcel != null) {
                z = true;
            }
            bool = Boolean.valueOf(z);
        }
        this.wifi = bool;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.event);
        parcel.writeString(this.created);
        parcel.writeString(this.userId);
        parcel.writeString(this.model);
        parcel.writeString(this.operatingSystem);
        if (this.resolution == 0) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeFloat(this.resolution.floatValue());
        }
        if (this.accessibilityFontScale == 0) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeFloat(this.accessibilityFontScale.floatValue());
        }
        parcel.writeString(this.orientation);
        parcel.writeInt(this.batteryLevel.intValue());
        parcel.writeByte((byte) this.pluggedIn.booleanValue());
        parcel.writeString(this.carrier);
        parcel.writeString(this.cellularNetworkType);
        if (this.wifi == 0) {
            parcel.writeByte(2);
        } else {
            parcel.writeByte((byte) this.wifi.booleanValue());
        }
    }
}
