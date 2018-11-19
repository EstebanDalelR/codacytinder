package com.google.android.m4b.maps.bk;

import com.google.android.m4b.maps.bo.af;

/* renamed from: com.google.android.m4b.maps.bk.i */
public final class C4804i {
    /* renamed from: a */
    private final double f17524a;
    /* renamed from: b */
    private final double f17525b;

    /* renamed from: b */
    private static double m21259b(double d, double d2) {
        double d3 = d2 - d;
        return d3 >= 0.0d ? d3 : (d2 + 3.141592653589793d) - (d - 3.141592653589793d);
    }

    private C4804i(double d, double d2, boolean z) {
        this.f17524a = d;
        this.f17525b = d2;
    }

    /* renamed from: a */
    public static C4804i m21257a() {
        return new C4804i(3.141592653589793d, -3.141592653589793d, true);
    }

    /* renamed from: e */
    private static C4804i m21260e() {
        return new C4804i(-3.141592653589793d, 3.141592653589793d, true);
    }

    /* renamed from: a */
    public static C4804i m21258a(double d, double d2) {
        double d3 = d == -3.141592653589793d ? 3.141592653589793d : d;
        if (d2 == -3.141592653589793d) {
            d2 = 3.141592653589793d;
        }
        if (C4804i.m21259b(d3, d2) <= 3.141592653589793d) {
            return new C4804i(d3, d2, true);
        }
        return new C4804i(d2, d3, true);
    }

