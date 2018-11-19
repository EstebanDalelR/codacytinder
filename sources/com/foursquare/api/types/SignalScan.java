package com.foursquare.api.types;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class SignalScan implements Parcelable, FoursquareType {
    public static final Creator<SignalScan> CREATOR = new C19051();
    private boolean iBeacon;
    private int iBeaconScanDuration;
    private boolean light;
    private boolean pressure;
    private boolean wifi;

    /* renamed from: com.foursquare.api.types.SignalScan$1 */
    class C19051 implements Creator<SignalScan> {
        C19051() {
        }

        public SignalScan createFromParcel(Parcel parcel) {
            return new SignalScan(parcel);
        }

        public SignalScan[] newArray(int i) {
            return new SignalScan[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public SignalScan(Parcel parcel) {
        boolean z = false;
        this.wifi = parcel.readInt() == 1;
        this.iBeacon = parcel.readInt() == 1;
        this.iBeaconScanDuration = parcel.readInt();
        this.pressure = parcel.readInt() == 1;
        if (parcel.readInt() == 1) {
            z = true;
        }
        this.light = z;
    }

    public boolean needsWifiScan() {
        return this.wifi;
    }

    public void setWifi(boolean z) {
        this.wifi = z;
    }

    public boolean needsIBeaconScan() {
        return this.iBeacon;
    }

    public int getiBeaconScanDurationInSeconds() {
        return this.iBeaconScanDuration;
    }

    public void setLight(boolean z) {
        this.light = z;
    }

    public boolean needsScan() {
        if (!this.iBeacon) {
            if (!this.wifi) {
                return false;
            }
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.wifi);
        parcel.writeInt(this.iBeacon);
        parcel.writeInt(this.iBeaconScanDuration);
        parcel.writeInt(this.pressure);
        parcel.writeInt(this.light);
    }
}
