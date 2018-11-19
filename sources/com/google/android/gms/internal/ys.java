package com.google.android.gms.internal;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.interfaces.ECPublicKey;

public final class ys implements zzdpv {
    /* renamed from: a */
    private static final byte[] f23521a = new byte[0];
    /* renamed from: b */
    private final yu f23522b;
    /* renamed from: c */
    private final String f23523c;
    /* renamed from: d */
    private final byte[] f23524d;
    /* renamed from: e */
    private final zzdus f23525e;
    /* renamed from: f */
    private final zzduj f23526f;

    public ys(ECPublicKey eCPublicKey, byte[] bArr, String str, zzdus zzdus, zzduj zzduj) throws GeneralSecurityException {
        yw.m20276a(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
        this.f23522b = new yu(eCPublicKey);
        this.f23524d = bArr;
        this.f23523c = str;
        this.f23525e = zzdus;
        this.f23526f = zzduj;
    }

    public final byte[] zzd(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        yv a = this.f23522b.m20270a(this.f23523c, this.f23524d, bArr2, this.f23526f.zzbma(), this.f23525e);
        bArr = this.f23526f.zzae(a.m20272b()).zzd(bArr, f23521a);
        bArr2 = a.m20271a();
        return ByteBuffer.allocate(bArr2.length + bArr.length).put(bArr2).put(bArr).array();
    }
}
