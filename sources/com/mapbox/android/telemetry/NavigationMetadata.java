package com.mapbox.android.telemetry;

import android.os.Build;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Date;

public class NavigationMetadata implements Parcelable {
    public static final Creator<NavigationMetadata> CREATOR = new C57991();
    private static final String OPERATING_SYSTEM;
    private int absoluteDistanceToDestination;
    private String applicationState;
    private String audioType;
    private Integer batteryLevel;
    private Boolean batteryPluggedIn;
    private String connectivity;
    private String created;
    private String device;
    private int distanceCompleted;
    private int distanceRemaining;
    private int durationRemaining;
    private Integer estimatedDistance;
    private Integer estimatedDuration;
    private int eventVersion;
    private String geometry;
    private double lat;
    private double lng;
    private String locationEngine;
    private String operatingSystem;
    private Integer originalEstimatedDistance;
    private Integer originalEstimatedDuration;
    private String originalGeometry;
    private String originalRequestIdentifier;
    private Integer originalStepCount;
    private Integer percentTimeInForeground;
    private Integer percentTimeInPortrait;
    private String profile;
    private String requestIdentifier;
    private Integer rerouteCount;
    private Integer screenBrightness;
    private String sdKIdentifier;
    private String sdkVersion;
    private String sessionIdentifier;
    private boolean simulation;
    private String startTimestamp;
    private Integer stepCount;
    private Integer volumeLevel;

    /* renamed from: com.mapbox.android.telemetry.NavigationMetadata$1 */
    static class C57991 implements Creator<NavigationMetadata> {
        C57991() {
        }

        public NavigationMetadata createFromParcel(Parcel parcel) {
            return new NavigationMetadata(parcel);
        }

