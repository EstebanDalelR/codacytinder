package com.tinder.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import java.io.Serializable;

public class CommonConnection implements Parcelable, Serializable {
    public static final Creator<CommonConnection> CREATOR = new C99191();
    public int degree;
    @Nullable
    public String id;
    @Nullable
    public String imageLarge;
    @Nullable
    public String imageMedium;
    @Nullable
    public String imageSmall;
    @Nullable
    public String name;

    /* renamed from: com.tinder.model.CommonConnection$1 */
    static class C99191 implements Creator<CommonConnection> {
        C99191() {
        }

        public CommonConnection createFromParcel(Parcel parcel) {
            return new CommonConnection(parcel);
        }

        public CommonConnection[] newArray(int i) {
            return new CommonConnection[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public CommonConnection(@Nullable String str, int i, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.id = str;
        this.degree = i;
        this.name = str2;
        this.imageSmall = str3;
        this.imageMedium = str4;
        this.imageLarge = str5;
    }

    @Nullable
    public String getImageForDensity(float f) {
        double d = (double) f;
        if (d <= 0.75d) {
            return this.imageSmall;
        }
        if (f <= 1.0f) {
            return this.imageSmall;
        }
        if (d <= 1.5d) {
            return this.imageMedium;
        }
        if (d <= 2.0d) {
            return this.imageMedium;
        }
        if (d <= 3.0d) {
            return this.imageLarge;
        }
        return this.imageLarge;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeInt(this.degree);
        parcel.writeString(this.name);
        parcel.writeString(this.imageSmall);
        parcel.writeString(this.imageMedium);
        parcel.writeString(this.imageLarge);
    }

    protected CommonConnection(Parcel parcel) {
        this.id = parcel.readString();
        this.degree = parcel.readInt();
        this.name = parcel.readString();
        this.imageSmall = parcel.readString();
        this.imageMedium = parcel.readString();
        this.imageLarge = parcel.readString();
    }
}
