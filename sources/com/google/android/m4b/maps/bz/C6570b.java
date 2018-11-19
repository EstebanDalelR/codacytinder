package com.google.android.m4b.maps.bz;

import android.opengl.Matrix;
import com.google.android.m4b.maps.bo.C7462l;
import com.google.android.m4b.maps.bo.af;
import com.google.android.m4b.maps.bo.bp;
import com.google.android.m4b.maps.cf.C5106e;
import com.google.android.m4b.maps.cf.C5118o;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.android.m4b.maps.bz.b */
public final class C6570b extends C5106e {
    /* renamed from: D */
    private static final AtomicLong f24561D = new AtomicLong(1);
    /* renamed from: a */
    public static final C6571c f24562a = new C6571c(new af(0, 0), 2.0f, 0.0f, 0.0f, 0.0f);
    /* renamed from: b */
    private static final float f24563b = ((float) (1.0d / Math.log(2.0d)));
    /* renamed from: c */
    private static float f24564c = (((float) Math.cos(1.3089969389957472d)) * 262144.0f);
    /* renamed from: d */
    private static final af f24565d = new af(0, 0, 1);
    /* renamed from: e */
    private static final float f24566e = ((float) (0.5d / Math.tan(0.2617993877991494d)));
    /* renamed from: A */
    private float[] f24567A;
    /* renamed from: B */
    private final float[] f24568B;
    /* renamed from: C */
    private final af f24569C;
    /* renamed from: E */
    private volatile long f24570E;
    /* renamed from: f */
    private final Thread f24571f;
    /* renamed from: g */
    private C6571c f24572g;
    /* renamed from: h */
    private boolean f24573h;
    /* renamed from: i */
    private af f24574i;
    /* renamed from: j */
    private float f24575j;
    /* renamed from: k */
    private float f24576k;
    /* renamed from: l */
    private float f24577l;
    /* renamed from: m */
    private float f24578m;
    /* renamed from: n */
    private int f24579n;
    /* renamed from: o */
    private int f24580o;
    /* renamed from: p */
    private float f24581p;
    /* renamed from: q */
    private af f24582q;
    /* renamed from: r */
    private af f24583r;
    /* renamed from: s */
    private af f24584s;
    /* renamed from: t */
    private bp f24585t;
    /* renamed from: u */
    private float f24586u;
    /* renamed from: v */
    private double[] f24587v;
    /* renamed from: w */
    private float[] f24588w;
    /* renamed from: x */
    private float[] f24589x;
    /* renamed from: y */
    private float[] f24590y;
    /* renamed from: z */
    private float[] f24591z;

    public C6570b(C6571c c6571c, int i, int i2, float f) {
        this(c6571c, i, i2, f, null);
    }

    public C6570b(C6571c c6571c, int i, int i2, float f, Thread thread) {
        this(c6571c, i, i2, f, null, null, 0, new float[16]);
    }

    private C6570b(C6571c c6571c, int i, int i2, float f, Thread thread, C5118o c5118o, int i3, float[] fArr) {
        super(null, 0, fArr);
        this.f24577l = f24566e;
        this.f24588w = null;
        this.f24589x = null;
        this.f24590y = null;
        this.f24591z = null;
        this.f24567A = null;
        this.f24568B = new float[8];
        this.f24569C = new af();
        this.f24570E = f24561D.getAndIncrement();
        this.f24580o = i2;
        this.f24579n = i;
        this.f24581p = f;
        this.f24571f = thread;
        this.f24573h = false;
        i2 = Math.min(Math.max(0.0f, 1106247680), 90.0f);
        if (i2 != this.f24578m) {
            this.f24578m = i2;
            this.f24570E = f24561D.incrementAndGet();
            this.f24576k = (float) (4602678819172646912 / Math.tan((((double) this.f24578m) * -1571644103) * 0));
            m29230b((boolean) 1);
            if (!(this.f24572g == 0 || this.f24572g.m29275f() == 0)) {
                this.f24574i = new af();
                m29220A();
            }
        }
        m29229b(c6571c);
    }

    /* renamed from: a */
    public final long mo5248a() {
        return this.f24570E;
    }

    /* renamed from: a */
    public static float m29226a(float f) {
        return ((float) Math.log((double) f)) * f24563b;
    }

