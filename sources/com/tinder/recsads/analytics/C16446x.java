package com.tinder.recsads.analytics;

import android.support.annotation.Nullable;
import com.tinder.recsads.analytics.C16434j.C14739a;
import com.tinder.recsads.analytics.C16434j.C14739a.C14738a;

/* renamed from: com.tinder.recsads.analytics.x */
final class C16446x extends C14739a {
    /* renamed from: a */
    private final String f51027a;
    /* renamed from: b */
    private final Integer f51028b;
    /* renamed from: c */
    private final String f51029c;

    /* renamed from: com.tinder.recsads.analytics.x$a */
    static final class C16445a extends C14738a {
        /* renamed from: a */
        private String f51024a;
        /* renamed from: b */
        private Integer f51025b;
        /* renamed from: c */
        private String f51026c;

        C16445a() {
        }

        /* renamed from: a */
        public C14739a mo12172a() {
            return new C16446x(this.f51024a, this.f51025b, this.f51026c);
        }
    }

    private C16446x(@Nullable String str, @Nullable Integer num, @Nullable String str2) {
        this.f51027a = str;
        this.f51028b = num;
        this.f51029c = str2;
    }

    @Nullable
    /* renamed from: a */
    public String mo12173a() {
        return this.f51027a;
    }

    @Nullable
    /* renamed from: b */
    public Integer mo12174b() {
        return this.f51028b;
    }

    @Nullable
    /* renamed from: c */
    public String mo12175c() {
        return this.f51029c;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Request{otherId=");
        stringBuilder.append(this.f51027a);
        stringBuilder.append(", progress=");
        stringBuilder.append(this.f51028b);
        stringBuilder.append(", format=");
        stringBuilder.append(this.f51029c);
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
        r1 = r5 instanceof com.tinder.recsads.analytics.C16434j.C14739a;
        r2 = 0;
        if (r1 == 0) goto L_0x0053;
    L_0x0009:
        r5 = (com.tinder.recsads.analytics.C16434j.C14739a) r5;
        r1 = r4.f51027a;
        if (r1 != 0) goto L_0x0016;
    L_0x000f:
        r1 = r5.mo12173a();
        if (r1 != 0) goto L_0x0051;
    L_0x0015:
        goto L_0x0022;
    L_0x0016:
        r1 = r4.f51027a;
        r3 = r5.mo12173a();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0051;
    L_0x0022:
        r1 = r4.f51028b;
        if (r1 != 0) goto L_0x002d;
    L_0x0026:
        r1 = r5.mo12174b();
        if (r1 != 0) goto L_0x0051;
    L_0x002c:
        goto L_0x0039;
    L_0x002d:
        r1 = r4.f51028b;
        r3 = r5.mo12174b();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0051;
    L_0x0039:
        r1 = r4.f51029c;
        if (r1 != 0) goto L_0x0044;
    L_0x003d:
        r5 = r5.mo12175c();
        if (r5 != 0) goto L_0x0051;
    L_0x0043:
        goto L_0x0052;
    L_0x0044:
        r1 = r4.f51029c;
        r5 = r5.mo12175c();
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
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.recsads.analytics.x.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((this.f51027a == null ? 0 : this.f51027a.hashCode()) ^ 1000003) * 1000003) ^ (this.f51028b == null ? 0 : this.f51028b.hashCode())) * 1000003;
        if (this.f51029c != null) {
            i = this.f51029c.hashCode();
        }
        return hashCode ^ i;
    }
}
