package com.tinder.model.network;

import com.google.gson.annotations.SerializedName;

public class DataResponse<T> {
    @SerializedName("data")
    protected T mData;
    @SerializedName("meta")
    protected ResponseMeta mMeta;

    public ResponseMeta getMeta() {
        return this.mMeta;
    }

    public T getData() {
        return this.mData;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
        r4 = this;
        r0 = 1;
        if (r4 != r5) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = 0;
        if (r5 == 0) goto L_0x003c;
    L_0x0007:
        r2 = r4.getClass();
        r3 = r5.getClass();
        if (r2 == r3) goto L_0x0012;
    L_0x0011:
        goto L_0x003c;
    L_0x0012:
        r5 = (com.tinder.model.network.DataResponse) r5;
        r2 = r4.mMeta;
        if (r2 == 0) goto L_0x0023;
    L_0x0018:
        r2 = r4.mMeta;
        r3 = r5.mMeta;
        r2 = r2.equals(r3);
        if (r2 != 0) goto L_0x0028;
    L_0x0022:
        goto L_0x0027;
    L_0x0023:
        r2 = r5.mMeta;
        if (r2 == 0) goto L_0x0028;
    L_0x0027:
        return r1;
    L_0x0028:
        r2 = r4.mData;
        if (r2 == 0) goto L_0x0035;
    L_0x002c:
        r0 = r4.mData;
        r5 = r5.mData;
        r0 = r0.equals(r5);
        goto L_0x003b;
    L_0x0035:
        r5 = r5.mData;
        if (r5 != 0) goto L_0x003a;
    L_0x0039:
        goto L_0x003b;
    L_0x003a:
        r0 = 0;
    L_0x003b:
        return r0;
    L_0x003c:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.model.network.DataResponse.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = (this.mMeta != null ? this.mMeta.hashCode() : 0) * 31;
        if (this.mData != null) {
            i = this.mData.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DataResponse{mMeta=");
        stringBuilder.append(this.mMeta);
        stringBuilder.append(", data=");
        stringBuilder.append(this.mData);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
