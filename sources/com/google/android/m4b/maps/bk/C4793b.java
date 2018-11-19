package com.google.android.m4b.maps.bk;

import com.google.android.m4b.maps.bk.C4791a.C4790b;
import com.google.android.m4b.maps.bk.C4800e.C6465a;

/* renamed from: com.google.android.m4b.maps.bk.b */
final class C4793b {
    /* renamed from: a */
    private final C4807m f17491a;
    /* renamed from: b */
    private final C4807m f17492b;
    /* renamed from: c */
    private final C4807m f17493c;
    /* renamed from: d */
    private final C4807m f17494d;

    /* renamed from: com.google.android.m4b.maps.bk.b$1 */
    static /* synthetic */ class C47921 {
        /* renamed from: a */
        static final /* synthetic */ int[] f17490a = new int[C4790b.values().length];

        static {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r0 = com.google.android.m4b.maps.bk.C4791a.C4790b.values();
            r0 = r0.length;
            r0 = new int[r0];
            f17490a = r0;
            r0 = f17490a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = com.google.android.m4b.maps.bk.C4791a.C4790b.RIGHT_VERTEX;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = f17490a;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = com.google.android.m4b.maps.bk.C4791a.C4790b.MERGE_VERTEX;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;	 Catch:{ NoSuchFieldError -> 0x001f }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.m4b.maps.bk.b.1.<clinit>():void");
        }
    }

    /* renamed from: c */
    private static int m21217c(int i, int i2, int i3) {
        return i <= i2 ? i : i - i3;
    }

    public C4793b(C6466g c6466g) {
        this.f17491a = c6466g.m28350b();
        this.f17492b = c6466g.m28350b();
        this.f17493c = c6466g.m28350b();
        this.f17494d = c6466g.m28350b();
    }

    public C4793b(C4807m c4807m) {
        this.f17491a = c4807m.m21295c();
        this.f17492b = c4807m.m21295c();
        this.f17493c = c4807m.m21295c();
        this.f17494d = c4807m.m21295c();
    }

    private C4793b(C4807m c4807m, C4807m c4807m2, C4807m c4807m3, C4807m c4807m4) {
        this.f17491a = c4807m;
        this.f17492b = c4807m2;
        this.f17493c = c4807m3;
        this.f17494d = c4807m4;
    }

    /* renamed from: a */
    public final void m21230a(int i, int i2, int i3) {
        int d = this.f17491a.f17533c != 0 ? m21220d(i2, i3, i2) : 0;
        int i4 = i2;
        m21216a(d, i4, i3, i2, -1);
        m21216a(d + 1, i4, i, -1, -1);
    }

    /* renamed from: a */
    public final int m21228a(int i, int i2, C4790b c4790b) {
        if (this.f17491a.m21305g(i, i2) < 0) {
            int d = m21220d(i, i2, i);
            if (C47921.f17490a[c4790b.ordinal()] != 1) {
                throw new C6465a("Impossible EdgeList start case.");
            }
            m21216a(d, i, i2, m21221e(this.f17491a.m21297d(i), i, i), -1);
            return -1;
        }
        m21216a(m21220d(i2, i, i2), i2, i, -1, -1);
        return m21223f(m21219d(i2), i2);
    }

    /* renamed from: b */
    public final int m21233b(int i, int i2, C4790b c4790b) {
        int i3 = -1;
        if (this.f17491a.m21305g(i, i2) < 0) {
            i = m21224g(i, i2);
            if (!this.f17494d.m21308i(i)) {
                i3 = this.f17494d.m21310j(i);
            }
            if (C47921.f17490a[c4790b.ordinal()] == 2) {
                c4790b = m21219d(i2);
                if (!this.f17494d.m21308i(c4790b)) {
                    i3 = this.f17494d.m21310j(c4790b);
                }
                this.f17493c.mo5037f(c4790b, i2);
                this.f17494d.mo5037f(c4790b, i2);
            }
        } else {
            i2 = m21224g(i2, i);
            c4790b = m21219d(i);
            if (!this.f17494d.m21308i(c4790b)) {
                int j = this.f17494d.m21310j(c4790b);
                this.f17494d.mo5037f(c4790b, -1);
                i3 = j;
            }
            this.f17493c.mo5037f(c4790b, i);
            i = i2;
        }
        m21218c(i);
        return i3;
    }

