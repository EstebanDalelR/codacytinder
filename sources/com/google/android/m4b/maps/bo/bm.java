package com.google.android.m4b.maps.bo;

public final class bm {
    /* renamed from: a */
    private float f17786a = 0.0f;
    /* renamed from: b */
    private float f17787b = 0.0f;

    /* renamed from: a */
    public final bm m21705a(bm bmVar) {
        this.f17786a = bmVar.f17786a;
        this.f17787b = bmVar.f17787b;
        return this;
    }

    /* renamed from: a */
    public final bm m21704a(af afVar, af afVar2) {
        this.f17786a = (float) (afVar2.f17658a - afVar.f17658a);
        this.f17787b = (float) (afVar2.f17659b - afVar.f17659b);
        return this;
    }

    /* renamed from: a */
    public static af m21701a(af afVar, bm bmVar, af afVar2) {
        afVar2.m21487d(afVar.f17658a + Math.round(bmVar.f17786a), afVar.f17659b + Math.round(bmVar.f17787b));
        return afVar2;
    }

    /* renamed from: c */
    public final float m21709c(bm bmVar) {
        return (this.f17786a * bmVar.f17786a) + (this.f17787b * bmVar.f17787b);
    }

    /* renamed from: d */
    public final boolean m21712d(bm bmVar) {
        return (this.f17786a * bmVar.f17787b) - (bmVar.f17786a * this.f17787b) < null ? true : null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (obj.getClass() == getClass()) {
                bm bmVar = (bm) obj;
                return this.f17786a == bmVar.f17786a && this.f17787b == bmVar.f17787b;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f17786a) ^ Float.floatToIntBits(this.f17787b);
    }

    /* renamed from: a */
    public final boolean m21706a(float f, float f2) {
        return this.f17786a == 0.0f && this.f17787b == 0.0f;
    }

    public final String toString() {
        float f = this.f17786a;
        float f2 = this.f17787b;
        StringBuilder stringBuilder = new StringBuilder(33);
        stringBuilder.append("(");
        stringBuilder.append(f);
        stringBuilder.append(",");
        stringBuilder.append(f2);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    /* renamed from: b */
    public final bm m21708b(bm bmVar) {
        this.f17786a += bmVar.f17786a;
        this.f17787b += bmVar.f17787b;
        return this;
    }

    /* renamed from: a */
    public final bm m21703a(float f) {
        this.f17786a *= f;
        this.f17787b *= f;
        return this;
    }

    /* renamed from: a */
    public final bm m21702a() {
        this.f17786a = -this.f17786a;
        this.f17787b = -this.f17787b;
        return this;
    }

    /* renamed from: b */
    public final float m21707b() {
        return (float) Math.sqrt((double) m21709c(this));
    }

    /* renamed from: c */
    public final bm m21710c() {
        float b = m21707b();
        if (b == 0.0f) {
            this.f17786a = 0.0f;
            this.f17787b = 0.0f;
        } else {
            this.f17786a /= b;
            this.f17787b /= b;
        }
        return this;
    }

    /* renamed from: d */
    public final bm m21711d() {
        float f = this.f17786a;
        this.f17786a = -this.f17787b;
        this.f17787b = f;
        return this;
    }
}