    /* renamed from: b */
    public final af m29242b() {
        return af.m21458a(this.f24574i);
    }

    /* renamed from: a */
    public final void m29237a(af afVar) {
        afVar.m21482b(this.f24574i);
    }

    /* renamed from: c */
    public final af m29245c() {
        return this.f24572g.m29272c();
    }

    /* renamed from: d */
    public final boolean m29248d() {
        return this.f24573h;
    }

    /* renamed from: e */
    public final int m29249e() {
        return this.f24579n;
    }

    /* renamed from: f */
    public final int m29250f() {
        return this.f24580o;
    }

    /* renamed from: g */
    public final float m29251g() {
        return this.f24581p;
    }

    /* renamed from: h */
    public final float m29252h() {
        return this.f24578m;
    }

    /* renamed from: a */
    public final void m29236a(int i, int i2, float f) {
        this.f24570E = f24561D.incrementAndGet();
        this.f24579n = Math.max(1, i);
        this.f24580o = Math.max(1, i2);
        this.f24581p = f;
        m29221B();
        m29220A();
        m29230b(true);
    }

    /* renamed from: i */
    public final float m29253i() {
        return this.f24575j;
    }

    /* renamed from: a */
    public final void m29240a(boolean z) {
        if (this.f24573h != z) {
            this.f24573h = z;
            this.f24570E = f24561D.incrementAndGet();
        }
    }

    /* renamed from: b */
    private void m29229b(C6571c c6571c) {
        if (this.f24572g == null || !this.f24572g.equals(c6571c)) {
            this.f24570E = f24561D.incrementAndGet();
            m29230b(false);
            if (!(this.f24572g != null && c6571c.m29274e() == this.f24572g.m29274e() && c6571c.m29273d() == this.f24572g.m29273d())) {
                this.f24587v = null;
            }
            this.f24572g = c6571c;
            m29221B();
            if (this.f24572g.m29275f() != 0.0f) {
                this.f24574i = new af();
                m29220A();
            } else {
                this.f24574i = this.f24572g.m29272c();
            }
            m22785w();
        }
    }

    /* renamed from: a */
    public final void m29239a(C6571c c6571c) {
        m29229b(c6571c);
    }

    /* renamed from: A */
    private void m29220A() {
        double e = ((double) this.f24572g.m29274e()) * 0.017453292519943295d;
        double d = ((double) this.f24572g.m29273d()) * 0.017453292519943295d;
        double sin = ((double) this.f24575j) * (Math.sin(d) - (Math.cos(d) * Math.tan(d - (((double) ((this.f24572g.m29275f() * 0.5f) * this.f24578m)) * 0.017453292519943295d))));
        int sin2 = (int) (Math.sin(e) * sin);
        int cos = (int) (sin * Math.cos(e));
        af c = this.f24572g.m29272c();
        this.f24574i.m21487d(c.m21490f() + sin2, c.m21492g() + cos);
    }

    /* renamed from: B */
    private void m29221B() {
        this.f24575j = ((float) (Math.pow(2.0d, (double) (30.0f - this.f24572g.m29269a())) * (((double) this.f24580o) / ((double) (this.f24581p * 256.0f))))) * this.f24577l;
    }

    /* renamed from: j */
    public final float m29254j() {
        return this.f24572g.m29274e();
    }

    /* renamed from: k */
    public final float m29255k() {
        return this.f24572g.m29273d();
    }

    /* renamed from: l */
    public final float m29256l() {
        return this.f24572g.m29269a();
    }

    /* renamed from: m */
    public final float m29257m() {
        return this.f24572g.m29269a();
    }

    /* renamed from: C */
    private double[] m29222C() {
        if (this.f24587v == null) {
            double e = 90.0d - ((double) this.f24572g.m29274e());
            if (e < 0.0d) {
                e += 360.0d;
            } else if (e >= 360.0d) {
                e -= 360.0d;
            }
            double d = ((double) this.f24572g.m29273d()) * 0.017453292519943295d;
            e *= 0.017453292519943295d;
            double sin = Math.sin(d);
            this.f24587v = new double[3];
            this.f24587v[0] = Math.cos(e) * sin;
            this.f24587v[1] = sin * Math.sin(e);
            this.f24587v[2] = -Math.cos(d);
        }
        return this.f24587v;
    }

