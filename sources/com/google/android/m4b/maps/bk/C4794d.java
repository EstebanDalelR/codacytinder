package com.google.android.m4b.maps.bk;

/* renamed from: com.google.android.m4b.maps.bk.d */
public final class C4794d {
    /* renamed from: a */
    private final C6466g f17495a;

    C4794d(C6466g c6466g) {
        this.f17495a = c6466g;
    }

    /* renamed from: a */
    public final double m21238a() {
        return this.f17495a.m28354d();
    }

    /* renamed from: b */
    public final boolean m21239b() {
        return this.f17495a.m28358f();
    }

    /* renamed from: c */
    public final boolean m21240c() {
        return this.f17495a.m28359g();
    }

    /* renamed from: d */
    public final boolean m21241d() {
        return this.f17495a.m28357e();
    }

    /* renamed from: e */
    public final boolean m21242e() {
        return this.f17495a.m28360h();
    }

    /* renamed from: f */
    final C6466g m21243f() {
        return this.f17495a;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{");
        stringBuilder.append(this.f17495a.toString());
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C4794d) {
            return ((C4794d) obj).f17495a.equals(this.f17495a);
        }
        return null;
    }

    public final int hashCode() {
        return this.f17495a.hashCode();
    }
}
