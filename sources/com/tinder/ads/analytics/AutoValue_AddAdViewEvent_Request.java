package com.tinder.ads.analytics;

import android.support.annotation.Nullable;
import com.tinder.ads.analytics.AddAdViewEvent.Request;

final class AutoValue_AddAdViewEvent_Request extends Request {
    private final Number aspectRatio;
    private final String format;
    private final String otherId;
    private final String thirdPartyTrackingUrl;

    static final class Builder extends com.tinder.ads.analytics.AddAdViewEvent.Request.Builder {
        private Number aspectRatio;
        private String format;
        private String otherId;
        private String thirdPartyTrackingUrl;

        Builder() {
        }

        Builder(Request request) {
            this.aspectRatio = request.aspectRatio();
            this.thirdPartyTrackingUrl = request.thirdPartyTrackingUrl();
            this.format = request.format();
            this.otherId = request.otherId();
        }

        public com.tinder.ads.analytics.AddAdViewEvent.Request.Builder aspectRatio(@Nullable Number number) {
            this.aspectRatio = number;
            return this;
        }

        public com.tinder.ads.analytics.AddAdViewEvent.Request.Builder thirdPartyTrackingUrl(@Nullable String str) {
            this.thirdPartyTrackingUrl = str;
            return this;
        }

        public com.tinder.ads.analytics.AddAdViewEvent.Request.Builder format(@Nullable String str) {
            this.format = str;
            return this;
        }

        public com.tinder.ads.analytics.AddAdViewEvent.Request.Builder otherId(@Nullable String str) {
            this.otherId = str;
            return this;
        }

        public Request build() {
            return new AutoValue_AddAdViewEvent_Request(this.aspectRatio, this.thirdPartyTrackingUrl, this.format, this.otherId);
        }
    }

    private AutoValue_AddAdViewEvent_Request(@Nullable Number number, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.aspectRatio = number;
        this.thirdPartyTrackingUrl = str;
        this.format = str2;
        this.otherId = str3;
    }

    @Nullable
    public Number aspectRatio() {
        return this.aspectRatio;
    }

    @Nullable
    public String thirdPartyTrackingUrl() {
        return this.thirdPartyTrackingUrl;
    }

    @Nullable
    public String format() {
        return this.format;
    }

    @Nullable
    public String otherId() {
        return this.otherId;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Request{aspectRatio=");
        stringBuilder.append(this.aspectRatio);
        stringBuilder.append(", thirdPartyTrackingUrl=");
        stringBuilder.append(this.thirdPartyTrackingUrl);
        stringBuilder.append(", format=");
        stringBuilder.append(this.format);
        stringBuilder.append(", otherId=");
        stringBuilder.append(this.otherId);
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
        r1 = r5 instanceof com.tinder.ads.analytics.AddAdViewEvent.Request;
        r2 = 0;
        if (r1 == 0) goto L_0x006a;
    L_0x0009:
        r5 = (com.tinder.ads.analytics.AddAdViewEvent.Request) r5;
        r1 = r4.aspectRatio;
        if (r1 != 0) goto L_0x0016;
    L_0x000f:
        r1 = r5.aspectRatio();
        if (r1 != 0) goto L_0x0068;
    L_0x0015:
        goto L_0x0022;
    L_0x0016:
        r1 = r4.aspectRatio;
        r3 = r5.aspectRatio();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0068;
    L_0x0022:
        r1 = r4.thirdPartyTrackingUrl;
        if (r1 != 0) goto L_0x002d;
    L_0x0026:
        r1 = r5.thirdPartyTrackingUrl();
        if (r1 != 0) goto L_0x0068;
    L_0x002c:
        goto L_0x0039;
    L_0x002d:
        r1 = r4.thirdPartyTrackingUrl;
        r3 = r5.thirdPartyTrackingUrl();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0068;
    L_0x0039:
        r1 = r4.format;
        if (r1 != 0) goto L_0x0044;
    L_0x003d:
        r1 = r5.format();
        if (r1 != 0) goto L_0x0068;
    L_0x0043:
        goto L_0x0050;
    L_0x0044:
        r1 = r4.format;
        r3 = r5.format();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0068;
    L_0x0050:
        r1 = r4.otherId;
        if (r1 != 0) goto L_0x005b;
    L_0x0054:
        r5 = r5.otherId();
        if (r5 != 0) goto L_0x0068;
    L_0x005a:
        goto L_0x0069;
    L_0x005b:
        r1 = r4.otherId;
        r5 = r5.otherId();
        r5 = r1.equals(r5);
        if (r5 == 0) goto L_0x0068;
    L_0x0067:
        goto L_0x0069;
    L_0x0068:
        r0 = 0;
    L_0x0069:
        return r0;
    L_0x006a:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.ads.analytics.AutoValue_AddAdViewEvent_Request.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((((this.aspectRatio == null ? 0 : this.aspectRatio.hashCode()) ^ 1000003) * 1000003) ^ (this.thirdPartyTrackingUrl == null ? 0 : this.thirdPartyTrackingUrl.hashCode())) * 1000003) ^ (this.format == null ? 0 : this.format.hashCode())) * 1000003;
        if (this.otherId != null) {
            i = this.otherId.hashCode();
        }
        return hashCode ^ i;
    }
}
