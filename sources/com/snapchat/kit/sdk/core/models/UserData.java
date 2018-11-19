package com.snapchat.kit.sdk.core.models;

import com.google.gson.annotations.SerializedName;

public class UserData {
    @SerializedName("me")
    MeData mMe;

    public MeData getMe() {
        return this.mMe;
    }
}
