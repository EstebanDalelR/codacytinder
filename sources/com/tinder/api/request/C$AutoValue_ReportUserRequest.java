package com.tinder.api.request;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

/* renamed from: com.tinder.api.request.$AutoValue_ReportUserRequest */
abstract class C$AutoValue_ReportUserRequest extends ReportUserRequest {
    private final Integer cause;
    private final String text;

    static final class Builder extends com.tinder.api.request.ReportUserRequest.Builder {
        private Integer cause;
        private String text;

        Builder() {
        }

        Builder(ReportUserRequest reportUserRequest) {
            this.cause = reportUserRequest.cause();
            this.text = reportUserRequest.text();
        }

        public com.tinder.api.request.ReportUserRequest.Builder cause(Integer num) {
            this.cause = num;
            return this;
        }

        public com.tinder.api.request.ReportUserRequest.Builder text(@Nullable String str) {
            this.text = str;
            return this;
        }

        public ReportUserRequest build() {
            String str = "";
            if (this.cause == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" cause");
                str = stringBuilder.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_ReportUserRequest(this.cause, this.text);
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Missing required properties:");
            stringBuilder2.append(str);
            throw new IllegalStateException(stringBuilder2.toString());
        }
    }

    C$AutoValue_ReportUserRequest(Integer num, @Nullable String str) {
        if (num == null) {
            throw new NullPointerException("Null cause");
        }
        this.cause = num;
        this.text = str;
    }

    @NonNull
    public Integer cause() {
        return this.cause;
    }

    @Nullable
    public String text() {
        return this.text;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ReportUserRequest{cause=");
        stringBuilder.append(this.cause);
        stringBuilder.append(", text=");
        stringBuilder.append(this.text);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ReportUserRequest)) {
            return false;
        }
        ReportUserRequest reportUserRequest = (ReportUserRequest) obj;
        if (this.cause.equals(reportUserRequest.cause())) {
            if (this.text == null) {
                if (reportUserRequest.text() == null) {
                    return z;
                }
            } else if (this.text.equals(reportUserRequest.text()) != null) {
                return z;
            }
        }
        z = false;
        return z;
    }

    public int hashCode() {
        return ((this.cause.hashCode() ^ 1000003) * 1000003) ^ (this.text == null ? 0 : this.text.hashCode());
    }
}
