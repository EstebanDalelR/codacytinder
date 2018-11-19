package com.google.android.m4b.maps.ct;

import java.util.Arrays;

/* renamed from: com.google.android.m4b.maps.ct.x */
public final class C5292x {
    /* renamed from: a */
    private static final int[] f19634a = new int[0];
    /* renamed from: b */
    private static final Object[] f19635b = new Object[0];
    /* renamed from: c */
    private static final C5292x f19636c = new C5292x(0, f19634a, f19635b);
    /* renamed from: d */
    private int f19637d;
    /* renamed from: e */
    private int[] f19638e;
    /* renamed from: f */
    private Object[] f19639f;
    /* renamed from: g */
    private int f19640g;

    /* renamed from: com.google.android.m4b.maps.ct.x$a */
    public static final class C5291a {
        /* renamed from: a */
        private int f19630a;
        /* renamed from: b */
        private int[] f19631b;
        /* renamed from: c */
        private Object[] f19632c;
        /* renamed from: d */
        private boolean f19633d;

        private C5291a() {
            this.f19630a = 0;
            this.f19631b = C5292x.f19634a;
            this.f19632c = C5292x.f19635b;
        }

        /* renamed from: b */
        private void m23462b() {
            if (this.f19633d) {
                throw new IllegalStateException("Do not reuse UnknownFieldSetLite Builders.");
            }
        }

        /* renamed from: a */
        public final boolean m23465a(int i, C5257e c5257e) {
            m23462b();
            int b = C5299z.m23485b(i);
            switch (C5299z.m23482a(i)) {
                case 0:
                    m23461a(i, Long.valueOf(c5257e.m23300e()));
                    return true;
                case 1:
                    m23461a(i, Long.valueOf(c5257e.m23302g()));
                    return true;
                case 2:
                    m23461a(i, c5257e.m23307l());
                    return true;
                case 3:
                    C5291a b2 = C5292x.m23468b();
                    while (true) {
                        int a = c5257e.m23291a();
                        if (a == 0 || !b2.m23465a(a, c5257e)) {
                            c5257e.m23292a(C5299z.m23483a(b, 4));
                            m23461a(i, b2.m23464a());
                            return true;
                        }
                    }
                    break;
                case 4:
                    return false;
                case 5:
                    m23461a(i, Integer.valueOf(c5257e.m23303h()));
                    return true;
                default:
                    throw C5274m.m23414g();
            }
        }

        /* renamed from: a */
        public final C5291a m23463a(int i, int i2) {
            if (i == 0) {
                throw new IllegalArgumentException("Zero is not a valid field number.");
            }
            m23462b();
            m23461a(C5299z.m23483a(i, 0), Long.valueOf((long) i2));
            return this;
        }

        /* renamed from: a */
        public final C5292x m23464a() {
            if (this.f19633d) {
                throw new IllegalStateException("Do not reuse UnknownFieldSetLite Builders.");
            }
            this.f19633d = true;
            if (this.f19630a == 0) {
                return C5292x.f19636c;
            }
            return new C5292x(this.f19630a, this.f19631b, this.f19632c);
        }

        /* renamed from: a */
        private void m23461a(int i, Object obj) {
            if (this.f19630a == this.f19631b.length) {
                int i2 = this.f19630a + (this.f19630a < 4 ? 8 : this.f19630a >> 1);
                this.f19631b = Arrays.copyOf(this.f19631b, i2);
                this.f19632c = Arrays.copyOf(this.f19632c, i2);
            }
            this.f19631b[this.f19630a] = i;
            this.f19632c[this.f19630a] = obj;
            this.f19630a++;
        }
    }

    /* renamed from: a */
    public static C5292x m23466a() {
        return f19636c;
    }

    /* renamed from: b */
    public static C5291a m23468b() {
        return new C5291a();
    }

    /* renamed from: a */
    static C5292x m23467a(C5292x c5292x, C5292x c5292x2) {
        int i = c5292x.f19637d + c5292x2.f19637d;
        Object copyOf = Arrays.copyOf(c5292x.f19638e, i);
        System.arraycopy(c5292x2.f19638e, 0, copyOf, c5292x.f19637d, c5292x2.f19637d);
        Object copyOf2 = Arrays.copyOf(c5292x.f19639f, i);
        System.arraycopy(c5292x2.f19639f, 0, copyOf2, c5292x.f19637d, c5292x2.f19637d);
        return new C5292x(i, copyOf, copyOf2);
    }

    private C5292x(int i, int[] iArr, Object[] objArr) {
        this.f19640g = -1;
        this.f19637d = i;
        this.f19638e = iArr;
        this.f19639f = objArr;
    }

    /* renamed from: a */
    public final void m23472a(C5259f c5259f) {
        for (int i = 0; i < this.f19637d; i++) {
            int i2 = this.f19638e[i];
            int b = C5299z.m23485b(i2);
            i2 = C5299z.m23482a(i2);
            if (i2 != 5) {
                switch (i2) {
                    case 0:
                        long longValue = ((Long) this.f19639f[i]).longValue();
                        c5259f.m23360b(b, 0);
                        c5259f.m23355a(longValue);
                        break;
                    case 1:
                        c5259f.m23352a(b, ((Long) this.f19639f[i]).longValue());
                        break;
                    case 2:
                        c5259f.m23353a(b, (C5255d) this.f19639f[i]);
                        break;
                    case 3:
                        c5259f.m23360b(b, 3);
                        ((C5292x) this.f19639f[i]).m23472a(c5259f);
                        c5259f.m23360b(b, 4);
                        break;
                    default:
                        throw C5274m.m23414g();
                }
            }
            i2 = ((Integer) this.f19639f[i]).intValue();
            c5259f.m23360b(b, 5);
            c5259f.m23359b(i2);
        }
    }

    /* renamed from: c */
    public final int m23473c() {
        int i = this.f19640g;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (i = 0; i < this.f19637d; i++) {
            int i3 = this.f19638e[i];
            int b = C5299z.m23485b(i3);
            i3 = C5299z.m23482a(i3);
            if (i3 != 5) {
                switch (i3) {
                    case 0:
                        i2 += C5259f.m23323b(b, ((Long) this.f19639f[i]).longValue());
                        break;
                    case 1:
                        i2 += C5259f.m23333c(b, ((Long) this.f19639f[i]).longValue());
                        break;
                    case 2:
                        i2 += C5259f.m23324b(b, (C5255d) this.f19639f[i]);
                        break;
                    case 3:
                        i2 += (C5259f.m23348j(b) * 2) + ((C5292x) this.f19639f[i]).m23473c();
                        break;
                    default:
                        throw new IllegalStateException(C5274m.m23414g());
                }
            }
            i2 += C5259f.m23317a(b, ((Integer) this.f19639f[i]).intValue());
        }
        this.f19640g = i2;
        return i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C5292x)) {
            return false;
        }
        C5292x c5292x = (C5292x) obj;
        if (this.f19637d == c5292x.f19637d && Arrays.equals(this.f19638e, c5292x.f19638e)) {
            if (Arrays.deepEquals(this.f19639f, c5292x.f19639f) != null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f19637d + 527) * 31) + Arrays.hashCode(this.f19638e)) * 31) + Arrays.deepHashCode(this.f19639f);
    }
}
