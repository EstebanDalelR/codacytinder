package com.tinder.profiletab.p369c;

import android.support.annotation.Nullable;
import com.tinder.profiletab.p369c.C16176d.C14466a;
import com.tinder.profiletab.p369c.C16176d.C14466a.C14465a;

/* renamed from: com.tinder.profiletab.c.c */
final class C16175c extends C14466a {
    /* renamed from: a */
    private final String f50380a;
    /* renamed from: b */
    private final String f50381b;
    /* renamed from: c */
    private final String f50382c;
    /* renamed from: d */
    private final int f50383d;
    /* renamed from: e */
    private final boolean f50384e;
    /* renamed from: f */
    private final boolean f50385f;
    /* renamed from: g */
    private final boolean f50386g;
    /* renamed from: h */
    private final boolean f50387h;
    /* renamed from: i */
    private final boolean f50388i;

    /* renamed from: com.tinder.profiletab.c.c$a */
    static final class C16174a extends C14465a {
        /* renamed from: a */
        private String f50371a;
        /* renamed from: b */
        private String f50372b;
        /* renamed from: c */
        private String f50373c;
        /* renamed from: d */
        private Integer f50374d;
        /* renamed from: e */
        private Boolean f50375e;
        /* renamed from: f */
        private Boolean f50376f;
        /* renamed from: g */
        private Boolean f50377g;
        /* renamed from: h */
        private Boolean f50378h;
        /* renamed from: i */
        private Boolean f50379i;

        C16174a() {
        }

        /* renamed from: a */
        public C14465a mo11775a(@Nullable String str) {
            this.f50371a = str;
            return this;
        }

        /* renamed from: b */
        public C14465a mo11778b(@Nullable String str) {
            this.f50372b = str;
            return this;
        }

        /* renamed from: c */
        public C14465a mo11780c(@Nullable String str) {
            this.f50373c = str;
            return this;
        }

        /* renamed from: a */
        public C14465a mo11774a(int i) {
            this.f50374d = Integer.valueOf(i);
            return this;
        }

        /* renamed from: a */
        public C14465a mo11776a(boolean z) {
            this.f50375e = Boolean.valueOf(z);
            return this;
        }

        /* renamed from: b */
        public C14465a mo11779b(boolean z) {
            this.f50376f = Boolean.valueOf(z);
            return this;
        }

        /* renamed from: c */
        public C14465a mo11781c(boolean z) {
            this.f50377g = Boolean.valueOf(z);
            return this;
        }

        /* renamed from: d */
        public C14465a mo11782d(boolean z) {
            this.f50378h = Boolean.valueOf(z);
            return this;
        }

        /* renamed from: e */
        public C14465a mo11783e(boolean z) {
            this.f50379i = Boolean.valueOf(z);
            return this;
        }

