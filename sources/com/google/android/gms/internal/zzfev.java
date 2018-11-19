package com.google.android.gms.internal;

final class zzfev extends zzfez {
    /* renamed from: c */
    private final int f28822c;
    /* renamed from: d */
    private final int f28823d;

    zzfev(byte[] bArr, int i, int i2) {
        super(bArr);
        zzfes.m20300b(i, i + i2, bArr.length);
        this.f28822c = i;
        this.f28823d = i2;
    }

    /* renamed from: a */
    public final byte mo6929a(int i) {
        zzfes.m20303b(i, mo6930a());
        return this.b[this.f28822c + i];
    }

    /* renamed from: a */
    public final int mo6930a() {
        return this.f28823d;
    }

    /* renamed from: a */
    protected final void mo6934a(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.b, mo7504f() + i, bArr, i2, i3);
    }

    /* renamed from: f */
    protected final int mo7504f() {
        return this.f28822c;
    }
}
