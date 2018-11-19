package com.google.android.m4b.maps.bk;

import com.google.android.m4b.maps.bk.C4791a.C4790b;

/* renamed from: com.google.android.m4b.maps.bk.m */
class C4807m {
    /* renamed from: a */
    protected C4791a f17531a;
    /* renamed from: b */
    protected int[] f17532b;
    /* renamed from: c */
    int f17533c;

    /* renamed from: c */
    public final C4807m m21295c() {
        return new C4807m(this.f17531a);
    }

    protected C4807m(double[] dArr) {
        this.f17531a = C6466g.m28340a(dArr);
        this.f17532b = new int[4];
        this.f17533c = null;
    }

    protected C4807m(C4791a c4791a) {
        this.f17531a = c4791a;
        this.f17532b = new int[4];
        this.f17533c = null;
    }

    protected C4807m(C4791a c4791a, int[] iArr) {
        this.f17531a = c4791a;
        this.f17532b = iArr;
        this.f17533c = iArr.length;
    }

    /* renamed from: b */
    public final double m21289b(int i) {
        return this.f17531a.mo5023a(i);
    }

    /* renamed from: c */
    public final double m21293c(int i) {
        return this.f17531a.mo5026b(i);
    }

    /* renamed from: g */
    public final int m21305g(int i, int i2) {
        return this.f17531a.m21205a(i, i2);
    }

    /* renamed from: d */
    public final int m21297d(int i) {
        return this.f17531a.mo5027c(i);
    }

    /* renamed from: e */
    public final int m21299e(int i) {
        return this.f17531a.mo5028d(i);
    }

    /* renamed from: d */
    public final int m21296d() {
        return this.f17531a.mo5024a();
    }

    /* renamed from: e */
    public final int m21298e() {
        return this.f17531a.f17489a;
    }

    /* renamed from: a */
    public final double m21285a(int i, int i2, int i3) {
        return this.f17531a.m21203a(i, i2, i3);
    }

    /* renamed from: f */
    public final C4790b m21302f(int i) {
        return this.f17531a.mo5029e(i);
    }

    /* renamed from: g */
    public final double m21304g(int i) {
        return this.f17531a.mo5023a(m21310j(i));
    }

    /* renamed from: h */
    public final double m21306h(int i) {
        return this.f17531a.mo5026b(m21310j(i));
    }

    /* renamed from: i */
    public final boolean m21308i(int i) {
        return m21310j(i) == -1;
    }

    /* renamed from: j */
    public final int m21310j(int i) {
        return this.f17532b[m21282o(i)];
    }

    /* renamed from: n */
    private int m21281n(int i) {
        return this.f17531a.m21214h(m21310j(i - 1));
    }

    /* renamed from: f */
    public final int m21301f() {
        return this.f17531a.m21214h(m21310j(this.f17533c - 2));
    }