    /* renamed from: a */
    public final boolean m21264a(double d) {
        return m21262g() ? (d >= this.f17524a || d <= this.f17525b) && m21261f() == null : d >= this.f17524a && d <= this.f17525b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final com.google.android.m4b.maps.bk.C4804i m21263a(com.google.android.m4b.maps.bk.C4804i r20) {
        /*
        r19 = this;
        r0 = r19;
        r1 = r20;
        r2 = r20.m21261f();
        if (r2 == 0) goto L_0x000b;
    L_0x000a:
        return r0;
    L_0x000b:
        r2 = r1.f17524a;
        r2 = r0.m21264a(r2);
        if (r2 == 0) goto L_0x008a;
    L_0x0013:
        r2 = r1.f17525b;
        r2 = r0.m21264a(r2);
        if (r2 == 0) goto L_0x007e;
    L_0x001b:
        r2 = r19.m21262g();
        r3 = 0;
        r4 = 1;
        if (r2 == 0) goto L_0x0051;
    L_0x0023:
        r2 = r20.m21262g();
        if (r2 == 0) goto L_0x003a;
    L_0x0029:
        r5 = r1.f17524a;
        r7 = r0.f17524a;
        r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1));
        if (r2 < 0) goto L_0x0076;
    L_0x0031:
        r1 = r1.f17525b;
        r5 = r0.f17525b;
        r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1));
        if (r7 > 0) goto L_0x0076;
    L_0x0039:
        goto L_0x0063;
    L_0x003a:
        r5 = r1.f17524a;
        r7 = r0.f17524a;
        r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1));
        if (r2 >= 0) goto L_0x004a;
    L_0x0042:
        r1 = r1.f17525b;
        r5 = r0.f17525b;
        r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1));
        if (r7 > 0) goto L_0x0076;
    L_0x004a:
        r1 = r19.m21261f();
        if (r1 != 0) goto L_0x0076;
    L_0x0050:
        goto L_0x0063;
    L_0x0051:
        r2 = r20.m21262g();
        if (r2 == 0) goto L_0x0065;
    L_0x0057:
        r2 = r19.m21265b();
        if (r2 != 0) goto L_0x0063;
    L_0x005d:
        r1 = r20.m21261f();
        if (r1 == 0) goto L_0x0076;
    L_0x0063:
        r3 = 1;
        goto L_0x0076;
    L_0x0065:
        r5 = r1.f17524a;
        r7 = r0.f17524a;
        r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1));
        if (r2 < 0) goto L_0x0076;
    L_0x006d:
        r1 = r1.f17525b;
        r5 = r0.f17525b;
        r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1));
        if (r7 > 0) goto L_0x0076;
    L_0x0075:
        goto L_0x0063;
    L_0x0076:
        if (r3 == 0) goto L_0x0079;
    L_0x0078:
        return r0;
    L_0x0079:
        r1 = com.google.android.m4b.maps.bk.C4804i.m21260e();
        return r1;
    L_0x007e:
        r8 = new com.google.android.m4b.maps.bk.i;
        r3 = r0.f17524a;
        r5 = r1.f17525b;
        r7 = 1;
        r2 = r8;
        r2.<init>(r3, r5, r7);
        return r8;
    L_0x008a:
        r2 = r1.f17525b;
        r2 = r0.m21264a(r2);
        if (r2 == 0) goto L_0x009e;
    L_0x0092:
        r2 = new com.google.android.m4b.maps.bk.i;
        r4 = r1.f17524a;
        r6 = r0.f17525b;
        r8 = 1;
        r3 = r2;
        r3.<init>(r4, r6, r8);
        return r2;
    L_0x009e:
        r2 = r19.m21261f();
        if (r2 != 0) goto L_0x00dc;
    L_0x00a4:
        r2 = r0.f17524a;
        r2 = r1.m21264a(r2);
        if (r2 == 0) goto L_0x00ad;
    L_0x00ac:
        goto L_0x00dc;
    L_0x00ad:
        r2 = r1.f17525b;
        r4 = r0.f17524a;
        r2 = com.google.android.m4b.maps.bk.C4804i.m21259b(r2, r4);
        r4 = r0.f17525b;
        r6 = r1.f17524a;
        r4 = com.google.android.m4b.maps.bk.C4804i.m21259b(r4, r6);
        r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r6 >= 0) goto L_0x00cd;
    L_0x00c1:
        r2 = new com.google.android.m4b.maps.bk.i;
        r8 = r1.f17524a;
        r10 = r0.f17525b;
        r12 = 1;
        r7 = r2;
        r7.<init>(r8, r10, r12);
        return r2;
    L_0x00cd:
        r2 = new com.google.android.m4b.maps.bk.i;
        r14 = r0.f17524a;
        r3 = r1.f17525b;
        r18 = 1;
        r13 = r2;
        r16 = r3;
        r13.<init>(r14, r16, r18);
        return r2;
    L_0x00dc:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bk.i.a(com.google.android.m4b.maps.bk.i):com.google.android.m4b.maps.bk.i");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4804i)) {
            return false;
        }
        C4804i c4804i = (C4804i) obj;
        if (this.f17524a == c4804i.f17524a && this.f17525b == c4804i.f17525b) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static double m21256a(int i) {
        return (((double) af.m21465b(i)) / 5.36870912E8d) * 3.141592653589793d;
    }

    /* renamed from: b */
    public final boolean m21265b() {
        return this.f17525b - this.f17524a == 6.283185307179586d;
    }

    /* renamed from: f */
    private boolean m21261f() {
        return this.f17524a - this.f17525b == 6.283185307179586d;
    }

    /* renamed from: g */
    private boolean m21262g() {
        return this.f17524a > this.f17525b;
    }

    /* renamed from: c */
    public final double m21266c() {
        double d = (this.f17524a + this.f17525b) * 0.5d;
        if (m21262g()) {
            return d <= 0.0d ? d + 3.141592653589793d : d - 3.141592653589793d;
        } else {
            return d;
        }
    }

    /* renamed from: d */
    public final C4804i m21267d() {
        if (this.f17524a == this.f17525b) {
            return C4804i.m21260e();
        }
        return new C4804i(this.f17525b, this.f17524a, true);
    }

    public final int hashCode() {
        long doubleToLongBits = ((Double.doubleToLongBits(this.f17524a) + 629) * 37) + Double.doubleToLongBits(this.f17525b);
        return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
    }

    public final String toString() {
        double d = this.f17524a;
        double d2 = this.f17525b;
        StringBuilder stringBuilder = new StringBuilder(52);
        stringBuilder.append("[");
        stringBuilder.append(d);
        stringBuilder.append(", ");
        stringBuilder.append(d2);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
