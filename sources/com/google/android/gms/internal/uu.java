package com.google.android.gms.internal;

import com.google.android.gms.internal.zzdsy.zzb;
import java.security.GeneralSecurityException;

final class uu implements zzdpw<zzdpp> {
    uu() {
    }

    /* renamed from: a */
    private static com.google.android.gms.internal.zzdpp m27480a(com.google.android.gms.internal.zzfes r1) throws java.security.GeneralSecurityException {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r1 = com.google.android.gms.internal.wd.m34691a(r1);	 Catch:{ zzfge -> 0x0012 }
        r0 = new com.google.android.gms.internal.yg;	 Catch:{ zzfge -> 0x0012 }
        r1 = r1.m34702b();	 Catch:{ zzfge -> 0x0012 }
        r1 = r1.m20311c();	 Catch:{ zzfge -> 0x0012 }
        r0.<init>(r1);	 Catch:{ zzfge -> 0x0012 }
        return r0;
    L_0x0012:
        r1 = new java.security.GeneralSecurityException;
        r0 = "expected AesGcmKey proto";
        r1.<init>(r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.uu.a(com.google.android.gms.internal.zzfes):com.google.android.gms.internal.zzdpp");
    }

    public final /* synthetic */ Object zza(zzfes zzfes) throws GeneralSecurityException {
        return m27480a(zzfes);
    }

    public final /* synthetic */ Object zza(zzfhe zzfhe) throws GeneralSecurityException {
        if (zzfhe instanceof wd) {
            wd wdVar = (wd) zzfhe;
            zo.m20290a(wdVar.m34700a(), 0);
            zo.m20289a(wdVar.m34702b().mo6930a());
            return new yg(wdVar.m34702b().m20311c());
        }
        throw new GeneralSecurityException("expected AesGcmKey proto");
    }

    public final zzfhe zzb(zzfes zzfes) throws GeneralSecurityException {
        try {
            return zzb(wf.m34703a(zzfes));
        } catch (Throwable e) {
            throw new GeneralSecurityException("expected serialized AesGcmKeyFormat proto", e);
        }
    }

    public final zzfhe zzb(zzfhe zzfhe) throws GeneralSecurityException {
        if (zzfhe instanceof wf) {
            wf wfVar = (wf) zzfhe;
            zo.m20289a(wfVar.m34707b());
            return wd.m34698c().m34690a(zzfes.m20298a(zm.m20287a(wfVar.m34707b()))).m34689a(wfVar.m34705a()).m34688a(0).m34103d();
        }
        throw new GeneralSecurityException("expected AesGcmKeyFormat proto");
    }

    public final zzdsy zzc(zzfes zzfes) throws GeneralSecurityException {
        return (zzdsy) zzdsy.m34930d().m34923a("type.googleapis.com/google.crypto.tink.AesGcmKey").m34922a(((wd) zzb(zzfes)).toByteString()).m34921a(zzb.SYMMETRIC).m34103d();
    }
}
