package com.tinder.tinderplus.model;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.purchase.domain.model.C14510e;
import com.tinder.tinderplus.model.C15219p.C15218b;
import com.tinder.tinderplus.model.C15219p.C15218b.C15217a;
import java.util.List;

/* renamed from: com.tinder.tinderplus.model.c */
final class C16959c extends C15218b {
    /* renamed from: a */
    private final Integer f52341a;
    /* renamed from: b */
    private final boolean f52342b;
    /* renamed from: c */
    private final C14510e f52343c;
    /* renamed from: d */
    private final List<String> f52344d;
    /* renamed from: e */
    private final Integer f52345e;
    /* renamed from: f */
    private final Integer f52346f;
    /* renamed from: g */
    private final List<Integer> f52347g;

    /* renamed from: com.tinder.tinderplus.model.c$a */
    static final class C16958a extends C15217a {
        /* renamed from: a */
        private Integer f52334a;
        /* renamed from: b */
        private Boolean f52335b;
        /* renamed from: c */
        private C14510e f52336c;
        /* renamed from: d */
        private List<String> f52337d;
        /* renamed from: e */
        private Integer f52338e;
        /* renamed from: f */
        private Integer f52339f;
        /* renamed from: g */
        private List<Integer> f52340g;

        C16958a() {
        }

        /* renamed from: a */
        public C15217a mo12629a(@Nullable Integer num) {
            this.f52334a = num;
            return this;
        }

        /* renamed from: a */
        public C15217a mo12631a(boolean z) {
            this.f52335b = Boolean.valueOf(z);
            return this;
        }

        /* renamed from: a */
        public C15217a mo12628a(@Nullable C14510e c14510e) {
            this.f52336c = c14510e;
            return this;
        }

        /* renamed from: a */
        public C15217a mo12630a(List<String> list) {
            this.f52337d = list;
            return this;
        }

        /* renamed from: b */
        public C15217a mo12633b(@Nullable Integer num) {
            this.f52338e = num;
            return this;
        }

        /* renamed from: c */
        public C15217a mo12635c(@Nullable Integer num) {
            this.f52339f = num;
            return this;
        }

        /* renamed from: b */
        public C15217a mo12634b(List<Integer> list) {
            this.f52340g = list;
            return this;
        }

