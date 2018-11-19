package com.mapbox.android.telemetry;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class NavigationStepMetadata implements Parcelable {
    public static final Creator<NavigationStepMetadata> CREATOR = new C58021();
    private Integer distance;
    private Integer distanceRemaining;
    private Integer duration;
    private Integer durationRemaining;
    private String previousInstruction;
    private String previousModifier;
    private String previousName;
    private String previousType;
    private String upcomingInstruction;
    private String upcomingModifier;
    private String upcomingName;
    private String upcomingType;

    /* renamed from: com.mapbox.android.telemetry.NavigationStepMetadata$1 */
    static class C58021 implements Creator<NavigationStepMetadata> {
        C58021() {
        }

        public NavigationStepMetadata createFromParcel(Parcel parcel) {
            return new NavigationStepMetadata(parcel);
        }

        public NavigationStepMetadata[] newArray(int i) {
            return new NavigationStepMetadata[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public NavigationStepMetadata() {
        this.upcomingInstruction = null;
        this.upcomingType = null;
        this.upcomingModifier = null;
        this.upcomingName = null;
        this.previousInstruction = null;
        this.previousType = null;
        this.previousModifier = null;
        this.previousName = null;
        this.distance = null;
        this.duration = null;
        this.distanceRemaining = null;
        this.durationRemaining = null;
    }

    public void setUpcomingInstruction(String str) {
        this.upcomingInstruction = str;
    }

    public void setUpcomingType(String str) {
        this.upcomingType = str;
    }

    public void setUpcomingModifier(String str) {
        this.upcomingModifier = str;
    }

    public void setUpcomingName(String str) {
        this.upcomingName = str;
    }

    public void setPreviousInstruction(String str) {
        this.previousInstruction = str;
    }

    public void setPreviousType(String str) {
        this.previousType = str;
    }

    public void setPreviousModifier(String str) {
        this.previousModifier = str;
    }

    public void setPreviousName(String str) {
        this.previousName = str;
    }

    public void setDistance(Integer num) {
        this.distance = num;
    }

    public void setDuration(Integer num) {
        this.duration = num;
    }

    public void setDistanceRemaining(Integer num) {
        this.distanceRemaining = num;
    }

    public void setDurationRemaining(Integer num) {
        this.durationRemaining = num;
    }

    private NavigationStepMetadata(Parcel parcel) {
        Integer num = null;
        this.upcomingInstruction = null;
        this.upcomingType = null;
        this.upcomingModifier = null;
        this.upcomingName = null;
        this.previousInstruction = null;
        this.previousType = null;
        this.previousModifier = null;
        this.previousName = null;
        this.distance = null;
        this.duration = null;
        this.distanceRemaining = null;
        this.durationRemaining = null;
        this.upcomingInstruction = parcel.readString();
        this.upcomingType = parcel.readString();
        this.upcomingModifier = parcel.readString();
        this.upcomingName = parcel.readString();
        this.previousInstruction = parcel.readString();
        this.previousType = parcel.readString();
        this.previousModifier = parcel.readString();
        this.previousName = parcel.readString();
        this.distance = parcel.readByte() == (byte) 0 ? null : Integer.valueOf(parcel.readInt());
        this.duration = parcel.readByte() == (byte) 0 ? null : Integer.valueOf(parcel.readInt());
        this.distanceRemaining = parcel.readByte() == (byte) 0 ? null : Integer.valueOf(parcel.readInt());
        if (parcel.readByte() != (byte) 0) {
            num = Integer.valueOf(parcel.readInt());
        }
        this.durationRemaining = num;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.upcomingInstruction);
        parcel.writeString(this.upcomingType);
        parcel.writeString(this.upcomingModifier);
        parcel.writeString(this.upcomingName);
        parcel.writeString(this.previousInstruction);
        parcel.writeString(this.previousType);
        parcel.writeString(this.previousModifier);
        parcel.writeString(this.previousName);
        if (this.distance == 0) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(this.distance.intValue());
        }
        if (this.duration == 0) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(this.duration.intValue());
        }
        if (this.distanceRemaining == 0) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(this.distanceRemaining.intValue());
        }
        if (this.durationRemaining == 0) {
            parcel.writeByte((byte) 0);
            return;
        }
        parcel.writeByte((byte) 1);
        parcel.writeInt(this.durationRemaining.intValue());
    }
}
