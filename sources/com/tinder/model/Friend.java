package com.tinder.model;

import com.google.gson.annotations.SerializedName;
import java.util.Arrays;
import java.util.List;

public class Friend {
    @SerializedName("in_squad")
    private boolean mIsInGroup;
    @SerializedName("name")
    private String mName;
    @SerializedName("photo")
    private List<ProfilePhoto> mPhotos;
    @SerializedName("user_id")
    private String mUserId;

    public Friend(String str, List<ProfilePhoto> list) {
        this.mName = str;
        this.mPhotos = list;
    }

    public Friend(String str, String str2, boolean z, List<ProfilePhoto> list) {
        this.mUserId = str;
        this.mName = str2;
        this.mIsInGroup = z;
        this.mPhotos = list;
    }

    public String getUserId() {
        return this.mUserId;
    }

    public String getName() {
        return this.mName;
    }

    public boolean isInGroup() {
        return this.mIsInGroup;
    }

    public List<ProfilePhoto> getPhotos() {
        return this.mPhotos;
    }

    public String toString() {
        return String.format("Name[%s] User ID [%s] In Group? [%s]", new Object[]{this.mName, this.mUserId, Boolean.valueOf(this.mIsInGroup)});
    }

    public boolean equals(Object obj) {
        return (!(obj instanceof Friend) || ((Friend) obj).getUserId().equals(this.mUserId) == null) ? null : true;
    }

    public int hashCode() {
        return Arrays.hashCode(new String[]{this.mUserId, this.mName});
    }
}
