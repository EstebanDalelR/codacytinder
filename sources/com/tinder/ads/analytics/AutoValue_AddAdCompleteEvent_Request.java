package com.tinder.ads.analytics;

import android.support.annotation.Nullable;
import com.tinder.ads.analytics.AddAdCompleteEvent.Request;

final class AutoValue_AddAdCompleteEvent_Request extends Request {
    private final Number carouselLength;
    private final String format;

    static final class Builder extends com.tinder.ads.analytics.AddAdCompleteEvent.Request.Builder {
        private Number carouselLength;
        private String format;

        Builder() {
        }

        Builder(Request request) {
            this.carouselLength = request.carouselLength();
            this.format = request.format();
        }

        public com.tinder.ads.analytics.AddAdCompleteEvent.Request.Builder carouselLength(@Nullable Number number) {
            this.carouselLength = number;
            return this;
        }

        public com.tinder.ads.analytics.AddAdCompleteEvent.Request.Builder format(@Nullable String str) {
            this.format = str;
            return this;
        }

        public Request build() {
            return new AutoValue_AddAdCompleteEvent_Request(this.carouselLength, this.format);
        }
    }

    private AutoValue_AddAdCompleteEvent_Request(@Nullable Number number, @Nullable String str) {
        this.carouselLength = number;
        this.format = str;
    }

    @Nullable
    public Number carouselLength() {
        return this.carouselLength;
    }

    @Nullable
    public String format() {
        return this.format;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Request{carouselLength=");
        stringBuilder.append(this.carouselLength);
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
        r1 = r5 instanceof com.tinder.ads.analytics.AddAdCompleteEvent.Request;
        r2 = 0;
        if (r1 == 0) goto L_0x003c;
    L_0x0009:
        r5 = (com.tinder.ads.analytics.AddAdCompleteEvent.Request) r5;
        r1 = r4.carouselLength;
        if (r1 != 0) goto L_0x0016;
    L_0x000f:
        r1 = r5.carouselLength();
        if (r1 != 0) goto L_0x003a;
    L_0x0015:
        goto L_0x0022;
    L_0x0016:
        r1 = r4.carouselLength;
        r3 = r5.carouselLength();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x003a;
    L_0x0022:
        r1 = r4.format;
        if (r1 != 0) goto L_0x002d;
    L_0x0026:
        r5 = r5.format();
        if (r5 != 0) goto L_0x003a;
    L_0x002c:
        goto L_0x003b;
    L_0x002d:
        r1 = r4.format;
        r5 = r5.format();
        r5 = r1.equals(r5);
        if (r5 == 0) goto L_0x003a;
    L_0x0039:
        goto L_0x003b;
    L_0x003a:
        r0 = 0;
    L_0x003b:
        return r0;
    L_0x003c:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.ads.analytics.AutoValue_AddAdCompleteEvent_Request.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((this.carouselLength == null ? 0 : this.carouselLength.hashCode()) ^ 1000003) * 1000003;
        if (this.format != null) {
            i = this.format.hashCode();
        }
        return hashCode ^ i;
    }
}
