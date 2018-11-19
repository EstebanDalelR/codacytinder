package com.google.android.m4b.maps.bo;

import com.google.android.m4b.maps.bk.C4804i;
import java.io.DataInput;
import java.util.Arrays;

public final class aj {
    /* renamed from: a */
    private static final ThreadLocal<af[]> f17663a = new C48351();
    /* renamed from: b */
    private final int[] f17664b;
    /* renamed from: c */
    private volatile al f17665c;
    /* renamed from: d */
    private volatile float f17666d;

    /* renamed from: com.google.android.m4b.maps.bo.aj$1 */
    class C48351 extends ThreadLocal<af[]> {
        C48351() {
        }

        protected final /* synthetic */ Object initialValue() {
            return new af[]{new af(), new af()};
        }
    }

    /* renamed from: com.google.android.m4b.maps.bo.aj$a */
    public static class C4836a {
        /* renamed from: a */
        private int[] f17661a;
        /* renamed from: b */
        private int f17662b;

        public C4836a() {
            this(16);
        }

        public C4836a(int i) {
            if (i <= 0) {
                throw new AssertionError();
            }
            this.f17661a = new int[(i * 3)];
            this.f17662b = 0;
        }

        /* renamed from: a */
        public final int m21512a() {
            return this.f17662b;
        }

        /* renamed from: a */
        public final af m21513a(int i) {
            return new af(this.f17661a[0], this.f17661a[1], this.f17661a[2]);
        }

        /* renamed from: b */
        public final void m21515b() {
            this.f17662b = 0;
        }

        /* renamed from: c */
        public final aj m21516c() {
            Object obj = new int[(this.f17662b * 3)];
            System.arraycopy(this.f17661a, 0, obj, 0, this.f17662b * 3);
            return new aj(obj);
        }

        /* renamed from: a */
        public final boolean m21514a(af afVar) {
            int i = afVar.f17658a;
            int i2 = afVar.f17659b;
            afVar = afVar.f17660c;
            if (this.f17662b * 3 == this.f17661a.length) {
                Object obj = new int[(this.f17661a.length * 2)];
                System.arraycopy(this.f17661a, 0, obj, 0, this.f17662b * 3);
                this.f17661a = obj;
            }
            int i3 = this.f17662b * 3;
            if (this.f17662b > 0 && i == this.f17661a[i3 - 3] && i2 == this.f17661a[i3 - 2] && afVar == this.f17661a[i3 - 1]) {
                return false;
            }
            this.f17661a[i3] = i;
            this.f17661a[i3 + 1] = i2;
            this.f17661a[i3 + 2] = afVar;
            this.f17662b += 1;
            return true;
        }
    }

    private aj(int[] iArr) {
        this.f17664b = iArr;
        this.f17666d = -1082130432;
    }

    /* renamed from: a */
    public final al m21523a() {
        if (this.f17665c == null) {
            if (this.f17664b.length / 3 > 0) {
                af a = m21522a(0);
                int i = a.f17658a;
                int i2 = a.f17659b;
                int i3 = i;
                int i4 = i2;
                for (int i5 = 1; i5 < this.f17664b.length / 3; i5++) {
                    m21524a(i5, a);
                    if (a.f17658a < i) {
                        i = a.f17658a;
                    }
                    if (a.f17658a > i3) {
                        i3 = a.f17658a;
                    }
                    if (a.f17659b < i2) {
                        i2 = a.f17659b;
                    }
                    if (a.f17659b > i4) {
                        i4 = a.f17659b;
                    }
                }
                a.m21487d(i, i2);
                this.f17665c = new al(a, new af(i3, i4));
            } else {
                this.f17665c = new al(new af(), new af());
            }
        }
        return this.f17665c;
    }

    /* renamed from: a */
    public static aj m21520a(int[] iArr) {
        return new aj(iArr);
    }

    /* renamed from: a */
    public static aj m21518a(af afVar, af afVar2) {
        int[] iArr = new int[6];
        afVar.m21480a(iArr, 0);
        afVar2.m21480a(iArr, 1);
        return new aj(iArr);
    }

