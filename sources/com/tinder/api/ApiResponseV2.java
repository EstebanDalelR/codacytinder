package com.tinder.api;

import com.google.gson.annotations.SerializedName;

public class ApiResponseV2 {
    private ApiError error;
    private ApiMeta meta;

    public static class ApiError {
        @SerializedName("code")
        String errorCode;

        public String getErrorCode() {
            return this.errorCode;
        }
    }

    public static class ApiMeta {
        @SerializedName("status")
        int statusCode;

        public int getStatusCode() {
            return this.statusCode;
        }
    }

    public ApiMeta getMeta() {
        return this.meta;
    }

    public ApiError getError() {
        return this.error;
    }
}
