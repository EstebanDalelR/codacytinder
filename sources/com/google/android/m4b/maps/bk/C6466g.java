package com.google.android.m4b.maps.bk;

import com.google.android.m4b.maps.bk.C4791a.C4790b;
import java.util.Arrays;

/* renamed from: com.google.android.m4b.maps.bk.g */
class C6466g extends C4791a {
    /* renamed from: b */
    private double[] f23991b;

    /* renamed from: a */
    public int mo5024a() {
        return 0;
    }

    /* renamed from: a */
    static C6466g m28340a(double[] dArr) {
        return new C6466g(dArr);
    }

    /* renamed from: a */
    static C6466g m28341a(double[] dArr, int[] iArr) {
        if (dArr.length % 2 == 0 && iArr.length >= 2 && iArr[0] == 0) {
            if (iArr[iArr.length - 1] == dArr.length / 2) {
                if (iArr.length == 2) {
                    return new C6466g(dArr);
                }
                return new C7454h(dArr, iArr);
            }
        }
        throw new IllegalArgumentException("ChainStartIndices for PolygonVertexList.create invalid.");
    }

    protected C6466g(double[] dArr) {
        if (dArr.length % 2 != 0) {
            throw new IllegalArgumentException("Cannot create PolygonVertexList from incomplete array.");
        }
        this.a = dArr.length / 2;
        this.f23991b = dArr;
    }

    /* renamed from: b */
    public final C4807m m28350b() {
        return new C4807m((C4791a) this);
    }

    /* renamed from: c */
    public final C6467j m28353c() {
        return new C6467j(this);
    }

    /* renamed from: a */
    public final double mo5023a(int i) {
        return this.f23991b[i * 2];
    }

    /* renamed from: b */
    public final double mo5026b(int i) {
        return this.f23991b[(i * 2) + 1];
    }

    /* renamed from: c */
    public int mo5027c(int i) {
        return m21214h(i - 1);
    }

    /* renamed from: d */
    public int mo5028d(int i) {
        return m21214h(i + 1);
    }

    /* renamed from: e */
    public final C4790b mo5029e(int i) {
        int i2 = i;
        int c = mo5027c(i);
        int d = mo5028d(i);
        double a = m21203a(c, i2, d);
        Object obj = null;
        Object obj2 = a < 0.0d ? 1 : null;
        i2 *= 2;
        double d2 = r0.f23991b[i2];
        c *= 2;
        double d3 = r0.f23991b[c];
        Object obj3 = d3 < d2 ? 1 : null;
        Object obj4 = d3 == d2 ? 1 : null;
        Object obj5 = d3 > d2 ? 1 : null;
        d *= 2;
        double d4 = r0.f23991b[d];
        Object obj6 = d4 < d2 ? 1 : null;
        Object obj7 = d4 == d2 ? 1 : null;
        if (d4 > d2) {
            obj = 1;
        }
        if (obj4 == null || obj7 == null) {
            if (a == 0.0d && !(obj4 == null && obj7 == null)) {
                obj2 = obj4 != null ? r0.f23991b[c + 1] < r0.f23991b[i2 + 1] ? obj : obj6 : r0.f23991b[d + 1] < r0.f23991b[i2 + 1] ? obj3 : obj5;
            }
            if (obj2 != null) {
                if (obj5 != null && (obj != null || obj7 != null)) {
                    return C4790b.SPLIT_VERTEX;
                }
                if (!(obj3 == null || (obj6 == null && obj7 == null))) {
                    return C4790b.MERGE_VERTEX;
                }
            } else if ((obj5 != null || obj4 != null) && obj != null) {
                return C4790b.START_VERTEX;
            } else {
                if (!((obj3 == null && obj4 == null) || obj6 == null)) {
                    return C4790b.END_VERTEX;
                }
            }
            if (!(obj3 == null && obj4 == null)) {
                if (obj == null) {
                    if (obj7 != null) {
                    }
                }
                return C4790b.RIGHT_VERTEX;
            }
            return C4790b.LEFT_VERTEX;
        }
        i2++;
        return r0.f23991b[d + 1] < r0.f23991b[i2] ? r0.f23991b[c + 1] < r0.f23991b[i2] ? C4790b.END_VERTEX : C4790b.LEFT_VERTEX : r0.f23991b[c + 1] > r0.f23991b[i2] ? C4790b.START_VERTEX : C4790b.RIGHT_VERTEX;
    }

