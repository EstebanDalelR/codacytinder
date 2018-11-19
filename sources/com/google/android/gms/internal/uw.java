package com.google.android.gms.internal;

import com.google.android.gms.internal.zzdsy.zzb;
import java.security.GeneralSecurityException;

final class uw implements zzdpw<zzdpp> {
    uw() {
    }

    /* renamed from: a */
    private static zzdpp m27483a(zzfes zzfes) throws GeneralSecurityException {
        try {
            return m27484a(xt.m34878a(zzfes));
        } catch (Throwable e) {
            throw new GeneralSecurityException("expected KmsAeadKey proto", e);
        }
    }

    /* renamed from: a */
    private static zzdpp m27484a(zzfhe zzfhe) throws GeneralSecurityException {
        if (zzfhe instanceof xt) {
            xt xtVar = (xt) zzfhe;
            zo.m20290a(xtVar.m34885a(), 0);
            String a = xtVar.m34887b().m34892a();
            return uj.m20225a(a).zzoe(a);
        }
        throw new GeneralSecurityException("expected KmsAeadKey proto");
    }

    public final /* synthetic */ Object zza(zzfes zzfes) throws GeneralSecurityException {
        return m27483a(zzfes);
    }

    public final /* synthetic */ Object zza(zzfhe zzfhe) throws GeneralSecurityException {
        return m27484a(zzfhe);
    }

    public final zzfhe zzb(zzfes zzfes) throws GeneralSecurityException {
        try {
            return zzb(xv.m34888a(zzfes));
        } catch (Throwable e) {
            throw new GeneralSecurityException("expected serialized KmsAeadKeyFormat proto", e);
        }
    }

    public final zzfhe zzb(zzfhe zzfhe) throws GeneralSecurityException {
        if (zzfhe instanceof xv) {
            return xt.m34883c().m34877a((xv) zzfhe).m34876a(0).m34103d();
        }
        throw new GeneralSecurityException("expected KmsAeadKeyFormat proto");
    }

    public final zzdsy zzc(zzfes zzfes) throws GeneralSecurityException {
        return (zzdsy) zzdsy.m34930d().m34923a("type.googleapis.com/google.crypto.tink.KmsAeadKey").m34922a(((xt) zzb(zzfes)).toByteString()).m34921a(zzb.REMOTE).m34103d();
    }
}
