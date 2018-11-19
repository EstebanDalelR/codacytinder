package com.tinder.ads.analytics;

import android.support.annotation.Nullable;
import com.tinder.ads.analytics.AddAdPlayEvent.Request;

final class AutoValue_AddAdPlayEvent_Request extends Request {
    private final String format;
    private final String otherId;
    private final Integer progress;

    static final class Builder extends com.tinder.ads.analytics.AddAdPlayEvent.Request.Builder {
        private String format;
        private String otherId;
        private Integer progress;

        Builder() {
        }

        Builder(Request request) {
            this.otherId = request.otherId();
            this.progress = request.progress();
            this.format = request.format();
        }

        public com.tinder.ads.analytics.AddAdPlayEvent.Request.Builder otherId(@Nullable String str) {
            this.otherId = str;
            return this;
        }

        public com.tinder.ads.analytics.AddAdPlayEvent.Request.Builder progress(@Nullable Integer num) {
            this.progress = num;
            return this;
        }

        public com.tinder.ads.analytics.AddAdPlayEvent.Request.Builder format(@Nullable String str) {
            this.format = str;
            return this;
        }

        public Request build() {
            return new AutoValue_AddAdPlayEvent_Request(this.otherId, this.progress, this.format);
        }
    }

    private AutoValue_AddAdPlayEvent_Request(@Nullable String str, @Nullable Integer num, @Nullable String str2) {
        this.otherId = str;
        this.progress = num;
        this.format = str2;
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
    public String format() {
        return this.format;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Request{otherId=");
        stringBuilder.append(this.otherId);
        stringBuilder.append(", progress=");
        stringBuilder.append(this.progress);
        stringBuilder.append(", format=");
        stringBuilder.append(this.format);
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
        r1 = r5 instanceof com.tinder.ads.analytics.AddAdPlayEvent.Request;
        r2 = 0;
        if (r1 == 0) goto L_0x0053;
    L_0x0009:
        r5 = (com.tinder.ads.analytics.AddAdPlayEvent.Request) r5;
        r1 = r4.otherId;
        if (r1 != 0) goto L_0x0016;
    L_0x000f:
        r1 = r5.otherId();
        if (r1 != 0) goto L_0x0051;
    L_0x0015:
        goto L_0x0022;
    L_0x0016:
        r1 = r4.otherId;
        r3 = r5.otherId();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0051;
    L_0x0022:
        r1 = r4.progress;
        if (r1 != 0) goto L_0x002d;
    L_0x0026:
        r1 = r5.progress();
        if (r1 != 0) goto L_0x0051;
    L_0x002c:
        goto L_0x0039;
    L_0x002d:
        r1 = r4.progress;
        r3 = r5.progress();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0051;
    L_0x0039:
        r1 = r4.format;
        if (r1 != 0) goto L_0x0044;
    L_0x003d:
        r5 = r5.format();
        if (r5 != 0) goto L_0x0051;
    L_0x0043:
        goto L_0x0052;
    L_0x0044:
        r1 = r4.format;
        r5 = r5.format();
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
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.ads.analytics.AutoValue_AddAdPlayEvent_Request.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((this.otherId == null ? 0 : this.otherId.hashCode()) ^ 1000003) * 1000003) ^ (this.progress == null ? 0 : this.progress.hashCode())) * 1000003;
        if (this.format != null) {
            i = this.format.hashCode();
        }
        return hashCode ^ i;
    }
}
