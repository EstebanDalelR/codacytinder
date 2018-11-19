package com.tinder.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.io.Serializable;

public class Interest implements Parcelable, Serializable {
    public static final Creator<Interest> CREATOR = new C99241();
    public String id;
    public String name;

    /* renamed from: com.tinder.model.Interest$1 */
    static class C99241 implements Creator<Interest> {
        C99241() {
        }

        public Interest createFromParcel(Parcel parcel) {
            return new Interest(parcel);
        }

        public Interest[] newArray(int i) {
            return new Interest[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public Interest(String str, String str2) {
        this.id = str;
        this.name = str2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.name);
    }

    protected Interest(Parcel parcel) {
        this.id = parcel.readString();
        this.name = parcel.readString();
    }
}
