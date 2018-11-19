package com.tinder.recsads.analytics;

import android.support.annotation.Nullable;
import com.tinder.recsads.analytics.C16432d.C14735a;
import com.tinder.recsads.analytics.C16432d.C14735a.C14734a;

/* renamed from: com.tinder.recsads.analytics.w */
final class C16444w extends C14735a {
    /* renamed from: a */
    private final Number f51022a;
    /* renamed from: b */
    private final String f51023b;

    /* renamed from: com.tinder.recsads.analytics.w$a */
    static final class C16443a extends C14734a {
        /* renamed from: a */
        private Number f51020a;
        /* renamed from: b */
        private String f51021b;

        C16443a() {
        }

        /* renamed from: a */
        public C14735a mo12169a() {
            return new C16444w(this.f51020a, this.f51021b);
        }
    }

    private C16444w(@Nullable Number number, @Nullable String str) {
        this.f51022a = number;
        this.f51023b = str;
    }

    @Nullable
    /* renamed from: a */
    public Number mo12170a() {
        return this.f51022a;
    }

    @Nullable
    /* renamed from: b */
    public String mo12171b() {
        return this.f51023b;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Request{carouselLength=");
        stringBuilder.append(this.f51022a);
        stringBuilder.append(", format=");
        stringBuilder.append(this.f51023b);
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
        r1 = r5 instanceof com.tinder.recsads.analytics.C16432d.C14735a;
        r2 = 0;
        if (r1 == 0) goto L_0x003c;
    L_0x0009:
        r5 = (com.tinder.recsads.analytics.C16432d.C14735a) r5;
        r1 = r4.f51022a;
        if (r1 != 0) goto L_0x0016;
    L_0x000f:
        r1 = r5.mo12170a();
        if (r1 != 0) goto L_0x003a;
    L_0x0015:
        goto L_0x0022;
    L_0x0016:
        r1 = r4.f51022a;
        r3 = r5.mo12170a();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x003a;
    L_0x0022:
        r1 = r4.f51023b;
        if (r1 != 0) goto L_0x002d;
    L_0x0026:
        r5 = r5.mo12171b();
        if (r5 != 0) goto L_0x003a;
    L_0x002c:
        goto L_0x003b;
    L_0x002d:
        r1 = r4.f51023b;
        r5 = r5.mo12171b();
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
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.recsads.analytics.w.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((this.f51022a == null ? 0 : this.f51022a.hashCode()) ^ 1000003) * 1000003;
        if (this.f51023b != null) {
            i = this.f51023b.hashCode();
        }
        return hashCode ^ i;
    }
}
