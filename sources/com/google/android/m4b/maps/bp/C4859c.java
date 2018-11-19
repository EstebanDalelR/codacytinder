package com.google.android.m4b.maps.bp;

import com.google.android.m4b.maps.bo.af;
import com.google.android.m4b.maps.bo.aj;
import com.google.android.m4b.maps.bo.ba;

/* renamed from: com.google.android.m4b.maps.bp.c */
public final class C4859c {
    /* renamed from: a */
    public static final C4860d f17844a = new C4860d("Unknown Road", null, false);
    /* renamed from: b */
    private static final C4858a[] f17845b = new C4858a[0];
    /* renamed from: c */
    private final int f17846c;
    /* renamed from: d */
    private final long f17847d;
    /* renamed from: e */
    private final C4860d[] f17848e;
    /* renamed from: f */
    private final aj f17849f;
    /* renamed from: g */
    private final int f17850g;
    /* renamed from: h */
    private C4858a[] f17851h;
    /* renamed from: i */
    private final int f17852i;
    /* renamed from: j */
    private final int f17853j;

    public C4859c(long j, C4860d[] c4860dArr, aj ajVar, int i, int i2, int i3, int i4) {
        if (c4860dArr.length == 0) {
            throw new IllegalArgumentException("Segments must have at least one name");
        }
        this.f17846c = i;
        this.f17847d = j;
        this.f17848e = c4860dArr;
        this.f17849f = ajVar;
        this.f17850g = i2;
        this.f17851h = f17845b;
        this.f17852i = i3;
        this.f17853j = i4;
    }

    /* renamed from: a */
    public static long m21792a(ba baVar, int i) {
        return ((((long) baVar.m21620c()) << 48) | (((long) baVar.m21621d()) << 32)) | ((long) i);
    }

    /* renamed from: a */
    public final void m21795a(C4858a... c4858aArr) {
        if (c4858aArr.length == 0) {
            this.f17851h = f17845b;
        } else {
            this.f17851h = c4858aArr;
        }
    }

    /* renamed from: a */
    private af m21793a(int i) {
        af afVar = new af();
        m21794a(i, afVar);
        return afVar;
    }

    /* renamed from: a */
    public final void m21794a(int i, af afVar) {
        if ((this.f17846c & 4) != 0) {
            i = (this.f17849f.m21528b() - i) - 1;
        }
        this.f17849f.m21524a(i, afVar);
    }

    public final int hashCode() {
        return (int) (((((this.f17847d >>> 48) & 255) << 24) | (((this.f17847d >>> 32) & 255) << 16)) | (this.f17847d & 65535));
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof C4859c) && this.f17847d == ((C4859c) obj).f17847d) {
            return true;
        }
        return false;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[name: ");
        stringBuilder.append(this.f17848e[0]);
        stringBuilder.append(" unroutable: ");
        stringBuilder.append((this.f17846c & 8) != 0);
        stringBuilder.append(" leaves-region: ");
        stringBuilder.append((this.f17846c & 1) != 0);
        stringBuilder.append(" enters-region: ");
        stringBuilder.append((this.f17846c & 2) != 0);
        stringBuilder.append(" num-points: ");
        stringBuilder.append(this.f17849f.m21528b());
        stringBuilder.append(" first-point: ");
        stringBuilder.append(m21793a(0).m21498j());
        stringBuilder.append(" last-point: ");
        stringBuilder.append(m21793a(this.f17849f.m21528b() - 1).m21498j());
        stringBuilder.append(" num-arcs: ");
        stringBuilder.append(this.f17851h.length);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