    /* renamed from: b */
    public final void m21234b(int i, int i2, int i3) {
        int d = m21220d(i2, i3, i2);
        int i4 = d - 1;
        int e = m21221e(this.f17491a.m21310j(i4), this.f17492b.m21310j(i4), i2);
        m21223f(m21219d(i2), i2);
        i4 = d;
        int i5 = i2;
        m21216a(i4, i5, i3, e, -1);
        m21216a(i4, i5, i, -1, -1);
    }

    /* renamed from: a */
    public final boolean m21231a(int i, int i2) {
        int i3;
        int i4;
        if (this.f17491a.m21305g(i2, i) < 0) {
            i3 = i;
            i4 = i2;
        } else {
            i4 = i;
            i3 = i2;
        }
        i = m21220d(i4, i3, i4);
        m21216a(i, i4, i3, -1, -1);
        if (m21222e(i - 1, i) == 0) {
            if (m21222e(i, i + 1) == 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public final boolean m21235b(int i, int i2) {
        if (this.f17491a.m21305g(i, i2) < 0) {
            i = m21224g(i, i2);
        } else {
            i = m21224g(i2, i);
        }
        m21218c(i);
        if (m21222e(i - 1, i) == 0) {
            if (m21222e(i, i + 1) == 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    private boolean m21222e(int i, int i2) {
        C4793b c4793b = this;
        int i3 = i;
        int i4 = i2;
        if (i3 < 0 || i3 >= c4793b.f17491a.f17533c || i4 < 0 || i4 >= c4793b.f17491a.f17533c) {
            return false;
        }
        double g = c4793b.f17491a.m21304g(i3);
        double h = c4793b.f17491a.m21306h(i3);
        double g2 = c4793b.f17492b.m21304g(i3);
        double h2 = c4793b.f17492b.m21306h(i3);
        double g3 = c4793b.f17491a.m21304g(i4);
        double h3 = c4793b.f17491a.m21306h(i4);
        double g4 = c4793b.f17492b.m21304g(i4);
        double h4 = c4793b.f17492b.m21306h(i4);
        if ((g == g4 && h == h4) || (g3 == g2 && h3 == h2)) {
            return false;
        }
        if ((g != g3 || h != h3) && (g2 != g4 || h2 != h4)) {
            double d = g;
            double d2 = h;
            double d3 = g2;
            double d4 = h2;
            if (C4806l.m21279a(d, d2, d3, d4, g3, h3) * C4806l.m21279a(d, d2, d3, d4, g4, h4) > 0.0d) {
                return false;
            }
            d = g3;
            d2 = h3;
            d3 = g4;
            d4 = h4;
            if (C4806l.m21279a(d, d2, d3, d4, g, h) * C4806l.m21279a(d, d2, d3, d4, g2, h2) > 0.0d) {
                return false;
            }
            return true;
        } else if (g != g3 || h != h3 || g2 != g4 || h2 != h4) {
            return false;
        } else {
            int j = c4793b.f17491a.m21310j(i3);
            int j2 = c4793b.f17491a.m21310j(i4);
            if ((c4793b.f17491a.m21297d(j) == c4793b.f17492b.m21310j(i3) ? 1 : null) == (c4793b.f17491a.m21297d(j2) == c4793b.f17492b.m21310j(i4) ? 1 : null)) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    public final int m21227a(int i) {
        return m21225h(m21219d(i), i);
    }

    /* renamed from: b */
    public final int m21232b(int i) {
        int d = m21219d(i);
        if (this.f17494d.m21308i(d)) {
            i = m21225h(d, i);
        } else {
            i = this.f17494d.m21310j(d);
        }
        this.f17494d.mo5037f(d, -1);
        return i;
    }

    /* renamed from: c */
    public final boolean m21236c(int i, int i2) {
        int h = this.f17492b.m21307h(i2, 0);
        while (h != -1 && !m21226i(h, i)) {
            h = this.f17492b.m21307h(i2, h + 1);
        }
        if (h != -1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final C4793b m21229a(C6467j c6467j, int i, int i2) {
        C4793b c4793b = this;
        int i3 = i;
        int i4 = i2;
        C4807m c = c6467j.m21295c();
        C4807m c2 = c6467j.m21295c();
        C4807m c3 = c6467j.m21295c();
        C4807m c4 = c6467j.m21295c();
        int i5;
        int i6;
        int j;
        int j2;
        int j3;
        if (i3 > i4) {
            i5 = (i3 - i4) - 1;
            for (i6 = 0; i6 < c4793b.f17491a.f17533c; i6++) {
                j = c4793b.f17491a.m21310j(i6);
                if (j <= i4 || j >= i3) {
                    j2 = c4793b.f17492b.m21310j(i6);
                    if (j2 <= i4 || j2 >= i3) {
                        j3 = c4793b.f17493c.m21310j(i6);
                        int j4 = c4793b.f17494d.m21310j(i6);
                        c.mo5035b(C4793b.m21217c(j, i4, i5));
                        c2.mo5035b(C4793b.m21217c(j2, i4, i5));
                        if (j3 > i4) {
                            if (j3 < i3) {
                                c3.mo5035b(C4793b.m21217c(j, i4, i5));
                                if (j4 > i4) {
                                    if (j4 >= i3) {
                                        throw new C6465a("When cutting edge list, we lost a merge vertex.");
                                    }
                                }
                                c4.mo5035b(C4793b.m21217c(j4, i4, i5));
                            }
                        }
                        c3.mo5035b(C4793b.m21217c(j3, i4, i5));
                        if (j4 > i4) {
                            if (j4 >= i3) {
                                throw new C6465a("When cutting edge list, we lost a merge vertex.");
                            }
                        }
                        c4.mo5035b(C4793b.m21217c(j4, i4, i5));
                    }
                }
            }
        } else {
            for (i5 = 0; i5 < c4793b.f17491a.f17533c; i5++) {
                i6 = c4793b.f17491a.m21310j(i5);
                if (i6 >= i3 && i6 <= i4) {
                    j = c4793b.f17492b.m21310j(i5);
                    if (j >= i3 && j <= i4) {
                        j2 = c4793b.f17493c.m21310j(i5);
                        j3 = c4793b.f17494d.m21310j(i5);
                        int[] iArr = new int[1];
                        iArr[0] = i6 - i3;
                        c.mo5035b(iArr);
                        c2.mo5035b(j - i3);
                        if (j2 == -1) {
                            c3.mo5035b(j2);
                        } else if (j2 < i3 || j2 > i4) {
                            c3.mo5035b(i6);
                        } else {
                            c3.mo5035b(j2 - i3);
                        }
                        if (j3 == -1) {
                            c4.mo5035b(j3);
                        } else if (j3 < i3 || j3 > i4) {
                            throw new C6465a("When cutting edge list, we lost a merge vertex.");
                        } else {
                            c4.mo5035b(j3 - i3);
                        }
                    }
                }
            }
        }
        return new C4793b(c, c2, c3, c4);
    }

    /* renamed from: d */
    public final void m21237d(int i, int i2) {
        m21216a(m21220d(i, i2, i2), i, i2, i, -1);
    }

    /* renamed from: a */
    private void m21216a(int i, int i2, int i3, int i4, int i5) {
        this.f17491a.mo5036e(i, i2);
        this.f17492b.mo5036e(i, i3);
        this.f17493c.mo5036e(i, i4);
        this.f17494d.mo5036e(i, -1);
    }

    /* renamed from: c */
    private void m21218c(int i) {
        this.f17491a.mo5031a(i);
        this.f17492b.mo5031a(i);
        this.f17493c.mo5031a(i);
        this.f17494d.mo5031a(i);
    }

    /* renamed from: f */
    private int m21223f(int i, int i2) {
        this.f17493c.mo5037f(i, i2);
        i2 = this.f17494d.m21310j(i);
        if (i2 != -1) {
            this.f17494d.mo5037f(i, -1);
        }
        return i2;
    }

    /* renamed from: g */
    private int m21224g(int i, int i2) {
        int h = this.f17492b.m21307h(i2, 0);
        while (h != -1 && !m21226i(h, i)) {
            h = this.f17492b.m21307h(i2, h + 1);
        }
        if (h != -1) {
            return h;
        }
        throw new NullPointerException("Could not find egde in EdgeList.");
    }

    /* renamed from: d */
    private int m21219d(int i) {
        double b = this.f17491a.m21289b(i);
        double c = this.f17491a.m21293c(i);
        int i2 = 0;
        while (m21215a(i2, b) < c && i2 < this.f17491a.f17533c) {
            i2++;
        }
        if (i2 > 0) {
            return i2 - 1;
        }
        return 0;
    }

    /* renamed from: d */
    private int m21220d(int i, int i2, int i3) {
        int i4 = i;
        int i5 = i2;
        int i6 = i3;
        double b = this.f17491a.m21289b(i6);
        double c = this.f17491a.m21293c(i6);
        i6 = 0;
        while (i6 < r0.f17491a.f17533c) {
            double a = m21215a(i6, b);
            if (a > c) {
                return i6;
            }
            if (a == c) {
                double g = r0.f17492b.m21304g(i6);
                double h = r0.f17492b.m21306h(i6);
                double b2 = r0.f17491a.m21289b(i4);
                double c2 = r0.f17491a.m21293c(i4);
                double b3 = r0.f17491a.m21289b(i5);
                double c3 = r0.f17491a.m21293c(i5);
                if (C4806l.m21279a(b2, c2, b3, c3, g, h) > 0.0d) {
                    return i6;
                }
                if (C4806l.m21280a(g, h, b3, c3) == 0 && i6 % 2 == 0) {
                    return i6;
                }
            }
            i6++;
        }
        return r0.f17491a.f17533c;
    }

    /* renamed from: h */
    private int m21225h(int i, int i2) {
        int i3 = i;
        int i4 = i2;
        int j = this.f17493c.m21310j(i3);
        double b = this.f17491a.m21289b(j);
        double c = this.f17491a.m21293c(j);
        double g = this.f17491a.m21304g(i3);
        double h = this.f17491a.m21306h(i3);
        if (C4806l.m21279a(g, h, this.f17492b.m21304g(i3), this.f17492b.m21306h(i3), b, c) <= 0.0d) {
            if (C4806l.m21279a(b, c, g, h, r0.f17491a.m21289b(i4), r0.f17491a.m21293c(i4)) <= 0.0d) {
                return r0.f17491a.m21310j(i3);
            }
        }
        return j;
    }

    /* renamed from: e */
    private int m21221e(int i, int i2, int i3) {
        return m21225h(m21224g(i, i2), i3);
    }

    /* renamed from: i */
    private boolean m21226i(int i, int i2) {
        return this.f17491a.m21309i(i2, i);
    }

    /* renamed from: a */
    private double m21215a(int i, double d) {
        double g = this.f17491a.m21304g(i);
        double h = this.f17491a.m21306h(i);
        if (g == d) {
            return h;
        }
        double g2 = this.f17492b.m21304g(i);
        double h2 = this.f17492b.m21306h(i);
        if (g2 == d) {
            return h2;
        }
        g2 -= g;
        if (g2 == 0.0d) {
            return h > h2 ? h : h2;
        } else {
            return h + (((d - g) * (h2 - h)) / g2);
        }
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{start:  ");
        stringBuilder.append(this.f17491a.m21313m(3));
        stringBuilder.append("\n end:    ");
        stringBuilder.append(this.f17492b.m21313m(3));
        stringBuilder.append("\n helper: ");
        stringBuilder.append(this.f17493c.m21313m(3));
        stringBuilder.append("\n merge:  ");
        stringBuilder.append(this.f17494d.m21313m(3));
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