    /* renamed from: n */
    public final af m29258n() {
        if (this.f24582q == null) {
            double[] C = m29222C();
            this.f24582q = new af((int) Math.round(((double) (-this.f24575j)) * C[0]), (int) Math.round(((double) (-this.f24575j)) * C[1]), (int) Math.round(((double) (-this.f24575j)) * C[2]));
            af.m21463a(this.f24582q, this.f24574i, this.f24582q);
        }
        return this.f24582q;
    }

    /* renamed from: o */
    public final af m29259o() {
        if (this.f24584s == null) {
            af n = m29258n();
            if (this.f24572g.m29273d() != 0.0f) {
                if (n.m21490f() != this.f24574i.m21490f() || n.m21492g() != this.f24574i.m21492g()) {
                    n = this.f24574i.m21491f(n).m21493g(f24565d);
                    af.m21467b(n, 65536.0f, n);
                    this.f24584s = n;
                }
            }
            double d = (double) (-this.f24572g.m29274e());
            if (d < 0.0d) {
                d += 360.0d;
            } else if (d >= 360.0d) {
                d -= 360.0d;
            }
            d *= 0.017453292519943295d;
            this.f24584s = new af((int) (Math.cos(d) * 65536.0d), (int) (Math.sin(d) * 65536.0d));
        }
        return this.f24584s;
    }

    /* renamed from: p */
    public final af m29260p() {
        if (this.f24583r == null) {
            af n = m29258n();
            if (((double) this.f24572g.m29273d()) != 0.0d) {
                if (n.m21490f() != this.f24574i.m21490f() || n.m21492g() != this.f24574i.m21492g()) {
                    n = this.f24574i.m21491f(n);
                    af.m21467b(n, 16384.0f, n);
                    n = m29259o().m21493g(n);
                    af.m21467b(n, 65536.0f, n);
                    this.f24583r = n;
                }
            }
            double e = 90.0d - ((double) this.f24572g.m29274e());
            if (e < 0.0d) {
                e += 360.0d;
            } else if (e >= 360.0d) {
                e -= 360.0d;
            }
            e *= 0.017453292519943295d;
            this.f24583r = new af((int) (Math.cos(e) * 65536.0d), (int) (Math.sin(e) * 65536.0d));
        }
        return this.f24583r;
    }

    /* renamed from: q */
    public final float m29261q() {
        if (this.f24586u < 0.0f) {
            this.f24586u = 1.0f / ((float) m29258n().m21494h());
        }
        return this.f24586u;
    }

    /* renamed from: a */
    public final float m29231a(float f, float f2) {
        return (f2 * f) / (this.f24576k * ((float) this.f24580o));
    }

    /* renamed from: b */
    public final float m29241b(float f, float f2) {
        return ((f * this.f24576k) * ((float) this.f24580o)) / f2;
    }

    /* renamed from: a */
    public final float m29232a(af afVar, boolean z) {
        z = m29222C();
        af.m21468b(afVar, m29258n(), this.f24569C);
        this.f24569C.m21497i(this.f24569C);
        return (float) (((((double) this.f24569C.m21490f()) * z[null]) + (((double) this.f24569C.m21492g()) * z[1])) + (((double) this.f24569C.m21494h()) * z[2]));
    }

    /* renamed from: c */
    public final float m29244c(float f, float f2) {
        return 30.0f - C6570b.m29226a((f / f2) * (this.f24581p * 256.0f));
    }

    /* renamed from: r */
    public final float m29262r() {
        return m29231a(1.0f, this.f24575j);
    }

    /* renamed from: s */
    public final float[] m29263s() {
        if (this.f24588w == null) {
            m29224E();
        }
        return this.f24588w;
    }

    /* renamed from: t */
    public final float[] m29264t() {
        if (this.f24589x == null) {
            m29223D();
        }
        return this.f24589x;
    }

