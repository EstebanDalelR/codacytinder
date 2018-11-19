package com.tinder.recsads.analytics;

import android.support.annotation.Nullable;
import com.tinder.recsads.analytics.C16439r.C14745a;
import com.tinder.recsads.analytics.C16439r.C14745a.C14744a;

/* renamed from: com.tinder.recsads.analytics.z */
final class C16450z extends C14745a {
    /* renamed from: a */
    private final Number f51038a;
    /* renamed from: b */
    private final Number f51039b;

    /* renamed from: com.tinder.recsads.analytics.z$a */
    static final class C16449a extends C14744a {
        /* renamed from: a */
        private Number f51036a;
        /* renamed from: b */
        private Number f51037b;

        C16449a() {
        }

        /* renamed from: a */
        public C14745a mo12181a() {
            return new C16450z(this.f51036a, this.f51037b);
        }
    }

    private C16450z(@Nullable Number number, @Nullable Number number2) {
        this.f51038a = number;
        this.f51039b = number2;
    }

    @Nullable
    /* renamed from: a */
    public Number mo12182a() {
        return this.f51038a;
    }

    @Nullable
    /* renamed from: b */
    public Number mo12183b() {
        return this.f51039b;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Request{progress=");
        stringBuilder.append(this.f51038a);
        stringBuilder.append(", timeViewed=");
        stringBuilder.append(this.f51039b);
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
        r1 = r5 instanceof com.tinder.recsads.analytics.C16439r.C14745a;
        r2 = 0;
        if (r1 == 0) goto L_0x003c;
    L_0x0009:
        r5 = (com.tinder.recsads.analytics.C16439r.C14745a) r5;
        r1 = r4.f51038a;
        if (r1 != 0) goto L_0x0016;
    L_0x000f:
        r1 = r5.mo12182a();
        if (r1 != 0) goto L_0x003a;
    L_0x0015:
        goto L_0x0022;
    L_0x0016:
        r1 = r4.f51038a;
        r3 = r5.mo12182a();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x003a;
    L_0x0022:
        r1 = r4.f51039b;
        if (r1 != 0) goto L_0x002d;
    L_0x0026:
        r5 = r5.mo12183b();
        if (r5 != 0) goto L_0x003a;
    L_0x002c:
        goto L_0x003b;
    L_0x002d:
        r1 = r4.f51039b;
        r5 = r5.mo12183b();
        r5 = r1.equals(r5);
        if (r5 == 0) goto L_0x003a;
    L_0x0039:
        goto L_0x003b;
    L_0x003a:
        r0 = 0;
    L_0x003b:
        return r0;
    L_0x003c:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.recsads.analytics.z.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((this.f51038a == null ? 0 : this.f51038a.hashCode()) ^ 1000003) * 1000003;
        if (this.f51039b != null) {
            i = this.f51039b.hashCode();
        }
        return hashCode ^ i;
    }
}
