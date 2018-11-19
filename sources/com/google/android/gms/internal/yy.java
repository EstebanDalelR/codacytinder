package com.google.android.gms.internal;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

public final class yy implements zzdpp {
    /* renamed from: a */
    private final zzdvf f23527a;
    /* renamed from: b */
    private final zzdqa f23528b;
    /* renamed from: c */
    private final int f23529c;

    public yy(zzdvf zzdvf, zzdqa zzdqa, int i) {
        this.f23527a = zzdvf;
        this.f23528b = zzdqa;
        this.f23529c = i;
    }

    public final byte[] zzd(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        bArr = this.f23527a.zzag(bArr);
        byte[] copyOf = Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8);
        copyOf = this.f23528b.zzac(yi.m20267a(bArr2, bArr, copyOf));
        return yi.m20267a(bArr, copyOf);
    }
}
