package com.tinder.profiletab.p370d;

import com.tinder.domain.common.model.ProfileUser;
import com.tinder.profiletab.p370d.C14470b.C14468a;
import javax.annotation.Nullable;

/* renamed from: com.tinder.profiletab.d.a */
final class C16186a extends C14470b {
    /* renamed from: a */
    private final ProfileUser f50408a;
    /* renamed from: b */
    private final String f50409b;
    /* renamed from: c */
    private final String f50410c;
    /* renamed from: d */
    private final String f50411d;
    /* renamed from: e */
    private final String f50412e;
    /* renamed from: f */
    private final String f50413f;

    /* renamed from: com.tinder.profiletab.d.a$a */
    static final class C16185a extends C14468a {
        /* renamed from: a */
        private ProfileUser f50402a;
        /* renamed from: b */
        private String f50403b;
        /* renamed from: c */
        private String f50404c;
        /* renamed from: d */
        private String f50405d;
        /* renamed from: e */
        private String f50406e;
        /* renamed from: f */
        private String f50407f;

        C16185a() {
        }

        /* renamed from: a */
        public C14468a m61134a(ProfileUser profileUser) {
            this.f50402a = profileUser;
            return this;
        }

        /* renamed from: a */
        public C14468a mo11793a(String str) {
            this.f50403b = str;
            return this;
        }

        /* renamed from: b */
        public C14468a mo11795b(@Nullable String str) {
            this.f50404c = str;
            return this;
        }

        /* renamed from: c */
        public C14468a mo11796c(@Nullable String str) {
            this.f50405d = str;
            return this;
        }

        /* renamed from: d */
        public C14468a mo11797d(@Nullable String str) {
            this.f50406e = str;
            return this;
        }

        /* renamed from: e */
        public C14468a mo11798e(@Nullable String str) {
            this.f50407f = str;
            return this;
        }

        /* renamed from: a */
        public C14470b mo11794a() {
            String str = "";
            if (this.f50402a == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" user");
                str = stringBuilder.toString();
            }
            if (this.f50403b == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" nameAndAgeLine");
                str = stringBuilder.toString();
            }
            if (str.isEmpty()) {
                return new C16186a(this.f50402a, this.f50403b, this.f50404c, this.f50405d, this.f50406e, this.f50407f);
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Missing required properties:");
            stringBuilder2.append(str);
            throw new IllegalStateException(stringBuilder2.toString());
        }
    }

    private C16186a(ProfileUser profileUser, String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.f50408a = profileUser;
        this.f50409b = str;
        this.f50410c = str2;
        this.f50411d = str3;
        this.f50412e = str4;
        this.f50413f = str5;
    }

    /* renamed from: a */
    public ProfileUser mo11799a() {
        return this.f50408a;
    }

    /* renamed from: b */
    public String mo11800b() {
        return this.f50409b;
    }

    @Nullable
    /* renamed from: c */
    public String mo11801c() {
        return this.f50410c;
    }

    @Nullable
    /* renamed from: d */
    public String mo11802d() {
        return this.f50411d;
    }

    @Nullable
    /* renamed from: e */
    public String mo11803e() {
        return this.f50412e;
    }

    @Nullable
    /* renamed from: f */
    public String mo11804f() {
        return this.f50413f;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("UserInfoViewModel{user=");
        stringBuilder.append(this.f50408a);
        stringBuilder.append(", nameAndAgeLine=");
        stringBuilder.append(this.f50409b);
        stringBuilder.append(", avatarUrl=");
        stringBuilder.append(this.f50410c);
        stringBuilder.append(", school=");
        stringBuilder.append(this.f50411d);
        stringBuilder.append(", job=");
        stringBuilder.append(this.f50412e);
        stringBuilder.append(", passportLocation=");
        stringBuilder.append(this.f50413f);
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
        r1 = r5 instanceof com.tinder.profiletab.p370d.C14470b;
        r2 = 0;
        if (r1 == 0) goto L_0x0082;
    L_0x0009:
        r5 = (com.tinder.profiletab.p370d.C14470b) r5;
        r1 = r4.f50408a;
        r3 = r5.mo11799a();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0080;
    L_0x0017:
        r1 = r4.f50409b;
        r3 = r5.mo11800b();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0080;
    L_0x0023:
        r1 = r4.f50410c;
        if (r1 != 0) goto L_0x002e;
    L_0x0027:
        r1 = r5.mo11801c();
        if (r1 != 0) goto L_0x0080;
    L_0x002d:
        goto L_0x003a;
    L_0x002e:
        r1 = r4.f50410c;
        r3 = r5.mo11801c();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0080;
    L_0x003a:
        r1 = r4.f50411d;
        if (r1 != 0) goto L_0x0045;
    L_0x003e:
        r1 = r5.mo11802d();
        if (r1 != 0) goto L_0x0080;
    L_0x0044:
        goto L_0x0051;
    L_0x0045:
        r1 = r4.f50411d;
        r3 = r5.mo11802d();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0080;
    L_0x0051:
        r1 = r4.f50412e;
        if (r1 != 0) goto L_0x005c;
    L_0x0055:
        r1 = r5.mo11803e();
        if (r1 != 0) goto L_0x0080;
    L_0x005b:
        goto L_0x0068;
    L_0x005c:
        r1 = r4.f50412e;
        r3 = r5.mo11803e();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0080;
    L_0x0068:
        r1 = r4.f50413f;
        if (r1 != 0) goto L_0x0073;
    L_0x006c:
        r5 = r5.mo11804f();
        if (r5 != 0) goto L_0x0080;
    L_0x0072:
        goto L_0x0081;
    L_0x0073:
        r1 = r4.f50413f;
        r5 = r5.mo11804f();
        r5 = r1.equals(r5);
        if (r5 == 0) goto L_0x0080;
    L_0x007f:
        goto L_0x0081;
    L_0x0080:
        r0 = 0;
    L_0x0081:
        return r0;
    L_0x0082:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.profiletab.d.a.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = (((((((((this.f50408a.hashCode() ^ 1000003) * 1000003) ^ this.f50409b.hashCode()) * 1000003) ^ (this.f50410c == null ? 0 : this.f50410c.hashCode())) * 1000003) ^ (this.f50411d == null ? 0 : this.f50411d.hashCode())) * 1000003) ^ (this.f50412e == null ? 0 : this.f50412e.hashCode())) * 1000003;
        if (this.f50413f != null) {
            i = this.f50413f.hashCode();
        }
        return hashCode ^ i;
    }
}
