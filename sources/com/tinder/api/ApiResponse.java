package com.tinder.api;

import com.google.gson.annotations.SerializedName;

public class ApiResponse<T> extends ApiResponseV2 {
    @SerializedName("data")
    T mData;

    public T getData() {
        return this.mData;
    }
}
