package com.tinder.purchase.domain.model;

import com.tinder.purchase.domain.model.C14510e.C14509b;
import com.tinder.purchase.domain.model.C14510e.C14509b.C14508a;
import io.reactivex.annotations.NonNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.tinder.purchase.domain.model.b */
final class C16225b extends C14509b {
    /* renamed from: a */
    private final String f50536a;
    /* renamed from: b */
    private final Integer f50537b;
    /* renamed from: c */
    private final C14514j f50538c;
    /* renamed from: d */
    private final C14514j f50539d;
    /* renamed from: e */
    private final String f50540e;
    /* renamed from: f */
    private final String f50541f;
    /* renamed from: g */
    private final Long f50542g;
    /* renamed from: h */
    private final Long f50543h;
    /* renamed from: i */
    private final boolean f50544i;

    /* renamed from: com.tinder.purchase.domain.model.b$a */
    static final class C16224a extends C14508a {
        /* renamed from: a */
        private String f50527a;
        /* renamed from: b */
        private Integer f50528b;
        /* renamed from: c */
        private C14514j f50529c;
        /* renamed from: d */
        private C14514j f50530d;
        /* renamed from: e */
        private String f50531e;
        /* renamed from: f */
        private String f50532f;
        /* renamed from: g */
        private Long f50533g;
        /* renamed from: h */
        private Long f50534h;
        /* renamed from: i */
        private Boolean f50535i;

        C16224a() {
        }

        C16224a(C14509b c14509b) {
            this.f50527a = c14509b.mo11860a();
            this.f50528b = c14509b.mo11861b();
            this.f50529c = c14509b.mo11862c();
            this.f50530d = c14509b.mo11863d();
            this.f50531e = c14509b.mo11864e();
            this.f50532f = c14509b.mo11865f();
            this.f50533g = c14509b.mo11866g();
            this.f50534h = c14509b.mo11867h();
            this.f50535i = Boolean.valueOf(c14509b.mo11868i());
        }

        /* renamed from: a */
        public C14508a mo11853a(String str) {
            this.f50527a = str;
            return this;
        }

        /* renamed from: a */
        public C14508a mo11851a(Integer num) {
            this.f50528b = num;
            return this;
        }

        /* renamed from: a */
        public C14508a mo11850a(C14514j c14514j) {
            this.f50529c = c14514j;
            return this;
        }

        /* renamed from: b */
        public C14508a mo11856b(C14514j c14514j) {
            this.f50530d = c14514j;
            return this;
        }

        /* renamed from: b */
        public C14508a mo11858b(@Nullable String str) {
            this.f50531e = str;
            return this;
        }

        /* renamed from: c */
        public C14508a mo11859c(@Nullable String str) {
            this.f50532f = str;
            return this;
        }

        /* renamed from: a */
        public C14508a mo11852a(@Nullable Long l) {
            this.f50533g = l;
            return this;
        }

        /* renamed from: b */
        public C14508a mo11857b(@Nullable Long l) {
            this.f50534h = l;
            return this;
        }

        /* renamed from: a */
        public C14508a mo11854a(boolean z) {
            this.f50535i = Boolean.valueOf(z);
            return this;
        }