        /* renamed from: a */
        public C14466a mo11777a() {
            String str = "";
            if (this.f50374d == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" numPhotos");
                str = stringBuilder.toString();
            }
            if (this.f50375e == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" ageHidden");
                str = stringBuilder.toString();
            }
            if (this.f50376f == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" distanceHidden");
                str = stringBuilder.toString();
            }
            if (this.f50377g == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" instagramConnected");
                str = stringBuilder.toString();
            }
            if (this.f50378h == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" spotifyConnected");
                str = stringBuilder.toString();
            }
            if (this.f50379i == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" hasAnthem");
                str = stringBuilder.toString();
            }
            if (str.isEmpty()) {
                return new C16175c(this.f50371a, this.f50372b, this.f50373c, this.f50374d.intValue(), this.f50375e.booleanValue(), this.f50376f.booleanValue(), this.f50377g.booleanValue(), this.f50378h.booleanValue(), this.f50379i.booleanValue());
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Missing required properties:");
            stringBuilder2.append(str);
            throw new IllegalStateException(stringBuilder2.toString());
        }
    }

    private C16175c(@Nullable String str, @Nullable String str2, @Nullable String str3, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.f50380a = str;
        this.f50381b = str2;
        this.f50382c = str3;
        this.f50383d = i;
        this.f50384e = z;
        this.f50385f = z2;
        this.f50386g = z3;
        this.f50387h = z4;
        this.f50388i = z5;
    }

    @Nullable
    /* renamed from: a */
    String mo11784a() {
        return this.f50380a;
    }

    @Nullable
    /* renamed from: b */
    String mo11785b() {
        return this.f50381b;
    }

    @Nullable
    /* renamed from: c */
    String mo11786c() {
        return this.f50382c;
    }

    /* renamed from: d */
    int mo11787d() {
        return this.f50383d;
    }

    /* renamed from: e */
    boolean mo11788e() {
        return this.f50384e;
    }

    /* renamed from: f */
    boolean mo11789f() {
        return this.f50385f;
    }

    /* renamed from: g */
    boolean mo11790g() {
        return this.f50386g;
    }

    /* renamed from: h */
    boolean mo11791h() {
        return this.f50387h;
    }

    /* renamed from: i */
    boolean mo11792i() {
        return this.f50388i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Request{bio=");
        stringBuilder.append(this.f50380a);
        stringBuilder.append(", work=");
        stringBuilder.append(this.f50381b);
        stringBuilder.append(", school=");
        stringBuilder.append(this.f50382c);
        stringBuilder.append(", numPhotos=");
        stringBuilder.append(this.f50383d);
        stringBuilder.append(", ageHidden=");
        stringBuilder.append(this.f50384e);
        stringBuilder.append(", distanceHidden=");
        stringBuilder.append(this.f50385f);
        stringBuilder.append(", instagramConnected=");
        stringBuilder.append(this.f50386g);
        stringBuilder.append(", spotifyConnected=");
        stringBuilder.append(this.f50387h);
        stringBuilder.append(", hasAnthem=");
        stringBuilder.append(this.f50388i);
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
        r1 = r5 instanceof com.tinder.profiletab.p369c.C16176d.C14466a;
        r2 = 0;
        if (r1 == 0) goto L_0x0083;
    L_0x0009:
        r5 = (com.tinder.profiletab.p369c.C16176d.C14466a) r5;
        r1 = r4.f50380a;
        if (r1 != 0) goto L_0x0016;
    L_0x000f:
        r1 = r5.mo11784a();
        if (r1 != 0) goto L_0x0081;
    L_0x0015:
        goto L_0x0022;
    L_0x0016:
        r1 = r4.f50380a;
        r3 = r5.mo11784a();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0081;
    L_0x0022:
        r1 = r4.f50381b;
        if (r1 != 0) goto L_0x002d;
    L_0x0026:
        r1 = r5.mo11785b();
        if (r1 != 0) goto L_0x0081;
    L_0x002c:
        goto L_0x0039;
    L_0x002d:
        r1 = r4.f50381b;
        r3 = r5.mo11785b();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0081;
    L_0x0039:
        r1 = r4.f50382c;
        if (r1 != 0) goto L_0x0044;
    L_0x003d:
        r1 = r5.mo11786c();
        if (r1 != 0) goto L_0x0081;
    L_0x0043:
        goto L_0x0050;
    L_0x0044:
        r1 = r4.f50382c;
        r3 = r5.mo11786c();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0081;
    L_0x0050:
        r1 = r4.f50383d;
        r3 = r5.mo11787d();
        if (r1 != r3) goto L_0x0081;
    L_0x0058:
        r1 = r4.f50384e;
        r3 = r5.mo11788e();
        if (r1 != r3) goto L_0x0081;
    L_0x0060:
        r1 = r4.f50385f;
        r3 = r5.mo11789f();
        if (r1 != r3) goto L_0x0081;
    L_0x0068:
        r1 = r4.f50386g;
        r3 = r5.mo11790g();
        if (r1 != r3) goto L_0x0081;
    L_0x0070:
        r1 = r4.f50387h;
        r3 = r5.mo11791h();
        if (r1 != r3) goto L_0x0081;
    L_0x0078:
        r1 = r4.f50388i;
        r5 = r5.mo11792i();
        if (r1 != r5) goto L_0x0081;
    L_0x0080:
        goto L_0x0082;
    L_0x0081:
        r0 = 0;
    L_0x0082:
        return r0;
    L_0x0083:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.profiletab.c.c.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((this.f50380a == null ? 0 : this.f50380a.hashCode()) ^ 1000003) * 1000003) ^ (this.f50381b == null ? 0 : this.f50381b.hashCode())) * 1000003;
        if (this.f50382c != null) {
            i = this.f50382c.hashCode();
        }
        int i2 = 1237;
        hashCode = (((((((((((hashCode ^ i) * 1000003) ^ this.f50383d) * 1000003) ^ (this.f50384e ? 1231 : 1237)) * 1000003) ^ (this.f50385f ? 1231 : 1237)) * 1000003) ^ (this.f50386g ? 1231 : 1237)) * 1000003) ^ (this.f50387h ? 1231 : 1237)) * 1000003;
        if (this.f50388i) {
            i2 = 1231;
        }
        return hashCode ^ i2;
    }
}
