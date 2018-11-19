package com.tinder.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class InstagramDataSet implements Parcelable, Serializable {
    public static final Creator<InstagramDataSet> CREATOR = new C99221();
    public String lastFetchTime;
    public int mediaCount;
    public List<InstagramPhoto> photos = new ArrayList(0);
    public String profileImageUrl;
    public String username;

    /* renamed from: com.tinder.model.InstagramDataSet$1 */
    static class C99221 implements Creator<InstagramDataSet> {
        C99221() {
        }

        public InstagramDataSet createFromParcel(Parcel parcel) {
            return new InstagramDataSet(parcel);
        }

        public InstagramDataSet[] newArray(int i) {
            return new InstagramDataSet[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.lastFetchTime);
        parcel.writeString(this.username);
        parcel.writeString(this.profileImageUrl);
        parcel.writeInt(this.mediaCount);
        parcel.writeList(this.photos);
    }

    protected InstagramDataSet(Parcel parcel) {
        this.lastFetchTime = parcel.readString();
        this.username = parcel.readString();
        this.profileImageUrl = parcel.readString();
        this.mediaCount = parcel.readInt();
        this.photos = new ArrayList();
        parcel.readList(this.photos, List.class.getClassLoader());
    }
}
