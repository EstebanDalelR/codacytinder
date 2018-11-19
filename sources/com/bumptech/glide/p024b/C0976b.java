package com.bumptech.glide.p024b;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.bumptech.glide.b.b */
class C0976b {
    /* renamed from: a */
    int f2632a;
    /* renamed from: b */
    int f2633b = 12;
    /* renamed from: c */
    int f2634c;
    /* renamed from: d */
    int f2635d = 4096;
    /* renamed from: e */
    int[] f2636e = new int[5003];
    /* renamed from: f */
    int[] f2637f = new int[5003];
    /* renamed from: g */
    int f2638g = 5003;
    /* renamed from: h */
    int f2639h = 0;
    /* renamed from: i */
    boolean f2640i = false;
    /* renamed from: j */
    int f2641j;
    /* renamed from: k */
    int f2642k;
    /* renamed from: l */
    int f2643l;
    /* renamed from: m */
    int f2644m = 0;
    /* renamed from: n */
    int f2645n = 0;
    /* renamed from: o */
    int[] f2646o = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535};
    /* renamed from: p */
    int f2647p;
    /* renamed from: q */
    byte[] f2648q = new byte[256];
    /* renamed from: r */
    private int f2649r;
    /* renamed from: s */
    private int f2650s;
    /* renamed from: t */
    private byte[] f2651t;
    /* renamed from: u */
    private int f2652u;
    /* renamed from: v */
    private int f2653v;
    /* renamed from: w */
    private int f2654w;

    /* renamed from: b */
    final int m3368b(int i) {
        return (1 << i) - 1;
    }

    C0976b(int i, int i2, byte[] bArr, int i3) {
        this.f2649r = i;
        this.f2650s = i2;
        this.f2651t = bArr;
        this.f2652u = Math.max(2, i3);
    }

    /* renamed from: a */
    void m3364a(byte b, OutputStream outputStream) throws IOException {
        byte[] bArr = this.f2648q;
        int i = this.f2647p;
        this.f2647p = i + 1;
        bArr[i] = b;
        if (this.f2647p >= (byte) -2) {
            m3371c(outputStream);
        }
    }

    /* renamed from: a */
    void m3367a(OutputStream outputStream) throws IOException {
        m3365a(this.f2638g);
        this.f2639h = this.f2642k + 2;
        this.f2640i = true;
        m3369b(this.f2642k, outputStream);
    }

    /* renamed from: a */
    void m3365a(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            this.f2636e[i2] = -1;
        }
    }

    /* renamed from: a */
    void m3366a(int i, OutputStream outputStream) throws IOException {
        int i2;
        this.f2641j = i;
        int i3 = 0;
        this.f2640i = false;
        this.f2632a = this.f2641j;
        this.f2634c = m3368b(this.f2632a);
        this.f2642k = 1 << (i - 1);
        this.f2643l = this.f2642k + 1;
        this.f2639h = this.f2642k + 2;
        this.f2647p = 0;
        i = m3363a();
        for (i2 = this.f2638g; i2 < 65536; i2 *= 2) {
            i3++;
        }
        i3 = 8 - i3;
        i2 = this.f2638g;
        m3365a(i2);
        m3369b(this.f2642k, outputStream);
        while (true) {
            int a = m3363a();
            if (a != -1) {
                int i4 = (a << this.f2633b) + i;
                int i5 = (a << i3) ^ i;
                if (this.f2636e[i5] == i4) {
                    i = this.f2637f[i5];
                } else if (this.f2636e[i5] >= 0) {
                    r6 = i2 - i5;
                    if (i5 == 0) {
                        r6 = 1;
                    }
                    do {
                        i5 -= r6;
                        if (i5 < 0) {
                            i5 += i2;
                        }
                        if (this.f2636e[i5] == i4) {
                            i = this.f2637f[i5];
                            break;
                        }
                    } while (this.f2636e[i5] >= 0);
                    m3369b(i, outputStream);
                    if (this.f2639h >= this.f2635d) {
                        i = this.f2637f;
                        r6 = this.f2639h;
                        this.f2639h = r6 + 1;
                        i[i5] = r6;
                        this.f2636e[i5] = i4;
                    } else {
                        m3367a(outputStream);
                    }
                    i = a;
                } else {
                    m3369b(i, outputStream);
                    if (this.f2639h >= this.f2635d) {
                        m3367a(outputStream);
                    } else {
                        i = this.f2637f;
                        r6 = this.f2639h;
                        this.f2639h = r6 + 1;
                        i[i5] = r6;
                        this.f2636e[i5] = i4;
                    }
                    i = a;
                }
            } else {
                m3369b(i, outputStream);
                m3369b(this.f2643l, outputStream);
                return;
            }
        }
    }

    /* renamed from: b */
    void m3370b(OutputStream outputStream) throws IOException {
        outputStream.write(this.f2652u);
        this.f2653v = this.f2649r * this.f2650s;
        this.f2654w = 0;
        m3366a(this.f2652u + 1, outputStream);
        outputStream.write(0);
    }

    /* renamed from: c */
    void m3371c(OutputStream outputStream) throws IOException {
        if (this.f2647p > 0) {
            outputStream.write(this.f2647p);
            outputStream.write(this.f2648q, 0, this.f2647p);
            this.f2647p = 0;
        }
    }

    /* renamed from: a */
    private int m3363a() {
        if (this.f2653v == 0) {
            return -1;
        }
        this.f2653v--;
        byte[] bArr = this.f2651t;
        int i = this.f2654w;
        this.f2654w = i + 1;
        return bArr[i] & 255;
    }

    /* renamed from: b */
    void m3369b(int i, OutputStream outputStream) throws IOException {
        this.f2644m &= this.f2646o[this.f2645n];
        if (this.f2645n > 0) {
            this.f2644m |= i << this.f2645n;
        } else {
            this.f2644m = i;
        }
        this.f2645n += this.f2632a;
        while (this.f2645n >= 8) {
            m3364a((byte) (this.f2644m & 255), outputStream);
            this.f2644m >>= 8;
            this.f2645n -= 8;
        }
        if (this.f2639h > this.f2634c || this.f2640i) {
            if (this.f2640i) {
                int i2 = this.f2641j;
                this.f2632a = i2;
                this.f2634c = m3368b(i2);
                this.f2640i = false;
            } else {
                this.f2632a++;
                if (this.f2632a == this.f2633b) {
                    this.f2634c = this.f2635d;
                } else {
                    this.f2634c = m3368b(this.f2632a);
                }
            }
        }
        if (i == this.f2643l) {
            while (this.f2645n > 0) {
                m3364a((byte) (this.f2644m & 255), outputStream);
                this.f2644m >>= 8;
                this.f2645n -= 8;
            }
            m3371c(outputStream);
        }
    }
}
