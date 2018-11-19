package com.tinder.analytics.performance;

import android.support.annotation.Nullable;
import com.tinder.analytics.performance.AddInstrumentationEvent.InstrumentationRequest.C7336a;
import com.tinder.analytics.performance.AddInstrumentationEvent.InstrumentationRequest.C7336a.C6235a;

/* renamed from: com.tinder.analytics.performance.g */
final class C8019g extends C7336a {
    /* renamed from: a */
    private final Number f28656a;
    /* renamed from: b */
    private final String f28657b;
    /* renamed from: c */
    private final C6242m f28658c;
    /* renamed from: d */
    private final String f28659d;
    /* renamed from: e */
    private final Number f28660e;
    /* renamed from: f */
    private final String f28661f;
    /* renamed from: g */
    private final String f28662g;
    /* renamed from: h */
    private final String f28663h;

    /* renamed from: com.tinder.analytics.performance.g$a */
    static final class C7337a extends C6235a {
        /* renamed from: a */
        private Number f26494a;
        /* renamed from: b */
        private String f26495b;
        /* renamed from: c */
        private C6242m f26496c;
        /* renamed from: d */
        private String f26497d;
        /* renamed from: e */
        private Number f26498e;
        /* renamed from: f */
        private String f26499f;
        /* renamed from: g */
        private String f26500g;
        /* renamed from: h */
        private String f26501h;

        C7337a() {
        }

        /* renamed from: a */
        public C6235a mo6801a(@Nullable Number number) {
            this.f26494a = number;
            return this;
        }

        /* renamed from: a */
        public C6235a mo6802a(@Nullable String str) {
            this.f26495b = str;
            return this;
        }

        /* renamed from: a */
        public C6235a mo6800a(@Nullable C6242m c6242m) {
            this.f26496c = c6242m;
            return this;
        }

        /* renamed from: b */
        public C6235a mo6805b(@Nullable String str) {
            this.f26497d = str;
            return this;
        }

        /* renamed from: b */
        public C6235a mo6804b(@Nullable Number number) {
            this.f26498e = number;
            return this;
        }

        /* renamed from: c */
        public C6235a mo6806c(@Nullable String str) {
            this.f26499f = str;
            return this;
        }

        /* renamed from: d */
        public C6235a mo6807d(@Nullable String str) {
            this.f26500g = str;
            return this;
        }

        /* renamed from: e */
        public C6235a mo6808e(@Nullable String str) {
            this.f26501h = str;
            return this;
        }

        /* renamed from: a */
        public C7336a mo6803a() {
            return new C8019g(this.f26494a, this.f26495b, this.f26496c, this.f26497d, this.f26498e, this.f26499f, this.f26500g, this.f26501h);
        }
    }

    private C8019g(@Nullable Number number, @Nullable String str, @Nullable C6242m c6242m, @Nullable String str2, @Nullable Number number2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.f28656a = number;
        this.f28657b = str;
        this.f28658c = c6242m;
        this.f28659d = str2;
        this.f28660e = number2;
        this.f28661f = str3;
        this.f28662g = str4;
        this.f28663h = str5;
    }

    @Nullable
    public Number durationInMillis() {
        return this.f28656a;
    }

    @Nullable
    public String nsName() {
        return this.f28657b;
    }

    @Nullable
    public C6242m payload() {
        return this.f28658c;
    }

    @Nullable
    public String nsEndpoint() {
        return this.f28659d;
    }

    @Nullable
    public Number nsStatusCode() {
        return this.f28660e;
    }

    @Nullable
    public String nsErrorCode() {
        return this.f28661f;
    }

    @Nullable
    public String nsMethod() {
        return this.f28662g;
    }

