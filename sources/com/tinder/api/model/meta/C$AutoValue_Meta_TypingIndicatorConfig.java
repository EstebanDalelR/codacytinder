package com.tinder.api.model.meta;

import android.support.annotation.Nullable;
import com.squareup.moshi.Json;
import com.tinder.api.model.meta.Meta.TypingIndicatorConfig;

/* renamed from: com.tinder.api.model.meta.$AutoValue_Meta_TypingIndicatorConfig */
abstract class C$AutoValue_Meta_TypingIndicatorConfig extends TypingIndicatorConfig {
    private final Long typingHeartbeat;
    private final Long typingTimeToLive;

    C$AutoValue_Meta_TypingIndicatorConfig(@Nullable Long l, @Nullable Long l2) {
        this.typingHeartbeat = l;
        this.typingTimeToLive = l2;
    }

    @Nullable
    @Json(name = "typing_heartbeat")
    public Long typingHeartbeat() {
        return this.typingHeartbeat;
    }

    @Nullable
    @Json(name = "typing_ttl")
    public Long typingTimeToLive() {
        return this.typingTimeToLive;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TypingIndicatorConfig{typingHeartbeat=");
        stringBuilder.append(this.typingHeartbeat);
        stringBuilder.append(", typingTimeToLive=");
        stringBuilder.append(this.typingTimeToLive);
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
        r1 = r5 instanceof com.tinder.api.model.meta.Meta.TypingIndicatorConfig;
        r2 = 0;
        if (r1 == 0) goto L_0x003c;
    L_0x0009:
        r5 = (com.tinder.api.model.meta.Meta.TypingIndicatorConfig) r5;
        r1 = r4.typingHeartbeat;
        if (r1 != 0) goto L_0x0016;
    L_0x000f:
        r1 = r5.typingHeartbeat();
        if (r1 != 0) goto L_0x003a;
    L_0x0015:
        goto L_0x0022;
    L_0x0016:
        r1 = r4.typingHeartbeat;
        r3 = r5.typingHeartbeat();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x003a;
    L_0x0022:
        r1 = r4.typingTimeToLive;
        if (r1 != 0) goto L_0x002d;
    L_0x0026:
        r5 = r5.typingTimeToLive();
        if (r5 != 0) goto L_0x003a;
    L_0x002c:
        goto L_0x003b;
    L_0x002d:
        r1 = r4.typingTimeToLive;
        r5 = r5.typingTimeToLive();
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
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.api.model.meta.$AutoValue_Meta_TypingIndicatorConfig.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((this.typingHeartbeat == null ? 0 : this.typingHeartbeat.hashCode()) ^ 1000003) * 1000003;
        if (this.typingTimeToLive != null) {
            i = this.typingTimeToLive.hashCode();
        }
        return hashCode ^ i;
    }
}