    /* renamed from: d */
    public final double m28354d() {
        double d = 0.0d;
        for (int i = 0; i < mo5024a() + 1; i++) {
            d += m28344i(i);
        }
        return d;
    }

    /* renamed from: i */
    private double m28344i(int i) {
        int g = mo7061g(i);
        int g2 = mo7061g(i + 1);
        double d = 0.0d;
        if (g2 - g < 3) {
            return 0.0d;
        }
        int i2 = (g2 - 1) * 2;
        double d2 = r0.f23991b[i2];
        double d3 = r0.f23991b[i2 + 1];
        double d4 = 0.0d;
        double d5 = d4;
        while (g < g2) {
            i2 = g * 2;
            double d6 = r0.f23991b[i2] - d2;
            double d7 = r0.f23991b[i2 + 1] - d3;
            d5 += (d * d7) - (d4 * d6);
            g++;
            d = d6;
            d4 = d7;
        }
        return d5 / 2.0d;
    }

    /* renamed from: e */
    public final boolean m28357e() {
        C6466g c6466g = this;
        for (int i = 0; i < c6466g.a; i++) {
            int c = mo5027c(i);
            int d = mo5028d(i);
            if (m21203a(c, i, d) == 0.0d) {
                double a = mo5023a(c);
                double b = mo5026b(c);
                double a2 = mo5023a(i);
                double b2 = mo5026b(i);
                double a3 = mo5023a(d);
                double b3 = mo5026b(d);
                if ((a == a2 || a3 == a2) && (a != a2 || a3 != a2)) {
                    break;
                }
                Object obj;
                Object obj2;
                if (C4806l.m21280a(a, b, a2, b2) >= 0) {
                    if (C4806l.m21280a(a, b, a2, b2) != 0 || b >= b2) {
                        obj = null;
                        if (C4806l.m21280a(a3, b3, a2, b2) >= 0) {
                            if (C4806l.m21280a(a3, b3, a2, b2) < 0 || b3 >= b2) {
                                obj2 = null;
                                if (obj != obj2) {
                                    return true;
                                }
                            }
                        }
                        obj2 = 1;
                        if (obj != obj2) {
                            return true;
                        }
                    }
                }
                obj = 1;
                if (C4806l.m21280a(a3, b3, a2, b2) >= 0) {
                    if (C4806l.m21280a(a3, b3, a2, b2) < 0) {
                    }
                    obj2 = null;
                    if (obj != obj2) {
                        return true;
                    }
                }
                obj2 = 1;
                if (obj != obj2) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public final boolean m28358f() {
        return m28344i(0) <= 0.0d;
    }

    /* renamed from: g */
    public final boolean m28359g() {
        for (int i = 1; i < mo5024a() + 1; i++) {
            if (m28344i(i) >= 0.0d) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    public final boolean m28360h() {
        int i;
        C6467j c = m28353c();
        C4793b c4793b = new C4793b(this);
        for (i = 0; i < c.c; i++) {
            Object obj;
            int j = c.m21310j(i);
            int d = c.m21297d(j);
            int e = c.m21299e(j);
            if (c.m21305g(d, j) != 0) {
                if (c.m21305g(j, e) != 0) {
                    C4790b e2 = mo5029e(j);
                    if (!((e2 == C4790b.LEFT_VERTEX && (c4793b.m21231a(d, j) || c4793b.m21235b(j, e))) || ((e2 == C4790b.RIGHT_VERTEX && (c4793b.m21231a(j, e) || c4793b.m21235b(d, j))) || ((e2 == C4790b.SPLIT_VERTEX && (c4793b.m21231a(d, j) || c4793b.m21231a(j, e))) || ((e2 == C4790b.MERGE_VERTEX && (c4793b.m21235b(j, e) || c4793b.m21235b(d, j))) || (e2 == C4790b.START_VERTEX && (c4793b.m21231a(j, e) || c4793b.m21231a(d, j)))))))) {
                        if (e2 == C4790b.END_VERTEX) {
                            if (!c4793b.m21235b(d, j)) {
                                if (c4793b.m21235b(j, e)) {
                                }
                            }
                        }
                        obj = null;
                        if (obj != null) {
                            return true;
                        }
                    }
                }
            }
            obj = 1;
            if (obj != null) {
                return true;
            }
        }
        int i2 = 0;
        while (i2 < this.a) {
            int i3 = i2 + 1;
            i = i3;
            while (i < this.a) {
                if (m21205a(i2, i) == 0) {
                    j = mo5027c(i2);
                    int d2 = mo5028d(i2);
                    if (!(j == i || d2 == i)) {
                        Object obj2;
                        int c2 = mo5027c(i2);
                        int d3 = mo5028d(i2);
                        int c3 = mo5027c(i);
                        int d4 = mo5028d(i);
                        if (!(m21205a(c2, i2) == 0 || m21205a(i2, d3) == 0 || m21205a(c3, i) == 0 || m21205a(i, d4) == 0 || m28343b(i2, c2, d3) || m28343b(i2, c2, c3) || m28343b(i2, c2, d4) || m28343b(i2, d3, c3) || m28343b(i2, d3, d4))) {
                            if (!m28343b(i2, c3, d4)) {
                                if (m28342a(c2, i2, d3, c3) && m28342a(c2, i2, d3, d4) && m21207a(i2, d3, c2, d4, c3)) {
                                    obj2 = 1;
                                    if (obj2 == null) {
                                        if (m21207a(i2, j, mo5027c(i), d2, mo5028d(i))) {
                                            i2 = i3;
                                        }
                                    }
                                }
                            }
                        }
                        obj2 = null;
                        if (obj2 == null) {
                            if (m21207a(i2, j, mo5027c(i), d2, mo5028d(i))) {
                                i2 = i3;
                            }
                        }
                    }
                    return true;
                }
                i++;
            }
            i2 = i3;
        }
        return false;
    }

    /* renamed from: a */
    private boolean m28342a(int i, int i2, int i3, int i4) {
        if (m21203a(i, i2, i3) >= 0.0d) {
            return m21203a(i, i2, i4) > 0.0d && m21203a(i2, i3, i4) > 0;
        } else {
            if (m21203a(i, i2, i4) < 0.0d) {
                if (m21203a(i2, i3, i4) < 0) {
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: b */
    private boolean m28343b(int i, int i2, int i3) {
        if (m21205a(i2, i3) == 0) {
            return true;
        }
        if (m21205a(i, i2) != 0) {
            if (m21205a(i, i3) != 0) {
                if (m21205a(i, i2) == m21205a(i, i3) && m21203a(i, i2, i3) == 0.0d) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    /* renamed from: a */
    final void mo5025a(int i, double[] dArr, int i2, int i3) {
        System.arraycopy(this.f23991b, i * 2, dArr, i2 * 2, i3 * 2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6466g)) {
            return false;
        }
        C6466g c6466g = (C6466g) obj;
        if (c6466g.mo7058a((Object) this)) {
            if (Arrays.equals(this.f23991b, c6466g.f23991b) != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    protected boolean mo7058a(Object obj) {
        return obj instanceof C6466g;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f23991b);
    }

    public String toString() {
        return m28351b(0, mo7061g(1));
    }

    /* renamed from: b */
    protected final String m28351b(int i, int i2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[(");
        int i3 = i * 2;
        stringBuilder.append(this.f23991b[i3]);
        stringBuilder.append(", ");
        stringBuilder.append(this.f23991b[i3 + 1]);
        stringBuilder.append(")");
        while (true) {
            i++;
            if (i < i2) {
                stringBuilder.append(", (");
                i3 = i * 2;
                stringBuilder.append(this.f23991b[i3]);
                stringBuilder.append(", ");
                stringBuilder.append(this.f23991b[i3 + 1]);
                stringBuilder.append(")");
            } else {
                stringBuilder.append("]");
                return stringBuilder.toString();
            }
        }
    }
}
