package com.mapbox.android.telemetry;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Date;

public class NavigationCancelData implements Parcelable {
    public static final Creator<NavigationCancelData> CREATOR = new C57921();
    private String arrivalTimestamp;
    private String comment;
    private Integer rating;

    /* renamed from: com.mapbox.android.telemetry.NavigationCancelData$1 */
    static class C57921 implements Creator<NavigationCancelData> {
        C57921() {
        }

        public NavigationCancelData createFromParcel(Parcel parcel) {
            return new NavigationCancelData(parcel);
        }

        public NavigationCancelData[] newArray(int i) {
            return new NavigationCancelData[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public NavigationCancelData() {
        this.arrivalTimestamp = null;
        this.rating = null;
        this.comment = null;
    }

    public void setArrivalTimestamp(Date date) {
        this.arrivalTimestamp = TelemetryUtils.generateCreateDateFormatted(date);
    }

    String getArrivalTimestamp() {
        return this.arrivalTimestamp;
    }

    Integer getRating() {
        return this.rating;
    }

    public void setRating(Integer num) {
        this.rating = num;
    }

    String getComment() {
        return this.comment;
    }

    public void setComment(String str) {
        this.comment = str;
    }

    private NavigationCancelData(Parcel parcel) {
        Integer num = null;
        this.arrivalTimestamp = null;
        this.rating = null;
        this.comment = null;
        this.arrivalTimestamp = parcel.readString();
        if (parcel.readByte() != (byte) 0) {
            num = Integer.valueOf(parcel.readInt());
        }
        this.rating = num;
        this.comment = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.arrivalTimestamp);
        if (this.rating == 0) {
            parcel.writeByte(0);
        } else {
            parcel.writeByte(1);
            parcel.writeInt(this.rating.intValue());
        }
        parcel.writeString(this.comment);
    }
}
