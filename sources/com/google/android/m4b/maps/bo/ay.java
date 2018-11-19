package com.google.android.m4b.maps.bo;

import java.io.DataInput;

public final class ay {
    /* renamed from: g */
    private static ay f17694g = new ay(0, 0, 12, 0.0f, 0.0f, 0);
    /* renamed from: a */
    private final int f17695a;
    /* renamed from: b */
    private final int f17696b;
    /* renamed from: c */
    private final int f17697c;
    /* renamed from: d */
    private final float f17698d;
    /* renamed from: e */
    private final float f17699e;
    /* renamed from: f */
    private final int f17700f;

    public ay(int i, int i2, int i3, float f, float f2, int i4) {
        this.f17695a = i;
        this.f17696b = i2;
        this.f17697c = i3;
        this.f17698d = f;
        this.f17699e = f2;
        this.f17700f = i4;
    }

    /* renamed from: a */
    public static ay m21584a(DataInput dataInput) {
        return new ay(dataInput.readInt(), dataInput.readInt(), dataInput.readUnsignedByte(), ((float) dataInput.readUnsignedShort()) / 100.0f, ((float) dataInput.readUnsignedShort()) / 100.0f, dataInput.readUnsignedByte());
    }

    /* renamed from: a */
    public static ay m21583a() {
        return f17694g;
    }

    /* renamed from: b */
    public final boolean m21585b() {
        return ac.m21434a(1, this.f17700f);
    }

    /* renamed from: c */
    public final boolean m21586c() {
        return ac.m21434a(2, this.f17700f);
    }

    /* renamed from: d */
    public final int m21587d() {
        return this.f17695a;
    }

    /* renamed from: e */
    public final int m21588e() {
        return this.f17696b;
    }

    /* renamed from: f */
    public final int m21589f() {
        return this.f17697c;
    }

    /* renamed from: g */
    public final float m21590g() {
        return this.f17698d;
    }

    public final int hashCode() {
        return ((((((((((this.f17700f + 31) * 31) + this.f17695a) * 31) + Float.floatToIntBits(this.f17698d)) * 31) + this.f17696b) * 31) + this.f17697c) * 31) + Float.floatToIntBits(this.f17699e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ay ayVar = (ay) obj;
        return this.f17700f == ayVar.f17700f && this.f17695a == ayVar.f17695a && this.f17698d == ayVar.f17698d && this.f17696b == ayVar.f17696b && this.f17697c == ayVar.f17697c && this.f17699e == ayVar.f17699e;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TextStyle{color=");
        stringBuilder.append(Integer.toHexString(this.f17695a));
        stringBuilder.append(", outlineColor=");
        stringBuilder.append(Integer.toHexString(this.f17696b));
        stringBuilder.append(", size=");
        stringBuilder.append(this.f17697c);
        stringBuilder.append(", leadingRatio=");
        stringBuilder.append(this.f17698d);
        stringBuilder.append(", trackingRatio=");
        stringBuilder.append(this.f17699e);
        stringBuilder.append(", attributes=");
        stringBuilder.append(this.f17700f);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
