package com.tinder.passport.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.SerializedName;

public class LocationName implements Parcelable {
    public static final Creator<LocationName> CREATOR = new C100421();
    @SerializedName("long_name")
    public String mLongName;
    @SerializedName("short_name")
    public String mShortName;

    /* renamed from: com.tinder.passport.model.LocationName$1 */
    static class C100421 implements Creator<LocationName> {
        C100421() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m41090a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m41091a(i);
        }

        /* renamed from: a */
        public LocationName m41090a(Parcel parcel) {
            return new LocationName(parcel);
        }

        /* renamed from: a */
        public LocationName[] m41091a(int i) {
            return new LocationName[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mLongName);
        parcel.writeString(this.mShortName);
    }

    private LocationName(Parcel parcel) {
        this.mLongName = parcel.readString();
        this.mShortName = parcel.readString();
    }
}
