package com.tinder.api.model.common;

import android.support.annotation.Nullable;
import com.tinder.api.model.common.CommonConnection.Photo;

/* renamed from: com.tinder.api.model.common.$AutoValue_CommonConnection_Photo */
abstract class C$AutoValue_CommonConnection_Photo extends Photo {
    private final String large;
    private final String medium;
    private final String small;

    C$AutoValue_CommonConnection_Photo(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.large = str;
        this.medium = str2;
        this.small = str3;
    }

    @Nullable
    public String large() {
        return this.large;
    }

    @Nullable
    public String medium() {
        return this.medium;
    }

    @Nullable
    public String small() {
        return this.small;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Photo{large=");
        stringBuilder.append(this.large);
        stringBuilder.append(", medium=");
        stringBuilder.append(this.medium);
        stringBuilder.append(", small=");
        stringBuilder.append(this.small);
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
        r1 = r5 instanceof com.tinder.api.model.common.CommonConnection.Photo;
        r2 = 0;
        if (r1 == 0) goto L_0x0053;
    L_0x0009:
        r5 = (com.tinder.api.model.common.CommonConnection.Photo) r5;
        r1 = r4.large;
        if (r1 != 0) goto L_0x0016;
    L_0x000f:
        r1 = r5.large();
        if (r1 != 0) goto L_0x0051;
    L_0x0015:
        goto L_0x0022;
    L_0x0016:
        r1 = r4.large;
        r3 = r5.large();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0051;
    L_0x0022:
        r1 = r4.medium;
        if (r1 != 0) goto L_0x002d;
    L_0x0026:
        r1 = r5.medium();
        if (r1 != 0) goto L_0x0051;
    L_0x002c:
        goto L_0x0039;
    L_0x002d:
        r1 = r4.medium;
        r3 = r5.medium();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0051;
    L_0x0039:
        r1 = r4.small;
        if (r1 != 0) goto L_0x0044;
    L_0x003d:
        r5 = r5.small();
        if (r5 != 0) goto L_0x0051;
    L_0x0043:
        goto L_0x0052;
    L_0x0044:
        r1 = r4.small;
        r5 = r5.small();
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
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.api.model.common.$AutoValue_CommonConnection_Photo.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((this.large == null ? 0 : this.large.hashCode()) ^ 1000003) * 1000003) ^ (this.medium == null ? 0 : this.medium.hashCode())) * 1000003;
        if (this.small != null) {
            i = this.small.hashCode();
        }
        return hashCode ^ i;
    }
}
