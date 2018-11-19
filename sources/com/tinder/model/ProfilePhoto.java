package com.tinder.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import com.google.gson.annotations.SerializedName;
import com.tinder.enums.UserPhotoSize;
import com.tinder.utils.ad;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ProfilePhoto extends Photo implements Parcelable, Serializable {
    public static final Creator<ProfilePhoto> CREATOR = new C99311();
    public String clientId;
    public String facebookId;
    public String imageUrl;
    public boolean isMain;
    @Nullable
    @SerializedName("processedFiles")
    public List<ProcessedPhoto> processedPhotos = new ArrayList(4);
    @Nullable
    @SerializedName("processedVideos")
    public List<ProcessedVideo> processedVideos = new ArrayList(4);
    public float xDistancePercent;
    public float xOffsetPercent;
    public float yDistancePercent;
    public float yOffsetPercent;

    /* renamed from: com.tinder.model.ProfilePhoto$1 */
    static class C99311 implements Creator<ProfilePhoto> {
        C99311() {
        }

        public ProfilePhoto createFromParcel(Parcel parcel) {
            return new ProfilePhoto(parcel);
        }

        public ProfilePhoto[] newArray(int i) {
            return new ProfilePhoto[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public ProfilePhoto(String str, String str2, @Nullable List<ProcessedPhoto> list) {
        this.imageUrl = str;
        this.photoId = str2;
        this.processedPhotos = list;
    }

    public ProfilePhoto(String str, String str2, @Nullable List<ProcessedPhoto> list, @Nullable List<ProcessedVideo> list2) {
        this.imageUrl = str;
        this.photoId = str2;
        this.processedPhotos = list;
        this.processedVideos = list2;
    }

    public ProfilePhoto(String str, String str2, float f, float f2, float f3, float f4) {
        this.facebookId = str;
        this.imageUrl = str2;
        this.xDistancePercent = f;
        this.yDistancePercent = f2;
        this.xOffsetPercent = f3;
        this.yOffsetPercent = f4;
    }

    public ProfilePhoto(String str) {
        this.clientId = str;
    }

    public ProfilePhoto(String str, @Nullable List<ProcessedPhoto> list) {
        this.photoId = str;
        this.processedPhotos = list;
    }

    public String getPhotoId() {
        return this.photoId;
    }

    @Nullable
    public ProcessedPhoto getProcessedPhoto(UserPhotoSize userPhotoSize) {
        if (this.processedPhotos != null) {
            for (ProcessedPhoto processedPhoto : this.processedPhotos) {
                if (processedPhoto.photoSize == userPhotoSize) {
                    return processedPhoto;
                }
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Failed to find match for photo size: ");
        stringBuilder.append(userPhotoSize);
        ad.c(stringBuilder.toString());
        return null;
    }

    public ProcessedPhoto getProcessedPhoto(UserPhotoSize userPhotoSize, boolean z) {
        if (this.processedPhotos) {
            for (ProcessedPhoto processedPhoto : this.processedPhotos) {
                if (ProcessedPhoto.sizeForWidth(processedPhoto.width) == userPhotoSize) {
                    return processedPhoto;
                }
            }
        }
        z = new StringBuilder();
        z.append("Failed to find match for photo size: ");
        z.append(userPhotoSize);
        ad.c(z.toString());
        return null;
    }

    @Nullable
    public List<ProcessedPhoto> getProcessedPhotos() {
        return this.processedPhotos;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ProfilePhoto{facebookId='");
        stringBuilder.append(this.facebookId);
        stringBuilder.append('\'');
        stringBuilder.append(", imageUrl='");
        stringBuilder.append(this.imageUrl);
        stringBuilder.append('\'');
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    protected ProfilePhoto(Parcel parcel) {
        this.imageUrl = parcel.readString();
        this.facebookId = parcel.readString();
        this.xDistancePercent = parcel.readFloat();
        this.yDistancePercent = parcel.readFloat();
        this.xOffsetPercent = parcel.readFloat();
        this.yOffsetPercent = parcel.readFloat();
        this.processedPhotos = parcel.createTypedArrayList(ProcessedPhoto.CREATOR);
        this.processedVideos = parcel.createTypedArrayList(ProcessedVideo.Companion.getCREATOR());
        this.isMain = parcel.readByte() != null ? true : null;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.imageUrl);
        parcel.writeString(this.facebookId);
        parcel.writeFloat(this.xDistancePercent);
        parcel.writeFloat(this.yDistancePercent);
        parcel.writeFloat(this.xOffsetPercent);
        parcel.writeFloat(this.yOffsetPercent);
        parcel.writeTypedList(this.processedPhotos);
        parcel.writeTypedList(this.processedVideos);
        parcel.writeByte((byte) this.isMain);
    }
}
