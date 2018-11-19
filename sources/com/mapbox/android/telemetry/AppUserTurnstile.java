package com.mapbox.android.telemetry;

import android.os.Build;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.SerializedName;
import com.mapbox.android.telemetry.Event.Type;

public class AppUserTurnstile extends Event implements Parcelable {
    private static final String APPLICATION_CONTEXT_CANT_BE_NULL = "Create a MapboxTelemetry instance before calling this method.";
    private static final String APP_USER_TURNSTILE = "appUserTurnstile";
    public static final Creator<AppUserTurnstile> CREATOR = new C57741();
    private static final String OPERATING_SYSTEM;
    @SerializedName("created")
    private final String created;
    @SerializedName("enabled.telemetry")
    private final boolean enabledTelemetry;
    @SerializedName("event")
    private final String event;
    @SerializedName("model")
    private String model;
    @SerializedName("operatingSystem")
    private String operatingSystem;
    @SerializedName("sdkIdentifier")
    private final String sdkIdentifier;
    @SerializedName("sdkVersion")
    private final String sdkVersion;
    @SerializedName("userId")
    private final String userId;

    /* renamed from: com.mapbox.android.telemetry.AppUserTurnstile$1 */
    static class C57741 implements Creator<AppUserTurnstile> {
        C57741() {
        }

        public AppUserTurnstile createFromParcel(Parcel parcel) {
            return new AppUserTurnstile(parcel);
        }

        public AppUserTurnstile[] newArray(int i) {
            return new AppUserTurnstile[i];
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

    public AppUserTurnstile(String str, String str2) {
        this.model = null;
        this.operatingSystem = null;
        checkApplicationContext();
        this.event = APP_USER_TURNSTILE;
        this.created = TelemetryUtils.obtainCurrentDate();
        this.userId = TelemetryUtils.retrieveVendorId();
        this.enabledTelemetry = ((Boolean) TelemetryEnabler.TELEMETRY_STATES.get(new TelemetryEnabler(true).obtainTelemetryState())).booleanValue();
        this.sdkIdentifier = str;
        this.sdkVersion = str2;
        this.model = Build.MODEL;
        this.operatingSystem = OPERATING_SYSTEM;
    }

    AppUserTurnstile(String str, String str2, boolean z) {
        this.model = null;
        this.operatingSystem = null;
        checkApplicationContext();
        this.event = APP_USER_TURNSTILE;
        this.created = TelemetryUtils.obtainCurrentDate();
        this.userId = TelemetryUtils.retrieveVendorId();
        this.enabledTelemetry = ((Boolean) TelemetryEnabler.TELEMETRY_STATES.get(new TelemetryEnabler(z).obtainTelemetryState())).booleanValue();
        this.sdkIdentifier = str;
        this.sdkVersion = str2;
        this.model = Build.MODEL;
        this.operatingSystem = OPERATING_SYSTEM;
    }

    Type obtainType() {
        return Type.TURNSTILE;
    }

    private AppUserTurnstile(Parcel parcel) {
        this.model = null;
        this.operatingSystem = null;
        this.event = parcel.readString();
        this.created = parcel.readString();
        this.userId = parcel.readString();
        this.enabledTelemetry = parcel.readByte() != (byte) 0;
        this.sdkIdentifier = parcel.readString();
        this.sdkVersion = parcel.readString();
        this.model = parcel.readString();
        this.operatingSystem = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.event);
        parcel.writeString(this.created);
        parcel.writeString(this.userId);
        parcel.writeByte((byte) this.enabledTelemetry);
        parcel.writeString(this.sdkIdentifier);
        parcel.writeString(this.sdkVersion);
        parcel.writeString(this.model);
        parcel.writeString(this.operatingSystem);
    }

    private void checkApplicationContext() {
        if (MapboxTelemetry.applicationContext == null) {
            throw new IllegalStateException(APPLICATION_CONTEXT_CANT_BE_NULL);
        }
    }
}
