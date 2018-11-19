package com.google.android.m4b.maps.bk;

/* renamed from: com.google.android.m4b.maps.bk.k */
public class C4805k {
    /* renamed from: a */
    private static final C4805k f17526a = new C6468a();
    /* renamed from: b */
    private final C4807m f17527b;
    /* renamed from: c */
    private int f17528c;

    /* renamed from: com.google.android.m4b.maps.bk.k$a */
    final class C6468a extends C4805k {
        /* renamed from: c */
        public final double mo5039c() {
            return 0.0d;
        }

        /* renamed from: d */
        public final int mo5040d() {
            return 0;
        }

        /* renamed from: e */
        public final int mo5041e() {
            return 0;
        }

        public final int hashCode() {
            return 0;
        }

        public C6468a() {
            super();
        }

        /* renamed from: a */
        public final boolean mo5038a(int i, int i2, int i3) {
            throw new UnsupportedOperationException("Cannot add triangle to immutable empty mesh");
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (!super.equals(obj)) {
                    if ((obj instanceof C4805k) && ((C4805k) obj).mo5040d() == null) {
                        return true;
                    }
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: a */
    public static C4805k m21269a(C4807m c4807m) {
        return new C4805k(c4807m.m21295c());
    }

    /* renamed from: a */
    public static C4805k m21268a() {
        return f17526a;
    }

    private C4805k(C4807m c4807m) {
        this.f17528c = 0;
        this.f17527b = c4807m;
    }

    /* renamed from: a */
    public boolean mo5038a(int i, int i2, int i3) {
        if (this.f17527b.m21294c(i, i2, i3) > 0.0d) {
            this.f17527b.mo5035b(i, i2, i3);
            return true;
        }
        this.f17528c++;
        return false;
    }

    /* renamed from: a */
    public final boolean m21273a(C4794d c4794d) {
        double a = c4794d.m21238a();
        double c = mo5039c();
        if (Math.abs(a - c) > 0.001d * a && a != c) {
            if (Double.isNaN(a) == null || Double.isNaN(c) == null) {
                return null;
            }
        }
        return true;
    }

    /* renamed from: b */
    public final void m21275b() {
        this.f17528c++;
    }

    /* renamed from: c */
    public double mo5039c() {
        double d = 0.0d;
        for (int i = 0; i < this.f17527b.f17533c; i += 3) {
            d += this.f17527b.m21290b(i, i + 1, i + 2);
        }
        return d;
    }

    /* renamed from: d */
    public int mo5040d() {
        return this.f17527b == null ? 0 : this.f17527b.f17533c / 3;
    }

    /* renamed from: e */
    public int mo5041e() {
        return this.f17527b == null ? 0 : this.f17527b.m21298e();
    }

    /* renamed from: a */
    public final double m21270a(int i) {
        if (i >= 0) {
            if (i < this.f17527b.m21298e()) {
                return this.f17527b.m21289b(i);
            }
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: b */
    public final double m21274b(int i) {
        if (i >= 0) {
            if (i < this.f17527b.m21298e()) {
                return this.f17527b.m21293c(i);
            }
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public final int m21271a(int i, int i2) {
        if (i >= 0 && i < mo5040d() && i2 >= 0) {
            if (i2 < 3) {
                return this.f17527b.m21310j((i * 3) + i2);
            }
        }
        throw new IllegalArgumentException();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\nint[] triangles = {\n    ");
        int i = this.f17527b.f17533c;
        for (int i2 = 0; i2 < i; i2 += 3) {
            stringBuilder.append(this.f17527b.m21310j(i2));
            stringBuilder.append(", ");
            stringBuilder.append(this.f17527b.m21310j(i2 + 1));
            stringBuilder.append(", ");
            stringBuilder.append(this.f17527b.m21310j(i2 + 2));
            if (i2 == this.f17527b.f17533c - 3) {
                stringBuilder.append("\n};\n\n");
            } else {
                stringBuilder.append(",\n    ");
            }
        }
        i = this.f17527b.m21298e();
        for (int i3 = 0; i3 < i; i3++) {
            stringBuilder.append("cutVertices.add(new Vertex2d(");
            stringBuilder.append(this.f17527b.m21289b(i3));
            stringBuilder.append(", ");
            stringBuilder.append(this.f17527b.m21293c(i3));
            stringBuilder.append("));\n");
        }
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        if (obj instanceof C4805k) {
            return ((C4805k) obj).f17527b.equals(this.f17527b);
        }
        return null;
    }

    public int hashCode() {
        return this.f17527b.hashCode();
    }
}