    /* renamed from: h */
    public final int m21307h(int i, int i2) {
        i = this.f17531a.m21214h(i);
        while (i2 < this.f17533c) {
            if (m21310j(i2) == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    /* renamed from: i */
    public final boolean m21309i(int i, int i2) {
        return this.f17531a.m21214h(m21310j(i2)) == this.f17531a.m21214h(i);
    }

    /* renamed from: k */
    public final boolean m21311k(int i) {
        return m21281n(i) == this.f17531a.mo5028d(m21310j(i));
    }

    /* renamed from: l */
    public final boolean m21312l(int i) {
        return m21281n(i) == this.f17531a.mo5027c(m21310j(i));
    }

    /* renamed from: b */
    public final double m21290b(int i, int i2, int i3) {
        return (-(((this.f17531a.mo5023a(this.f17532b[i]) - this.f17531a.mo5023a(this.f17532b[i2])) * (this.f17531a.mo5026b(this.f17532b[i3]) - this.f17531a.mo5026b(this.f17532b[i2]))) - ((this.f17531a.mo5026b(this.f17532b[i]) - this.f17531a.mo5026b(this.f17532b[i2])) * (this.f17531a.mo5023a(this.f17532b[i3]) - this.f17531a.mo5023a(this.f17532b[i2]))))) / 2.0d;
    }

    /* renamed from: c */
    public final double m21294c(int i, int i2, int i3) {
        C4791a c4791a = this.f17531a;
        return (-(((c4791a.mo5023a(i) - c4791a.mo5023a(i2)) * (c4791a.mo5026b(i3) - c4791a.mo5026b(i2))) - ((c4791a.mo5026b(i) - c4791a.mo5026b(i2)) * (c4791a.mo5023a(i3) - c4791a.mo5023a(i2))))) / 2.0d;
    }

    /* renamed from: a */
    public void mo5030a() {
        this.f17533c = 0;
    }

    /* renamed from: b */
    public void mo5035b(int... iArr) {
        m21284q(iArr.length);
        for (int p : iArr) {
            this.f17532b[this.f17533c] = m21283p(p);
            this.f17533c++;
        }
    }

    /* renamed from: e */
    public void mo5036e(int i, int i2) {
        m21284q(1);
        System.arraycopy(this.f17532b, i, this.f17532b, i + 1, this.f17533c - i);
        this.f17532b[i] = m21283p(i2);
        this.f17533c++;
    }

    /* renamed from: f */
    public void mo5037f(int i, int i2) {
        this.f17532b[m21282o(i)] = m21283p(i2);
    }

    /* renamed from: b */
    public void mo5033b() {
        this.f17533c--;
    }

    /* renamed from: a */
    public void mo5031a(int i) {
        System.arraycopy(this.f17532b, i + 1, this.f17532b, i, (this.f17533c - i) - 1);
        this.f17533c--;
    }

    /* renamed from: o */
    private int m21282o(int i) {
        if (this.f17533c == 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        i %= this.f17533c;
        return i < 0 ? i + this.f17533c : i;
    }

    /* renamed from: p */
    private int m21283p(int i) {
        return i == -1 ? -1 : this.f17531a.m21214h(i);
    }

    /* renamed from: q */
    private void m21284q(int i) {
        if (this.f17532b.length < this.f17533c + i) {
            i = new int[(this.f17533c + Math.max(i, (int) ((((double) this.f17532b.length) * 1.5d) + 1.0d)))];
            System.arraycopy(this.f17532b, 0, i, 0, this.f17532b.length);
            this.f17532b = i;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4807m)) {
            return false;
        }
        C4807m c4807m = (C4807m) obj;
        if (c4807m.mo7054a((Object) this) && this.f17531a.equals(c4807m.f17531a)) {
            int[] iArr = this.f17532b;
            int i = this.f17533c;
            int[] iArr2 = c4807m.f17532b;
            obj = c4807m.f17533c;
            if (i == -1) {
                i = iArr.length;
            }
            if (obj == -1) {
                obj = iArr2.length;
            }
            if (i == obj && iArr != null && iArr2 != null && iArr.length >= i) {
                if (iArr2.length >= i) {
                    obj = null;
                    while (obj < i) {
                        if (iArr[obj] == iArr2[obj]) {
                            obj++;
                        }
                    }
                    obj = true;
                    if (obj == null) {
                        return true;
                    }
                }
            }
            obj = null;
            if (obj == null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    protected boolean mo7054a(Object obj) {
        return obj instanceof C4807m;
    }

    public int hashCode() {
        int hashCode = this.f17531a.hashCode();
        int[] iArr = this.f17532b;
        int i = this.f17533c;
        int i2 = 0;
        if (iArr != null) {
            int i3 = 1;
            while (i2 < i) {
                i3 = (i3 * 31) + iArr[i2];
                i2++;
            }
            i2 = i3;
        }
        return hashCode + (31 * i2);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{");
        stringBuilder.append(m21313m(5));
        stringBuilder.append(",");
        stringBuilder.append(this.f17533c);
        stringBuilder.append(",\n");
        stringBuilder.append(this.f17531a);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    /* renamed from: m */
    final String m21313m(int i) {
        int i2 = this.f17533c - 1;
        if (i2 == -1) {
            return "[]";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('[');
        int i3 = 0;
        while (true) {
            StringBuilder stringBuilder2 = new StringBuilder(13);
            stringBuilder2.append("%");
            stringBuilder2.append(i);
            stringBuilder2.append("s");
            stringBuilder.append(String.format(stringBuilder2.toString(), new Object[]{Integer.valueOf(this.f17532b[i3])}));
            if (i3 == i2) {
                stringBuilder.append(93);
                return stringBuilder.toString();
            }
            stringBuilder.append(", ");
            i3++;
        }
    }
}
