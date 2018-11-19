package com.snapchat.kit.sdk.core.models;

import com.google.gson.annotations.SerializedName;

public class UserDataError {
    @SerializedName("errorType")
    private String mErrorType;

    public String getErrorType() {
        return this.mErrorType;
    }
}
