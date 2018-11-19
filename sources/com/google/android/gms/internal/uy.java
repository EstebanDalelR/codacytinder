package com.google.android.gms.internal;

import com.google.android.gms.internal.zzdsy.zzb;
import java.security.GeneralSecurityException;

final class uy implements zzdpw<zzdpp> {
    uy() {
    }

    /* renamed from: a */
    private final zzdpp m27485a(zzfes zzfes) throws GeneralSecurityException {
        try {
            xx a = xx.m34895a(zzfes);
            if (a instanceof xx) {
                a = a;
                zo.m20290a(a.m34902a(), 0);
                String a2 = a.m34904b().m34909a();
                return new ux(a.m34904b().m34910b(), uj.m20225a(a2).zzoe(a2));
            }
            throw new GeneralSecurityException("expected KmsEnvelopeAeadKey proto");
        } catch (Throwable e) {
            throw new GeneralSecurityException("expected serialized KmSEnvelopeAeadKey proto", e);
        }
    }

    public final /* synthetic */ Object zza(zzfes zzfes) throws GeneralSecurityException {
        return m27485a(zzfes);
    }

    public final /* synthetic */ Object zza(zzfhe zzfhe) throws GeneralSecurityException {
        if (zzfhe instanceof xx) {
            xx xxVar = (xx) zzfhe;
            zo.m20290a(xxVar.m34902a(), 0);
            String a = xxVar.m34904b().m34909a();
            return new ux(xxVar.m34904b().m34910b(), uj.m20225a(a).zzoe(a));
        }
        throw new GeneralSecurityException("expected KmsEnvelopeAeadKey proto");
    }

    public final zzfhe zzb(zzfes zzfes) throws GeneralSecurityException {
        try {
            return zzb(xz.m34905a(zzfes));
        } catch (Throwable e) {
            throw new GeneralSecurityException("expected serialized KmsEnvelopeAeadKeyFormat proto", e);
        }
    }

    public final zzfhe zzb(zzfhe zzfhe) throws GeneralSecurityException {
        if (zzfhe instanceof xz) {
            return xx.m34900c().m34894a((xz) zzfhe).m34893a(0).m34103d();
        }
        throw new GeneralSecurityException("expected KmsEnvelopeAeadKeyFormat proto");
    }

    public final zzdsy zzc(zzfes zzfes) throws GeneralSecurityException {
        return (zzdsy) zzdsy.m34930d().m34923a("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey").m34922a(((xx) zzb(zzfes)).toByteString()).m34921a(zzb.REMOTE).m34103d();
    }
}
