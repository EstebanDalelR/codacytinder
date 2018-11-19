package com.tinder.ads.analytics;

import android.support.annotation.Nullable;
import com.tinder.ads.analytics.AddAdSelectEvent.Request;

final class AutoValue_AddAdSelectEvent_Request extends Request {
    private final int action;
    private final Float progress;
    private final Integer timeViewed;

    static final class Builder extends com.tinder.ads.analytics.AddAdSelectEvent.Request.Builder {
        private Integer action;
        private Float progress;
        private Integer timeViewed;

        Builder() {
        }

        Builder(Request request) {
            this.timeViewed = request.timeViewed();
            this.progress = request.progress();
            this.action = Integer.valueOf(request.action());
        }

        public com.tinder.ads.analytics.AddAdSelectEvent.Request.Builder timeViewed(@Nullable Integer num) {
            this.timeViewed = num;
            return this;
        }

        public com.tinder.ads.analytics.AddAdSelectEvent.Request.Builder progress(@Nullable Float f) {
            this.progress = f;
            return this;
        }

        public com.tinder.ads.analytics.AddAdSelectEvent.Request.Builder action(int i) {
            this.action = Integer.valueOf(i);
            return this;
        }

        public Request build() {
            String str = "";
            if (this.action == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" action");
                str = stringBuilder.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_AddAdSelectEvent_Request(this.timeViewed, this.progress, this.action.intValue());
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Missing required properties:");
            stringBuilder2.append(str);
            throw new IllegalStateException(stringBuilder2.toString());
        }
    }

    private AutoValue_AddAdSelectEvent_Request(@Nullable Integer num, @Nullable Float f, int i) {
        this.timeViewed = num;
        this.progress = f;
        this.action = i;
    }

    @Nullable
    public Integer timeViewed() {
        return this.timeViewed;
    }

    @Nullable
    public Float progress() {
        return this.progress;
    }

    public int action() {
        return this.action;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Request{timeViewed=");
        stringBuilder.append(this.timeViewed);
        stringBuilder.append(", progress=");
        stringBuilder.append(this.progress);
        stringBuilder.append(", action=");
        stringBuilder.append(this.action);
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
        r1 = r5 instanceof com.tinder.ads.analytics.AddAdSelectEvent.Request;
        r2 = 0;
        if (r1 == 0) goto L_0x0044;
    L_0x0009:
        r5 = (com.tinder.ads.analytics.AddAdSelectEvent.Request) r5;
        r1 = r4.timeViewed;
        if (r1 != 0) goto L_0x0016;
    L_0x000f:
        r1 = r5.timeViewed();
        if (r1 != 0) goto L_0x0042;
    L_0x0015:
        goto L_0x0022;
    L_0x0016:
        r1 = r4.timeViewed;
        r3 = r5.timeViewed();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0042;
    L_0x0022:
        r1 = r4.progress;
        if (r1 != 0) goto L_0x002d;
    L_0x0026:
        r1 = r5.progress();
        if (r1 != 0) goto L_0x0042;
    L_0x002c:
        goto L_0x0039;
    L_0x002d:
        r1 = r4.progress;
        r3 = r5.progress();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0042;
    L_0x0039:
        r1 = r4.action;
        r5 = r5.action();
        if (r1 != r5) goto L_0x0042;
    L_0x0041:
        goto L_0x0043;
    L_0x0042:
        r0 = 0;
    L_0x0043:
        return r0;
    L_0x0044:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.ads.analytics.AutoValue_AddAdSelectEvent_Request.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((this.timeViewed == null ? 0 : this.timeViewed.hashCode()) ^ 1000003) * 1000003;
        if (this.progress != null) {
            i = this.progress.hashCode();
        }
        return ((hashCode ^ i) * 1000003) ^ this.action;
    }
}
