package com.tinder.onboarding.model.network;

import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;

public class OnboardingErrorResponse {
    @SerializedName("error")
    private Data data;
    @SerializedName("meta")
    private ResponseMeta meta;

    public static class Data {
        @SerializedName("data")
        private JsonElement errorData;
        @SerializedName("code")
        private int internalCode;

        public int getInternalCode() {
            return this.internalCode;
        }

        public JsonElement getErrorData() {
            return this.errorData;
        }
    }

    public ResponseMeta getMeta() {
        return this.meta;
    }

    public Data getData() {
        return this.data;
    }
}
