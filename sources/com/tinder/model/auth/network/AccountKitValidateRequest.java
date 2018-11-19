package com.tinder.model.auth.network;

import com.google.gson.annotations.SerializedName;

public class AccountKitValidateRequest {
    @SerializedName("token")
    private String token;

    public AccountKitValidateRequest(String str) {
        this.token = str;
    }
}