    /* renamed from: d */
    public final af m29247d(float f, float f2) {
        if (this.f24567A == null) {
            m29225F();
        }
        float[] fArr = this.f24568B;
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = 1.0f;
        fArr[3] = 1.0f;
        Matrix.multiplyMV(fArr, 4, this.f24567A, 0, fArr, 0);
        f2 = 1.0f / fArr[7];
        double d = (double) (fArr[4] * f2);
        double d2 = (double) (fArr[5] * f2);
        f = (double) (fArr[6] * f2);
        if (f >= 0.0f) {
            return 0.0f;
        }
        af n = m29258n();
        int f3 = n.m21490f();
        double d3 = 1.0d / (0.0f - f);
        f = (double) n.m21494h();
        double d4 = (double) f3;
        d = ((((d * f) + ((double) this.f24574i.m21490f())) - d4) * d3) + d4;
        d2 = (d2 * f) + ((double) this.f24574i.m21492g());
        f = (double) n.m21492g();
        return new af((int) d, (int) (((d2 - f) * d3) + f));
    }

    /* renamed from: a */
    public final C7462l m29235a(float f, float f2, float f3, float f4) {
        if (this.f24567A == null) {
            m29225F();
        }
        af n = m29258n();
        int f5 = n.m21490f();
        int g = n.m21492g();
        int h = n.m21494h();
        int f6 = r0.f24574i.m21490f() - f5;
        int g2 = r0.f24574i.m21492g() - g;
        float[] fArr = r0.f24568B;
        fArr[0] = f;
        fArr[1] = f3;
        fArr[2] = 1.0f;
        fArr[3] = 1.0f;
        Matrix.multiplyMV(fArr, 4, r0.f24567A, 0, fArr, 0);
        float f7 = 1.0f / fArr[7];
        double d = (double) (fArr[4] * f7);
        double d2 = (double) (fArr[5] * f7);
        double d3 = (double) (fArr[6] * f7);
        if (d3 >= 1.0d) {
            return null;
        }
        d3 = 1.0d / (1.0d - d3);
        float[] fArr2 = fArr;
        double d4 = (double) h;
        double d5 = (double) f6;
        double d6 = d5;
        d5 = (double) f5;
        double d7 = (double) g2;
        double d8 = (double) g;
        af afVar = new af((int) ((((d * d4) + d5) * d3) + d5), (int) ((((d2 * d4) + d7) * d3) + d8));
        fArr2[0] = f2;
        double d9 = d4;
        Matrix.multiplyMV(fArr2, 4, r0.f24567A, 0, fArr2, 0);
        f7 = 1.0f / fArr2[7];
        d = (double) (fArr2[4] * f7);
        d2 = (double) (fArr2[5] * f7);
        d4 = (double) (fArr2[6] * f7);
        if (d4 >= 1.0d) {
            return null;
        }
        d4 = 1.0d / (1.0d - d4);
        af afVar2 = new af((int) ((((d * d9) + d6) * d4) + d5), (int) ((((d2 * d9) + d7) * d4) + d8));
        fArr2[1] = f4;
        Matrix.multiplyMV(fArr2, 4, r0.f24567A, 0, fArr2, 0);
        f7 = 1.0f / fArr2[7];
        d = (double) (fArr2[4] * f7);
        d2 = (double) (fArr2[5] * f7);
        af afVar3 = afVar2;
        d4 = (double) (fArr2[6] * f7);
        if (d4 >= 1.0d) {
            return null;
        }
        d4 = 1.0d / (1.0d - d4);
        afVar2 = new af((int) ((((d * d9) + d6) * d4) + d5), (int) ((((d2 * d9) + d7) * d4) + d8));
        double d10 = d6;
        fArr2[0] = f;
        Matrix.multiplyMV(fArr2, 4, r0.f24567A, 0, fArr2, 0);
        float f8 = 1.0f / fArr2[7];
        double d11 = (double) (fArr2[4] * f8);
        double d12 = (double) (fArr2[5] * f8);
        double d13 = (double) (fArr2[6] * f8);
        if (d13 >= 1.0d) {
            return null;
        }
        double d14 = 1.0d / (1.0d - d13);
        return C7462l.m32256a(new af((int) ((((d11 * d9) + d10) * d14) + d5), (int) ((((d12 * d9) + d7) * d14) + d8)), afVar2, afVar, afVar3);
    }

    /* renamed from: b */
    public final int[] m29243b(af afVar) {
        m29238a(afVar, new float[8]);
        return new int[]{Math.round(r0[0]), Math.round(r0[1])};
    }