        public NavigationMetadata[] newArray(int i) {
            return new NavigationMetadata[i];
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

    public NavigationMetadata(Date date, int i, int i2, int i3, String str, String str2, int i4, String str3, double d, double d2, String str4, String str5, boolean z, String str6, int i5) {
        this.percentTimeInPortrait = null;
        this.percentTimeInForeground = null;
        this.estimatedDistance = null;
        this.estimatedDuration = null;
        this.rerouteCount = null;
        this.originalRequestIdentifier = null;
        this.requestIdentifier = null;
        this.originalGeometry = null;
        this.originalEstimatedDistance = null;
        this.originalEstimatedDuration = null;
        this.stepCount = null;
        this.originalStepCount = null;
        this.startTimestamp = TelemetryUtils.generateCreateDateFormatted(date);
        this.distanceCompleted = i;
        this.distanceRemaining = i2;
        this.durationRemaining = i3;
        this.operatingSystem = OPERATING_SYSTEM;
        this.sdKIdentifier = str;
        this.sdkVersion = str2;
        this.eventVersion = i4;
        this.sessionIdentifier = str3;
        this.lat = d;
        this.lng = d2;
        this.geometry = str4;
        this.created = TelemetryUtils.obtainCurrentDate();
        this.profile = str5;
        this.simulation = z;
        this.device = Build.MODEL;
        this.locationEngine = str6;
        this.absoluteDistanceToDestination = i5;
        this.volumeLevel = Integer.valueOf(NavigationUtils.obtainVolumeLevel());
        this.batteryLevel = Integer.valueOf(TelemetryUtils.obtainBatteryLevel());
        this.screenBrightness = Integer.valueOf(NavigationUtils.obtainScreenBrightness());
        this.batteryPluggedIn = Boolean.valueOf(TelemetryUtils.isPluggedIn());
        this.connectivity = TelemetryUtils.obtainCellularNetworkType();
        this.audioType = NavigationUtils.obtainAudioType();
        this.applicationState = TelemetryUtils.obtainApplicationState();
    }

    public void setCreated(Date date) {
        this.created = TelemetryUtils.generateCreateDateFormatted(date);
    }

    String getCreated() {
        return this.created;
    }

    String getStartTimestamp() {
        return this.startTimestamp;
    }

    Integer getDistanceCompleted() {
        return Integer.valueOf(this.distanceCompleted);
    }

    Integer getDistanceRemaining() {
        return Integer.valueOf(this.distanceRemaining);
    }

    Integer getDurationRemaining() {
        return Integer.valueOf(this.durationRemaining);
    }

    String getOperatingSystem() {
        return this.operatingSystem;
    }

    int getEventVersion() {
        return this.eventVersion;
    }

    String getSdKIdentifier() {
        return this.sdKIdentifier;
    }

    String getSdkVersion() {
        return this.sdkVersion;
    }

    String getSessionIdentifier() {
        return this.sessionIdentifier;
    }

    double getLat() {
        return this.lat;
    }

    double getLng() {
        return this.lng;
    }

    String getGeometry() {
        return this.geometry;
    }

    String getProfile() {
        return this.profile;
    }

    Integer getEstimatedDistance() {
        return this.estimatedDistance;
    }

    public void setEstimatedDistance(Integer num) {
        this.estimatedDistance = num;
    }

    Integer getEstimatedDuration() {
        return this.estimatedDuration;
    }

    public void setEstimatedDuration(Integer num) {
        this.estimatedDuration = num;
    }

    Integer getRerouteCount() {
        return this.rerouteCount;
    }

    public void setRerouteCount(Integer num) {
        this.rerouteCount = num;
    }

    boolean isSimulation() {
        return this.simulation;
    }

    String getOriginalRequestIdentifier() {
        return this.originalRequestIdentifier;
    }

    public void setOriginalRequestIdentifier(String str) {
        this.originalRequestIdentifier = str;
    }

    String getRequestIdentifier() {
        return this.requestIdentifier;
    }

    public void setRequestIdentifier(String str) {
        this.requestIdentifier = str;
    }

    String getOriginalGeometry() {
        return this.originalGeometry;
    }

    public void setOriginalGeometry(String str) {
        this.originalGeometry = str;
    }

    Integer getOriginalEstimatedDistance() {
        return this.originalEstimatedDistance;
    }

    public void setOriginalEstimatedDistance(Integer num) {
        this.originalEstimatedDistance = num;
    }

    Integer getOriginalEstimatedDuration() {
        return this.originalEstimatedDuration;
    }

    public void setOriginalEstimatedDuration(Integer num) {
        this.originalEstimatedDuration = num;
    }

    String getAudioType() {
        return this.audioType;
    }

    Integer getStepCount() {
        return this.stepCount;
    }

    public void setStepCount(Integer num) {
        this.stepCount = num;
    }

    Integer getOriginalStepCount() {
        return this.originalStepCount;
    }

    public void setOriginalStepCount(Integer num) {
        this.originalStepCount = num;
    }

    String getDevice() {
        return this.device;
    }

    String getLocationEngine() {
        return this.locationEngine;
    }

    Integer getVolumeLevel() {
        return this.volumeLevel;
    }

    Integer getScreenBrightness() {
        return this.screenBrightness;
    }

    String getApplicationState() {
        return this.applicationState;
    }

    Boolean isBatteryPluggedIn() {
        return this.batteryPluggedIn;
    }

    void setBatteryLevel(Integer num) {
        this.batteryLevel = num;
    }

    Integer getBatteryLevel() {
        return this.batteryLevel;
    }

    String getConnectivity() {
        return this.connectivity;
    }

    int getAbsoluteDistanceToDestination() {
        return this.absoluteDistanceToDestination;
    }

    Integer getPercentTimeInPortrait() {
        return this.percentTimeInPortrait;
    }

    public void setPercentTimeInPortrait(Integer num) {
        this.percentTimeInPortrait = num;
    }

    Integer getPercentTimeInForeground() {
        return this.percentTimeInForeground;
    }

    public void setPercentTimeInForeground(Integer num) {
        this.percentTimeInForeground = num;
    }

    private NavigationMetadata(Parcel parcel) {
        Integer num = null;
        this.percentTimeInPortrait = null;
        this.percentTimeInForeground = null;
        this.estimatedDistance = null;
        this.estimatedDuration = null;
        this.rerouteCount = null;
        this.originalRequestIdentifier = null;
        this.requestIdentifier = null;
        this.originalGeometry = null;
        this.originalEstimatedDistance = null;
        this.originalEstimatedDuration = null;
        this.stepCount = null;
        this.originalStepCount = null;
        this.absoluteDistanceToDestination = parcel.readInt();
        this.percentTimeInPortrait = parcel.readByte() == (byte) 0 ? null : Integer.valueOf(parcel.readInt());
        this.percentTimeInForeground = parcel.readByte() == (byte) 0 ? null : Integer.valueOf(parcel.readInt());
        this.startTimestamp = parcel.readString();
        this.distanceCompleted = parcel.readInt();
        this.distanceRemaining = parcel.readInt();
        this.durationRemaining = parcel.readInt();
        this.operatingSystem = parcel.readString();
        this.eventVersion = parcel.readInt();
        this.sdKIdentifier = parcel.readString();
        this.sdkVersion = parcel.readString();
        this.sessionIdentifier = parcel.readString();
        this.lat = parcel.readDouble();
        this.lng = parcel.readDouble();
        this.geometry = parcel.readString();
        this.created = parcel.readString();
        this.profile = parcel.readString();
        this.estimatedDistance = parcel.readByte() == (byte) 0 ? null : Integer.valueOf(parcel.readInt());
        this.estimatedDuration = parcel.readByte() == (byte) 0 ? null : Integer.valueOf(parcel.readInt());
        this.rerouteCount = parcel.readByte() == (byte) 0 ? null : Integer.valueOf(parcel.readInt());
        boolean z = false;
        this.simulation = parcel.readByte() != (byte) 0;
        this.originalRequestIdentifier = parcel.readString();
        this.requestIdentifier = parcel.readString();
        this.originalGeometry = parcel.readString();
        this.originalEstimatedDistance = parcel.readByte() == (byte) 0 ? null : Integer.valueOf(parcel.readInt());
        this.originalEstimatedDuration = parcel.readByte() == (byte) 0 ? null : Integer.valueOf(parcel.readInt());
        this.audioType = parcel.readString();
        this.stepCount = parcel.readByte() == (byte) 0 ? null : Integer.valueOf(parcel.readInt());
        if (parcel.readByte() != (byte) 0) {
            num = Integer.valueOf(parcel.readInt());
        }
        this.originalStepCount = num;
        this.device = parcel.readString();
        this.locationEngine = parcel.readString();
        this.volumeLevel = Integer.valueOf(parcel.readInt());
        this.screenBrightness = Integer.valueOf(parcel.readInt());
        this.applicationState = parcel.readString();
        if (parcel.readByte() != (byte) 0) {
            z = true;
        }
        this.batteryPluggedIn = Boolean.valueOf(z);
        this.batteryLevel = Integer.valueOf(parcel.readInt());
        this.connectivity = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.absoluteDistanceToDestination);
        if (this.percentTimeInPortrait == 0) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(this.percentTimeInPortrait.intValue());
        }
        if (this.percentTimeInForeground == 0) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(this.percentTimeInForeground.intValue());
        }
        parcel.writeString(this.startTimestamp);
        parcel.writeInt(this.distanceCompleted);
        parcel.writeInt(this.distanceRemaining);
        parcel.writeInt(this.durationRemaining);
        parcel.writeString(this.operatingSystem);
        parcel.writeInt(this.eventVersion);
        parcel.writeString(this.sdKIdentifier);
        parcel.writeString(this.sdkVersion);
        parcel.writeString(this.sessionIdentifier);
        parcel.writeDouble(this.lat);
        parcel.writeDouble(this.lng);
        parcel.writeString(this.geometry);
        parcel.writeString(this.created);
        parcel.writeString(this.profile);
        if (this.estimatedDistance == 0) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(this.estimatedDistance.intValue());
        }
        if (this.estimatedDuration == 0) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(this.estimatedDuration.intValue());
        }
        if (this.rerouteCount == 0) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(this.rerouteCount.intValue());
        }
        parcel.writeByte((byte) this.simulation);
        parcel.writeString(this.originalRequestIdentifier);
        parcel.writeString(this.requestIdentifier);
        parcel.writeString(this.originalGeometry);
        if (this.originalEstimatedDistance == 0) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(this.originalEstimatedDistance.intValue());
        }
        if (this.originalEstimatedDuration == 0) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(this.originalEstimatedDuration.intValue());
        }
        parcel.writeString(this.audioType);
        if (this.stepCount == 0) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(this.stepCount.intValue());
        }
        if (this.originalStepCount == 0) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(this.originalStepCount.intValue());
        }
        parcel.writeString(this.device);
        parcel.writeString(this.locationEngine);
        parcel.writeInt(this.volumeLevel.intValue());
        parcel.writeInt(this.screenBrightness.intValue());
        parcel.writeString(this.applicationState);
        parcel.writeByte((byte) this.batteryPluggedIn.booleanValue());
        parcel.writeInt(this.batteryLevel.intValue());
        parcel.writeString(this.connectivity);
    }
}
