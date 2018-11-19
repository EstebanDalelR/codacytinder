package com.tinder.api.response.v2;

import android.support.annotation.Nullable;
import com.tinder.api.response.v2.FastMatchRecsResponse.Data;
import com.tinder.api.response.v2.FastMatchRecsResponse.Meta;

/* renamed from: com.tinder.api.response.v2.$AutoValue_FastMatchRecsResponse */
abstract class C$AutoValue_FastMatchRecsResponse extends FastMatchRecsResponse {
    private final Data data;
    private final Meta meta;

    C$AutoValue_FastMatchRecsResponse(@Nullable Data data, @Nullable Meta meta) {
        this.data = data;
        this.meta = meta;
    }

    @Nullable
    public Data data() {
        return this.data;
    }

    @Nullable
    public Meta meta() {
        return this.meta;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("FastMatchRecsResponse{data=");
        stringBuilder.append(this.data);
        stringBuilder.append(", meta=");
        stringBuilder.append(this.meta);
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
        r1 = r5 instanceof com.tinder.api.response.v2.FastMatchRecsResponse;
        r2 = 0;
        if (r1 == 0) goto L_0x003c;
    L_0x0009:
        r5 = (com.tinder.api.response.v2.FastMatchRecsResponse) r5;
        r1 = r4.data;
        if (r1 != 0) goto L_0x0016;
    L_0x000f:
        r1 = r5.data();
        if (r1 != 0) goto L_0x003a;
    L_0x0015:
        goto L_0x0022;
    L_0x0016:
        r1 = r4.data;
        r3 = r5.data();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x003a;
    L_0x0022:
        r1 = r4.meta;
        if (r1 != 0) goto L_0x002d;
    L_0x0026:
        r5 = r5.meta();
        if (r5 != 0) goto L_0x003a;
    L_0x002c:
        goto L_0x003b;
    L_0x002d:
        r1 = r4.meta;
        r5 = r5.meta();
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
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.api.response.v2.$AutoValue_FastMatchRecsResponse.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((this.data == null ? 0 : this.data.hashCode()) ^ 1000003) * 1000003;
        if (this.meta != null) {
            i = this.meta.hashCode();
        }
        return hashCode ^ i;
    }
}