    /* renamed from: a */
    public static aj m21519a(DataInput dataInput, ba baVar) {
        int a = bl.m21698a(dataInput);
        int[] iArr = new int[(a * 3)];
        for (int i = 0; i < a; i++) {
            af.m21464a(dataInput, baVar, iArr, i);
        }
        return new aj(iArr);
    }

    /* renamed from: b */
    public final int m21528b() {
        return this.f17664b.length / 3;
    }

    /* renamed from: a */
    public final af m21522a(int i) {
        i *= 3;
        return new af(this.f17664b[i], this.f17664b[i + 1], this.f17664b[i + 2]);
    }

    /* renamed from: a */
    public final void m21524a(int i, af afVar) {
        i *= 3;
        afVar.f17658a = this.f17664b[i];
        afVar.f17659b = this.f17664b[i + 1];
        afVar.f17660c = this.f17664b[i + 2];
    }

    /* renamed from: a */
    public final void m21526a(af afVar) {
        int length = this.f17664b.length - 3;
        afVar.f17658a = this.f17664b[length];
        afVar.f17659b = this.f17664b[length + 1];
        afVar.f17660c = this.f17664b[length + 2];
    }

    /* renamed from: c */
    public final af m21531c() {
        int length = this.f17664b.length - 3;
        return new af(this.f17664b[length], this.f17664b[length + 1], this.f17664b[length + 2]);
    }

    /* renamed from: a */
    public final void m21525a(int i, af afVar, af afVar2) {
        i *= 3;
        afVar2.f17658a = this.f17664b[i] - afVar.f17658a;
        afVar2.f17659b = this.f17664b[i + 1] - afVar.f17659b;
        afVar2.f17660c = this.f17664b[i + 2] - afVar.f17660c;
    }

    /* renamed from: d */
    public final float m21534d() {
        float f = 0.0f;
        if (this.f17666d < 0.0f) {
            for (int i = 0; i < (this.f17664b.length / 3) - 1; i++) {
                f += m21527b(i);
            }
            this.f17666d = f;
        }
        return this.f17666d;
    }

    /* renamed from: b */
    public final float m21527b(int i) {
        i *= 3;
        int i2 = i + 3;
        int i3 = i + 1;
        int i4 = i2 + 1;
        i = (float) (this.f17664b[i] - this.f17664b[i2]);
        float f = (float) (this.f17664b[i3] - this.f17664b[i4]);
        float f2 = (float) (this.f17664b[i3 + 1] - this.f17664b[i4 + 1]);
        return (float) Math.sqrt((double) (((i * i) + (f * f)) + (f2 * f2)));
    }

