package com.google.android.gms.internal;

final class abi {
    /* renamed from: a */
    private final zzffg f14982a;
    /* renamed from: b */
    private final byte[] f14983b;

    private abi(int i) {
        this.f14983b = new byte[i];
        this.f14982a = zzffg.m27526a(this.f14983b);
    }

    /* renamed from: a */
    public final zzfes m18814a() {
        this.f14982a.m27581c();
        return new zzfez(this.f14983b);
    }

    /* renamed from: b */
    public final zzffg m18815b() {
        return this.f14982a;
    }
}
