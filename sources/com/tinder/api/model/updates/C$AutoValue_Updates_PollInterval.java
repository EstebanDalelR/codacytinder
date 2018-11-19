package com.tinder.api.model.updates;

import android.support.annotation.Nullable;
import com.squareup.moshi.Json;
import com.tinder.api.model.updates.Updates.PollInterval;

/* renamed from: com.tinder.api.model.updates.$AutoValue_Updates_PollInterval */
abstract class C$AutoValue_Updates_PollInterval extends PollInterval {
    private final Long persistent;
    private final Long standard;

    C$AutoValue_Updates_PollInterval(@Nullable Long l, @Nullable Long l2) {
        this.persistent = l;
        this.standard = l2;
    }

    @Nullable
    @Json(name = "persistent")
    public Long persistent() {
        return this.persistent;
    }

    @Nullable
    @Json(name = "standard")
    public Long standard() {
        return this.standard;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PollInterval{persistent=");
        stringBuilder.append(this.persistent);
        stringBuilder.append(", standard=");
        stringBuilder.append(this.standard);
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
        r1 = r5 instanceof com.tinder.api.model.updates.Updates.PollInterval;
        r2 = 0;
        if (r1 == 0) goto L_0x003c;
    L_0x0009:
        r5 = (com.tinder.api.model.updates.Updates.PollInterval) r5;
        r1 = r4.persistent;
        if (r1 != 0) goto L_0x0016;
    L_0x000f:
        r1 = r5.persistent();
        if (r1 != 0) goto L_0x003a;
    L_0x0015:
        goto L_0x0022;
    L_0x0016:
        r1 = r4.persistent;
        r3 = r5.persistent();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x003a;
    L_0x0022:
        r1 = r4.standard;
        if (r1 != 0) goto L_0x002d;
    L_0x0026:
        r5 = r5.standard();
        if (r5 != 0) goto L_0x003a;
    L_0x002c:
        goto L_0x003b;
    L_0x002d:
        r1 = r4.standard;
        r5 = r5.standard();
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
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.api.model.updates.$AutoValue_Updates_PollInterval.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((this.persistent == null ? 0 : this.persistent.hashCode()) ^ 1000003) * 1000003;
        if (this.standard != null) {
            i = this.standard.hashCode();
        }
        return hashCode ^ i;
    }
}
