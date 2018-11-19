package com.google.android.gms.internal;

import java.security.GeneralSecurityException;
import java.security.interfaces.ECPrivateKey;

public final class yr implements zzdpu {
    /* renamed from: a */
    private static final byte[] f23514a = new byte[0];
    /* renamed from: b */
    private final ECPrivateKey f23515b;
    /* renamed from: c */
    private final yt f23516c;
    /* renamed from: d */
    private final String f23517d;
    /* renamed from: e */
    private final byte[] f23518e;
    /* renamed from: f */
    private final zzdus f23519f;
    /* renamed from: g */
    private final zzduj f23520g;

    public yr(ECPrivateKey eCPrivateKey, byte[] bArr, String str, zzdus zzdus, zzduj zzduj) throws GeneralSecurityException {
        this.f23515b = eCPrivateKey;
        this.f23516c = new yt(eCPrivateKey);
        this.f23518e = bArr;
        this.f23517d = str;
        this.f23519f = zzdus;
        this.f23520g = zzduj;
    }
}