    /* renamed from: a */
    public final void m29238a(af afVar, float[] fArr) {
        if (this.f24591z == null) {
            m29225F();
        }
        int f = afVar.m21490f() - this.f24574i.m21490f();
        if (f >= 536870912) {
            f -= 1073741824;
        } else if (f < -536870912) {
            f += 1073741824;
        }
        int h = m29258n().m21494h();
        fArr[0] = (float) f;
        fArr[1] = (float) (afVar.m21492g() - this.f24574i.m21492g());
        fArr[2] = (float) afVar.m21494h();
        fArr[3] = (float) h;
        Matrix.multiplyMV(fArr, 4, this.f24591z, 0, fArr, 0);
        afVar = 1065353216 / fArr[7];
        fArr[0] = fArr[4] * afVar;
        fArr[1] = fArr[5] * afVar;
    }

    /* renamed from: u */
    public final bp m29265u() {
        return m29234a(0, 0, 0, 0);
    }

    /* renamed from: a */
    public final bp m29234a(int i, int i2, int i3, int i4) {
        if (this.f24585t == null) {
            this.f24585t = m29227a(this.f24572g.m29273d() + (this.f24578m * 0.5f), i, i2, i3, i4);
        }
        return this.f24585t;
    }

    /* renamed from: v */
    public final bp m29266v() {
        if (this.f24572g.m29273d() == 0.0f) {
            return m29265u();
        }
        float d = this.f24572g.m29273d() * 0.017453292f;
        double d2 = (double) d;
        return m29246c(this.f24572g.m29273d() + ((((float) Math.atan((Math.sin(d2) + ((double) (0.5f / this.f24576k))) / Math.cos(d2))) - d) * 57.29578f));
    }

    /* renamed from: b */
    public static float m29228b(float f) {
        return f < f24564c ? ((float) Math.acos((double) (f / 262144.0f))) * 57.29578f : 75.0f;
    }

    /* renamed from: c */
    public final bp m29246c(float f) {
        return m29227a(f, 0, 0, 0, 0);
    }

