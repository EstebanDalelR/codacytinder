package com.google.android.m4b.maps.bk;

import com.google.android.m4b.maps.bk.C4800e.C6465a;
import java.util.Arrays;

/* renamed from: com.google.android.m4b.maps.bk.c */
final class C7453c extends C6467j {
    /* renamed from: d */
    private boolean[] f27351d = new boolean[(m21296d() + 2)];

    /* renamed from: a */
    private static boolean m32170a(double d, double d2, double d3, double d4, double d5, double d6) {
        return ((d - d3) * (d6 - d4)) - ((d5 - d3) * (d2 - d4)) > 0.0d;
    }

    C7453c(C6466g c6466g) {
        super(c6466g);
        Arrays.fill(this.f27351d, false);
        this.f27351d[0] = true;
    }

    /* renamed from: c */
    public final boolean mo7055c(int i, int i2) {
        i = this.a.mo7060f(i);
        i2 = this.a.mo7060f(i2);
        if (i == i2) {
            return false;
        }
        if (this.f27351d[i] && this.f27351d[i2]) {
            return false;
        }
        if (this.f27351d[i]) {
            this.f27351d[i2] = 1;
            return true;
        } else if (this.f27351d[i2] != 0) {
            this.f27351d[i] = 1;
            return true;
        } else {
            throw new C6465a("Some outer chains have not been cut.");
        }
    }

    /* renamed from: a */
    public final C6467j m32171a(int[] iArr) {
        C6467j c6467j = this;
        int[] iArr2 = iArr;
        if (m21296d() == 0) {
            return c6467j;
        }
        double[] dArr = new double[((m21298e() + iArr2.length) * 2)];
        int g = c6467j.a.mo7061g(1);
        c6467j.a.mo5025a(0, dArr, 0, g);
        Arrays.fill(c6467j.f27351d, false);
        c6467j.f27351d[0] = true;
        int i = g;
        for (int i2 = 0; i2 < iArr2.length; i2 += 2) {
            int i3;
            g = iArr2[i2];
            int i4 = iArr2[i2 + 1];
            int f = c6467j.a.mo7060f(i4);
            if (c6467j.f27351d[f]) {
                f = c6467j.a.mo7060f(g);
                i3 = g;
                g = i4;
            } else {
                i3 = i4;
            }
            int i5 = f;
            int g2 = c6467j.a.mo7061g(i5);
            int g3 = c6467j.a.mo7061g(i5 + 1);
            double a = c6467j.a.mo5023a(g);
            double b = c6467j.a.mo5026b(g);
            double[] dArr2 = dArr;
            double d = a;
            double d2 = b;
            int i6 = g2;
            int i7 = i3;
            i3 = i;
            int a2 = C7453c.m32169a(dArr2, 2, d, d2, 0, i3);
            if (C7453c.m32169a(dArr2, 2, d, d2, a2 + 1, i3) != -1) {
                g = a2;
                Object obj = null;
                while (obj == null) {
                    i4 = (g - 1) % i;
                    if (i4 < 0) {
                        i4 += i;
                    }
                    g2 = g + 1;
                    f = g2 % i;
                    if (f < 0) {
                        f += i;
                    }
                    i4 *= 2;
                    int i8 = i4 + 1;
                    int i9 = g * 2;
                    int i10 = i9 + 1;
                    f *= 2;
                    i3 = f + 1;
                    boolean a3 = C7453c.m32170a(dArr[i4], dArr[i8], dArr[i9], dArr[i10], dArr[f], dArr[i3]);
                    boolean a4 = C7453c.m32170a(m21289b(i7), m21293c(i7), dArr[i9], dArr[i10], dArr[f], dArr[i3]);
                    boolean a5 = C7453c.m32170a(dArr[i4], dArr[i8], dArr[i9], dArr[i10], m21289b(i7), m21293c(i7));
                    if (!a3) {
                        if (!a4) {
                            if (a5) {
                            }
                        }
                        g = C7453c.m32169a(dArr, 2, a, b, g2, i);
                    } else if (a4 && a5) {
                        g = C7453c.m32169a(dArr, 2, a, b, g2, i);
                    }
                    obj = 1;
                }
            } else {
                g = a2;
            }
            if (c6467j.a.mo5023a(i7) == a) {
                if (c6467j.a.mo5026b(i7) == b) {
                    g++;
                    System.arraycopy(dArr, g * 2, dArr, ((g + g3) - i6) * 2, ((i - g) - 1) * 2);
                    i4 = (g3 - i7) - 1;
                    c6467j.a.mo5025a(i7, dArr, g, i4);
                    c6467j.a.mo5025a(i6, dArr, g + i4, (i7 - i6) + 1);
                    i += (g3 - i6) + 2;
                    c6467j.f27351d[i5] = true;
                }
            }
            System.arraycopy(dArr, g * 2, dArr, (((g + g3) - i6) + 2) * 2, (i - g) * 2);
            g++;
            i4 = g3 - i7;
            c6467j.a.mo5025a(i7, dArr, g, i4);
            c6467j.a.mo5025a(i6, dArr, g + i4, (i7 - i6) + 1);
            i += (g3 - i6) + 2;
            c6467j.f27351d[i5] = true;
        }
        return new C6467j(dArr);
    }

    /* renamed from: a */
    private static int m32169a(double[] dArr, int i, double d, double d2, int i2, int i3) {
        while (i2 < i3) {
            i = i2 * 2;
            if (dArr[i] == d && dArr[i + 1] == d2) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7453c)) {
            return false;
        }
        C7453c c7453c = (C7453c) obj;
        if ((this instanceof C7453c) && super.equals(c7453c)) {
            if (Arrays.equals(this.f27351d, c7453c.f27351d) == null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo7054a(Object obj) {
        return obj instanceof C7453c;
    }

    public final int hashCode() {
        return super.hashCode() + (Arrays.hashCode(this.f27351d) * 31);
    }
}
