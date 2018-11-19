package com.google.zxing.pdf417.encoder;

/* renamed from: com.google.zxing.pdf417.encoder.b */
final class C5681b {
    /* renamed from: a */
    private final byte[] f21055a;
    /* renamed from: b */
    private int f21056b = 0;

    C5681b(int i) {
        this.f21055a = new byte[i];
    }

    /* renamed from: a */
    private void m24863a(int i, boolean z) {
        this.f21055a[i] = (byte) z;
    }

    /* renamed from: a */
    void m24864a(boolean z, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.f21056b;
            this.f21056b = i3 + 1;
            m24863a(i3, z);
        }
    }

    /* renamed from: a */
    byte[] m24865a(int i) {
        byte[] bArr = new byte[(this.f21055a.length * i)];
        for (int i2 = 0; i2 < bArr.length; i2++) {
            bArr[i2] = this.f21055a[i2 / i];
        }
        return bArr;
    }
}
