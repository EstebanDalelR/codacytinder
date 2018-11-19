package com.snapchat.kit.sdk.core.models;

import com.google.gson.annotations.SerializedName;

public class UserBitmojiData {
    @SerializedName("avatar")
    private String mAvatar;
    @SerializedName("packs")
    private String mPacksJson;

    public String getAvatar() {
        return this.mAvatar;
    }

    public String getPacksJson() {
        return this.mPacksJson;
    }
}
