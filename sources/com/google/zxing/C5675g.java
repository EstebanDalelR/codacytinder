package com.google.zxing;

/* renamed from: com.google.zxing.g */
public class C5675g {
    /* renamed from: a */
    private final float f21035a;
    /* renamed from: b */
    private final float f21036b;

    public C5675g(float f, float f2) {
        this.f21035a = f;
        this.f21036b = f2;
    }

    /* renamed from: a */
    public final float m24845a() {
        return this.f21035a;
    }

    /* renamed from: b */
    public final float m24846b() {
        return this.f21036b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5675g)) {
            return false;
        }
        C5675g c5675g = (C5675g) obj;
        if (this.f21035a == c5675g.f21035a && this.f21036b == c5675g.f21036b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.f21035a) * 31) + Float.floatToIntBits(this.f21036b);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("(");
        stringBuilder.append(this.f21035a);
        stringBuilder.append(',');
        stringBuilder.append(this.f21036b);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}
