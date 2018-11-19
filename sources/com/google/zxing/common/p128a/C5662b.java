package com.google.zxing.common.p128a;

/* renamed from: com.google.zxing.common.a.b */
final class C5662b {
    /* renamed from: a */
    private final C5661a f20983a;
    /* renamed from: b */
    private final int[] f20984b;

    C5662b(C5661a c5661a, int[] iArr) {
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        this.f20983a = c5661a;
        c5661a = iArr.length;
        if (c5661a <= 1 || iArr[0] != 0) {
            this.f20984b = iArr;
            return;
        }
        int i = 1;
        while (i < c5661a && iArr[i] == 0) {
            i++;
        }
        if (i == c5661a) {
            this.f20984b = new int[]{null};
            return;
        }
        this.f20984b = new int[(c5661a - i)];
        System.arraycopy(iArr, i, this.f20984b, 0, this.f20984b.length);
    }

    /* renamed from: a */
    int[] m24742a() {
        return this.f20984b;
    }

    /* renamed from: b */
    int m24743b() {
        return this.f20984b.length - 1;
    }

    /* renamed from: c */
    boolean m24745c() {
        return this.f20984b[0] == 0;
    }

    /* renamed from: a */
    int m24739a(int i) {
        return this.f20984b[(this.f20984b.length - 1) - i];
    }

    /* renamed from: a */
    C5662b m24741a(C5662b c5662b) {
        if (!this.f20983a.equals(c5662b.f20983a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        } else if (m24745c()) {
            return c5662b;
        } else {
            if (c5662b.m24745c()) {
                return this;
            }
            int[] iArr = this.f20984b;
            c5662b = c5662b.f20984b;
            if (iArr.length > c5662b.length) {
                int[] iArr2 = iArr;
                iArr = c5662b;
                c5662b = iArr2;
            }
            Object obj = new int[c5662b.length];
            int length = c5662b.length - iArr.length;
            System.arraycopy(c5662b, 0, obj, 0, length);
            for (int i = length; i < c5662b.length; i++) {
                obj[i] = C5661a.m24731b(iArr[i - length], c5662b[i]);
            }
            return new C5662b(this.f20983a, obj);
        }
    }

    /* renamed from: b */
    C5662b m24744b(C5662b c5662b) {
        if (this.f20983a.equals(c5662b.f20983a)) {
            if (!m24745c()) {
                if (!c5662b.m24745c()) {
                    int[] iArr = this.f20984b;
                    int length = iArr.length;
                    c5662b = c5662b.f20984b;
                    int length2 = c5662b.length;
                    int[] iArr2 = new int[((length + length2) - 1)];
                    for (int i = 0; i < length; i++) {
                        int i2 = iArr[i];
                        for (int i3 = 0; i3 < length2; i3++) {
                            int i4 = i + i3;
                            iArr2[i4] = C5661a.m24731b(iArr2[i4], this.f20983a.m24738c(i2, c5662b[i3]));
                        }
                    }
                    return new C5662b(this.f20983a, iArr2);
                }
            }
            return this.f20983a.m24733a();
        }
        throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
    }

    /* renamed from: a */
    C5662b m24740a(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        } else if (i2 == 0) {
            return this.f20983a.m24733a();
        } else {
            int length = this.f20984b.length;
            i = new int[(i + length)];
            for (int i3 = 0; i3 < length; i3++) {
                i[i3] = this.f20983a.m24738c(this.f20984b[i3], i2);
            }
            return new C5662b(this.f20983a, i);
        }
    }

    /* renamed from: c */
    C5662b[] m24746c(C5662b c5662b) {
        if (!this.f20983a.equals(c5662b.f20983a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        } else if (c5662b.m24745c()) {
            throw new IllegalArgumentException("Divide by 0");
        } else {
            C5662b a = this.f20983a.m24733a();
            int c = this.f20983a.m24737c(c5662b.m24739a(c5662b.m24743b()));
            C5662b c5662b2 = a;
            a = this;
            while (a.m24743b() >= c5662b.m24743b() && !a.m24745c()) {
                int b = a.m24743b() - c5662b.m24743b();
                int c2 = this.f20983a.m24738c(a.m24739a(a.m24743b()), c);
                C5662b a2 = c5662b.m24740a(b, c2);
                c5662b2 = c5662b2.m24741a(this.f20983a.m24734a(b, c2));
                a = a.m24741a(a2);
            }
            return new C5662b[]{c5662b2, a};
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(m24743b() * 8);
        for (int b = m24743b(); b >= 0; b--) {
            int a = m24739a(b);
            if (a != 0) {
                if (a < 0) {
                    stringBuilder.append(" - ");
                    a = -a;
                } else if (stringBuilder.length() > 0) {
                    stringBuilder.append(" + ");
                }
                if (b == 0 || a != 1) {
                    a = this.f20983a.m24736b(a);
                    if (a == 0) {
                        stringBuilder.append('1');
                    } else if (a == 1) {
                        stringBuilder.append('a');
                    } else {
                        stringBuilder.append("a^");
                        stringBuilder.append(a);
                    }
                }
                if (b != 0) {
                    if (b == 1) {
                        stringBuilder.append('x');
                    } else {
                        stringBuilder.append("x^");
                        stringBuilder.append(b);
                    }
                }
            }
        }
        return stringBuilder.toString();
    }
}
