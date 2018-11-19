package com.tinder.recsads.analytics;

import android.support.annotation.Nullable;
import com.tinder.recsads.analytics.C16438p.C14743a;
import com.tinder.recsads.analytics.C16438p.C14743a.C14742a;

/* renamed from: com.tinder.recsads.analytics.y */
final class C16448y extends C14743a {
    /* renamed from: a */
    private final Integer f51033a;
    /* renamed from: b */
    private final Float f51034b;
    /* renamed from: c */
    private final int f51035c;

    /* renamed from: com.tinder.recsads.analytics.y$a */
    static final class C16447a extends C14742a {
        /* renamed from: a */
        private Integer f51030a;
        /* renamed from: b */
        private Float f51031b;
        /* renamed from: c */
        private Integer f51032c;

        C16447a() {
        }

        /* renamed from: a */
        public C14742a mo12176a(int i) {
            this.f51032c = Integer.valueOf(i);
            return this;
        }

        /* renamed from: a */
        public C14743a mo12177a() {
            String str = "";
            if (this.f51032c == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" action");
                str = stringBuilder.toString();
            }
            if (str.isEmpty()) {
                return new C16448y(this.f51030a, this.f51031b, this.f51032c.intValue());
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Missing required properties:");
            stringBuilder2.append(str);
            throw new IllegalStateException(stringBuilder2.toString());
        }
    }

    private C16448y(@Nullable Integer num, @Nullable Float f, int i) {
        this.f51033a = num;
        this.f51034b = f;
        this.f51035c = i;
    }

    @Nullable
    /* renamed from: a */
    public Integer mo12178a() {
        return this.f51033a;
    }

    @Nullable
    /* renamed from: b */
    public Float mo12179b() {
        return this.f51034b;
    }

    /* renamed from: c */
    public int mo12180c() {
        return this.f51035c;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Request{timeViewed=");
        stringBuilder.append(this.f51033a);
        stringBuilder.append(", progress=");
        stringBuilder.append(this.f51034b);
        stringBuilder.append(", action=");
        stringBuilder.append(this.f51035c);
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
        r1 = r5 instanceof com.tinder.recsads.analytics.C16438p.C14743a;
        r2 = 0;
        if (r1 == 0) goto L_0x0044;
    L_0x0009:
        r5 = (com.tinder.recsads.analytics.C16438p.C14743a) r5;
        r1 = r4.f51033a;
        if (r1 != 0) goto L_0x0016;
    L_0x000f:
        r1 = r5.mo12178a();
        if (r1 != 0) goto L_0x0042;
    L_0x0015:
        goto L_0x0022;
    L_0x0016:
        r1 = r4.f51033a;
        r3 = r5.mo12178a();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0042;
    L_0x0022:
        r1 = r4.f51034b;
        if (r1 != 0) goto L_0x002d;
    L_0x0026:
        r1 = r5.mo12179b();
        if (r1 != 0) goto L_0x0042;
    L_0x002c:
        goto L_0x0039;
    L_0x002d:
        r1 = r4.f51034b;
        r3 = r5.mo12179b();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0042;
    L_0x0039:
        r1 = r4.f51035c;
        r5 = r5.mo12180c();
        if (r1 != r5) goto L_0x0042;
    L_0x0041:
        goto L_0x0043;
    L_0x0042:
        r0 = 0;
    L_0x0043:
        return r0;
    L_0x0044:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.recsads.analytics.y.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((this.f51033a == null ? 0 : this.f51033a.hashCode()) ^ 1000003) * 1000003;
        if (this.f51034b != null) {
            i = this.f51034b.hashCode();
        }
        return ((hashCode ^ i) * 1000003) ^ this.f51035c;
    }
}
