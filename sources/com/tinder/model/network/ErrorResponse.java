package com.tinder.model.network;

import com.google.gson.annotations.SerializedName;

public class ErrorResponse {
    @SerializedName("error")
    private Data mData;
    @SerializedName("meta")
    private ResponseMeta mMeta;

    public static class Data {
        @SerializedName("code")
        private int mInternalCode;
        @SerializedName("message")
        private String mMessage;

        public int getInternalCode() {
            return this.mInternalCode;
        }

        public String getMessage() {
            return this.mMessage;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Data{mInternalCode=");
            stringBuilder.append(this.mInternalCode);
            stringBuilder.append(", mMessage='");
            stringBuilder.append(this.mMessage);
            stringBuilder.append('\'');
            stringBuilder.append('}');
            return stringBuilder.toString();
        }
    }

    public ResponseMeta getMeta() {
        return this.mMeta;
    }

    public Data getData() {
        return this.mData;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ErrorResponse{mMeta=");
        stringBuilder.append(this.mMeta);
        stringBuilder.append(", mData=");
        stringBuilder.append(this.mData);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