    /* renamed from: a */
    private bp m29227a(float f, int i, int i2, int i3, int i4) {
        f = Math.min(f, C6570b.m29228b((float) m29258n().m21494h()));
        float ceil = (float) Math.ceil((double) ((((float) this.f24580o) * 0.5f) - ((((float) this.f24580o) * this.f24576k) * ((float) Math.tan((double) ((f - this.f24572g.m29273d()) * 0.017453292f))))));
        i = (float) i;
        af d = m29247d(i, (float) (this.f24580o - i4));
        i4 = m29247d((float) (this.f24579n - i3), (float) (this.f24580o - i4));
        i2 = ((float) i2) + ceil;
        i = m29247d(i, i2);
        i2 = m29247d((float) (this.f24579n - i3), i2);
        if (!(d == null || i4 == 0 || i == 0)) {
            if (i2 != 0) {
                return bp.m28654a(d, i4, i, i2);
            }
        }
        i2 = this.f24572g.toString();
        i3 = this.f24579n;
        i4 = this.f24580o;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(i2).length() + 81);
        stringBuilder.append("pos: ");
        stringBuilder.append(i2);
        stringBuilder.append(" farAngle: ");
        stringBuilder.append(f);
        stringBuilder.append(" size: ");
        stringBuilder.append(i3);
        stringBuilder.append("x");
        stringBuilder.append(i4);
        stringBuilder.append(" top:");
        stringBuilder.append(ceil);
        throw new IllegalStateException(stringBuilder.toString());
    }

    public final String toString() {
        String valueOf = String.valueOf(new af(Math.round((float) this.f24574i.m21490f()), Math.round((float) this.f24574i.m21492g()), Math.round((float) this.f24574i.m21494h())));
        float f = this.f24575j;
        float e = this.f24572g.m29274e();
        float d = this.f24572g.m29273d();
        float f2 = this.f24578m;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 70);
        stringBuilder.append("[");
        stringBuilder.append(valueOf);
        stringBuilder.append(", ");
        stringBuilder.append(f);
        stringBuilder.append(", ");
        stringBuilder.append(e);
        stringBuilder.append(", ");
        stringBuilder.append(d);
        stringBuilder.append(", ");
        stringBuilder.append(f2);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public final int hashCode() {
        int i;
        int floatToIntBits = (((((((((Float.floatToIntBits(this.f24575j) + 31) * 31) + this.f24580o) * 31) + this.f24579n) * 31) + Float.floatToIntBits(this.f24578m)) * 31) + Float.floatToIntBits(this.f24581p)) * 31;
        if (this.f24572g == null) {
            i = 0;
        } else {
            i = this.f24572g.hashCode();
        }
        return floatToIntBits + i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6570b)) {
            return false;
        }
        C6570b c6570b = (C6570b) obj;
        return this.f24575j == c6570b.f24575j && this.f24572g.equals(c6570b.f24572g) && this.f24578m == c6570b.f24578m && this.f24580o == c6570b.f24580o && this.f24579n == c6570b.f24579n && this.f24581p == c6570b.f24581p;
    }

    /* renamed from: b */
    private void m29230b(boolean z) {
        this.f24582q = null;
        this.f24583r = null;
        this.f24584s = null;
        this.f24585t = null;
        this.f24586u = -1.0f;
        this.f24588w = null;
        this.f24591z = null;
        this.f24567A = null;
        if (z) {
            this.f24589x = null;
            this.f24590y = null;
        }
    }

    /* renamed from: D */
    private void m29223D() {
        this.f24589x = new float[16];
        float f = (((float) this.f24579n) * 1.0f) / ((float) this.f24580o);
        float tan = ((float) Math.tan((((double) this.f24578m) * 0.017453292519943295d) * 0.5d)) * 0.1f;
        float f2 = -tan;
        Matrix.frustumM(this.f24589x, 0, f2 * f, tan * f, f2, tan, 0.1f, 20.0f);
    }

    /* renamed from: E */
    private void m29224E() {
        this.f24588w = new float[16];
        float q = m29261q();
        af f = m29258n().m21491f(this.f24574i);
        float f2 = ((float) f.m21490f()) * q;
        float g = ((float) f.m21492g()) * q;
        float h = ((float) f.m21494h()) * q;
        af p = m29260p();
        float[] fArr = this.f24588w;
        float f3 = (float) p.m21490f();
        float g2 = (float) p.m21492g();
        q = (float) p.m21494h();
        f2 = -f2;
        g = -g;
        h = -h;
        float length = 1.0f / Matrix.length(f2, g, h);
        float f4 = f2 * length;
        float f5 = g * length;
        length *= h;
        float f6 = (f5 * q) - (length * g2);
        float f7 = (length * f3) - (q * f4);
        g2 = (g2 * f4) - (f3 * f5);
        q = 1.0f / Matrix.length(f6, f7, g2);
        f6 *= q;
        f7 *= q;
        g2 *= q;
        q = (f7 * length) - (g2 * f5);
        f3 = (g2 * f4) - (f6 * length);
        float f8 = (f6 * f5) - (f7 * f4);
        fArr[0] = f6;
        fArr[1] = q;
        fArr[2] = -f4;
        fArr[3] = 0.0f;
        fArr[4] = f7;
        fArr[5] = f3;
        fArr[6] = -f5;
        fArr[7] = 0.0f;
        fArr[8] = g2;
        fArr[9] = f8;
        fArr[10] = -length;
        fArr[11] = 0.0f;
        fArr[12] = 0.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 1.0f;
        Matrix.translateM(fArr, 0, f2, g, h);
    }

    /* renamed from: F */
    private void m29225F() {
        if (this.f24588w == null) {
            m29224E();
        }
        if (this.f24589x == null) {
            m29223D();
        }
        if (this.f24590y == null) {
            this.f24590y = new float[16];
            this.f24590y[0] = ((float) this.f24579n) * 0.5f;
            this.f24590y[5] = ((float) this.f24580o) * -0.5f;
            this.f24590y[10] = 1.0f;
            this.f24590y[15] = 1.0f;
            this.f24590y[12] = ((float) this.f24579n) * 0.5f;
            this.f24590y[13] = ((float) this.f24580o) * 0.5f;
        }
        this.f24591z = new float[16];
        float[] fArr = new float[16];
        Matrix.multiplyMM(fArr, 0, this.f24590y, 0, this.f24589x, 0);
        Matrix.multiplyMM(this.f24591z, 0, fArr, 0, this.f24588w, 0);
        this.f24567A = fArr;
        Matrix.invertM(this.f24567A, 0, this.f24591z, 0);
    }
}
