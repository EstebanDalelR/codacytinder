package com.tinder.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.io.Serializable;

public class InstagramPhoto extends Photo implements Parcelable, Serializable {
    public static final Creator<InstagramPhoto> CREATOR = new C99231();
    public String mLink;
    public long mTimestamp;
    public String mUrlLarge;
    public String mUrlSmall;

    /* renamed from: com.tinder.model.InstagramPhoto$1 */
    static class C99231 implements Creator<InstagramPhoto> {
        C99231() {
        }

        public InstagramPhoto createFromParcel(Parcel parcel) {
            return new InstagramPhoto(parcel);
        }

        public InstagramPhoto[] newArray(int i) {
            return new InstagramPhoto[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.mTimestamp);
        parcel.writeString(this.mLink);
        parcel.writeString(this.mUrlLarge);
        parcel.writeString(this.mUrlSmall);
    }

    protected InstagramPhoto(Parcel parcel) {
        this.mTimestamp = parcel.readLong();
        this.mLink = parcel.readString();
        this.mUrlLarge = parcel.readString();
        this.mUrlSmall = parcel.readString();
    }
}
