package com.google.zxing.common;

import java.util.Arrays;

/* renamed from: com.google.zxing.common.a */
public final class C5664a implements Cloneable {
    /* renamed from: a */
    private int[] f20987a;
    /* renamed from: b */
    private int f20988b;

    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        return m24763d();
    }

    public C5664a() {
        this.f20988b = 0;
        this.f20987a = new int[1];
    }

    public C5664a(int i) {
        this.f20988b = i;
        this.f20987a = C5664a.m24750e(i);
    }

    C5664a(int[] iArr, int i) {
        this.f20987a = iArr;
        this.f20988b = i;
    }

    /* renamed from: a */
    public int m24751a() {
        return this.f20988b;
    }

    /* renamed from: b */
    public int m24758b() {
        return (this.f20988b + 7) / 8;
    }

    /* renamed from: d */
    private void m24749d(int i) {
        if (i > (this.f20987a.length << 5)) {
            i = C5664a.m24750e(i);
            System.arraycopy(this.f20987a, 0, i, 0, this.f20987a.length);
            this.f20987a = i;
        }
    }

    /* renamed from: a */
    public boolean m24756a(int i) {
        return ((1 << (i & 31)) & this.f20987a[i / 32]) != 0;
    }

    /* renamed from: b */
    public int m24759b(int i) {
        if (i >= this.f20988b) {
            return this.f20988b;
        }
        int i2 = i / 32;
        i = (((1 << (i & 31)) - 1) ^ -1) & this.f20987a[i2];
        while (i == 0) {
            i2++;
            if (i2 == this.f20987a.length) {
                return this.f20988b;
            }
            i = this.f20987a[i2];
        }
        i2 = (i2 << 5) + Integer.numberOfTrailingZeros(i);
        return i2 > this.f20988b ? this.f20988b : i2;
    }

    /* renamed from: c */
    public int m24761c(int i) {
        if (i >= this.f20988b) {
            return this.f20988b;
        }
        int i2 = i / 32;
        i = (((1 << (i & 31)) - 1) ^ -1) & (this.f20987a[i2] ^ -1);
        while (i == 0) {
            i2++;
            if (i2 == this.f20987a.length) {
                return this.f20988b;
            }
            i = this.f20987a[i2] ^ -1;
        }
        i2 = (i2 << 5) + Integer.numberOfTrailingZeros(i);
        return i2 > this.f20988b ? this.f20988b : i2;
    }

    /* renamed from: a */
    public boolean m24757a(int i, int i2, boolean z) {
        if (i2 >= i && i >= 0) {
            if (i2 <= this.f20988b) {
                if (i2 == i) {
                    return true;
                }
                i2--;
                int i3 = i / 32;
                int i4 = i2 / 32;
                int i5 = i3;
                while (i5 <= i4) {
                    int i6 = 31;
                    int i7 = i5 > i3 ? 0 : i & 31;
                    if (i5 >= i4) {
                        i6 = 31 & i2;
                    }
                    i6 = (2 << i6) - (1 << i7);
                    i7 = this.f20987a[i5] & i6;
                    if (!z) {
                        i6 = 0;
                    }
                    if (i7 != i6) {
                        return false;
                    }
                    i5++;
                }
                return true;
            }
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public void m24755a(boolean z) {
        m24749d(this.f20988b + 1);
        if (z) {
            z = this.f20987a;
            int i = this.f20988b / 32;
            z[i] = z[i] | (1 << (this.f20988b & 31));
        }
        this.f20988b += true;
    }

    /* renamed from: a */
    public void m24752a(int i, int i2) {
        if (i2 >= 0) {
            if (i2 <= 32) {
                m24749d(this.f20988b + i2);
                while (i2 > 0) {
                    boolean z = true;
                    if (((i >> (i2 - 1)) & 1) != 1) {
                        z = false;
                    }
                    m24755a(z);
                    i2--;
                }
                return;
            }
        }
        throw new IllegalArgumentException("Num bits must be between 0 and 32");
    }

    /* renamed from: a */
    public void m24754a(C5664a c5664a) {
        int i = c5664a.f20988b;
        m24749d(this.f20988b + i);
        for (int i2 = 0; i2 < i; i2++) {
            m24755a(c5664a.m24756a(i2));
        }
    }

    /* renamed from: b */
    public void m24760b(C5664a c5664a) {
        if (this.f20988b != c5664a.f20988b) {
            throw new IllegalArgumentException("Sizes don't match");
        }
        for (int i = 0; i < this.f20987a.length; i++) {
            int[] iArr = this.f20987a;
            iArr[i] = iArr[i] ^ c5664a.f20987a[i];
        }
    }

    /* renamed from: a */
    public void m24753a(int i, byte[] bArr, int i2, int i3) {
        int i4 = i;
        i = 0;
        while (i < i3) {
            int i5 = i4;
            int i6 = 0;
            for (i4 = 0; i4 < 8; i4++) {
                if (m24756a(i5)) {
                    i6 |= 1 << (7 - i4);
                }
                i5++;
            }
            bArr[i2 + i] = (byte) i6;
            i++;
            i4 = i5;
        }
    }

    /* renamed from: c */
    public void m24762c() {
        int i;
        int[] iArr = new int[this.f20987a.length];
        int i2 = (this.f20988b - 1) / 32;
        int i3 = i2 + 1;
        for (i = 0; i < i3; i++) {
            long j = (long) r0.f20987a[i];
            long j2 = ((j >> 1) & 1431655765) | ((j & 1431655765) << 1);
            j2 = ((j2 >> 2) & 858993459) | ((j2 & 858993459) << 2);
            j2 = ((j2 >> 4) & 252645135) | ((j2 & 252645135) << 4);
            j2 = ((j2 >> 8) & 16711935) | ((j2 & 16711935) << 8);
            iArr[i2 - i] = (int) (((j2 >> 16) & 65535) | ((j2 & 65535) << 16));
        }
        i = i3 << 5;
        if (r0.f20988b != i) {
            i -= r0.f20988b;
            int i4 = iArr[0] >>> i;
            for (i2 = 1; i2 < i3; i2++) {
                int i5 = iArr[i2];
                iArr[i2 - 1] = i4 | (i5 << (32 - i));
                i4 = i5 >>> i;
            }
            iArr[i3 - 1] = i4;
        }
        r0.f20987a = iArr;
    }

    /* renamed from: e */
    private static int[] m24750e(int i) {
        return new int[((i + 31) / 32)];
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5664a)) {
            return false;
        }
        C5664a c5664a = (C5664a) obj;
        if (this.f20988b != c5664a.f20988b || Arrays.equals(this.f20987a, c5664a.f20987a) == null) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.f20988b * 31) + Arrays.hashCode(this.f20987a);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(this.f20988b);
        for (int i = 0; i < this.f20988b; i++) {
            if ((i & 7) == 0) {
                stringBuilder.append(' ');
            }
            stringBuilder.append(m24756a(i) ? 'X' : '.');
        }
        return stringBuilder.toString();
    }

    /* renamed from: d */
    public C5664a m24763d() {
        return new C5664a((int[]) this.f20987a.clone(), this.f20988b);
    }
}