    @Nullable
    public String nsOtherId() {
        return this.f28663h;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("InstrumentationRequestImpl{durationInMillis=");
        stringBuilder.append(this.f28656a);
        stringBuilder.append(", nsName=");
        stringBuilder.append(this.f28657b);
        stringBuilder.append(", payload=");
        stringBuilder.append(this.f28658c);
        stringBuilder.append(", nsEndpoint=");
        stringBuilder.append(this.f28659d);
        stringBuilder.append(", nsStatusCode=");
        stringBuilder.append(this.f28660e);
        stringBuilder.append(", nsErrorCode=");
        stringBuilder.append(this.f28661f);
        stringBuilder.append(", nsMethod=");
        stringBuilder.append(this.f28662g);
        stringBuilder.append(", nsOtherId=");
        stringBuilder.append(this.f28663h);
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
        r1 = r5 instanceof com.tinder.analytics.performance.AddInstrumentationEvent.InstrumentationRequest.C7336a;
        r2 = 0;
        if (r1 == 0) goto L_0x00c6;
    L_0x0009:
        r5 = (com.tinder.analytics.performance.AddInstrumentationEvent.InstrumentationRequest.C7336a) r5;
        r1 = r4.f28656a;
        if (r1 != 0) goto L_0x0016;
    L_0x000f:
        r1 = r5.durationInMillis();
        if (r1 != 0) goto L_0x00c4;
    L_0x0015:
        goto L_0x0022;
    L_0x0016:
        r1 = r4.f28656a;
        r3 = r5.durationInMillis();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00c4;
    L_0x0022:
        r1 = r4.f28657b;
        if (r1 != 0) goto L_0x002d;
    L_0x0026:
        r1 = r5.nsName();
        if (r1 != 0) goto L_0x00c4;
    L_0x002c:
        goto L_0x0039;
    L_0x002d:
        r1 = r4.f28657b;
        r3 = r5.nsName();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00c4;
    L_0x0039:
        r1 = r4.f28658c;
        if (r1 != 0) goto L_0x0044;
    L_0x003d:
        r1 = r5.payload();
        if (r1 != 0) goto L_0x00c4;
    L_0x0043:
        goto L_0x0050;
    L_0x0044:
        r1 = r4.f28658c;
        r3 = r5.payload();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00c4;
    L_0x0050:
        r1 = r4.f28659d;
        if (r1 != 0) goto L_0x005b;
    L_0x0054:
        r1 = r5.nsEndpoint();
        if (r1 != 0) goto L_0x00c4;
    L_0x005a:
        goto L_0x0067;
    L_0x005b:
        r1 = r4.f28659d;
        r3 = r5.nsEndpoint();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00c4;
    L_0x0067:
        r1 = r4.f28660e;
        if (r1 != 0) goto L_0x0072;
    L_0x006b:
        r1 = r5.nsStatusCode();
        if (r1 != 0) goto L_0x00c4;
    L_0x0071:
        goto L_0x007e;
    L_0x0072:
        r1 = r4.f28660e;
        r3 = r5.nsStatusCode();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00c4;
    L_0x007e:
        r1 = r4.f28661f;
        if (r1 != 0) goto L_0x0089;
    L_0x0082:
        r1 = r5.nsErrorCode();
        if (r1 != 0) goto L_0x00c4;
    L_0x0088:
        goto L_0x0095;
    L_0x0089:
        r1 = r4.f28661f;
        r3 = r5.nsErrorCode();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00c4;
    L_0x0095:
        r1 = r4.f28662g;
        if (r1 != 0) goto L_0x00a0;
    L_0x0099:
        r1 = r5.nsMethod();
        if (r1 != 0) goto L_0x00c4;
    L_0x009f:
        goto L_0x00ac;
    L_0x00a0:
        r1 = r4.f28662g;
        r3 = r5.nsMethod();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00c4;
    L_0x00ac:
        r1 = r4.f28663h;
        if (r1 != 0) goto L_0x00b7;
    L_0x00b0:
        r5 = r5.nsOtherId();
        if (r5 != 0) goto L_0x00c4;
    L_0x00b6:
        goto L_0x00c5;
    L_0x00b7:
        r1 = r4.f28663h;
        r5 = r5.nsOtherId();
        r5 = r1.equals(r5);
        if (r5 == 0) goto L_0x00c4;
    L_0x00c3:
        goto L_0x00c5;
    L_0x00c4:
        r0 = 0;
    L_0x00c5:
        return r0;
    L_0x00c6:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.analytics.performance.g.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((((((((((((this.f28656a == null ? 0 : this.f28656a.hashCode()) ^ 1000003) * 1000003) ^ (this.f28657b == null ? 0 : this.f28657b.hashCode())) * 1000003) ^ (this.f28658c == null ? 0 : this.f28658c.hashCode())) * 1000003) ^ (this.f28659d == null ? 0 : this.f28659d.hashCode())) * 1000003) ^ (this.f28660e == null ? 0 : this.f28660e.hashCode())) * 1000003) ^ (this.f28661f == null ? 0 : this.f28661f.hashCode())) * 1000003) ^ (this.f28662g == null ? 0 : this.f28662g.hashCode())) * 1000003;
        if (this.f28663h != null) {
            i = this.f28663h.hashCode();
        }
        return hashCode ^ i;
    }
}
