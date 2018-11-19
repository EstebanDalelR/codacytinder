package com.tinder.onboarding.model.network;

import com.google.gson.annotations.SerializedName;

public class PasswordRequestMeta {
    @SerializedName("no_change")
    private boolean passwordUnChanged;

    PasswordRequestMeta() {
    }

    public PasswordRequestMeta(boolean z) {
        this.passwordUnChanged = z;
    }

    public boolean hasPasswordUnChanged() {
        return this.passwordUnChanged;
    }
}
