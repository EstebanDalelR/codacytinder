package com.tinder.ads.analytics;

import android.support.annotation.Nullable;
import com.tinder.ads.analytics.AddAdToggleAudioEvent.Request;

final class AutoValue_AddAdToggleAudioEvent_Request extends Request {
    private final Number progress;
    private final Number timeViewed;

    static final class Builder extends com.tinder.ads.analytics.AddAdToggleAudioEvent.Request.Builder {
        private Number progress;
        private Number timeViewed;

        Builder() {
        }

        Builder(Request request) {
            this.progress = request.progress();
            this.timeViewed = request.timeViewed();
        }

        public com.tinder.ads.analytics.AddAdToggleAudioEvent.Request.Builder progress(@Nullable Number number) {
            this.progress = number;
            return this;
        }

        public com.tinder.ads.analytics.AddAdToggleAudioEvent.Request.Builder timeViewed(@Nullable Number number) {
            this.timeViewed = number;
            return this;
        }

        public Request build() {
            return new AutoValue_AddAdToggleAudioEvent_Request(this.progress, this.timeViewed);
        }
    }

    private AutoValue_AddAdToggleAudioEvent_Request(@Nullable Number number, @Nullable Number number2) {
        this.progress = number;
        this.timeViewed = number2;
    }

    @Nullable
    public Number progress() {
        return this.progress;
    }

    @Nullable
    public Number timeViewed() {
        return this.timeViewed;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Request{progress=");
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
        r1 = r5 instanceof com.tinder.ads.analytics.AddAdToggleAudioEvent.Request;
        r2 = 0;
        if (r1 == 0) goto L_0x003c;
    L_0x0009:
        r5 = (com.tinder.ads.analytics.AddAdToggleAudioEvent.Request) r5;
        r1 = r4.progress;
        if (r1 != 0) goto L_0x0016;
    L_0x000f:
        r1 = r5.progress();
        if (r1 != 0) goto L_0x003a;
    L_0x0015:
        goto L_0x0022;
    L_0x0016:
        r1 = r4.progress;
        r3 = r5.progress();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x003a;
    L_0x0022:
        r1 = r4.timeViewed;
        if (r1 != 0) goto L_0x002d;
    L_0x0026:
        r5 = r5.timeViewed();
        if (r5 != 0) goto L_0x003a;
    L_0x002c:
        goto L_0x003b;
    L_0x002d:
        r1 = r4.timeViewed;
        r5 = r5.timeViewed();
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
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.ads.analytics.AutoValue_AddAdToggleAudioEvent_Request.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((this.progress == null ? 0 : this.progress.hashCode()) ^ 1000003) * 1000003;
        if (this.timeViewed != null) {
            i = this.timeViewed.hashCode();
        }
        return hashCode ^ i;
    }
}
