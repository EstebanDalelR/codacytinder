package com.tinder.api.model.common;

import android.support.annotation.Nullable;
import com.squareup.moshi.Json;

/* renamed from: com.tinder.api.model.common.$AutoValue_Interest */
abstract class C$AutoValue_Interest extends Interest {
    private final String createdTime;
    private final String id;
    private final String name;

    C$AutoValue_Interest(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.name = str;
        this.id = str2;
        this.createdTime = str3;
    }

    @Nullable
    public String name() {
        return this.name;
    }

    @Nullable
    public String id() {
        return this.id;
    }

    @Nullable
    @Json(name = "created_time")
    public String createdTime() {
        return this.createdTime;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Interest{name=");
        stringBuilder.append(this.name);
        stringBuilder.append(", id=");
        stringBuilder.append(this.id);
        stringBuilder.append(", createdTime=");
        stringBuilder.append(this.createdTime);
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
        r1 = r5 instanceof com.tinder.api.model.common.Interest;
        r2 = 0;
        if (r1 == 0) goto L_0x0053;
    L_0x0009:
        r5 = (com.tinder.api.model.common.Interest) r5;
        r1 = r4.name;
        if (r1 != 0) goto L_0x0016;
    L_0x000f:
        r1 = r5.name();
        if (r1 != 0) goto L_0x0051;
    L_0x0015:
        goto L_0x0022;
    L_0x0016:
        r1 = r4.name;
        r3 = r5.name();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0051;
    L_0x0022:
        r1 = r4.id;
        if (r1 != 0) goto L_0x002d;
    L_0x0026:
        r1 = r5.id();
        if (r1 != 0) goto L_0x0051;
    L_0x002c:
        goto L_0x0039;
    L_0x002d:
        r1 = r4.id;
        r3 = r5.id();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0051;
    L_0x0039:
        r1 = r4.createdTime;
        if (r1 != 0) goto L_0x0044;
    L_0x003d:
        r5 = r5.createdTime();
        if (r5 != 0) goto L_0x0051;
    L_0x0043:
        goto L_0x0052;
    L_0x0044:
        r1 = r4.createdTime;
        r5 = r5.createdTime();
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
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.api.model.common.$AutoValue_Interest.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((this.name == null ? 0 : this.name.hashCode()) ^ 1000003) * 1000003) ^ (this.id == null ? 0 : this.id.hashCode())) * 1000003;
        if (this.createdTime != null) {
            i = this.createdTime.hashCode();
        }
        return hashCode ^ i;
    }
}
