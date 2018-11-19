package com.google.android.gms.internal;

public final class aeb implements Cloneable {
    /* renamed from: a */
    private static final aec f15093a = new aec();
    /* renamed from: b */
    private boolean f15094b;
    /* renamed from: c */
    private int[] f15095c;
    /* renamed from: d */
    private aec[] f15096d;
    /* renamed from: e */
    private int f15097e;

    aeb() {
        this(10);
    }

    private aeb(int i) {
        this.f15094b = false;
        i = m19035c(i);
        this.f15095c = new int[i];
        this.f15096d = new aec[i];
        this.f15097e = 0;
    }

    /* renamed from: c */
    private static int m19035c(int i) {
        i <<= 2;
        for (int i2 = 4; i2 < 32; i2++) {
            int i3 = (1 << i2) - 12;
            if (i <= i3) {
                i = i3;
                break;
            }
        }
        return i / 4;
    }

    /* renamed from: d */
    private final int m19036d(int i) {
        int i2 = this.f15097e - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            int i5 = this.f15095c[i4];
            if (i5 < i) {
                i3 = i4 + 1;
            } else if (i5 <= i) {
                return i4;
            } else {
                i2 = i4 - 1;
            }
        }
        return i3 ^ -1;
    }

    /* renamed from: a */
    final int m19037a() {
        return this.f15097e;
    }

    /* renamed from: a */
    final aec m19038a(int i) {
        i = m19036d(i);
        if (i >= 0) {
            if (this.f15096d[i] != f15093a) {
                return this.f15096d[i];
            }
        }
        return null;
    }

    /* renamed from: a */
    final void m19039a(int i, aec aec) {
        int d = m19036d(i);
        if (d >= 0) {
            this.f15096d[d] = aec;
            return;
        }
        d ^= -1;
        if (d >= this.f15097e || this.f15096d[d] != f15093a) {
            if (this.f15097e >= this.f15095c.length) {
                int c = m19035c(this.f15097e + 1);
                Object obj = new int[c];
                Object obj2 = new aec[c];
                System.arraycopy(this.f15095c, 0, obj, 0, this.f15095c.length);
                System.arraycopy(this.f15096d, 0, obj2, 0, this.f15096d.length);
                this.f15095c = obj;
                this.f15096d = obj2;
            }
            if (this.f15097e - d != 0) {
                int i2 = d + 1;
                System.arraycopy(this.f15095c, d, this.f15095c, i2, this.f15097e - d);
                System.arraycopy(this.f15096d, d, this.f15096d, i2, this.f15097e - d);
            }
            this.f15095c[d] = i;
            this.f15096d[d] = aec;
            this.f15097e++;
            return;
        }
        this.f15095c[d] = i;
        this.f15096d[d] = aec;
    }

    /* renamed from: b */
    final aec m19040b(int i) {
        return this.f15096d[i];
    }

    /* renamed from: b */
    public final boolean m19041b() {
        return this.f15097e == 0;
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        int i = this.f15097e;
        aeb aeb = new aeb(i);
        int i2 = 0;
        System.arraycopy(this.f15095c, 0, aeb.f15095c, 0, i);
        while (i2 < i) {
            if (this.f15096d[i2] != null) {
                aeb.f15096d[i2] = (aec) this.f15096d[i2].clone();
            }
            i2++;
        }
        aeb.f15097e = i;
        return aeb;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aeb)) {
            return false;
        }
        aeb aeb = (aeb) obj;
        if (this.f15097e != aeb.f15097e) {
            return false;
        }
        Object obj2;
        int[] iArr = this.f15095c;
        int[] iArr2 = aeb.f15095c;
        int i = this.f15097e;
        for (int i2 = 0; i2 < i; i2++) {
            if (iArr[i2] != iArr2[i2]) {
                obj2 = null;
                break;
            }
        }
        obj2 = 1;
        if (obj2 != null) {
            aec[] aecArr = this.f15096d;
            aec[] aecArr2 = aeb.f15096d;
            int i3 = this.f15097e;
            for (i = 0; i < i3; i++) {
                if (!aecArr[i].equals(aecArr2[i])) {
                    obj = null;
                    break;
                }
            }
            obj = 1;
            if (obj != null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 17;
        for (int i2 = 0; i2 < this.f15097e; i2++) {
            i = (((i * 31) + this.f15095c[i2]) * 31) + this.f15096d[i2].hashCode();
        }
        return i;
    }
}
