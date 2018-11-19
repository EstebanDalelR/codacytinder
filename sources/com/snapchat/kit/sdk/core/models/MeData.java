package com.snapchat.kit.sdk.core.models;

import com.google.gson.annotations.SerializedName;

public class MeData {
    @SerializedName("displayName")
    private String displayName;
    @SerializedName("externalId")
    private String externalId;
    @SerializedName("bitmoji")
    private UserBitmojiData mBitmojiData;

    public UserBitmojiData getBitmojiData() {
        return this.mBitmojiData;
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public String getExternalId() {
        return this.externalId;
    }
}
