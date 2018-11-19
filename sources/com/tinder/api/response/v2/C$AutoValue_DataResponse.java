package com.tinder.api.response.v2;

import javax.annotation.Nullable;

/* renamed from: com.tinder.api.response.v2.$AutoValue_DataResponse */
abstract class C$AutoValue_DataResponse<T> extends DataResponse<T> {
    private final T data;
    private final ResponseError error;
    private final ResponseMeta meta;

    C$AutoValue_DataResponse(@Nullable ResponseMeta responseMeta, @Nullable T t, @Nullable ResponseError responseError) {
        this.meta = responseMeta;
        this.data = t;
        this.error = responseError;
    }

    @Nullable
    public ResponseMeta meta() {
        return this.meta;
    }

    @Nullable
    public T data() {
        return this.data;
    }

    @Nullable
    public ResponseError error() {
        return this.error;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DataResponse{meta=");
        stringBuilder.append(this.meta);
        stringBuilder.append(", data=");
        stringBuilder.append(this.data);
        stringBuilder.append(", error=");
        stringBuilder.append(this.error);
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
        r1 = r5 instanceof com.tinder.api.response.v2.DataResponse;
        r2 = 0;
        if (r1 == 0) goto L_0x0053;
    L_0x0009:
        r5 = (com.tinder.api.response.v2.DataResponse) r5;
        r1 = r4.meta;
        if (r1 != 0) goto L_0x0016;
    L_0x000f:
        r1 = r5.meta();
        if (r1 != 0) goto L_0x0051;
    L_0x0015:
        goto L_0x0022;
    L_0x0016:
        r1 = r4.meta;
        r3 = r5.meta();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0051;
    L_0x0022:
        r1 = r4.data;
        if (r1 != 0) goto L_0x002d;
    L_0x0026:
        r1 = r5.data();
        if (r1 != 0) goto L_0x0051;
    L_0x002c:
        goto L_0x0039;
    L_0x002d:
        r1 = r4.data;
        r3 = r5.data();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0051;
    L_0x0039:
        r1 = r4.error;
        if (r1 != 0) goto L_0x0044;
    L_0x003d:
        r5 = r5.error();
        if (r5 != 0) goto L_0x0051;
    L_0x0043:
        goto L_0x0052;
    L_0x0044:
        r1 = r4.error;
        r5 = r5.error();
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
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.api.response.v2.$AutoValue_DataResponse.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((this.meta == null ? 0 : this.meta.hashCode()) ^ 1000003) * 1000003) ^ (this.data == null ? 0 : this.data.hashCode())) * 1000003;
        if (this.error != null) {
            i = this.error.hashCode();
        }
        return hashCode ^ i;
    }
}
