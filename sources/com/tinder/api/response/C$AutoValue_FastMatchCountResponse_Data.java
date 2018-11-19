package com.tinder.api.response;

import android.support.annotation.Nullable;
import com.squareup.moshi.Json;
import com.tinder.api.response.FastMatchCountResponse.Data;

/* renamed from: com.tinder.api.response.$AutoValue_FastMatchCountResponse_Data */
abstract class C$AutoValue_FastMatchCountResponse_Data extends Data {
    private final Integer count;
    private final Boolean isRange;

    C$AutoValue_FastMatchCountResponse_Data(@Nullable Integer num, @Nullable Boolean bool) {
        this.count = num;
        this.isRange = bool;
    }

    @Nullable
    public Integer count() {
        return this.count;
    }

    @Nullable
    @Json(name = "is_range")
    public Boolean isRange() {
        return this.isRange;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Data{count=");
        stringBuilder.append(this.count);
        stringBuilder.append(", isRange=");
        stringBuilder.append(this.isRange);
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
        r1 = r5 instanceof com.tinder.api.response.FastMatchCountResponse.Data;
        r2 = 0;
        if (r1 == 0) goto L_0x003c;
    L_0x0009:
        r5 = (com.tinder.api.response.FastMatchCountResponse.Data) r5;
        r1 = r4.count;
        if (r1 != 0) goto L_0x0016;
    L_0x000f:
        r1 = r5.count();
        if (r1 != 0) goto L_0x003a;
    L_0x0015:
        goto L_0x0022;
    L_0x0016:
        r1 = r4.count;
        r3 = r5.count();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x003a;
    L_0x0022:
        r1 = r4.isRange;
        if (r1 != 0) goto L_0x002d;
    L_0x0026:
        r5 = r5.isRange();
        if (r5 != 0) goto L_0x003a;
    L_0x002c:
        goto L_0x003b;
    L_0x002d:
        r1 = r4.isRange;
        r5 = r5.isRange();
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
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.api.response.$AutoValue_FastMatchCountResponse_Data.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((this.count == null ? 0 : this.count.hashCode()) ^ 1000003) * 1000003;
        if (this.isRange != null) {
            i = this.isRange.hashCode();
        }
        return hashCode ^ i;
    }
}
