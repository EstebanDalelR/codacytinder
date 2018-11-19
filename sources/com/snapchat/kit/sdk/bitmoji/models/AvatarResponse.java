package com.snapchat.kit.sdk.bitmoji.models;

import com.google.gson.annotations.SerializedName;

public class AvatarResponse {
    @SerializedName("avatar_version_uuid")
    protected String avatarId;

    public final String getAvatarId() {
        return this.avatarId;
    }
}
