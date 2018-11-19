package com.google.zxing.pdf417.encoder;

import java.lang.reflect.Array;

/* renamed from: com.google.zxing.pdf417.encoder.a */
public final class C5680a {
    /* renamed from: a */
    private final C5681b[] f21051a;
    /* renamed from: b */
    private int f21052b;
    /* renamed from: c */
    private final int f21053c;
    /* renamed from: d */
    private final int f21054d;

    C5680a(int i, int i2) {
        this.f21051a = new C5681b[i];
        int length = this.f21051a.length;
        for (int i3 = 0; i3 < length; i3++) {
            this.f21051a[i3] = new C5681b(((i2 + 4) * 17) + 1);
        }
        this.f21054d = i2 * 17;
        this.f21053c = i;
        this.f21052b = -1;
    }

    /* renamed from: a */
    void m24860a() {
        this.f21052b++;
    }

    /* renamed from: b */
    C5681b m24862b() {
        return this.f21051a[this.f21052b];
    }

    /* renamed from: a */
    public byte[][] m24861a(int i, int i2) {
        byte[][] bArr = (byte[][]) Array.newInstance(byte.class, new int[]{this.f21053c * i2, this.f21054d * i});
        int i3 = this.f21053c * i2;
        for (int i4 = 0; i4 < i3; i4++) {
            bArr[(i3 - i4) - 1] = this.f21051a[i4 / i2].m24865a(i);
        }
        return bArr;
    }
}
