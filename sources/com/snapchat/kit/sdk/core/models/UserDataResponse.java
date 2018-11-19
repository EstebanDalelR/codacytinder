package com.snapchat.kit.sdk.core.models;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

public class UserDataResponse {
    @SerializedName("data")
    private UserData mData;
    @SerializedName("errors")
    private List<UserDataError> mErrors;

    public UserData getData() {
        return this.mData;
    }

    private List<UserDataError> getErrors() {
        if (this.mErrors == null) {
            this.mErrors = new ArrayList();
        }
        return this.mErrors;
    }

    public boolean hasError() {
        return getErrors().isEmpty() ^ 1;
    }
}
