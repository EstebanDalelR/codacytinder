package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.util.C2289a;
import com.tinder.model.GlobalConfig;
import java.nio.ShortBuffer;
import java.util.Arrays;

/* renamed from: com.google.android.exoplayer2.audio.j */
final class C2032j {
    /* renamed from: a */
    private final int f5575a;
    /* renamed from: b */
    private final int f5576b;
    /* renamed from: c */
    private final float f5577c;
    /* renamed from: d */
    private final float f5578d;
    /* renamed from: e */
    private final float f5579e;
    /* renamed from: f */
    private final int f5580f;
    /* renamed from: g */
    private final int f5581g;
    /* renamed from: h */
    private final int f5582h = (this.f5581g * 2);
    /* renamed from: i */
    private final short[] f5583i = new short[this.f5582h];
    /* renamed from: j */
    private short[] f5584j;
    /* renamed from: k */
    private int f5585k;
    /* renamed from: l */
    private short[] f5586l;
    /* renamed from: m */
    private int f5587m;
    /* renamed from: n */
    private short[] f5588n;
    /* renamed from: o */
    private int f5589o;
    /* renamed from: p */
    private int f5590p;
    /* renamed from: q */
    private int f5591q;
    /* renamed from: r */
    private int f5592r;
    /* renamed from: s */
    private int f5593s;
    /* renamed from: t */
    private int f5594t;
    /* renamed from: u */
    private int f5595u;
    /* renamed from: v */
    private int f5596v;

    public C2032j(int i, int i2, float f, float f2, int i3) {
        this.f5575a = i;
        this.f5576b = i2;
        this.f5577c = f;
        this.f5578d = f2;
        this.f5579e = ((float) i) / ((float) i3);
        this.f5580f = i / 400;
        this.f5581g = i / 65;
        this.f5584j = new short[(this.f5582h * i2)];
        this.f5586l = new short[(this.f5582h * i2)];
        this.f5588n = new short[(this.f5582h * i2)];
    }

    /* renamed from: a */
    public void m7335a(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining() / this.f5576b;
        int i = (this.f5576b * remaining) * 2;
        this.f5584j = m7325a(this.f5584j, this.f5585k, remaining);
        shortBuffer.get(this.f5584j, this.f5585k * this.f5576b, i / 2);
        this.f5585k += remaining;
        m7332d();
    }

