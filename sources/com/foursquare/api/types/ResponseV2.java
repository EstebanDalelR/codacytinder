package com.foursquare.api.types;

import java.io.Serializable;

public class ResponseV2<T extends FoursquareType> implements FoursquareType, Serializable {
    private T mResult;
    private Meta meta;

    public static class Meta implements FoursquareType {
        private int code;
        private String errorDetail;
        private String errorMessage;
        private String errorType;
        private String requestId;

        public int getCode() {
            return this.code;
        }

        public void setCode(int i) {
            this.code = i;
        }

        public void setErrorDetail(String str) {
            this.errorDetail = str;
        }

        public String getErrorDetail() {
            return this.errorDetail;
        }

        public void setErrorMessage(String str) {
            this.errorMessage = str;
        }

        public String getErrorMessage() {
            return this.errorMessage;
        }

        public String getRequestId() {
            return this.requestId;
        }

        public void setRequestId(String str) {
            this.requestId = str;
        }

        public void setErrorType(String str) {
            this.errorType = str;
        }

        public String getErrorType() {
            return this.errorType;
        }
    }

    public Meta getMeta() {
        return this.meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public T getResult() {
        return this.mResult;
    }

    public void setResult(T t) {
        this.mResult = t;
    }

    public String getRequestId() {
        return getMeta() != null ? getMeta().getRequestId() : null;
    }
}