        /* renamed from: a */
        public C15218b mo12632a() {
            String str = "";
            if (this.f52335b == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" isFromNotification");
                str = stringBuilder.toString();
            }
            if (this.f52337d == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" orderedPerks");
                str = stringBuilder.toString();
            }
            if (this.f52340g == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" incentives");
                str = stringBuilder.toString();
            }
            if (str.isEmpty()) {
                return new C16959c(this.f52334a, this.f52335b.booleanValue(), this.f52336c, this.f52337d, this.f52338e, this.f52339f, this.f52340g);
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Missing required properties:");
            stringBuilder2.append(str);
            throw new IllegalStateException(stringBuilder2.toString());
        }
    }

    private C16959c(@Nullable Integer num, boolean z, @Nullable C14510e c14510e, List<String> list, @Nullable Integer num2, @Nullable Integer num3, List<Integer> list2) {
        this.f52341a = num;
        this.f52342b = z;
        this.f52343c = c14510e;
        this.f52344d = list;
        this.f52345e = num2;
        this.f52346f = num3;
        this.f52347g = list2;
    }

    @Nullable
    /* renamed from: a */
    public Integer mo12636a() {
        return this.f52341a;
    }

    /* renamed from: b */
    public boolean mo12637b() {
        return this.f52342b;
    }

    @Nullable
    /* renamed from: c */
    public C14510e mo12638c() {
        return this.f52343c;
    }

    @NonNull
    /* renamed from: d */
    public List<String> mo12639d() {
        return this.f52344d;
    }

    @Nullable
    /* renamed from: e */
    public Integer mo12640e() {
        return this.f52345e;
    }

    @Nullable
    /* renamed from: f */
    public Integer mo12641f() {
        return this.f52346f;
    }

    @NonNull
    /* renamed from: g */
    public List<Integer> mo12642g() {
        return this.f52347g;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Options{analyticsSource=");
        stringBuilder.append(this.f52341a);
        stringBuilder.append(", isFromNotification=");
        stringBuilder.append(this.f52342b);
        stringBuilder.append(", intendedOffer=");
        stringBuilder.append(this.f52343c);
        stringBuilder.append(", orderedPerks=");
        stringBuilder.append(this.f52344d);
        stringBuilder.append(", position=");
        stringBuilder.append(this.f52345e);
        stringBuilder.append(", lastPosition=");
        stringBuilder.append(this.f52346f);
        stringBuilder.append(", incentives=");
        stringBuilder.append(this.f52347g);
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
        r1 = r5 instanceof com.tinder.tinderplus.model.C15219p.C15218b;
        r2 = 0;
        if (r1 == 0) goto L_0x008a;
    L_0x0009:
        r5 = (com.tinder.tinderplus.model.C15219p.C15218b) r5;
        r1 = r4.f52341a;
        if (r1 != 0) goto L_0x0016;
    L_0x000f:
        r1 = r5.mo12636a();
        if (r1 != 0) goto L_0x0088;
    L_0x0015:
        goto L_0x0022;
    L_0x0016:
        r1 = r4.f52341a;
        r3 = r5.mo12636a();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0088;
    L_0x0022:
        r1 = r4.f52342b;
        r3 = r5.mo12637b();
        if (r1 != r3) goto L_0x0088;
    L_0x002a:
        r1 = r4.f52343c;
        if (r1 != 0) goto L_0x0035;
    L_0x002e:
        r1 = r5.mo12638c();
        if (r1 != 0) goto L_0x0088;
    L_0x0034:
        goto L_0x0041;
    L_0x0035:
        r1 = r4.f52343c;
        r3 = r5.mo12638c();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0088;
    L_0x0041:
        r1 = r4.f52344d;
        r3 = r5.mo12639d();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0088;
    L_0x004d:
        r1 = r4.f52345e;
        if (r1 != 0) goto L_0x0058;
    L_0x0051:
        r1 = r5.mo12640e();
        if (r1 != 0) goto L_0x0088;
    L_0x0057:
        goto L_0x0064;
    L_0x0058:
        r1 = r4.f52345e;
        r3 = r5.mo12640e();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0088;
    L_0x0064:
        r1 = r4.f52346f;
        if (r1 != 0) goto L_0x006f;
    L_0x0068:
        r1 = r5.mo12641f();
        if (r1 != 0) goto L_0x0088;
    L_0x006e:
        goto L_0x007b;
    L_0x006f:
        r1 = r4.f52346f;
        r3 = r5.mo12641f();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0088;
    L_0x007b:
        r1 = r4.f52347g;
        r5 = r5.mo12642g();
        r5 = r1.equals(r5);
        if (r5 == 0) goto L_0x0088;
    L_0x0087:
        goto L_0x0089;
    L_0x0088:
        r0 = 0;
    L_0x0089:
        return r0;
    L_0x008a:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.tinderplus.model.c.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((((((((this.f52341a == null ? 0 : this.f52341a.hashCode()) ^ 1000003) * 1000003) ^ (this.f52342b ? 1231 : 1237)) * 1000003) ^ (this.f52343c == null ? 0 : this.f52343c.hashCode())) * 1000003) ^ this.f52344d.hashCode()) * 1000003) ^ (this.f52345e == null ? 0 : this.f52345e.hashCode())) * 1000003;
        if (this.f52346f != null) {
            i = this.f52346f.hashCode();
        }
        return ((hashCode ^ i) * 1000003) ^ this.f52347g.hashCode();
    }
}
