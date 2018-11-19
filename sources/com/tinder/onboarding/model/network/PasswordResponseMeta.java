package com.tinder.onboarding.model.network;

import com.google.gson.annotations.SerializedName;

public class PasswordResponseMeta {
    @SerializedName("has_password")
    private boolean hasPassword;

    PasswordResponseMeta() {
    }

    public boolean hasPassword() {
        return this.hasPassword;
    }
}