    /* renamed from: e */
    public final boolean m21536e() {
        if (this.f17664b.length <= 0) {
            return false;
        }
        int length = this.f17664b.length - 3;
        if (this.f17664b[0] == this.f17664b[length] && this.f17664b[1] == this.f17664b[length + 1] && this.f17664b[2] == this.f17664b[length + 2]) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final af m21521a(float f) {
        int i = 0;
        if (f <= 0.0f) {
            return m21522a(0);
        }
        if (f >= 1.0f) {
            return m21531c();
        }
        float d = m21534d() * f;
        int length = (this.f17664b.length / 3) - 1;
        while (i < length) {
            float b = m21527b(i);
            if (b >= d) {
                d /= b;
                af afVar = new af();
                af afVar2 = new af();
                m21524a(i, afVar);
                m21524a(i + 1, afVar2);
                af.m21462a(afVar, afVar2, d, afVar2);
                return afVar2;
            }
            d -= b;
            i++;
        }
        return m21531c();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aj)) {
            return null;
        }
        return Arrays.equals(this.f17664b, ((aj) obj).f17664b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f17664b);
    }

    /* renamed from: b */
    public final aj m21529b(float f) {
        if (this.f17664b.length <= 6) {
            return this;
        }
        int length = this.f17664b.length / 3;
        boolean[] zArr = new boolean[length];
        int i = 0;
        zArr[0] = true;
        int i2 = length - 1;
        zArr[i2] = true;
        int a = m21517a(f * f, 1, 0, i2, new af(), new af(), new af(), new af(), zArr) + 2;
        if (a == length) {
            return this;
        }
        f = new int[(a * 3)];
        int i3 = 0;
        while (i < length) {
            if (zArr[i]) {
                int i4 = i * 3;
                int i5 = i3 + 1;
                i2 = i4 + 1;
                f[i3] = this.f17664b[i4];
                i3 = i5 + 1;
                int i6 = i2 + 1;
                f[i5] = this.f17664b[i2];
                i4 = i3 + 1;
                f[i3] = this.f17664b[i6];
                i3 = i4;
            }
            i++;
        }
        return new aj(f);
    }

    /* renamed from: a */
    private int m21517a(float f, int i, int i2, int i3, af afVar, af afVar2, af afVar3, af afVar4, boolean[] zArr) {
        int i4 = i2;
        int i5 = i3;
        af afVar5 = afVar;
        af afVar6 = afVar2;
        af afVar7 = afVar4;
        m21524a(i4, afVar5);
        m21524a(i5, afVar6);
        int i6 = i4 + i;
        float f2 = f;
        int i7 = -1;
        while (true) {
            int i8 = i5 - 1;
            if (i6 > i8) {
                break;
            }
            m21524a(i6, afVar7);
            float a = af.m21454a(afVar5, afVar6, afVar7, afVar3);
            if (a > f2) {
                i7 = i6;
                f2 = a;
            }
            i6 += i;
        }
        af afVar8 = afVar3;
        if (i7 < 0) {
            return 0;
        }
        int i9;
        int i10;
        int i11 = 1;
        zArr[i7] = true;
        if (i7 > i4 + 1) {
            i9 = i8;
            af afVar9 = afVar7;
            i10 = i7;
            i11 = m21517a(f, i, i4, i7, afVar5, afVar6, afVar3, afVar9, zArr) + 1;
        } else {
            i9 = i8;
            i10 = i7;
        }
        return i10 < i9 ? m21517a(f, i, i10, i5, afVar5, afVar2, afVar3, afVar4, zArr) + i11 : i11;
    }

    /* renamed from: c */
    public final aj m21532c(float f) {
        aj ajVar;
        boolean e = m21536e();
        int length = this.f17664b.length / 3;
        int i = length - 1;
        if (length > 2 && f > 0.0f) {
            if (length > 3 || !e) {
                boolean z;
                int i2;
                C4836a c4836a = new C4836a(length);
                int i3 = 1;
                int i4 = e ? i - 1 : 1;
                int i5 = (i4 - 1) * 3;
                int i6 = i4 * 3;
                int i7 = ((i4 + 1) % length) * 3;
                i4 = ((i4 + 2) % length) * 3;
                af afVar = new af(ajVar.f17664b[i5], ajVar.f17664b[i5 + 1], 0);
                af afVar2 = new af(ajVar.f17664b[i6], ajVar.f17664b[i6 + 1], 0);
                af afVar3 = new af(ajVar.f17664b[i7], ajVar.f17664b[i7 + 1], 0);
                af afVar4 = new af(ajVar.f17664b[i4], ajVar.f17664b[i4 + 1], 0);
                af afVar5 = new af();
                if (!e || afVar2.m21483c(afVar3) > f) {
                    i3 = 0;
                }
                if (!e) {
                    c4836a.m21514a(afVar);
                    if (i4 == 0) {
                        if (afVar.m21483c(afVar2) > f && afVar2.m21483c(afVar3) > f) {
                            c4836a.m21514a(afVar2);
                        }
                        c4836a.m21514a(afVar3);
                        return c4836a.m21516c();
                    }
                    while (afVar.m21483c(afVar2) <= f) {
                        i4 += 3;
                        if (i4 == length * 3) {
                            if (afVar.m21483c(afVar3) > f && afVar3.m21483c(afVar4) > f) {
                                c4836a.m21514a(afVar3);
                            }
                            c4836a.m21514a(afVar4);
                            return c4836a.m21516c();
                        }
                        afVar2.m21482b(afVar3);
                        afVar3.m21482b(afVar4);
                        afVar4.m21477a(ajVar.f17664b[i4], ajVar.f17664b[i4 + 1], 0);
                    }
                }
                int i8 = i4;
                while (i8 < length * 3) {
                    int i9;
                    af afVar6;
                    int i10;
                    int i11;
                    af afVar7;
                    afVar4.m21487d(ajVar.f17664b[i8], ajVar.f17664b[i8 + 1]);
                    float c;
                    double c2;
                    double c3;
                    double d;
                    if (i3 != 0) {
                        if (i8 == (i - 1) * 3) {
                            afVar4.m21482b(afVar5);
                        } else if (i8 != i * 3) {
                        }
                        c = afVar2.m21483c(afVar3);
                        if (c <= f) {
                            if (e || i8 != i4) {
                                c4836a.m21514a(afVar2);
                            } else {
                                afVar5.m21482b(afVar2);
                            }
                            afVar.m21482b(afVar2);
                            afVar2.m21482b(afVar3);
                            afVar3.m21482b(afVar4);
                        } else {
                            i9 = i;
                            afVar6 = afVar;
                            c2 = (double) (afVar.m21483c(afVar2) + c);
                            c3 = (double) (c + afVar3.m21483c(afVar4));
                            i10 = i3;
                            i11 = i4;
                            afVar7 = afVar5;
                            d = c2 + c3;
                            z = e;
                            i2 = length;
                            afVar2.m21487d((int) Math.round(((((double) afVar2.f17658a) * c2) + (((double) afVar3.f17658a) * c3)) / d), (int) Math.round(((((double) afVar2.f17659b) * c2) + (((double) afVar3.f17659b) * c3)) / d));
                            afVar3.m21482b(afVar4);
                            i8 += 3;
                            i = i9;
                            afVar = afVar6;
                            i3 = i10;
                            i4 = i11;
                            afVar5 = afVar7;
                            e = z;
                            length = i2;
                            ajVar = this;
                        }
                    } else {
                        c = afVar2.m21483c(afVar3);
                        if (c <= f) {
                            i9 = i;
                            afVar6 = afVar;
                            c2 = (double) (afVar.m21483c(afVar2) + c);
                            c3 = (double) (c + afVar3.m21483c(afVar4));
                            i10 = i3;
                            i11 = i4;
                            afVar7 = afVar5;
                            d = c2 + c3;
                            z = e;
                            i2 = length;
                            afVar2.m21487d((int) Math.round(((((double) afVar2.f17658a) * c2) + (((double) afVar3.f17658a) * c3)) / d), (int) Math.round(((((double) afVar2.f17659b) * c2) + (((double) afVar3.f17659b) * c3)) / d));
                            afVar3.m21482b(afVar4);
                            i8 += 3;
                            i = i9;
                            afVar = afVar6;
                            i3 = i10;
                            i4 = i11;
                            afVar5 = afVar7;
                            e = z;
                            length = i2;
                            ajVar = this;
                        } else {
                            if (e) {
                            }
                            c4836a.m21514a(afVar2);
                            afVar.m21482b(afVar2);
                            afVar2.m21482b(afVar3);
                            afVar3.m21482b(afVar4);
                        }
                    }
                    z = e;
                    i2 = length;
                    i9 = i;
                    afVar6 = afVar;
                    i10 = i3;
                    i11 = i4;
                    afVar7 = afVar5;
                    i8 += 3;
                    i = i9;
                    afVar = afVar6;
                    i3 = i10;
                    i4 = i11;
                    afVar5 = afVar7;
                    e = z;
                    length = i2;
                    ajVar = this;
                }
                z = e;
                i2 = length;
                if (z || afVar2.m21483c(afVar3) > f) {
                    c4836a.m21514a(afVar2);
                }
                if (z) {
                    c4836a.m21514a(c4836a.m21513a(0));
                } else {
                    c4836a.m21514a(afVar3);
                }
                if (c4836a.m21512a() == i2) {
                    return this;
                }
                ajVar = this;
                return c4836a.m21516c();
            }
        }
        return ajVar;
    }

    /* renamed from: d */
    public final float m21535d(int i) {
        i *= 3;
        int i2 = i + 3;
        return ah.m21499a(this.f17664b[i2] - this.f17664b[i], this.f17664b[i2 + 1] - this.f17664b[i + 1]);
    }

    /* renamed from: h */
    public final aj m21539h() {
        int length = this.f17664b.length;
        int[] iArr = new int[length];
        int[] iArr2 = this.f17664b;
        for (int i = 0; i < this.f17664b.length; i += 3) {
            int i2 = length - i;
            iArr[i] = iArr2[i2 - 3];
            iArr[i + 1] = iArr2[i2 - 2];
            iArr[i + 2] = iArr2[i2 - 1];
        }
        return new aj(iArr);
    }

    /* renamed from: b */
    public final aj m21530b(af afVar) {
        int[] iArr = new int[this.f17664b.length];
        for (int i = 0; i < this.f17664b.length; i += 3) {
            iArr[i] = this.f17664b[i] + afVar.f17658a;
            int i2 = i + 1;
            iArr[i2] = this.f17664b[i2] + afVar.f17659b;
            i2 = i + 2;
            iArr[i2] = this.f17664b[i2] + afVar.f17660c;
        }
        return new aj(iArr);
    }

    /* renamed from: i */
    public final int m21540i() {
        return (this.f17664b.length * 4) + 160;
    }

    /* renamed from: f */
    public final boolean m21537f() {
        int length = this.f17664b.length / 3;
        long j = 0;
        int i = 0;
        while (i < length - 1) {
            af a = m21522a(i);
            i++;
            af a2 = m21522a(i);
            j += (((long) a.f17658a) * ((long) a2.f17659b)) - (((long) a2.f17658a) * ((long) a.f17659b));
        }
        if (!m21536e()) {
            af c = m21531c();
            af a3 = m21522a(0);
            j += (((long) c.f17658a) * ((long) a3.f17659b)) - (((long) a3.f17658a) * ((long) c.f17659b));
        }
        return j > 0;
    }

    /* renamed from: g */
    public final int m21538g() {
        int length = this.f17664b.length / 3;
        if (length == 0) {
            return -536870912;
        }
        C4804i a = C4804i.m21257a();
        af afVar = new af();
        m21522a(0).m21497i(afVar);
        for (int i = 1; i < length; i++) {
            af afVar2 = new af(afVar);
            m21522a(i).m21497i(afVar);
            a = a.m21263a(C4804i.m21258a(C4804i.m21256a(af.m21465b(afVar2.f17658a)), C4804i.m21256a(af.m21465b(afVar.f17658a))));
        }
        if (a.m21265b()) {
            return -536870912;
        }
        double a2 = C4804i.m21256a(-536870912);
        if (a2 == -3.141592653589793d) {
            a2 = 3.141592653589793d;
        }
        if (a.m21264a(a2)) {
            return af.m21465b((int) ((a.m21267d().m21266c() / 3.141592653589793d) * 5.36870912E8d));
        }
        return -536870912;
    }

    /* renamed from: c */
    public final aj m21533c(int i) {
        if (i == -536870912) {
            return this;
        }
        Object obj = i < 0 ? 1 : null;
        int length = this.f17664b.length / 3;
        C4836a c4836a = new C4836a(length);
        af afVar = new af();
        Object obj2 = null;
        for (int i2 = 0; i2 < length; i2++) {
            m21524a(i2, afVar);
            if (obj != null) {
                if (afVar.f17658a < i) {
                    afVar.f17658a += 1073741824;
                } else {
                    c4836a.m21514a(afVar);
                }
            } else if (afVar.f17658a > i) {
                afVar.f17658a -= 1073741824;
            } else {
                c4836a.m21514a(afVar);
            }
            obj2 = 1;
            c4836a.m21514a(afVar);
        }
        return obj2 != null ? c4836a.m21516c() : this;
    }
}
