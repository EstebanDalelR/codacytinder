package com.snapchat.kit.sdk.bitmoji.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;
import org.apache.commons.lang3.builder.C17715c;

public class Sticker implements Serializable {
    public static final String FRIENDS_CAPABILITY = "FRIENDS";
    @SerializedName("capabilities")
    @Expose
    private List<String> mCapabilities;
    @SerializedName("comic_id")
    @Expose
    private String mComicId;
    @SerializedName("url")
    @Expose
    private String mImageUrl;
    @SerializedName("tags")
    @Expose
    private List<String> mTags;
    @SerializedName("template_id")
    @Expose
    private String mTemplateId;

    public String getTemplateId() {
        return this.mTemplateId;
    }

    public String getComicId() {
        return this.mComicId;
    }

    public List<String> getTags() {
        return this.mTags;
    }

    public String getImageUrl() {
        return this.mImageUrl;
    }

    public List<String> getCapabilities() {
        return this.mCapabilities;
    }

    public boolean isFriendmoji() {
        return getCapabilities().contains(FRIENDS_CAPABILITY);
    }

    public Sticker(String str, String str2, List<String> list, String str3, List<String> list2) {
        this.mTemplateId = str;
        this.mComicId = str2;
        this.mTags = list;
        this.mImageUrl = str3;
        this.mCapabilities = list2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Sticker)) {
            return null;
        }
        Sticker sticker = (Sticker) obj;
        return new C17715c().a(this.mComicId, sticker.getComicId()).a(this.mImageUrl, sticker.getImageUrl()).a(this.mTags, sticker.getTags()).a();
    }

    public int hashCode() {
        if (this.mImageUrl == null) {
            return 0;
        }
        return this.mImageUrl.hashCode();
    }
}
