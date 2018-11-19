package com.google.android.gms.internal;

public final class aay {
    /* renamed from: a */
    private final byte[] f14974a = new byte[256];
    /* renamed from: b */
    private int f14975b;
    /* renamed from: c */
    private int f14976c;

    public aay(byte[] bArr) {
        int i;
        for (i = 0; i < 256; i++) {
            this.f14974a[i] = (byte) i;
        }
        int i2 = 0;
        for (i = 0; i < 256; i++) {
            i2 = ((i2 + this.f14974a[i]) + bArr[i % bArr.length]) & 255;
            byte b = this.f14974a[i];
            this.f14974a[i] = this.f14974a[i2];
            this.f14974a[i2] = b;
        }
        this.f14975b = 0;
        this.f14976c = 0;
    }

    /* renamed from: a */
    public final void m18810a(byte[] bArr) {
        int i = this.f14975b;
        int i2 = this.f14976c;
        for (int i3 = 0; i3 < bArr.length; i3++) {
            i = (i + 1) & 255;
            i2 = (i2 + this.f14974a[i]) & 255;
            byte b = this.f14974a[i];
            this.f14974a[i] = this.f14974a[i2];
            this.f14974a[i2] = b;
            bArr[i3] = (byte) (bArr[i3] ^ this.f14974a[(this.f14974a[i] + this.f14974a[i2]) & 255]);
        }
        this.f14975b = i;
        this.f14976c = i2;
    }
}
