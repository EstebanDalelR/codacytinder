package com.google.android.m4b.maps.bo;

import com.google.android.m4b.maps.ar.C4662a;
import java.io.DataInput;
import java.util.Locale;

public final class af implements Comparable<af> {
    /* renamed from: a */
    int f17658a;
    /* renamed from: b */
    int f17659b;
    /* renamed from: c */
    int f17660c;

    /* renamed from: b */
    public static int m21465b(int i) {
        while (i < -536870912) {
            i += 1073741824;
        }
        while (i >= 536870912) {
            i -= 1073741824;
        }
        return i;
    }

    /* renamed from: e */
    public static boolean m21472e(int i, int i2) {
        if (i >= -536870912 && i < 536870912 && i2 >= -536870912) {
            if (i2 < 536870912) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ int compareTo(Object obj) {
        af afVar = (af) obj;
        if (this.f17658a != afVar.f17658a) {
            return this.f17658a - afVar.f17658a;
        }
        if (this.f17659b == afVar.f17659b) {
            return this.f17660c - afVar.f17660c;
        }
        return this.f17659b - afVar.f17659b;
    }

    public af(int i, int i2) {
        this.f17658a = i;
        this.f17659b = i2;
    }

    public af(int i, int i2, int i3) {
        this.f17658a = i;
        this.f17659b = i2;
        this.f17660c = i3;
    }

    public af(af afVar) {
        this.f17658a = afVar.f17658a;
        this.f17659b = afVar.f17659b;
        this.f17660c = afVar.f17660c;
    }

    /* renamed from: a */
    public static af m21456a(int i, int i2) {
        return m21455a(((double) i) * 1.0E-7d, ((double) i2) * -1698910392);
    }

    /* renamed from: b */
    public static af m21466b(int i, int i2) {
        return m21455a(((double) i) * 1.0E-6d, ((double) i2) * -1598689907);
    }

    /* renamed from: c */
    public static af m21471c(int i, int i2) {
        return m21455a(((double) i) * 1.0E-5d, ((double) i2) * -1998362383);
    }

    /* renamed from: a */
    public static af m21455a(double d, double d2) {
        af afVar = new af();
        afVar.m21487d((int) Math.round((d2 * 0.017453292519943295d) * 1.708913188941079E8d), (int) Math.round(Math.log(Math.tan(((d * 0.017453292519943295d) * 0.5d) + 0.7853981633974483d)) * 1.708913188941079E8d));
        return afVar;
    }

    /* renamed from: a */
    public static af m21457a(C4662a c4662a) {
        return m21456a(c4662a.m20835d(1), c4662a.m20835d(2));
    }

    /* renamed from: a */
    public final int m21473a() {
        return (int) Math.round(m21481b() * 1000000.0d);
    }

    /* renamed from: b */
    public final double m21481b() {
        return ((Math.atan(Math.exp(((double) this.f17659b) * 5.8516723170686385E-9d)) - 0.7853981633974483d) * 2.0d) * 57.29577951308232d;
    }

    /* renamed from: c */
    public final int m21484c() {
        return (int) Math.round(m21485d() * 1000000.0d);
    }

    /* renamed from: d */
    public final double m21485d() {
        double d = (((double) this.f17658a) * 5.8516723170686385E-9d) * 57.29577951308232d;
        while (d > 180.0d) {
            d -= 360.0d;
        }
        while (d < -180.0d) {
            d += 360.0d;
        }
        return d;
    }

    /* renamed from: a */
    public static double m21452a(double d) {
        return 5.36870912E8d / (Math.cos(d * 0.017453292519943295d) * 2.0015115070354454E7d);
    }

    /* renamed from: e */
    public final double m21488e() {
        return m21452a(m21481b());
    }

    /* renamed from: a */
    public static af m21458a(af afVar) {
        return new af(afVar.f17658a, afVar.f17659b, afVar.f17660c);
    }

    /* renamed from: a */
    public static af m21460a(DataInput dataInput, ba baVar) {
        if (baVar.f17705c < 0) {
            int i = -baVar.f17705c;
            return new af((dataInput.readShort() >> i) + baVar.f17703a, (dataInput.readShort() >> i) + baVar.f17704b);
        }
        i = baVar.f17705c;
        return new af((dataInput.readShort() << i) + baVar.f17703a, (dataInput.readShort() << i) + baVar.f17704b);
    }

    /* renamed from: a */
    static void m21464a(DataInput dataInput, ba baVar, int[] iArr, int i) {
        i *= 3;
        if (baVar.f17705c < 0) {
            int i2 = -baVar.f17705c;
            int i3 = i + 1;
            iArr[i] = (dataInput.readShort() >> i2) + baVar.f17703a;
            i = i3 + 1;
            iArr[i3] = (dataInput.readShort() >> i2) + baVar.f17704b;
            iArr[i] = 0;
            return;
        }
        i2 = baVar.f17705c;
        i3 = i + 1;
        iArr[i] = (dataInput.readShort() << i2) + baVar.f17703a;
        i = i3 + 1;
        iArr[i3] = (dataInput.readShort() << i2) + baVar.f17704b;
        iArr[i] = 0;
    }

    /* renamed from: b */
    static void m21469b(DataInput dataInput, ba baVar, int[] iArr, int i) {
        i *= 3;
        if (baVar.f17705c < 0) {
            int i2 = -baVar.f17705c;
            int i3 = i + 1;
            iArr[i] = (dataInput.readShort() >> i2) + baVar.f17703a;
            i = i3 + 1;
            iArr[i3] = (dataInput.readShort() >> i2) + baVar.f17704b;
            iArr[i] = dataInput.readInt() >> i2;
            return;
        }
        i2 = baVar.f17705c;
        i3 = i + 1;
        iArr[i] = (dataInput.readShort() << i2) + baVar.f17703a;
        i = i3 + 1;
        iArr[i3] = (dataInput.readShort() << i2) + baVar.f17704b;
        iArr[i] = dataInput.readInt() << i2;
    }

    /* renamed from: f */
    public final int m21490f() {
        return this.f17658a;
    }

    /* renamed from: g */
    public final int m21492g() {
        return this.f17659b;
    }

    /* renamed from: h */
    public final int m21494h() {
        return this.f17660c;
    }

    /* renamed from: a */
    public final void m21480a(int[] iArr, int i) {
        i *= 3;
        iArr[i] = this.f17658a;
        iArr[i + 1] = this.f17659b;
        iArr[i + 2] = this.f17660c;
    }

    /* renamed from: a */
    public final void m21478a(int i, int[] iArr, int i2) {
        long j = (long) i;
        int i3 = (int) ((((long) this.f17659b) << 16) / j);
        int i4 = (int) ((((long) this.f17660c) << 16) / j);
        iArr[i2] = (int) ((((long) this.f17658a) << 16) / j);
        iArr[i2 + 1] = i3;
        iArr[i2 + 2] = i4;
    }

    /* renamed from: b */
    public final void m21482b(af afVar) {
        this.f17658a = afVar.f17658a;
        this.f17659b = afVar.f17659b;
        this.f17660c = afVar.f17660c;
    }

    /* renamed from: a */
    public final void m21476a(int i) {
        this.f17660c = i;
    }

    /* renamed from: d */
    public final void m21487d(int i, int i2) {
        this.f17658a = i;
        this.f17659b = i2;
        this.f17660c = 0;
    }

    /* renamed from: a */
    public final void m21477a(int i, int i2, int i3) {
        this.f17658a = i;
        this.f17659b = i2;
        this.f17660c = i3;
    }

    /* renamed from: a */
    public final void m21475a(float f, float f2) {
        double d = (double) f2;
        f = (double) ((f * 3.1415927f) / 180.0f);
        m21487d((int) (Math.sin(f) * d), (int) (d * Math.cos(f)));
    }

    /* renamed from: i */
    public final float m21496i() {
        return (float) Math.sqrt((double) (((((float) this.f17658a) * ((float) this.f17658a)) + (((float) this.f17659b) * ((float) this.f17659b))) + (((float) this.f17660c) * ((float) this.f17660c))));
    }

    /* renamed from: c */
    public final float m21483c(af afVar) {
        float f = (float) (this.f17658a - afVar.f17658a);
        float f2 = (float) (this.f17659b - afVar.f17659b);
        afVar = (float) (this.f17660c - afVar.f17660c);
        return (float) Math.sqrt((double) (((f * f) + (f2 * f2)) + (afVar * afVar)));
    }

    /* renamed from: d */
    public final float m21486d(af afVar) {
        float f = (float) (this.f17658a - afVar.f17658a);
        float f2 = (float) (this.f17659b - afVar.f17659b);
        afVar = (float) (this.f17660c - afVar.f17660c);
        return ((f * f) + (f2 * f2)) + (afVar * afVar);
    }

    /* renamed from: a */
    public static af m21459a(af afVar, af afVar2, float f) {
        int abs;
        af afVar3 = new af();
        f = -f;
        if (Math.abs(afVar2.f17658a) >= 268435456 && (afVar.f17658a >= 0 || afVar2.f17658a >= 0)) {
            if (afVar.f17658a < 0 || afVar2.f17658a < 0) {
                abs = 1073741824 - (Math.abs(afVar.f17658a) + Math.abs(afVar2.f17658a));
                if (afVar.f17658a < 0) {
                    abs = -abs;
                }
                afVar3.m21477a(((int) (((float) abs) * f)) + afVar.f17658a, ((int) (((float) (afVar2.f17659b - afVar.f17659b)) * f)) + afVar.f17659b, ((int) (f * ((float) (afVar2.f17660c - afVar.f17660c)))) + afVar.f17660c);
                return afVar3;
            }
        }
        abs = afVar2.f17658a - afVar.f17658a;
        afVar3.m21477a(((int) (((float) abs) * f)) + afVar.f17658a, ((int) (((float) (afVar2.f17659b - afVar.f17659b)) * f)) + afVar.f17659b, ((int) (f * ((float) (afVar2.f17660c - afVar.f17660c)))) + afVar.f17660c);
        return afVar3;
    }

    /* renamed from: a */
    public static void m21463a(af afVar, af afVar2, af afVar3) {
        afVar3.f17658a = afVar.f17658a + afVar2.f17658a;
        afVar3.f17659b = afVar.f17659b + afVar2.f17659b;
        afVar3.f17660c = afVar.f17660c + afVar2.f17660c;
    }

    /* renamed from: e */
    public final af m21489e(af afVar) {
        return new af(this.f17658a + afVar.f17658a, this.f17659b + afVar.f17659b, this.f17660c + afVar.f17660c);
    }

    /* renamed from: b */
    public static void m21468b(af afVar, af afVar2, af afVar3) {
        afVar3.f17658a = afVar.f17658a - afVar2.f17658a;
        afVar3.f17659b = afVar.f17659b - afVar2.f17659b;
        afVar3.f17660c = afVar.f17660c - afVar2.f17660c;
    }

    /* renamed from: f */
    public final af m21491f(af afVar) {
        return new af(this.f17658a - afVar.f17658a, this.f17659b - afVar.f17659b, this.f17660c - afVar.f17660c);
    }

    /* renamed from: a */
    public static void m21461a(af afVar, float f, af afVar2) {
        afVar2.f17658a = (int) (((float) afVar.f17658a) * f);
        afVar2.f17659b = (int) (((float) afVar.f17659b) * f);
        afVar2.f17660c = (int) (((float) afVar.f17660c) * f);
    }

    /* renamed from: b */
    public static void m21467b(af afVar, float f, af afVar2) {
        float i = afVar.m21496i();
        afVar2.f17658a = (int) ((((float) afVar.f17658a) * f) / i);
        afVar2.f17659b = (int) ((((float) afVar.f17659b) * f) / i);
        afVar2.f17660c = (int) ((((float) afVar.f17660c) * f) / i);
    }

    /* renamed from: a */
    public static float m21453a(af afVar, af afVar2) {
        return ((((float) afVar.f17658a) * ((float) afVar2.f17658a)) + (((float) afVar.f17659b) * ((float) afVar2.f17659b))) + (((float) afVar.f17660c) * ((float) afVar2.f17660c));
    }

    /* renamed from: g */
    public final af m21493g(af afVar) {
        af afVar2 = afVar;
        af afVar3 = new af();
        long j = (long) this.f17658a;
        long j2 = (long) this.f17659b;
        long j3 = (long) this.f17660c;
        long j4 = (long) afVar2.f17658a;
        long j5 = (long) afVar2.f17659b;
        long j6 = (long) afVar2.f17660c;
        afVar3.f17658a = (int) ((j2 * j6) - (j3 * j5));
        afVar3.f17659b = (int) ((j3 * j4) - (j6 * j));
        afVar3.f17660c = (int) ((j * j5) - (j2 * j4));
        return afVar3;
    }

    /* renamed from: a */
    public static void m21462a(af afVar, af afVar2, float f, af afVar3) {
        afVar3.f17658a = ((int) (((float) (afVar2.f17658a - afVar.f17658a)) * f)) + afVar.f17658a;
        afVar3.f17659b = ((int) (((float) (afVar2.f17659b - afVar.f17659b)) * f)) + afVar.f17659b;
        afVar3.f17660c = ((int) (f * ((float) (afVar2.f17660c - afVar.f17660c)))) + afVar.f17660c;
    }

    /* renamed from: a */
    public final af m21474a(af afVar, float f) {
        af afVar2 = new af();
        m21462a(this, afVar, f, afVar2);
        return afVar2;
    }

    /* renamed from: c */
    public static float m21470c(af afVar, af afVar2, af afVar3) {
        float f = (float) (afVar2.f17658a - afVar.f17658a);
        float f2 = (float) (afVar2.f17659b - afVar.f17659b);
        afVar2 = (float) (afVar2.f17660c - afVar.f17660c);
        return (((((float) (afVar3.f17658a - afVar.f17658a)) * f) + (((float) (afVar3.f17659b - afVar.f17659b)) * f2)) + (((float) (afVar3.f17660c - afVar.f17660c)) * afVar2)) / (((f * f) + (f2 * f2)) + (afVar2 * afVar2));
    }

    /* renamed from: h */
    public final void m21495h(af afVar) {
        afVar.f17658a = m21465b(this.f17658a);
        int i = this.f17659b;
        if (i < -536870912) {
            i = -536870912;
        } else if (i >= 536870912) {
            i = 536870911;
        }
        afVar.f17659b = i;
        afVar.f17660c = this.f17660c;
    }

    /* renamed from: a */
    public final void m21479a(af afVar, float f, float f2) {
        afVar.f17658a = m21465b(this.f17658a);
        f2 = 1.0842022E-19f - ((int) Math.ceil((double) ((f2 * 0.5f) * ab.m21427a(f))));
        if (f2 < null) {
            f2 = 0.0f;
        }
        if (this.f17659b > f2) {
            afVar.f17659b = f2;
        } else {
            f2 = -f2;
            if (this.f17659b < f2) {
                afVar.f17659b = f2;
            } else {
                afVar.f17659b = this.f17659b;
            }
        }
        afVar.f17660c = this.f17660c;
    }

    /* renamed from: i */
    public final void m21497i(af afVar) {
        afVar.f17658a = m21465b(this.f17658a);
        afVar.f17659b = this.f17659b;
        afVar.f17660c = this.f17660c;
    }

    public final String toString() {
        int i = this.f17658a;
        int i2 = this.f17659b;
        int i3 = this.f17660c;
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("(");
        stringBuilder.append(i);
        stringBuilder.append(",");
        stringBuilder.append(i2);
        stringBuilder.append(",");
        stringBuilder.append(i3);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    /* renamed from: j */
    public final String m21498j() {
        return String.format(Locale.US, "%f,%f", new Object[]{Double.valueOf(m21481b()), Double.valueOf(m21485d())});
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof af)) {
            return false;
        }
        af afVar = (af) obj;
        if (this.f17658a == afVar.f17658a && this.f17659b == afVar.f17659b && this.f17660c == afVar.f17660c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f17658a;
        int i2 = this.f17659b;
        int i3 = this.f17660c;
        i = ((i - i2) - i3) ^ (i3 >> 13);
        i2 = ((i2 - i3) - i) ^ (i << 8);
        i3 = ((i3 - i) - i2) ^ (i2 >> 13);
        i = ((i - i2) - i3) ^ (i3 >> 12);
        i2 = ((i2 - i3) - i) ^ (i << 16);
        i3 = ((i3 - i) - i2) ^ (i2 >> 5);
        i = ((i - i2) - i3) ^ (i3 >> 3);
        i2 = ((i2 - i3) - i) ^ (i << 10);
        return (i2 >> 15) ^ ((i3 - i) - i2);
    }

    /* renamed from: a */
    public static float m21454a(af afVar, af afVar2, af afVar3, af afVar4) {
        float c = m21470c(afVar, afVar2, afVar3);
        if (c <= 0.0f) {
            afVar4.m21482b(afVar);
        } else if (c >= 1.0f) {
            afVar4.m21482b(afVar2);
        } else {
            m21462a(afVar, afVar2, c, afVar4);
        }
        return afVar3.m21486d(afVar4);
    }
}
