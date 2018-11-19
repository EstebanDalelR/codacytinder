package com.tinder.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.annotation.NonNull;
import com.google.gson.annotations.SerializedName;
import com.tinder.enums.UserPhotoSize;

public class ProcessedPhoto implements Parcelable {
    public static final Creator<ProcessedPhoto> CREATOR = new C99301();
    @SerializedName("height")
    public int height;
    @SerializedName("url")
    public String imageUrl;
    public String photoId;
    @NonNull
    public final UserPhotoSize photoSize;
    @SerializedName("width")
    public int width;

    /* renamed from: com.tinder.model.ProcessedPhoto$1 */
    static class C99301 implements Creator<ProcessedPhoto> {
        C99301() {
        }

        public ProcessedPhoto createFromParcel(Parcel parcel) {
            return new ProcessedPhoto(parcel);
        }

        public ProcessedPhoto[] newArray(int i) {
            return new ProcessedPhoto[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public static UserPhotoSize sizeForWidth(int i) {
        if (i <= 84) {
            return UserPhotoSize.XSMALL;
        }
        if (i <= 172) {
            return UserPhotoSize.SMALL;
        }
        if (i <= 320) {
            return UserPhotoSize.MED;
        }
        if (i <= 640) {
            return UserPhotoSize.LARGE;
        }
        return UserPhotoSize.XLARGE;
    }

    public ProcessedPhoto(String str, int i, int i2) {
        this.imageUrl = str;
        this.width = i;
        this.height = i2;
        this.photoSize = sizeForWidth(i);
    }

    protected ProcessedPhoto(Parcel parcel) {
        this.imageUrl = parcel.readString();
        this.width = parcel.readInt();
        this.height = parcel.readInt();
        this.photoSize = (UserPhotoSize) parcel.readSerializable();
        this.photoId = parcel.readString();
    }

    public void setPhotoId(String str) {
        this.photoId = str;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.imageUrl);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeSerializable(this.photoSize);
        parcel.writeString(this.photoId);
    }
}
