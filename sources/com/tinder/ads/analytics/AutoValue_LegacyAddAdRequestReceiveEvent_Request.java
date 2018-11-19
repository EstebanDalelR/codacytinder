package com.tinder.ads.analytics;

import android.support.annotation.Nullable;
import com.tinder.ads.analytics.LegacyAddAdRequestReceiveEvent.Request;

final class AutoValue_LegacyAddAdRequestReceiveEvent_Request extends Request {
    private final String adBody;
    private final String cta;
    private final String title;

    static final class Builder extends com.tinder.ads.analytics.LegacyAddAdRequestReceiveEvent.Request.Builder {
        private String adBody;
        private String cta;
        private String title;

        Builder() {
        }

        Builder(Request request) {
            this.title = request.title();
            this.cta = request.cta();
            this.adBody = request.adBody();
        }

        public com.tinder.ads.analytics.LegacyAddAdRequestReceiveEvent.Request.Builder title(@Nullable String str) {
            this.title = str;
            return this;
        }

        public com.tinder.ads.analytics.LegacyAddAdRequestReceiveEvent.Request.Builder cta(@Nullable String str) {
            this.cta = str;
            return this;
        }

        public com.tinder.ads.analytics.LegacyAddAdRequestReceiveEvent.Request.Builder adBody(@Nullable String str) {
            this.adBody = str;
            return this;
        }

        public Request build() {
            return new AutoValue_LegacyAddAdRequestReceiveEvent_Request(this.title, this.cta, this.adBody);
        }
    }

    private AutoValue_LegacyAddAdRequestReceiveEvent_Request(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.title = str;
        this.cta = str2;
        this.adBody = str3;
    }

    @Nullable
    public String title() {
        return this.title;
    }

    @Nullable
    public String cta() {
        return this.cta;
    }

    @Nullable
    public String adBody() {
        return this.adBody;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Request{title=");
        stringBuilder.append(this.title);
        stringBuilder.append(", cta=");
        stringBuilder.append(this.cta);
        stringBuilder.append(", adBody=");
        stringBuilder.append(this.adBody);
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
        r1 = r5 instanceof com.tinder.ads.analytics.LegacyAddAdRequestReceiveEvent.Request;
        r2 = 0;
        if (r1 == 0) goto L_0x0053;
    L_0x0009:
        r5 = (com.tinder.ads.analytics.LegacyAddAdRequestReceiveEvent.Request) r5;
        r1 = r4.title;
        if (r1 != 0) goto L_0x0016;
    L_0x000f:
        r1 = r5.title();
        if (r1 != 0) goto L_0x0051;
    L_0x0015:
        goto L_0x0022;
    L_0x0016:
        r1 = r4.title;
        r3 = r5.title();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0051;
    L_0x0022:
        r1 = r4.cta;
        if (r1 != 0) goto L_0x002d;
    L_0x0026:
        r1 = r5.cta();
        if (r1 != 0) goto L_0x0051;
    L_0x002c:
        goto L_0x0039;
    L_0x002d:
        r1 = r4.cta;
        r3 = r5.cta();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0051;
    L_0x0039:
        r1 = r4.adBody;
        if (r1 != 0) goto L_0x0044;
    L_0x003d:
        r5 = r5.adBody();
        if (r5 != 0) goto L_0x0051;
    L_0x0043:
        goto L_0x0052;
    L_0x0044:
        r1 = r4.adBody;
        r5 = r5.adBody();
        r5 = r1.equals(r5);
        if (r5 == 0) goto L_0x0051;
    L_0x0050:
        goto L_0x0052;
    L_0x0051:
        r0 = 0;
    L_0x0052:
        return r0;
    L_0x0053:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.ads.analytics.AutoValue_LegacyAddAdRequestReceiveEvent_Request.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((this.title == null ? 0 : this.title.hashCode()) ^ 1000003) * 1000003) ^ (this.cta == null ? 0 : this.cta.hashCode())) * 1000003;
        if (this.adBody != null) {
            i = this.adBody.hashCode();
        }
        return hashCode ^ i;
    }
}
