package com.google.android.gms.internal;

import com.google.android.gms.internal.zzdsy.zzb;
import java.security.GeneralSecurityException;

final class uv implements zzdpw<zzdpp> {
    uv() {
    }

    /* renamed from: a */
    private static wj m27481a() throws GeneralSecurityException {
        return (wj) wj.m34718c().m34711a(0).m34712a(zzfes.m20298a(zm.m20287a(32))).m34103d();
    }

    /* renamed from: a */
    private final zzdpp m27482a(zzfes zzfes) throws GeneralSecurityException {
        try {
            wj a = wj.m34713a(zzfes);
            if (a instanceof wj) {
                a = a;
                zo.m20290a(a.m34720a(), 0);
                if (a.m34722b().mo6930a() == 32) {
                    return yo.m27507a(a.m34722b().m20311c());
                }
                throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
            }
            throw new GeneralSecurityException("expected ChaCha20Poly1305Key proto");
        } catch (Throwable e) {
            throw new GeneralSecurityException("invalid ChaCha20Poly1305 key", e);
        }
    }

    public final /* synthetic */ Object zza(zzfes zzfes) throws GeneralSecurityException {
        return m27482a(zzfes);
    }

    public final /* synthetic */ Object zza(zzfhe zzfhe) throws GeneralSecurityException {
        if (zzfhe instanceof wj) {
            wj wjVar = (wj) zzfhe;
            zo.m20290a(wjVar.m34720a(), 0);
            if (wjVar.m34722b().mo6930a() == 32) {
                return yo.m27507a(wjVar.m34722b().m20311c());
            }
            throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
        }
        throw new GeneralSecurityException("expected ChaCha20Poly1305Key proto");
    }

    public final zzfhe zzb(zzfes zzfes) throws GeneralSecurityException {
        return m27481a();
    }

    public final zzfhe zzb(zzfhe zzfhe) throws GeneralSecurityException {
        return m27481a();
    }

    public final zzdsy zzc(zzfes zzfes) throws GeneralSecurityException {
        return (zzdsy) zzdsy.m34930d().m34923a("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key").m34922a(m27481a().toByteString()).m34921a(zzb.SYMMETRIC).m34103d();
    }
}
