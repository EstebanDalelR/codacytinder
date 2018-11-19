package com.tinder.ads.analytics;

import android.support.annotation.Nullable;
import com.tinder.ads.analytics.AddAdCloseEvent.Request;

final class AutoValue_AddAdCloseEvent_Request extends Request {
    private final boolean like;
    private final String method;
    private final String otherId;
    private final Integer progress;
    private final Integer timeViewed;

    static final class Builder extends com.tinder.ads.analytics.AddAdCloseEvent.Request.Builder {
        private Boolean like;
        private String method;
        private String otherId;
        private Integer progress;
        private Integer timeViewed;

        Builder() {
        }

        Builder(Request request) {
            this.like = Boolean.valueOf(request.like());
            this.method = request.method();
            this.otherId = request.otherId();
            this.progress = request.progress();
            this.timeViewed = request.timeViewed();
        }

        public com.tinder.ads.analytics.AddAdCloseEvent.Request.Builder like(boolean z) {
            this.like = Boolean.valueOf(z);
            return this;
        }

        public com.tinder.ads.analytics.AddAdCloseEvent.Request.Builder method(@Nullable String str) {
            this.method = str;
            return this;
        }

        public com.tinder.ads.analytics.AddAdCloseEvent.Request.Builder otherId(@Nullable String str) {
            this.otherId = str;
            return this;
        }

        public com.tinder.ads.analytics.AddAdCloseEvent.Request.Builder progress(@Nullable Integer num) {
            this.progress = num;
            return this;
        }

        public com.tinder.ads.analytics.AddAdCloseEvent.Request.Builder timeViewed(@Nullable Integer num) {
            this.timeViewed = num;
            return this;
        }

        public Request build() {
            String str = "";
            if (this.like == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" like");
                str = stringBuilder.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_AddAdCloseEvent_Request(this.like.booleanValue(), this.method, this.otherId, this.progress, this.timeViewed);
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Missing required properties:");
            stringBuilder2.append(str);
            throw new IllegalStateException(stringBuilder2.toString());
        }
    }

    private AutoValue_AddAdCloseEvent_Request(boolean z, @Nullable String str, @Nullable String str2, @Nullable Integer num, @Nullable Integer num2) {
        this.like = z;
        this.method = str;
        this.otherId = str2;
        this.progress = num;
        this.timeViewed = num2;
    }

    public boolean like() {
        return this.like;
    }

    @Nullable
    public String method() {
        return this.method;
    }

    @Nullable
    public String otherId() {
        return this.otherId;
    }

    @Nullable
    public Integer progress() {
        return this.progress;
    }

    @Nullable
    public Integer timeViewed() {
        return this.timeViewed;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Request{like=");
        stringBuilder.append(this.like);
        stringBuilder.append(", method=");
        stringBuilder.append(this.method);
        stringBuilder.append(", otherId=");
        stringBuilder.append(this.otherId);
        stringBuilder.append(", progress=");
        stringBuilder.append(this.progress);
        stringBuilder.append(", timeViewed=");
        stringBuilder.append(this.timeViewed);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
        r4 = this;
        r0 = 1;
        if (r5 != r4) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = r5 instanceof com.tinder.ads.analytics.AddAdCloseEvent.Request;
        r2 = 0;
        if (r1 == 0) goto L_0x0072;
    L_0x0009:
        r5 = (com.tinder.ads.analytics.AddAdCloseEvent.Request) r5;
        r1 = r4.like;
        r3 = r5.like();
        if (r1 != r3) goto L_0x0070;
    L_0x0013:
        r1 = r4.method;
        if (r1 != 0) goto L_0x001e;
    L_0x0017:
        r1 = r5.method();
        if (r1 != 0) goto L_0x0070;
    L_0x001d:
        goto L_0x002a;
    L_0x001e:
        r1 = r4.method;
        r3 = r5.method();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0070;
    L_0x002a:
        r1 = r4.otherId;
        if (r1 != 0) goto L_0x0035;
    L_0x002e:
        r1 = r5.otherId();
        if (r1 != 0) goto L_0x0070;
    L_0x0034:
        goto L_0x0041;
    L_0x0035:
        r1 = r4.otherId;
        r3 = r5.otherId();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0070;
    L_0x0041:
        r1 = r4.progress;
        if (r1 != 0) goto L_0x004c;
    L_0x0045:
        r1 = r5.progress();
        if (r1 != 0) goto L_0x0070;
    L_0x004b:
        goto L_0x0058;
    L_0x004c:
        r1 = r4.progress;
        r3 = r5.progress();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0070;
    L_0x0058:
        r1 = r4.timeViewed;
        if (r1 != 0) goto L_0x0063;
    L_0x005c:
        r5 = r5.timeViewed();
        if (r5 != 0) goto L_0x0070;
    L_0x0062:
        goto L_0x0071;
    L_0x0063:
        r1 = r4.timeViewed;
        r5 = r5.timeViewed();
        r5 = r1.equals(r5);
        if (r5 == 0) goto L_0x0070;
    L_0x006f:
        goto L_0x0071;
    L_0x0070:
        r0 = 0;
    L_0x0071:
        return r0;
    L_0x0072:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.ads.analytics.AutoValue_AddAdCloseEvent_Request.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((((((this.like ? 1231 : 1237) ^ 1000003) * 1000003) ^ (this.method == null ? 0 : this.method.hashCode())) * 1000003) ^ (this.otherId == null ? 0 : this.otherId.hashCode())) * 1000003) ^ (this.progress == null ? 0 : this.progress.hashCode())) * 1000003;
        if (this.timeViewed != null) {
            i = this.timeViewed.hashCode();
        }
        return hashCode ^ i;
    }
}
