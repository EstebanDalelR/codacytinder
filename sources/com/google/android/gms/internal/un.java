package com.google.android.gms.internal;

import java.util.Arrays;

public final class un<P> {
    /* renamed from: a */
    private final P f16580a;
    /* renamed from: b */
    private final byte[] f16581b;
    /* renamed from: c */
    private final zzdtb f16582c;
    /* renamed from: d */
    private final zzdtt f16583d;

    public un(P p, byte[] bArr, zzdtb zzdtb, zzdtt zzdtt) {
        this.f16580a = p;
        this.f16581b = Arrays.copyOf(bArr, bArr.length);
        this.f16582c = zzdtb;
        this.f16583d = zzdtt;
    }

    /* renamed from: a */
    public final P m20230a() {
        return this.f16580a;
    }

    /* renamed from: b */
    public final byte[] m20231b() {
        return this.f16581b == null ? null : Arrays.copyOf(this.f16581b, this.f16581b.length);
    }
}
