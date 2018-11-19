package com.google.android.m4b.maps.bo;

import java.io.DataInput;

/* renamed from: com.google.android.m4b.maps.bo.a */
public final class C4834a {
    /* renamed from: a */
    private final af f17639a;
    /* renamed from: b */
    private final int f17640b;
    /* renamed from: c */
    private final float f17641c;
    /* renamed from: d */
    private final af f17642d;
    /* renamed from: e */
    private final float f17643e;
    /* renamed from: f */
    private final float f17644f;
    /* renamed from: g */
    private final float f17645g;

    public C4834a(af afVar, int i, float f, af afVar2, float f2, float f3, float f4) {
        this.f17639a = afVar;
        this.f17640b = i;
        this.f17641c = f;
        this.f17642d = afVar2;
        this.f17643e = f2;
        this.f17644f = f3;
        this.f17645g = f4;
    }

    /* renamed from: a */
    public static C4834a m21422a(DataInput dataInput, ba baVar) {
        float a;
        af a2;
        float f;
        af a3 = af.m21460a(dataInput, baVar);
        int readUnsignedByte = dataInput.readUnsignedByte();
        float a4 = ac.m21434a(readUnsignedByte, 1) ? ((float) bl.m21698a(dataInput)) / 10.0f : Float.NaN;
        if (ac.m21434a(readUnsignedByte, 2)) {
            float a5 = ((float) bl.m21698a(dataInput)) / 8.0f;
            a = ((float) bl.m21698a(dataInput)) / 1090519040;
            a2 = af.m21460a(dataInput, baVar);
            dataInput = ((float) bl.m21698a(dataInput)) / 10.0f;
            f = a5;
        } else {
            a2 = null;
            dataInput = 2143289344;
            f = Float.NaN;
            a = Float.NaN;
        }
        return new C4834a(a3, readUnsignedByte, a4, a2, dataInput, f, a);
    }

    /* renamed from: a */
    public final boolean m21423a() {
        return ac.m21434a(this.f17640b, 1);
    }

    /* renamed from: b */
    public final af m21424b() {
        return this.f17639a;
    }

    /* renamed from: c */
    public final float m21425c() {
        return this.f17641c;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((((((((((this.f17642d == null ? 0 : this.f17642d.hashCode()) + 31) * 31) + Float.floatToIntBits(this.f17644f)) * 31) + Float.floatToIntBits(this.f17643e)) * 31) + Float.floatToIntBits(this.f17645g)) * 31) + this.f17640b) * 31;
        if (this.f17639a != null) {
            i = this.f17639a.hashCode();
        }
        return ((hashCode + i) * 31) + Float.floatToIntBits(this.f17641c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C4834a c4834a = (C4834a) obj;
        if (this.f17642d == null) {
            if (c4834a.f17642d != null) {
                return false;
            }
        } else if (!this.f17642d.equals(c4834a.f17642d)) {
            return false;
        }
        if (Float.floatToIntBits(this.f17644f) != Float.floatToIntBits(c4834a.f17644f) || Float.floatToIntBits(this.f17643e) != Float.floatToIntBits(c4834a.f17643e) || Float.floatToIntBits(this.f17645g) != Float.floatToIntBits(c4834a.f17645g) || this.f17640b != c4834a.f17640b) {
            return false;
        }
        if (this.f17639a == null) {
            if (c4834a.f17639a != null) {
                return false;
            }
        } else if (!this.f17639a.equals(c4834a.f17639a)) {
            return false;
        }
        return Float.floatToIntBits(this.f17641c) == Float.floatToIntBits(c4834a.f17641c);
    }

    /* renamed from: d */
    public final int m21426d() {
        return (ac.m21429a(this.f17639a) + 40) + ac.m21429a(this.f17642d);
    }
}
