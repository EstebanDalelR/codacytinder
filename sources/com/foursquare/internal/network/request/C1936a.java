package com.foursquare.internal.network.request;

import com.google.gson.annotations.SerializedName;

/* renamed from: com.foursquare.internal.network.request.a */
public class C1936a {
    @SerializedName("name")
    /* renamed from: a */
    private String f5212a;
    @SerializedName("value")
    /* renamed from: b */
    private String f5213b;

    public C1936a(String str, String str2) {
        if (str == null) {
            str = "";
        }
        this.f5212a = str;
        this.f5213b = str2;
    }

    /* renamed from: a */
    public String m6784a() {
        return this.f5212a;
    }

    /* renamed from: b */
    public String m6785b() {
        return this.f5213b;
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
        if (r5 == 0) goto L_0x003e;
    L_0x0007:
        r2 = r4.getClass();
        r3 = r5.getClass();
        if (r2 == r3) goto L_0x0012;
    L_0x0011:
        goto L_0x003e;
    L_0x0012:
        r5 = (com.foursquare.internal.network.request.C1936a) r5;
        r2 = r4.f5212a;
        if (r2 == 0) goto L_0x0023;
    L_0x0018:
        r2 = r4.f5212a;
        r3 = r5.f5212a;
        r2 = r2.equals(r3);
        if (r2 != 0) goto L_0x0028;
    L_0x0022:
        goto L_0x0027;
    L_0x0023:
        r2 = r5.f5212a;
        if (r2 == 0) goto L_0x0028;
    L_0x0027:
        return r1;
    L_0x0028:
        r2 = r4.f5213b;
        if (r2 == 0) goto L_0x0037;
    L_0x002c:
        r2 = r4.f5213b;
        r5 = r5.f5213b;
        r5 = r2.equals(r5);
        if (r5 != 0) goto L_0x003d;
    L_0x0036:
        goto L_0x003c;
    L_0x0037:
        r5 = r5.f5213b;
        if (r5 != 0) goto L_0x003c;
    L_0x003b:
        goto L_0x003d;
    L_0x003c:
        r0 = 0;
    L_0x003d:
        return r0;
    L_0x003e:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.foursquare.internal.network.request.a.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = (this.f5212a != null ? this.f5212a.hashCode() : 0) * 31;
        if (this.f5213b != null) {
            i = this.f5213b.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        if (this.f5213b == null) {
            return this.f5212a;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f5212a);
        stringBuilder.append("=");
        stringBuilder.append(this.f5213b);
        return stringBuilder.toString();
    }
}
