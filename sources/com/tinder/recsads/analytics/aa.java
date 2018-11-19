package com.tinder.recsads.analytics;

import android.support.annotation.Nullable;
import com.tinder.recsads.analytics.C16440t.C14747a;
import com.tinder.recsads.analytics.C16440t.C14747a.C14746a;

final class aa extends C14747a {
    /* renamed from: a */
    private final Number f50992a;
    /* renamed from: b */
    private final String f50993b;
    /* renamed from: c */
    private final String f50994c;
    /* renamed from: d */
    private final String f50995d;

    /* renamed from: com.tinder.recsads.analytics.aa$a */
    static final class C16430a extends C14746a {
        /* renamed from: a */
        private Number f50988a;
        /* renamed from: b */
        private String f50989b;
        /* renamed from: c */
        private String f50990c;
        /* renamed from: d */
        private String f50991d;

        C16430a() {
        }

        /* renamed from: a */
        public C14747a mo12151a() {
            return new aa(this.f50988a, this.f50989b, this.f50990c, this.f50991d);
        }
    }

    private aa(@Nullable Number number, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.f50992a = number;
        this.f50993b = str;
        this.f50994c = str2;
        this.f50995d = str3;
    }

    @Nullable
    /* renamed from: a */
    public Number mo12152a() {
        return this.f50992a;
    }

    @Nullable
    /* renamed from: b */
    public String mo12153b() {
        return this.f50993b;
    }

    @Nullable
    /* renamed from: c */
    public String mo12154c() {
        return this.f50994c;
    }

    @Nullable
    /* renamed from: d */
    public String mo12155d() {
        return this.f50995d;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Request{aspectRatio=");
        stringBuilder.append(this.f50992a);
        stringBuilder.append(", thirdPartyTrackingUrl=");
        stringBuilder.append(this.f50993b);
        stringBuilder.append(", format=");
        stringBuilder.append(this.f50994c);
        stringBuilder.append(", otherId=");
        stringBuilder.append(this.f50995d);
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
        r1 = r5 instanceof com.tinder.recsads.analytics.C16440t.C14747a;
        r2 = 0;
        if (r1 == 0) goto L_0x006a;
    L_0x0009:
        r5 = (com.tinder.recsads.analytics.C16440t.C14747a) r5;
        r1 = r4.f50992a;
        if (r1 != 0) goto L_0x0016;
    L_0x000f:
        r1 = r5.mo12152a();
        if (r1 != 0) goto L_0x0068;
    L_0x0015:
        goto L_0x0022;
    L_0x0016:
        r1 = r4.f50992a;
        r3 = r5.mo12152a();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0068;
    L_0x0022:
        r1 = r4.f50993b;
        if (r1 != 0) goto L_0x002d;
    L_0x0026:
        r1 = r5.mo12153b();
        if (r1 != 0) goto L_0x0068;
    L_0x002c:
        goto L_0x0039;
    L_0x002d:
        r1 = r4.f50993b;
        r3 = r5.mo12153b();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0068;
    L_0x0039:
        r1 = r4.f50994c;
        if (r1 != 0) goto L_0x0044;
    L_0x003d:
        r1 = r5.mo12154c();
        if (r1 != 0) goto L_0x0068;
    L_0x0043:
        goto L_0x0050;
    L_0x0044:
        r1 = r4.f50994c;
        r3 = r5.mo12154c();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0068;
    L_0x0050:
        r1 = r4.f50995d;
        if (r1 != 0) goto L_0x005b;
    L_0x0054:
        r5 = r5.mo12155d();
        if (r5 != 0) goto L_0x0068;
    L_0x005a:
        goto L_0x0069;
    L_0x005b:
        r1 = r4.f50995d;
        r5 = r5.mo12155d();
        r5 = r1.equals(r5);
        if (r5 == 0) goto L_0x0068;
    L_0x0067:
        goto L_0x0069;
    L_0x0068:
        r0 = 0;
    L_0x0069:
        return r0;
    L_0x006a:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.recsads.analytics.aa.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((((this.f50992a == null ? 0 : this.f50992a.hashCode()) ^ 1000003) * 1000003) ^ (this.f50993b == null ? 0 : this.f50993b.hashCode())) * 1000003) ^ (this.f50994c == null ? 0 : this.f50994c.hashCode())) * 1000003;
        if (this.f50995d != null) {
            i = this.f50995d.hashCode();
        }
        return hashCode ^ i;
    }
}
