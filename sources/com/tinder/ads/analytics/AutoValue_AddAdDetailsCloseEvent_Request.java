package com.tinder.ads.analytics;

import android.support.annotation.NonNull;
import com.tinder.ads.analytics.AddAdDetailsCloseEvent.Request;

final class AutoValue_AddAdDetailsCloseEvent_Request extends Request {
    private final Boolean like;
    private final String method;
    private final String originalUrl;
    private final String otherId;
    private final Boolean paused;
    private final Number progress;
    private final Number timeViewed;
    private final String url;

    static final class Builder extends com.tinder.ads.analytics.AddAdDetailsCloseEvent.Request.Builder {
        private Boolean like;
        private String method;
        private String originalUrl;
        private String otherId;
        private Boolean paused;
        private Number progress;
        private Number timeViewed;
        private String url;

        Builder() {
        }

        Builder(Request request) {
            this.originalUrl = request.originalUrl();
            this.url = request.url();
            this.like = request.like();
            this.method = request.method();
            this.otherId = request.otherId();
            this.paused = request.paused();
            this.progress = request.progress();
            this.timeViewed = request.timeViewed();
        }

        public com.tinder.ads.analytics.AddAdDetailsCloseEvent.Request.Builder originalUrl(String str) {
            this.originalUrl = str;
            return this;
        }

        public com.tinder.ads.analytics.AddAdDetailsCloseEvent.Request.Builder url(String str) {
            this.url = str;
            return this;
        }

        public com.tinder.ads.analytics.AddAdDetailsCloseEvent.Request.Builder like(Boolean bool) {
            this.like = bool;
            return this;
        }

        public com.tinder.ads.analytics.AddAdDetailsCloseEvent.Request.Builder method(String str) {
            this.method = str;
            return this;
        }

        public com.tinder.ads.analytics.AddAdDetailsCloseEvent.Request.Builder otherId(String str) {
            this.otherId = str;
            return this;
        }

        public com.tinder.ads.analytics.AddAdDetailsCloseEvent.Request.Builder paused(Boolean bool) {
            this.paused = bool;
            return this;
        }

        public com.tinder.ads.analytics.AddAdDetailsCloseEvent.Request.Builder progress(Number number) {
            this.progress = number;
            return this;
        }

        public com.tinder.ads.analytics.AddAdDetailsCloseEvent.Request.Builder timeViewed(Number number) {
            this.timeViewed = number;
            return this;
        }

        public Request build() {
            String str = "";
            if (this.originalUrl == null) {
                StringBuilder stringBuilder = new StringBuilder();
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
            if (this.like == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" like");
                str = stringBuilder.toString();
            }
            if (this.method == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" method");
                str = stringBuilder.toString();
            }
            if (this.otherId == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" otherId");
                str = stringBuilder.toString();
            }
            if (this.paused == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" paused");
                str = stringBuilder.toString();
            }
            if (this.progress == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" progress");
                str = stringBuilder.toString();
            }
            if (this.timeViewed == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" timeViewed");
                str = stringBuilder.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_AddAdDetailsCloseEvent_Request(this.originalUrl, this.url, this.like, this.method, this.otherId, this.paused, this.progress, this.timeViewed);
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Missing required properties:");
            stringBuilder2.append(str);
            throw new IllegalStateException(stringBuilder2.toString());
        }
    }

    private AutoValue_AddAdDetailsCloseEvent_Request(String str, String str2, Boolean bool, String str3, String str4, Boolean bool2, Number number, Number number2) {
        this.originalUrl = str;
        this.url = str2;
        this.like = bool;
        this.method = str3;
        this.otherId = str4;
        this.paused = bool2;
        this.progress = number;
        this.timeViewed = number2;
    }

    @NonNull
    public String originalUrl() {
        return this.originalUrl;
    }

    @NonNull
    public String url() {
        return this.url;
    }

    @NonNull
    public Boolean like() {
        return this.like;
    }

    @NonNull
    public String method() {
        return this.method;
    }

    @NonNull
    public String otherId() {
        return this.otherId;
    }

    @NonNull
    public Boolean paused() {
        return this.paused;
    }

    @NonNull
    public Number progress() {
        return this.progress;
    }

    @NonNull
    public Number timeViewed() {
        return this.timeViewed;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Request{originalUrl=");
        stringBuilder.append(this.originalUrl);
        stringBuilder.append(", url=");
        stringBuilder.append(this.url);
        stringBuilder.append(", like=");
        stringBuilder.append(this.like);
        stringBuilder.append(", method=");
        stringBuilder.append(this.method);
        stringBuilder.append(", otherId=");
        stringBuilder.append(this.otherId);
        stringBuilder.append(", paused=");
        stringBuilder.append(this.paused);
        stringBuilder.append(", progress=");
        stringBuilder.append(this.progress);
        stringBuilder.append(", timeViewed=");
        stringBuilder.append(this.timeViewed);
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
        if (!this.originalUrl.equals(request.originalUrl()) || !this.url.equals(request.url()) || !this.like.equals(request.like()) || !this.method.equals(request.method()) || !this.otherId.equals(request.otherId()) || !this.paused.equals(request.paused()) || !this.progress.equals(request.progress()) || this.timeViewed.equals(request.timeViewed()) == null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((((((((((((((this.originalUrl.hashCode() ^ 1000003) * 1000003) ^ this.url.hashCode()) * 1000003) ^ this.like.hashCode()) * 1000003) ^ this.method.hashCode()) * 1000003) ^ this.otherId.hashCode()) * 1000003) ^ this.paused.hashCode()) * 1000003) ^ this.progress.hashCode()) * 1000003) ^ this.timeViewed.hashCode();
    }
}
