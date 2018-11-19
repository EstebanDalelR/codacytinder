package com.tinder.p238f.p240b.p241a.p242a;

import android.support.annotation.Nullable;
import com.tinder.p238f.p240b.p241a.p242a.C9367c.C9365a;
import com.tinder.p238f.p240b.p241a.p242a.C9367c.C9366b;
import com.tinder.passport.model.PassportLocation;

/* renamed from: com.tinder.f.b.a.a.a */
final class C11598a extends C9367c {
    /* renamed from: a */
    private final boolean f37994a;
    /* renamed from: b */
    private final C9366b f37995b;
    /* renamed from: c */
    private final PassportLocation f37996c;

    /* renamed from: com.tinder.f.b.a.a.a$a */
    static final class C11597a extends C9365a {
        /* renamed from: a */
        private Boolean f37991a;
        /* renamed from: b */
        private C9366b f37992b;
        /* renamed from: c */
        private PassportLocation f37993c;

        C11597a() {
        }

        /* renamed from: a */
        public C9365a mo10354a(boolean z) {
            this.f37991a = Boolean.valueOf(z);
            return this;
        }

        /* renamed from: a */
        public C9365a mo10352a(@Nullable C9366b c9366b) {
            this.f37992b = c9366b;
            return this;
        }

        /* renamed from: a */
        public C9365a mo10353a(@Nullable PassportLocation passportLocation) {
            this.f37993c = passportLocation;
            return this;
        }

        /* renamed from: a */
        public C9367c mo10355a() {
            String str = "";
            if (this.f37991a == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" isTraveling");
                str = stringBuilder.toString();
            }
            if (str.isEmpty()) {
                return new C11598a(this.f37991a.booleanValue(), this.f37992b, this.f37993c);
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Missing required properties:");
            stringBuilder2.append(str);
            throw new IllegalStateException(stringBuilder2.toString());
        }
    }

    private C11598a(boolean z, @Nullable C9366b c9366b, @Nullable PassportLocation passportLocation) {
        this.f37994a = z;
        this.f37995b = c9366b;
        this.f37996c = passportLocation;
    }

    /* renamed from: a */
    public boolean mo10356a() {
        return this.f37994a;
    }

    @Nullable
    /* renamed from: b */
    public C9366b mo10357b() {
        return this.f37995b;
    }

    @Nullable
    /* renamed from: c */
    public PassportLocation mo10358c() {
        return this.f37996c;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TravelingInfo{isTraveling=");
        stringBuilder.append(this.f37994a);
        stringBuilder.append(", travelLocation=");
        stringBuilder.append(this.f37995b);
        stringBuilder.append(", passportLocation=");
        stringBuilder.append(this.f37996c);
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
        r1 = r5 instanceof com.tinder.p238f.p240b.p241a.p242a.C9367c;
        r2 = 0;
        if (r1 == 0) goto L_0x0044;
    L_0x0009:
        r5 = (com.tinder.p238f.p240b.p241a.p242a.C9367c) r5;
        r1 = r4.f37994a;
        r3 = r5.mo10356a();
        if (r1 != r3) goto L_0x0042;
    L_0x0013:
        r1 = r4.f37995b;
        if (r1 != 0) goto L_0x001e;
    L_0x0017:
        r1 = r5.mo10357b();
        if (r1 != 0) goto L_0x0042;
    L_0x001d:
        goto L_0x002a;
    L_0x001e:
        r1 = r4.f37995b;
        r3 = r5.mo10357b();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0042;
    L_0x002a:
        r1 = r4.f37996c;
        if (r1 != 0) goto L_0x0035;
    L_0x002e:
        r5 = r5.mo10358c();
        if (r5 != 0) goto L_0x0042;
    L_0x0034:
        goto L_0x0043;
    L_0x0035:
        r1 = r4.f37996c;
        r5 = r5.mo10358c();
        r5 = r1.equals(r5);
        if (r5 == 0) goto L_0x0042;
    L_0x0041:
        goto L_0x0043;
    L_0x0042:
        r0 = 0;
    L_0x0043:
        return r0;
    L_0x0044:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.f.b.a.a.a.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((this.f37994a ? 1231 : 1237) ^ 1000003) * 1000003) ^ (this.f37995b == null ? 0 : this.f37995b.hashCode())) * 1000003;
        if (this.f37996c != null) {
            i = this.f37996c.hashCode();
        }
        return hashCode ^ i;
    }
}