    /* renamed from: b */
    public void m7337b(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.f5576b, this.f5587m);
        shortBuffer.put(this.f5586l, 0, this.f5576b * min);
        this.f5587m -= min;
        System.arraycopy(this.f5586l, min * this.f5576b, this.f5586l, 0, this.f5587m * this.f5576b);
    }

    /* renamed from: a */
    public void m7334a() {
        int i = this.f5585k;
        float f = this.f5579e * this.f5578d;
        int i2 = this.f5587m + ((int) ((((((float) i) / (this.f5577c / this.f5578d)) + ((float) this.f5589o)) / f) + 0.5f));
        this.f5584j = m7325a(this.f5584j, this.f5585k, (this.f5582h * 2) + i);
        for (int i3 = 0; i3 < (this.f5582h * 2) * this.f5576b; i3++) {
            this.f5584j[(this.f5576b * i) + i3] = (short) 0;
        }
        this.f5585k += this.f5582h * 2;
        m7332d();
        if (this.f5587m > i2) {
            this.f5587m = i2;
        }
        this.f5585k = 0;
        this.f5592r = 0;
        this.f5589o = 0;
    }

    /* renamed from: b */
    public void m7336b() {
        this.f5585k = 0;
        this.f5587m = 0;
        this.f5589o = 0;
        this.f5590p = 0;
        this.f5591q = 0;
        this.f5592r = 0;
        this.f5593s = 0;
        this.f5594t = 0;
        this.f5595u = 0;
        this.f5596v = 0;
    }

    /* renamed from: c */
    public int m7338c() {
        return this.f5587m;
    }

    /* renamed from: a */
    private short[] m7325a(short[] sArr, int i, int i2) {
        int length = sArr.length / this.f5576b;
        if (i + i2 <= length) {
            return sArr;
        }
        return Arrays.copyOf(sArr, (((length * 3) / 2) + i2) * this.f5576b);
    }

    /* renamed from: a */
    private void m7322a(int i) {
        int i2 = this.f5585k - i;
        System.arraycopy(this.f5584j, i * this.f5576b, this.f5584j, 0, this.f5576b * i2);
        this.f5585k = i2;
    }

    /* renamed from: b */
    private void m7329b(short[] sArr, int i, int i2) {
        this.f5586l = m7325a(this.f5586l, this.f5587m, i2);
        System.arraycopy(sArr, i * this.f5576b, this.f5586l, this.f5587m * this.f5576b, this.f5576b * i2);
        this.f5587m += i2;
    }

    /* renamed from: b */
    private int m7326b(int i) {
        int min = Math.min(this.f5582h, this.f5592r);
        m7329b(this.f5584j, i, min);
        this.f5592r -= min;
        return min;
    }

    /* renamed from: c */
    private void m7331c(short[] sArr, int i, int i2) {
        int i3 = this.f5582h / i2;
        int i4 = this.f5576b * i2;
        i *= this.f5576b;
        for (int i5 = 0; i5 < i3; i5++) {
            int i6 = 0;
            for (int i7 = 0; i7 < i4; i7++) {
                i6 += sArr[((i5 * i4) + i) + i7];
            }
            this.f5583i[i5] = (short) (i6 / i4);
        }
    }

    /* renamed from: a */
    private int m7319a(short[] sArr, int i, int i2, int i3) {
        i *= this.f5576b;
        int i4 = 1;
        int i5 = 0;
        int i6 = 0;
        int i7 = 255;
        while (i2 <= i3) {
            int i8 = 0;
            for (int i9 = 0; i9 < i2; i9++) {
                i8 += Math.abs(sArr[i + i9] - sArr[(i + i2) + i9]);
            }
            if (i8 * i5 < i4 * i2) {
                i5 = i2;
                i4 = i8;
            }
            if (i8 * i7 > i6 * i2) {
                i7 = i2;
                i6 = i8;
            }
            i2++;
        }
        this.f5595u = i4 / i5;
        this.f5596v = i6 / i7;
        return i5;
    }

    /* renamed from: a */
    private boolean m7324a(int i, int i2) {
        if (i != 0) {
            if (this.f5593s != 0) {
                if (i2 <= i * 3 && i * 2 > this.f5594t * 3) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    /* renamed from: a */
    private int m7317a(short[] sArr, int i) {
        int i2 = this.f5575a > GlobalConfig.DEFAULT_RECS_INTERVAL ? this.f5575a / GlobalConfig.DEFAULT_RECS_INTERVAL : 1;
        if (this.f5576b == 1 && i2 == 1) {
            sArr = m7319a(sArr, i, this.f5580f, this.f5581g);
        } else {
            m7331c(sArr, i, i2);
            int a = m7319a(this.f5583i, 0, this.f5580f / i2, this.f5581g / i2);
            if (i2 != 1) {
                a *= i2;
                i2 *= 4;
                int i3 = a - i2;
                a += i2;
                if (i3 < this.f5580f) {
                    i3 = this.f5580f;
                }
                if (a > this.f5581g) {
                    a = this.f5581g;
                }
                if (this.f5576b == 1) {
                    sArr = m7319a(sArr, i, i3, a);
                } else {
                    m7331c(sArr, i, 1);
                    sArr = m7319a(this.f5583i, 0, i3, a);
                }
            } else {
                sArr = a;
            }
        }
        i = m7324a(this.f5595u, this.f5596v) != 0 ? this.f5593s : sArr;
        this.f5594t = this.f5595u;
        this.f5593s = sArr;
        return i;
    }

    /* renamed from: c */
    private void m7330c(int i) {
        int i2 = this.f5587m - i;
        this.f5588n = m7325a(this.f5588n, this.f5589o, i2);
        System.arraycopy(this.f5586l, this.f5576b * i, this.f5588n, this.f5589o * this.f5576b, this.f5576b * i2);
        this.f5587m = i;
        this.f5589o += i2;
    }

    /* renamed from: d */
    private void m7333d(int i) {
        if (i != 0) {
            System.arraycopy(this.f5588n, this.f5576b * i, this.f5588n, 0, (this.f5589o - i) * this.f5576b);
            this.f5589o -= i;
        }
    }

    /* renamed from: b */
    private short m7328b(short[] sArr, int i, int i2, int i3) {
        short s = sArr[i];
        sArr = sArr[i + this.f5576b];
        i = this.f5591q * i2;
        int i4 = (this.f5590p + 1) * i3;
        i = i4 - i;
        i4 -= this.f5590p * i3;
        return (short) (((s * i) + ((i4 - i) * sArr)) / i4);
    }

    /* renamed from: a */
    private void m7321a(float f, int i) {
        if (this.f5587m != i) {
            int i2 = (int) (((float) this.f5575a) / f);
            int i3 = this.f5575a;
            while (true) {
                if (i2 <= 16384) {
                    if (i3 <= 16384) {
                        break;
                    }
                }
                i2 /= 2;
                i3 /= 2;
            }
            m7330c(i);
            int i4 = 0;
            while (true) {
                boolean z = true;
                if (i4 < this.f5589o - 1) {
                    while ((this.f5590p + 1) * i2 > this.f5591q * i3) {
                        this.f5586l = m7325a(this.f5586l, this.f5587m, 1);
                        for (int i5 = 0; i5 < this.f5576b; i5++) {
                            this.f5586l[(this.f5587m * this.f5576b) + i5] = m7328b(this.f5588n, (this.f5576b * i4) + i5, i3, i2);
                        }
                        this.f5591q++;
                        this.f5587m++;
                    }
                    this.f5590p++;
                    if (this.f5590p == i3) {
                        this.f5590p = 0;
                        if (this.f5591q != i2) {
                            z = false;
                        }
                        C2289a.m8313b(z);
                        this.f5591q = 0;
                    }
                    i4++;
                } else {
                    m7333d(this.f5589o - Float.MIN_VALUE);
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    private int m7318a(short[] sArr, int i, float f, int i2) {
        int i3;
        if (f >= 2.0f) {
            i3 = (int) (((float) i2) / (f - 1.0f));
        } else {
            this.f5592r = (int) ((((float) i2) * (2.0f - f)) / (f - 1.0f));
            i3 = i2;
        }
        this.f5586l = m7325a(this.f5586l, this.f5587m, i3);
        C2032j.m7323a(i3, this.f5576b, this.f5586l, this.f5587m, sArr, i, sArr, i + i2);
        this.f5587m += i3;
        return i3;
    }

    /* renamed from: b */
    private int m7327b(short[] sArr, int i, float f, int i2) {
        int i3;
        if (f < 0.5f) {
            i3 = (int) ((((float) i2) * f) / (1.0f - f));
        } else {
            this.f5592r = (int) ((((float) i2) * ((2.0f * f) - 1.0f)) / (1.0f - f));
            i3 = i2;
        }
        int i4 = i2 + i3;
        this.f5586l = m7325a(this.f5586l, this.f5587m, i4);
        System.arraycopy(sArr, this.f5576b * i, this.f5586l, this.f5587m * this.f5576b, this.f5576b * i2);
        C2032j.m7323a(i3, this.f5576b, this.f5586l, this.f5587m + i2, sArr, i + i2, sArr, i);
        this.f5587m += i4;
        return i3;
    }

    /* renamed from: a */
    private void m7320a(float f) {
        if (this.f5585k >= this.f5582h) {
            int i = this.f5585k;
            int i2 = 0;
            do {
                if (this.f5592r > 0) {
                    i2 += m7326b(i2);
                } else {
                    int a = m7317a(this.f5584j, i2);
                    if (((double) f) > 1.0d) {
                        i2 += a + m7318a(this.f5584j, i2, f, a);
                    } else {
                        i2 += m7327b(this.f5584j, i2, f, a);
                    }
                }
            } while (this.f5582h + i2 <= i);
            m7322a(i2);
        }
    }

    /* renamed from: d */
    private void m7332d() {
        int i = this.f5587m;
        float f = this.f5577c / this.f5578d;
        float f2 = this.f5579e * this.f5578d;
        double d = (double) f;
        if (d <= 1.00001d) {
            if (d >= 0.99999d) {
                m7329b(this.f5584j, 0, this.f5585k);
                this.f5585k = 0;
                if (f2 != 1.0f) {
                    m7321a(f2, i);
                }
            }
        }
        m7320a(f);
        if (f2 != 1.0f) {
            m7321a(f2, i);
        }
    }

    /* renamed from: a */
    private static void m7323a(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i4 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i3 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                sArr[i9] = (short) (((sArr2[i7] * (i - i10)) + (sArr3[i8] * i10)) / i);
                i9 += i2;
                i7 += i2;
                i8 += i2;
            }
        }
    }
}
