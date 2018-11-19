package com.google.android.gms.internal;

import java.security.GeneralSecurityException;
import java.security.Key;
import javax.crypto.Mac;

public final class zk implements zzdqa {
    /* renamed from: a */
    private Mac f23530a;
    /* renamed from: b */
    private final int f23531b;
    /* renamed from: c */
    private final String f23532c;
    /* renamed from: d */
    private final Key f23533d;

    public zk(String str, Key key, int i) throws GeneralSecurityException {
        this.f23532c = str;
        this.f23531b = i;
        this.f23533d = key;
        this.f23530a = (Mac) yz.f16655b.m20279a(str);
        this.f23530a.init(key);
    }

    public final byte[] zzac(byte[] r4) throws java.security.GeneralSecurityException {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r0 = r3.f23530a;	 Catch:{ CloneNotSupportedException -> 0x0009 }
        r0 = r0.clone();	 Catch:{ CloneNotSupportedException -> 0x0009 }
        r0 = (javax.crypto.Mac) r0;	 Catch:{ CloneNotSupportedException -> 0x0009 }
        goto L_0x0018;
    L_0x0009:
        r0 = com.google.android.gms.internal.yz.f16655b;
        r1 = r3.f23532c;
        r0 = r0.m20279a(r1);
        r0 = (javax.crypto.Mac) r0;
        r1 = r3.f23533d;
        r0.init(r1);
    L_0x0018:
        r0.update(r4);
        r4 = r3.f23531b;
        r4 = new byte[r4];
        r0 = r0.doFinal();
        r1 = r3.f23531b;
        r2 = 0;
        java.lang.System.arraycopy(r0, r2, r4, r2, r1);
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zk.zzac(byte[]):byte[]");
    }
}
