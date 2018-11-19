package com.google.android.m4b.maps.bq;

import java.io.InputStream;

/* renamed from: com.google.android.m4b.maps.bq.i */
public final class C4868i {
    /* renamed from: a */
    private static final byte[] f17873a = new byte[256];
    /* renamed from: e */
    private static final byte[] f17874e = new byte[]{(byte) 90, (byte) -18, (byte) 3, (byte) -99, (byte) 14, (byte) -41, (byte) 106, (byte) -78, (byte) 116, (byte) 63, (byte) 54, (byte) 80, (byte) 40, (byte) -121, (byte) -32, (byte) -17};
    /* renamed from: f */
    private static final byte[] f17875f = new byte[16];
    /* renamed from: b */
    private final byte[] f17876b = new byte[256];
    /* renamed from: c */
    private int f17877c;
    /* renamed from: d */
    private int f17878d;

    static {
        for (int i = 0; i < 256; i++) {
            f17873a[i] = (byte) i;
        }
    }

    /* renamed from: a */
    public final void m21809a(byte[] bArr, int i) {
        System.arraycopy(f17873a, 0, this.f17876b, 0, 256);
        int i2 = 0;
        for (i = 0; i < 256; i++) {
            i2 = ((i2 + this.f17876b[i]) + bArr[i % 40]) & 255;
            byte b = this.f17876b[i];
            this.f17876b[i] = this.f17876b[i2];
            this.f17876b[i2] = b;
        }
        this.f17877c = 0;
        this.f17878d = 0;
        m21804a(256);
    }

    /* renamed from: b */
    public final void m21811b(byte[] bArr, int i) {
        System.arraycopy(f17873a, 0, this.f17876b, 0, 256);
        int i2 = 0;
        for (i = 0; i < 256; i++) {
            i2 = ((i2 + this.f17876b[i]) + bArr[i & 31]) & 255;
            byte b = this.f17876b[i];
            this.f17876b[i] = this.f17876b[i2];
            this.f17876b[i2] = b;
        }
        this.f17877c = 0;
        this.f17878d = 0;
        m21804a(256);
    }

    /* renamed from: a */
    private void m21804a(int i) {
        int i2 = this.f17877c;
        int i3 = this.f17878d;
        for (int i4 = 0; i4 < i; i4++) {
            i2 = (i2 + 1) & 255;
            i3 = (i3 + this.f17876b[i2]) & 255;
            byte b = this.f17876b[i2];
            this.f17876b[i2] = this.f17876b[i3];
            this.f17876b[i3] = b;
        }
        this.f17877c = i2;
        this.f17878d = i3;
    }

    /* renamed from: a */
    public final void m21810a(byte[] bArr, int i, int i2) {
        int i3 = this.f17877c;
        int i4 = this.f17878d;
        int i5 = 0;
        while (i5 < i2) {
            i3 = (i3 + 1) & 255;
            i4 = (i4 + this.f17876b[i3]) & 255;
            byte b = this.f17876b[i3];
            byte b2 = this.f17876b[i4];
            this.f17876b[i3] = b2;
            this.f17876b[i4] = b;
            int i6 = i + 1;
            bArr[i] = (byte) (this.f17876b[(b + b2) & 255] ^ bArr[i]);
            i5++;
            i = i6;
        }
        this.f17877c = i3;
        this.f17878d = i4;
    }

    /* renamed from: a */
    public static void m21806a(int i, int i2, int i3, int i4, byte[] bArr) {
        C4868i.m21808a(bArr);
        bArr[16] = (byte) (i >> 24);
        bArr[17] = (byte) (i >> 16);
        bArr[18] = (byte) (i >> 8);
        bArr[19] = (byte) i;
        bArr[20] = (byte) (i2 >> 24);
        bArr[21] = (byte) (i2 >> 16);
        bArr[22] = (byte) (i2 >> 8);
        bArr[23] = (byte) i2;
        bArr[24] = (byte) (i3 >> 24);
        bArr[25] = (byte) (i3 >> 16);
        bArr[26] = (byte) (i3 >> 8);
        bArr[27] = (byte) i3;
        bArr[28] = (byte) (i4 >> 24);
        bArr[29] = (byte) (i4 >> 16);
        bArr[30] = (byte) (i4 >> 8);
        bArr[31] = (byte) i4;
    }

    /* renamed from: a */
    public static void m21807a(InputStream inputStream) {
        inputStream.read(f17875f);
        inputStream.close();
    }

    /* renamed from: a */
    private static void m21808a(byte[] bArr) {
        for (int i = 0; i < 16; i++) {
            bArr[i] = (byte) ((f17874e[i] * 47) ^ f17875f[i]);
        }
    }

    /* renamed from: a */
    public static void m21805a(int i, int i2, int i3, int i4, int i5, long j, byte[] bArr) {
        C4868i.m21808a(bArr);
        if (i4 < 8) {
            i4 = 0;
        }
        bArr[16] = (byte) (i >> 24);
        bArr[17] = (byte) (i >> 16);
        bArr[18] = (byte) (i >> 8);
        bArr[19] = (byte) i;
        bArr[20] = (byte) (i2 >> 24);
        bArr[21] = (byte) (i2 >> 16);
        bArr[22] = (byte) (i2 >> 8);
        bArr[23] = (byte) i2;
        bArr[24] = (byte) (i3 >> 24);
        bArr[25] = (byte) (i3 >> 16);
        bArr[26] = (byte) (i3 >> 8);
        bArr[27] = (byte) i3;
        i3 = i4 & 65535;
        bArr[28] = (byte) (i3 >> 8);
        bArr[29] = (byte) i3;
        i = 65535 & i5;
        bArr[30] = (byte) (i >> 8);
        bArr[31] = (byte) i;
        bArr[32] = (byte) ((int) (j >> 56));
        bArr[33] = (byte) ((int) (j >> 48));
        bArr[34] = (byte) ((int) (j >> 40));
        bArr[35] = (byte) ((int) (j >> 32));
        bArr[36] = (byte) ((int) (j >> 24));
        bArr[37] = (byte) ((int) (j >> 16));
        bArr[38] = (byte) ((int) (j >> 8));
        bArr[39] = (byte) ((int) j);
    }
}
