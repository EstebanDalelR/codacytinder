package com.tinder.match.viewmodel;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.match.viewmodel.MatchListItem.C9883a;
import com.tinder.match.viewmodel.MatchListItem.Type;

/* renamed from: com.tinder.match.viewmodel.a */
final class C12095a extends MatchListItem {
    /* renamed from: a */
    private final C12099h f39246a;
    /* renamed from: b */
    private final String f39247b;
    /* renamed from: c */
    private final Type f39248c;

    /* renamed from: com.tinder.match.viewmodel.a$a */
    static final class C12094a extends C9883a {
        /* renamed from: a */
        private C12099h f39243a;
        /* renamed from: b */
        private String f39244b;
        /* renamed from: c */
        private Type f39245c;

        C12094a() {
        }

        /* renamed from: a */
        public C9883a mo10597a(@Nullable C12099h c12099h) {
            this.f39243a = c12099h;
            return this;
        }

        /* renamed from: a */
        public C9883a mo10598a(@Nullable String str) {
            this.f39244b = str;
            return this;
        }

        /* renamed from: a */
        public C9883a mo10596a(Type type) {
            this.f39245c = type;
            return this;
        }

        /* renamed from: a */
        public MatchListItem mo10599a() {
            String str = "";
            if (this.f39245c == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" type");
                str = stringBuilder.toString();
            }
            if (str.isEmpty()) {
                return new C12095a(this.f39243a, this.f39244b, this.f39245c);
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Missing required properties:");
            stringBuilder2.append(str);
            throw new IllegalStateException(stringBuilder2.toString());
        }
    }

    private C12095a(@Nullable C12099h c12099h, @Nullable String str, Type type) {
        this.f39246a = c12099h;
        this.f39247b = str;
        this.f39248c = type;
    }

    @Nullable
    /* renamed from: a */
    public C12099h mo10600a() {
        return this.f39246a;
    }

    @Nullable
    /* renamed from: b */
    public String mo10601b() {
        return this.f39247b;
    }

    @NonNull
    /* renamed from: c */
    public Type mo10602c() {
        return this.f39248c;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("MatchListItem{matchViewModel=");
        stringBuilder.append(this.f39246a);
        stringBuilder.append(", untouchedMatchCount=");
        stringBuilder.append(this.f39247b);
        stringBuilder.append(", type=");
        stringBuilder.append(this.f39248c);
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
        r1 = r5 instanceof com.tinder.match.viewmodel.MatchListItem;
        r2 = 0;
        if (r1 == 0) goto L_0x0048;
    L_0x0009:
        r5 = (com.tinder.match.viewmodel.MatchListItem) r5;
        r1 = r4.f39246a;
        if (r1 != 0) goto L_0x0016;
    L_0x000f:
        r1 = r5.mo10600a();
        if (r1 != 0) goto L_0x0046;
    L_0x0015:
        goto L_0x0022;
    L_0x0016:
        r1 = r4.f39246a;
        r3 = r5.mo10600a();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0046;
    L_0x0022:
        r1 = r4.f39247b;
        if (r1 != 0) goto L_0x002d;
    L_0x0026:
        r1 = r5.mo10601b();
        if (r1 != 0) goto L_0x0046;
    L_0x002c:
        goto L_0x0039;
    L_0x002d:
        r1 = r4.f39247b;
        r3 = r5.mo10601b();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0046;
    L_0x0039:
        r1 = r4.f39248c;
        r5 = r5.mo10602c();
        r5 = r1.equals(r5);
        if (r5 == 0) goto L_0x0046;
    L_0x0045:
        goto L_0x0047;
    L_0x0046:
        r0 = 0;
    L_0x0047:
        return r0;
    L_0x0048:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.match.viewmodel.a.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((this.f39246a == null ? 0 : this.f39246a.hashCode()) ^ 1000003) * 1000003;
        if (this.f39247b != null) {
            i = this.f39247b.hashCode();
        }
        return ((hashCode ^ i) * 1000003) ^ this.f39248c.hashCode();
    }
}
