package com.mapbox.android.telemetry;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.SerializedName;
import com.mapbox.android.telemetry.Event.Type;

class MapClickEvent extends Event implements Parcelable {
    public static final Creator<MapClickEvent> CREATOR = new C57841();
    private static final String MAP_CLICK = "map.click";
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
    @SerializedName("gesture")
    private final String gesture;
    @SerializedName("lat")
    private double latitude;
    @SerializedName("lng")
    private double longitude;
    @SerializedName("orientation")
    private String orientation;
    @SerializedName("pluggedIn")
    private Boolean pluggedIn;
    @SerializedName("wifi")
    private Boolean wifi;
    @SerializedName("zoom")
    private double zoom;

    /* renamed from: com.mapbox.android.telemetry.MapClickEvent$1 */
    static class C57841 implements Creator<MapClickEvent> {
        C57841() {
        }

        public MapClickEvent createFromParcel(Parcel parcel) {
            return new MapClickEvent(parcel);
        }

        public MapClickEvent[] newArray(int i) {
            return new MapClickEvent[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    MapClickEvent(MapState mapState) {
        this.orientation = null;
        this.carrier = null;
        this.wifi = null;
        this.event = MAP_CLICK;
        this.gesture = mapState.getGesture();
        this.latitude = mapState.getLatitude();
        this.longitude = mapState.getLongitude();
        this.zoom = mapState.getZoom();
        this.created = TelemetryUtils.obtainCurrentDate();
        this.batteryLevel = Integer.valueOf(TelemetryUtils.obtainBatteryLevel());
        this.pluggedIn = Boolean.valueOf(TelemetryUtils.isPluggedIn());
        this.cellularNetworkType = TelemetryUtils.obtainCellularNetworkType();
    }

    Type obtainType() {
        return Type.MAP_CLICK;
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

    private MapClickEvent(Parcel parcel) {
        Boolean bool = null;
        this.orientation = null;
        this.carrier = null;
        this.wifi = null;
        this.event = parcel.readString();
        this.created = parcel.readString();
        this.gesture = parcel.readString();
        this.latitude = parcel.readDouble();
        this.longitude = parcel.readDouble();
        this.zoom = parcel.readDouble();
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
        parcel.writeString(this.gesture);
        parcel.writeDouble(this.latitude);
        parcel.writeDouble(this.longitude);
        parcel.writeDouble(this.zoom);
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
