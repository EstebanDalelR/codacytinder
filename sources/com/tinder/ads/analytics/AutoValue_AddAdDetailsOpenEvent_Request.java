package com.tinder.ads.analytics;

import com.tinder.ads.analytics.AddAdDetailsOpenEvent.Request;

final class AutoValue_AddAdDetailsOpenEvent_Request extends Request {
    private final String method;
    private final String originalUrl;
    private final String url;

    static final class Builder extends com.tinder.ads.analytics.AddAdDetailsOpenEvent.Request.Builder {
        private String method;
        private String originalUrl;
        private String url;

        Builder() {
        }

        Builder(Request request) {
            this.method = request.method();
            this.originalUrl = request.originalUrl();
            this.url = request.url();
        }

        public com.tinder.ads.analytics.AddAdDetailsOpenEvent.Request.Builder method(String str) {
            this.method = str;
            return this;
        }

        public com.tinder.ads.analytics.AddAdDetailsOpenEvent.Request.Builder originalUrl(String str) {
            this.originalUrl = str;
            return this;
        }

        public com.tinder.ads.analytics.AddAdDetailsOpenEvent.Request.Builder url(String str) {
            this.url = str;
            return this;
        }

        public Request build() {
            String str = "";
            if (this.method == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" method");
                str = stringBuilder.toString();
            }
            if (this.originalUrl == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" originalUrl");
                str = stringBuilder.toString();
            }
            if (this.url == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" url");
                str = stringBuilder.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_AddAdDetailsOpenEvent_Request(this.method, this.originalUrl, this.url);
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Missing required properties:");
            stringBuilder2.append(str);
            throw new IllegalStateException(stringBuilder2.toString());
        }
    }

    private AutoValue_AddAdDetailsOpenEvent_Request(String str, String str2, String str3) {
        this.method = str;
        this.originalUrl = str2;
        this.url = str3;
    }

    public String method() {
        return this.method;
    }

    public String originalUrl() {
        return this.originalUrl;
    }

    public String url() {
        return this.url;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Request{method=");
        stringBuilder.append(this.method);
        stringBuilder.append(", originalUrl=");
        stringBuilder.append(this.originalUrl);
        stringBuilder.append(", url=");
        stringBuilder.append(this.url);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Request)) {
            return false;
        }
        Request request = (Request) obj;
        if (!this.method.equals(request.method()) || !this.originalUrl.equals(request.originalUrl()) || this.url.equals(request.url()) == null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((((this.method.hashCode() ^ 1000003) * 1000003) ^ this.originalUrl.hashCode()) * 1000003) ^ this.url.hashCode();
    }
}
