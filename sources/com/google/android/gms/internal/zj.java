package com.google.android.gms.internal;

public final class zj {
    /* renamed from: a */
    private final byte[] f16667a;

    private zj(byte[] bArr, int i, int i2) {
        this.f16667a = new byte[i2];
        System.arraycopy(bArr, 0, this.f16667a, 0, i2);
    }

    /* renamed from: a */
    public static zj m20281a(byte[] bArr) {
        return bArr == null ? null : new zj(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public final byte[] m20282a() {
        Object obj = new byte[this.f16667a.length];
        System.arraycopy(this.f16667a, 0, obj, 0, this.f16667a.length);
        return obj;
    }
}
