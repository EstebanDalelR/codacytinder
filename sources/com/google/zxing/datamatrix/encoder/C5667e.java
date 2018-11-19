package com.google.zxing.datamatrix.encoder;

import java.util.Arrays;

/* renamed from: com.google.zxing.datamatrix.encoder.e */
public class C5667e {
    /* renamed from: a */
    private final CharSequence f21000a;
    /* renamed from: b */
    private final int f21001b;
    /* renamed from: c */
    private final int f21002c;
    /* renamed from: d */
    private final byte[] f21003d;

    public C5667e(CharSequence charSequence, int i, int i2) {
        this.f21000a = charSequence;
        this.f21002c = i;
        this.f21001b = i2;
        this.f21003d = new byte[(i * i2)];
        Arrays.fill(this.f21003d, -1);
    }

    /* renamed from: a */
    public final boolean m24788a(int i, int i2) {
        return this.f21003d[(i2 * this.f21002c) + i] == 1;
    }

    /* renamed from: a */
    private void m24782a(int i, int i2, boolean z) {
        this.f21003d[(i2 * this.f21002c) + i] = (byte) z;
    }

    /* renamed from: b */
    private boolean m24784b(int i, int i2) {
        return this.f21003d[(i2 * this.f21002c) + i] >= 0;
    }

    /* renamed from: a */
    public final void m24787a() {
        int i = 4;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i == this.f21001b && r2 == 0) {
                int i4 = i3 + 1;
                m24779a(i3);
                i3 = i4;
            }
            if (i == this.f21001b - 2 && r2 == 0 && this.f21002c % 4 != 0) {
                i4 = i3 + 1;
                m24783b(i3);
                i3 = i4;
            }
            if (i == this.f21001b - 2 && r2 == 0 && this.f21002c % 8 == 4) {
                i4 = i3 + 1;
                m24785c(i3);
                i3 = i4;
            }
            if (i == this.f21001b + 4 && r2 == 2 && this.f21002c % 8 == 0) {
                i4 = i3 + 1;
                m24786d(i3);
                i3 = i4;
            }
            do {
                if (i < this.f21001b && i2 >= 0 && !m24784b(i2, i)) {
                    i4 = i3 + 1;
                    m24780a(i, i2, i3);
                    i3 = i4;
                }
                i -= 2;
                i2 += 2;
                if (i < 0) {
                    break;
                }
            } while (i2 < this.f21002c);
            i++;
            i2 += 3;
            do {
                if (i >= 0 && i2 < this.f21002c && !m24784b(i2, i)) {
                    i4 = i3 + 1;
                    m24780a(i, i2, i3);
                    i3 = i4;
                }
                i += 2;
                i2 -= 2;
                if (i >= this.f21001b) {
                    break;
                }
            } while (i2 >= 0);
            i += 3;
            i2++;
            if (i >= this.f21001b && i2 >= this.f21002c) {
                break;
            }
        }
        if (!m24784b(this.f21002c - 1, this.f21001b - 1)) {
            m24782a(this.f21002c - 1, this.f21001b - 1, true);
            m24782a(this.f21002c - 2, this.f21001b - 2, true);
        }
    }

    /* renamed from: a */
    private void m24781a(int i, int i2, int i3, int i4) {
        if (i < 0) {
            i += this.f21001b;
            i2 += 4 - ((this.f21001b + 4) % 8);
        }
        if (i2 < 0) {
            i2 += this.f21002c;
            i += 4 - ((this.f21002c + 4) % 8);
        }
        boolean z = true;
        if ((this.f21000a.charAt(i3) & (1 << (8 - i4))) == 0) {
            z = false;
        }
        m24782a(i2, i, z);
    }

    /* renamed from: a */
    private void m24780a(int i, int i2, int i3) {
        int i4 = i - 2;
        int i5 = i2 - 2;
        m24781a(i4, i5, i3, 1);
        int i6 = i2 - 1;
        m24781a(i4, i6, i3, 2);
        i4 = i - 1;
        m24781a(i4, i5, i3, 3);
        m24781a(i4, i6, i3, 4);
        m24781a(i4, i2, i3, 5);
        m24781a(i, i5, i3, 6);
        m24781a(i, i6, i3, 7);
        m24781a(i, i2, i3, 8);
    }

    /* renamed from: a */
    private void m24779a(int i) {
        m24781a(this.f21001b - 1, 0, i, 1);
        m24781a(this.f21001b - 1, 1, i, 2);
        m24781a(this.f21001b - 1, 2, i, 3);
        m24781a(0, this.f21002c - 2, i, 4);
        m24781a(0, this.f21002c - 1, i, 5);
        m24781a(1, this.f21002c - 1, i, 6);
        m24781a(2, this.f21002c - 1, i, 7);
        m24781a(3, this.f21002c - 1, i, 8);
    }

    /* renamed from: b */
    private void m24783b(int i) {
        m24781a(this.f21001b - 3, 0, i, 1);
        m24781a(this.f21001b - 2, 0, i, 2);
        m24781a(this.f21001b - 1, 0, i, 3);
        m24781a(0, this.f21002c - 4, i, 4);
        m24781a(0, this.f21002c - 3, i, 5);
        m24781a(0, this.f21002c - 2, i, 6);
        m24781a(0, this.f21002c - 1, i, 7);
        m24781a(1, this.f21002c - 1, i, 8);
    }

    /* renamed from: c */
    private void m24785c(int i) {
        m24781a(this.f21001b - 3, 0, i, 1);
        m24781a(this.f21001b - 2, 0, i, 2);
        m24781a(this.f21001b - 1, 0, i, 3);
        m24781a(0, this.f21002c - 2, i, 4);
        m24781a(0, this.f21002c - 1, i, 5);
        m24781a(1, this.f21002c - 1, i, 6);
        m24781a(2, this.f21002c - 1, i, 7);
        m24781a(3, this.f21002c - 1, i, 8);
    }

    /* renamed from: d */
    private void m24786d(int i) {
        m24781a(this.f21001b - 1, 0, i, 1);
        m24781a(this.f21001b - 1, this.f21002c - 1, i, 2);
        m24781a(0, this.f21002c - 3, i, 3);
        m24781a(0, this.f21002c - 2, i, 4);
        m24781a(0, this.f21002c - 1, i, 5);
        m24781a(1, this.f21002c - 3, i, 6);
        m24781a(1, this.f21002c - 2, i, 7);
        m24781a(1, this.f21002c - 1, i, 8);
    }
}
