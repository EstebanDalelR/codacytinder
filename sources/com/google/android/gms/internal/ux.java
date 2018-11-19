package com.google.android.gms.internal;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

public final class ux implements zzdpp {
    /* renamed from: a */
    private static final byte[] f23490a = new byte[0];
    /* renamed from: b */
    private final xl f23491b;
    /* renamed from: c */
    private final zzdpp f23492c;

    public ux(xl xlVar, zzdpp zzdpp) {
        this.f23491b = xlVar;
        this.f23492c = zzdpp;
    }

    public final byte[] zzd(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] toByteArray = uo.m20242b(this.f23491b).toByteArray();
        byte[] zzd = this.f23492c.zzd(toByteArray, f23490a);
        bArr = ((zzdpp) uo.m20237a(this.f23491b.m34811a(), toByteArray)).zzd(bArr, bArr2);
        return ByteBuffer.allocate((zzd.length + 4) + bArr.length).putInt(zzd.length).put(zzd).put(bArr).array();
    }
}