        /* renamed from: a */
        public C14509b mo11855a() {
            String str = "";
            if (this.f50527a == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" productId");
                str = stringBuilder.toString();
            }
            if (this.f50528b == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" percentage");
                str = stringBuilder.toString();
            }
            if (this.f50529c == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" price");
                str = stringBuilder.toString();
            }
            if (this.f50530d == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" basePrice");
                str = stringBuilder.toString();
            }
            if (this.f50535i == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" isIntroPricing");
                str = stringBuilder.toString();
            }
            if (str.isEmpty()) {
                return new C16225b(this.f50527a, this.f50528b, this.f50529c, this.f50530d, this.f50531e, this.f50532f, this.f50533g, this.f50534h, this.f50535i.booleanValue());
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Missing required properties:");
            stringBuilder2.append(str);
            throw new IllegalStateException(stringBuilder2.toString());
        }
    }

    private C16225b(String str, Integer num, C14514j c14514j, C14514j c14514j2, @Nullable String str2, @Nullable String str3, @Nullable Long l, @Nullable Long l2, boolean z) {
        this.f50536a = str;
        this.f50537b = num;
        this.f50538c = c14514j;
        this.f50539d = c14514j2;
        this.f50540e = str2;
        this.f50541f = str3;
        this.f50542g = l;
        this.f50543h = l2;
        this.f50544i = z;
    }

    @NonNull
    /* renamed from: a */
    public String mo11860a() {
        return this.f50536a;
    }

    @NonNull
    /* renamed from: b */
    public Integer mo11861b() {
        return this.f50537b;
    }

    @NonNull
    /* renamed from: c */
    public C14514j mo11862c() {
        return this.f50538c;
    }

    @NonNull
    /* renamed from: d */
    public C14514j mo11863d() {
        return this.f50539d;
    }

    @Nullable
    /* renamed from: e */
    public String mo11864e() {
        return this.f50540e;
    }

    @Nullable
    /* renamed from: f */
    public String mo11865f() {
        return this.f50541f;
    }

    @Nullable
    /* renamed from: g */
    public Long mo11866g() {
        return this.f50542g;
    }

    @Nullable
    /* renamed from: h */
    public Long mo11867h() {
        return this.f50543h;
    }

    /* renamed from: i */
    public boolean mo11868i() {
        return this.f50544i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Discount{productId=");
        stringBuilder.append(this.f50536a);
        stringBuilder.append(", percentage=");
        stringBuilder.append(this.f50537b);
        stringBuilder.append(", price=");
        stringBuilder.append(this.f50538c);
        stringBuilder.append(", basePrice=");
        stringBuilder.append(this.f50539d);
        stringBuilder.append(", campaign=");
        stringBuilder.append(this.f50540e);
        stringBuilder.append(", testGroup=");
        stringBuilder.append(this.f50541f);
        stringBuilder.append(", viewedAt=");
        stringBuilder.append(this.f50542g);
        stringBuilder.append(", expiresAt=");
        stringBuilder.append(this.f50543h);
        stringBuilder.append(", isIntroPricing=");
        stringBuilder.append(this.f50544i);
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
        r1 = r5 instanceof com.tinder.purchase.domain.model.C14510e.C14509b;
        r2 = 0;
        if (r1 == 0) goto L_0x00a2;
    L_0x0009:
        r5 = (com.tinder.purchase.domain.model.C14510e.C14509b) r5;
        r1 = r4.f50536a;
        r3 = r5.mo11860a();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00a0;
    L_0x0017:
        r1 = r4.f50537b;
        r3 = r5.mo11861b();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00a0;
    L_0x0023:
        r1 = r4.f50538c;
        r3 = r5.mo11862c();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00a0;
    L_0x002f:
        r1 = r4.f50539d;
        r3 = r5.mo11863d();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00a0;
    L_0x003b:
        r1 = r4.f50540e;
        if (r1 != 0) goto L_0x0046;
    L_0x003f:
        r1 = r5.mo11864e();
        if (r1 != 0) goto L_0x00a0;
    L_0x0045:
        goto L_0x0052;
    L_0x0046:
        r1 = r4.f50540e;
        r3 = r5.mo11864e();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00a0;
    L_0x0052:
        r1 = r4.f50541f;
        if (r1 != 0) goto L_0x005d;
    L_0x0056:
        r1 = r5.mo11865f();
        if (r1 != 0) goto L_0x00a0;
    L_0x005c:
        goto L_0x0069;
    L_0x005d:
        r1 = r4.f50541f;
        r3 = r5.mo11865f();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00a0;
    L_0x0069:
        r1 = r4.f50542g;
        if (r1 != 0) goto L_0x0074;
    L_0x006d:
        r1 = r5.mo11866g();
        if (r1 != 0) goto L_0x00a0;
    L_0x0073:
        goto L_0x0080;
    L_0x0074:
        r1 = r4.f50542g;
        r3 = r5.mo11866g();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00a0;
    L_0x0080:
        r1 = r4.f50543h;
        if (r1 != 0) goto L_0x008b;
    L_0x0084:
        r1 = r5.mo11867h();
        if (r1 != 0) goto L_0x00a0;
    L_0x008a:
        goto L_0x0097;
    L_0x008b:
        r1 = r4.f50543h;
        r3 = r5.mo11867h();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00a0;
    L_0x0097:
        r1 = r4.f50544i;
        r5 = r5.mo11868i();
        if (r1 != r5) goto L_0x00a0;
    L_0x009f:
        goto L_0x00a1;
    L_0x00a0:
        r0 = 0;
    L_0x00a1:
        return r0;
    L_0x00a2:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.purchase.domain.model.b.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = (((((((((((((this.f50536a.hashCode() ^ 1000003) * 1000003) ^ this.f50537b.hashCode()) * 1000003) ^ this.f50538c.hashCode()) * 1000003) ^ this.f50539d.hashCode()) * 1000003) ^ (this.f50540e == null ? 0 : this.f50540e.hashCode())) * 1000003) ^ (this.f50541f == null ? 0 : this.f50541f.hashCode())) * 1000003) ^ (this.f50542g == null ? 0 : this.f50542g.hashCode())) * 1000003;
        if (this.f50543h != null) {
            i = this.f50543h.hashCode();
        }
        return ((hashCode ^ i) * 1000003) ^ (this.f50544i ? 1231 : 1237);
    }
}
