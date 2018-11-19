package com.tinder.recsads.analytics;

import com.tinder.recsads.analytics.AdEventFields.C14727a;
import com.tinder.recsads.analytics.AdEventFields.From;
import com.tinder.recsads.analytics.AdEventFields.Type;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.tinder.recsads.analytics.v */
final class C16442v extends AdEventFields {
    /* renamed from: b */
    private final Number f51013b;
    /* renamed from: c */
    private final String f51014c;
    /* renamed from: d */
    private final String f51015d;
    /* renamed from: e */
    private final Provider f51016e;
    /* renamed from: f */
    private final Type f51017f;
    /* renamed from: g */
    private final From f51018g;
    /* renamed from: h */
    private final Boolean f51019h;

    /* renamed from: com.tinder.recsads.analytics.v$a */
    static final class C16441a extends C14727a {
        /* renamed from: a */
        private Number f51006a;
        /* renamed from: b */
        private String f51007b;
        /* renamed from: c */
        private String f51008c;
        /* renamed from: d */
        private Provider f51009d;
        /* renamed from: e */
        private Type f51010e;
        /* renamed from: f */
        private From f51011f;
        /* renamed from: g */
        private Boolean f51012g;

        C16441a() {
        }

        /* renamed from: a */
        public C14727a mo12159a(@Nullable Number number) {
            this.f51006a = number;
            return this;
        }

        /* renamed from: b */
        public C14727a m61842b(@Nullable String str) {
            this.f51007b = str;
            return this;
        }

        /* renamed from: a */
        public C14727a mo12160a(@Nullable String str) {
            this.f51008c = str;
            return this;
        }

        /* renamed from: a */
        public C14727a mo12158a(Provider provider) {
            this.f51009d = provider;
            return this;
        }

        /* renamed from: a */
        public C14727a mo12157a(Type type) {
            this.f51010e = type;
            return this;
        }

        /* renamed from: a */
        public C14727a mo12156a(From from) {
            this.f51011f = from;
            return this;
        }

        /* renamed from: a */
        public AdEventFields mo12161a() {
            String str = "";
            if (this.f51009d == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" provider");
                str = stringBuilder.toString();
            }
            if (this.f51010e == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" type");
                str = stringBuilder.toString();
            }
            if (this.f51011f == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" from");
                str = stringBuilder.toString();
            }
            if (str.isEmpty()) {
                return new C16442v(this.f51006a, this.f51007b, this.f51008c, this.f51009d, this.f51010e, this.f51011f, this.f51012g);
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Missing required properties:");
            stringBuilder2.append(str);
            throw new IllegalStateException(stringBuilder2.toString());
        }
    }

    private C16442v(@Nullable Number number, @Nullable String str, @Nullable String str2, Provider provider, Type type, From from, @Nullable Boolean bool) {
        this.f51013b = number;
        this.f51014c = str;
        this.f51015d = str2;
        this.f51016e = provider;
        this.f51017f = type;
        this.f51018g = from;
        this.f51019h = bool;
    }

    @Nullable
    /* renamed from: a */
    public Number mo12162a() {
        return this.f51013b;
    }

    @Nullable
    /* renamed from: b */
    public String mo12163b() {
        return this.f51014c;
    }

    @Nullable
    /* renamed from: c */
    public String mo12164c() {
        return this.f51015d;
    }

    @NotNull
    /* renamed from: d */
    public Provider mo12165d() {
        return this.f51016e;
    }

    @NotNull
    /* renamed from: e */
    public Type mo12166e() {
        return this.f51017f;
    }

    @NotNull
    /* renamed from: f */
    public From mo12167f() {
        return this.f51018g;
    }

    @Nullable
    /* renamed from: g */
    public Boolean mo12168g() {
        return this.f51019h;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AdEventFields{adCadence=");
        stringBuilder.append(this.f51013b);
        stringBuilder.append(", creativeId=");
        stringBuilder.append(this.f51014c);
        stringBuilder.append(", campaignId=");
        stringBuilder.append(this.f51015d);
        stringBuilder.append(", provider=");
        stringBuilder.append(this.f51016e);
        stringBuilder.append(", type=");
        stringBuilder.append(this.f51017f);
        stringBuilder.append(", from=");
        stringBuilder.append(this.f51018g);
        stringBuilder.append(", mute=");
        stringBuilder.append(this.f51019h);
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
        r1 = r5 instanceof com.tinder.recsads.analytics.AdEventFields;
        r2 = 0;
        if (r1 == 0) goto L_0x008e;
    L_0x0009:
        r5 = (com.tinder.recsads.analytics.AdEventFields) r5;
        r1 = r4.f51013b;
        if (r1 != 0) goto L_0x0016;
    L_0x000f:
        r1 = r5.mo12162a();
        if (r1 != 0) goto L_0x008c;
    L_0x0015:
        goto L_0x0022;
    L_0x0016:
        r1 = r4.f51013b;
        r3 = r5.mo12162a();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x008c;
    L_0x0022:
        r1 = r4.f51014c;
        if (r1 != 0) goto L_0x002d;
    L_0x0026:
        r1 = r5.mo12163b();
        if (r1 != 0) goto L_0x008c;
    L_0x002c:
        goto L_0x0039;
    L_0x002d:
        r1 = r4.f51014c;
        r3 = r5.mo12163b();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x008c;
    L_0x0039:
        r1 = r4.f51015d;
        if (r1 != 0) goto L_0x0044;
    L_0x003d:
        r1 = r5.mo12164c();
        if (r1 != 0) goto L_0x008c;
    L_0x0043:
        goto L_0x0050;
    L_0x0044:
        r1 = r4.f51015d;
        r3 = r5.mo12164c();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x008c;
    L_0x0050:
        r1 = r4.f51016e;
        r3 = r5.mo12165d();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x008c;
    L_0x005c:
        r1 = r4.f51017f;
        r3 = r5.mo12166e();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x008c;
    L_0x0068:
        r1 = r4.f51018g;
        r3 = r5.mo12167f();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x008c;
    L_0x0074:
        r1 = r4.f51019h;
        if (r1 != 0) goto L_0x007f;
    L_0x0078:
        r5 = r5.mo12168g();
        if (r5 != 0) goto L_0x008c;
    L_0x007e:
        goto L_0x008d;
    L_0x007f:
        r1 = r4.f51019h;
        r5 = r5.mo12168g();
        r5 = r1.equals(r5);
        if (r5 == 0) goto L_0x008c;
    L_0x008b:
        goto L_0x008d;
    L_0x008c:
        r0 = 0;
    L_0x008d:
        return r0;
    L_0x008e:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.recsads.analytics.v.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((((((((((this.f51013b == null ? 0 : this.f51013b.hashCode()) ^ 1000003) * 1000003) ^ (this.f51014c == null ? 0 : this.f51014c.hashCode())) * 1000003) ^ (this.f51015d == null ? 0 : this.f51015d.hashCode())) * 1000003) ^ this.f51016e.hashCode()) * 1000003) ^ this.f51017f.hashCode()) * 1000003) ^ this.f51018g.hashCode()) * 1000003;
        if (this.f51019h != null) {
            i = this.f51019h.hashCode();
        }
        return hashCode ^ i;
    }
}
