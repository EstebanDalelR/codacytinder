package com.google.android.exoplayer2.extractor.p061b;

import com.google.android.exoplayer2.util.C2289a;

/* renamed from: com.google.android.exoplayer2.extractor.b.i */
final class C2063i {
    /* renamed from: a */
    private final byte[] f5673a;
    /* renamed from: b */
    private final int f5674b;
    /* renamed from: c */
    private int f5675c;
    /* renamed from: d */
    private int f5676d;

    public C2063i(byte[] bArr) {
        this.f5673a = bArr;
        this.f5674b = bArr.length;
    }

    /* renamed from: a */
    public boolean m7400a() {
        boolean z = (((this.f5673a[this.f5675c] & 255) >> this.f5676d) & 1) == 1;
        m7402b(1);
        return z;
    }

    /* renamed from: a */
    public int m7399a(int i) {
        int i2 = this.f5675c;
        int min = Math.min(i, 8 - this.f5676d);
        int i3 = i2 + 1;
        i2 = ((this.f5673a[i2] & 255) >> this.f5676d) & (255 >> (8 - min));
        while (min < i) {
            i2 |= (this.f5673a[i3] & 255) << min;
            min += 8;
            i3++;
        }
        i2 &= -1 >>> (32 - i);
        m7402b(i);
        return i2;
    }

    /* renamed from: b */
    public void m7402b(int i) {
        int i2 = i / 8;
        this.f5675c += i2;
        this.f5676d += i - (i2 * 8);
        if (this.f5676d > 7) {
            this.f5675c++;
            this.f5676d -= 8;
        }
        m7398c();
    }

    /* renamed from: b */
    public int m7401b() {
        return (this.f5675c * 8) + this.f5676d;
    }

    /* renamed from: c */
    private void m7398c() {
        boolean z = this.f5675c >= 0 && (this.f5675c < this.f5674b || (this.f5675c == this.f5674b && this.f5676d == 0));
        C2289a.m8313b(z);
    }
}
