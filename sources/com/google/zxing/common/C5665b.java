package com.google.zxing.common;

import java.util.Arrays;

/* renamed from: com.google.zxing.common.b */
public final class C5665b implements Cloneable {
    /* renamed from: a */
    private final int f20989a;
    /* renamed from: b */
    private final int f20990b;
    /* renamed from: c */
    private final int f20991c;
    /* renamed from: d */
    private final int[] f20992d;

    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        return m24773d();
    }

    public C5665b(int i) {
        this(i, i);
    }

    public C5665b(int i, int i2) {
        if (i > 0) {
            if (i2 > 0) {
                this.f20989a = i;
                this.f20990b = i2;
                this.f20991c = (i + 31) / 32;
                this.f20992d = new int[(this.f20991c * i2)];
                return;
            }
        }
        throw new IllegalArgumentException("Both dimensions must be greater than 0");
    }

    private C5665b(int i, int i2, int i3, int[] iArr) {
        this.f20989a = i;
        this.f20990b = i2;
        this.f20991c = i3;
        this.f20992d = iArr;
    }

    /* renamed from: a */
    public boolean m24768a(int i, int i2) {
        return ((this.f20992d[(i2 * this.f20991c) + (i / 32)] >>> (i & 31)) & 1) != 0;
    }

    /* renamed from: b */
    public void m24770b(int i, int i2) {
        i2 = (i2 * this.f20991c) + (i / 32);
        int[] iArr = this.f20992d;
        iArr[i2] = (1 << (i & 31)) | iArr[i2];
    }

    /* renamed from: c */
    public void m24772c(int i, int i2) {
        i2 = (i2 * this.f20991c) + (i / 32);
        int[] iArr = this.f20992d;
        iArr[i2] = (1 << (i & 31)) ^ iArr[i2];
    }

    /* renamed from: a */
    public void m24766a() {
        int length = this.f20992d.length;
        for (int i = 0; i < length; i++) {
            this.f20992d[i] = 0;
        }
    }

    /* renamed from: a */
    public void m24767a(int i, int i2, int i3, int i4) {
        if (i2 >= 0) {
            if (i >= 0) {
                if (i4 > 0) {
                    if (i3 > 0) {
                        i3 += i;
                        i4 += i2;
                        if (i4 <= this.f20990b) {
                            if (i3 <= this.f20989a) {
                                while (i2 < i4) {
                                    int i5 = this.f20991c * i2;
                                    for (int i6 = i; i6 < i3; i6++) {
                                        int[] iArr = this.f20992d;
                                        int i7 = (i6 / 32) + i5;
                                        iArr[i7] = iArr[i7] | (1 << (i6 & 31));
                                    }
                                    i2++;
                                }
                                return;
                            }
                        }
                        throw new IllegalArgumentException("The region must fit inside the matrix");
                    }
                }
                throw new IllegalArgumentException("Height and width must be at least 1");
            }
        }
        throw new IllegalArgumentException("Left and top must be nonnegative");
    }

    /* renamed from: b */
    public int m24769b() {
        return this.f20989a;
    }

    /* renamed from: c */
    public int m24771c() {
        return this.f20990b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5665b)) {
            return false;
        }
        C5665b c5665b = (C5665b) obj;
        if (this.f20989a == c5665b.f20989a && this.f20990b == c5665b.f20990b && this.f20991c == c5665b.f20991c && Arrays.equals(this.f20992d, c5665b.f20992d) != null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((this.f20989a * 31) + this.f20989a) * 31) + this.f20990b) * 31) + this.f20991c) * 31) + Arrays.hashCode(this.f20992d);
    }

    public String toString() {
        return m24765a("X ", "  ");
    }

    /* renamed from: a */
    public String m24765a(String str, String str2) {
        return m24764a(str, str2, "\n");
    }

    /* renamed from: a */
    private String m24764a(String str, String str2, String str3) {
        StringBuilder stringBuilder = new StringBuilder(this.f20990b * (this.f20989a + 1));
        for (int i = 0; i < this.f20990b; i++) {
            for (int i2 = 0; i2 < this.f20989a; i2++) {
                stringBuilder.append(m24768a(i2, i) ? str : str2);
            }
            stringBuilder.append(str3);
        }
        return stringBuilder.toString();
    }

    /* renamed from: d */
    public C5665b m24773d() {
        return new C5665b(this.f20989a, this.f20990b, this.f20991c, (int[]) this.f20992d.clone());
    }
}
