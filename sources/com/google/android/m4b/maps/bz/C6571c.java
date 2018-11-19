package com.google.android.m4b.maps.bz;

import com.google.android.m4b.maps.ax.C4700b;
import com.google.android.m4b.maps.bo.af;

/* renamed from: com.google.android.m4b.maps.bz.c */
public final class C6571c implements C5044d {
    /* renamed from: a */
    private final af f24592a;
    /* renamed from: b */
    private final float f24593b;
    /* renamed from: c */
    private final float f24594c;
    /* renamed from: d */
    private final float f24595d;
    /* renamed from: e */
    private final float f24596e;

    /* renamed from: b */
    public final C6571c mo5249b() {
        return this;
    }

    public C6571c(af afVar, float f, float f2, float f3, float f4) {
        this.f24592a = new af(afVar.m21490f(), afVar.m21492g());
        this.f24593b = Math.max(Math.min(f, 21.0f), 2.0f);
        this.f24594c = f2;
        this.f24595d = f3;
        this.f24596e = f4;
    }

    public C6571c(C4700b c4700b, float f, float f2, float f3, float f4) {
        this(af.m21466b(c4700b.m20900a(), c4700b.m20901b()), f, f2, f3, f4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6571c)) {
            return false;
        }
        C6571c c6571c = (C6571c) obj;
        return this.f24592a.equals(c6571c.f24592a) && this.f24593b == c6571c.f24593b && this.f24594c == c6571c.f24594c && this.f24595d == c6571c.f24595d && this.f24596e == c6571c.f24596e;
    }

    public final int hashCode() {
        return ((((((((Float.floatToIntBits(this.f24593b) + 37) * 37) + Float.floatToIntBits(this.f24595d)) * 37) + Float.floatToIntBits(this.f24594c)) * 37) + Float.floatToIntBits(this.f24596e)) * 37) + this.f24592a.hashCode();
    }

    /* renamed from: a */
    public final float m29269a() {
        return this.f24593b;
    }

    /* renamed from: c */
    public final af m29272c() {
        return af.m21458a(this.f24592a);
    }

    /* renamed from: d */
    public final float m29273d() {
        return this.f24594c;
    }

    /* renamed from: e */
    public final float m29274e() {
        return this.f24595d;
    }

    /* renamed from: f */
    public final float m29275f() {
        return this.f24596e;
    }

    /* renamed from: a */
    public final C6571c m29270a(C6571c c6571c) {
        int f = this.f24592a.m21490f() - c6571c.f24592a.m21490f();
        if (f > 536870912) {
            return new C6571c(new af(this.f24592a.m21490f() - 1073741824, this.f24592a.m21492g()), this.f24593b, this.f24594c, this.f24595d, this.f24596e);
        }
        return f < -536870912 ? new C6571c(new af(this.f24592a.m21490f() + 1073741824, this.f24592a.m21492g()), this.f24593b, this.f24594c, this.f24595d, this.f24596e) : this;
    }

    /* renamed from: a */
    public static C6571c m29268a(C6571c c6571c, C6571c c6571c2, float f, float f2) {
        float f3;
        af afVar;
        float f4;
        if (f2 == 0.0f) {
            f2 = c6571c.f24592a.m21474a(c6571c2.f24592a, f);
            f3 = c6571c.f24593b;
            afVar = f2;
            f4 = f3 + ((c6571c2.f24593b - f3) * f);
        } else {
            af a = c6571c.f24592a.m21474a(c6571c2.f24592a, (((float) Math.cos((double) ((f - 1.0f) * 3.1415927f))) + 1.0f) / 2.0f);
            f2 = Math.min(((C6571c.m29267a(c6571c.f24593b) * (1.0f - f)) + (C6571c.m29267a(c6571c2.f24593b) * f)) + ((float) ((Math.pow((double) ((float) Math.sin((double) (3.1415927f * f))), 1.2d) * 0.5d) * Math.pow((double) f2, 0.4d))), 160.0f);
            f4 = Math.max(f2 > 0.0f ? (float) (((-Math.log(((double) f2) * 0.1d)) * 1.4426950216293335d) + 4.0d) : 32.0f, 2.0f);
            afVar = a;
        }
        f2 = c6571c.f24594c;
        float f5 = f2 + ((c6571c2.f24594c - f2) * f);
        f2 = c6571c.f24595d;
        f3 = c6571c2.f24595d;
        if (f2 > f3) {
            if (f2 - f3 > 180.0f) {
                f2 -= 360.0f;
            }
        } else if (f3 - f2 > 180.0f) {
            f3 -= 360.0f;
        }
        f2 += (f3 - f2) * f;
        if (((double) f2) < 0.0d) {
            f2 += 360.0f;
        }
        float f6 = f2;
        c6571c = c6571c.f24596e;
        return new C6571c(afVar, f4, f5, f6, c6571c + ((c6571c2.f24596e - c6571c) * f));
    }

    /* renamed from: a */
    private static float m29267a(float f) {
        return (float) (Math.exp((4.0d - ((double) f)) / 1.4426950216293335d) * 10.0d);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f24592a);
        float f = this.f24593b;
        float f2 = this.f24594c;
        float f3 = this.f24595d;
        float f4 = this.f24596e;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 109);
        stringBuilder.append("[target:");
        stringBuilder.append(valueOf);
        stringBuilder.append(" zoom:");
        stringBuilder.append(f);
        stringBuilder.append(" viewingAngle:");
        stringBuilder.append(f2);
        stringBuilder.append(" bearing:");
        stringBuilder.append(f3);
        stringBuilder.append(" lookAhead:");
        stringBuilder.append(f4);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
