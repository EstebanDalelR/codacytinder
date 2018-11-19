package com.mapbox.android.telemetry;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class NavigationNewData implements Parcelable {
    public static final Creator<NavigationNewData> CREATOR = new C58001();
    private Integer newDistanceRemaining;
    private Integer newDurationRemaining;
    private String newGeometry;

    /* renamed from: com.mapbox.android.telemetry.NavigationNewData$1 */
    static class C58001 implements Creator<NavigationNewData> {
        C58001() {
        }

        public NavigationNewData createFromParcel(Parcel parcel) {
            return new NavigationNewData(parcel);
        }

        public NavigationNewData[] newArray(int i) {
            return new NavigationNewData[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public NavigationNewData(int i, int i2, String str) {
        this.newDistanceRemaining = Integer.valueOf(i);
        this.newDurationRemaining = Integer.valueOf(i2);
        this.newGeometry = str;
    }

    Integer getNewDistanceRemaining() {
        return this.newDistanceRemaining;
    }

    Integer getNewDurationRemaining() {
        return this.newDurationRemaining;
    }

    String getNewGeometry() {
        return this.newGeometry;
    }

    private NavigationNewData(Parcel parcel) {
        if (parcel.readByte() == (byte) 0) {
            this.newDistanceRemaining = null;
        } else {
            this.newDistanceRemaining = Integer.valueOf(parcel.readInt());
        }
        if (parcel.readByte() == (byte) 0) {
            this.newDurationRemaining = null;
        } else {
            this.newDurationRemaining = Integer.valueOf(parcel.readInt());
        }
        this.newGeometry = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (this.newDistanceRemaining == 0) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(this.newDistanceRemaining.intValue());
        }
        if (this.newDurationRemaining == 0) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(this.newDurationRemaining.intValue());
        }
        parcel.writeString(this.newGeometry);
    }
}
