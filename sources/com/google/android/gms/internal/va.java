package com.google.android.gms.internal;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;

final class va implements zzdpw<zzdpv> {
    va() {
    }

    /* renamed from: a */
    private final zzdpv m27487a(zzfes zzfes) throws GeneralSecurityException {
        try {
            wv a = wv.m34757a(zzfes);
            if (a instanceof wv) {
                a = a;
                zo.m20290a(a.m34769a(), 0);
                vf.m20249a(a.m34771b());
                wr b = a.m34771b();
                wx a2 = b.m34733a();
                zzdur a3 = vf.m20246a(a2.m34776a());
                byte[] c = a.m34772c().m20311c();
                byte[] c2 = a.m34773d().m20311c();
                ECParameterSpec a4 = yw.m20274a(a3);
                ECPoint eCPoint = new ECPoint(new BigInteger(1, c), new BigInteger(1, c2));
                yw.m20276a(eCPoint, a4.getCurve());
                return new ys((ECPublicKey) KeyFactory.getInstance("EC").generatePublic(new ECPublicKeySpec(eCPoint, a4)), a2.m34779c().m20311c(), vf.m20248a(a2.m34778b()), vf.m20247a(b.m34736c()), new vh(b.m34735b().m34725a()));
            }
            throw new GeneralSecurityException("expected EciesAeadHkdfPublicKey proto");
        } catch (Throwable e) {
            throw new GeneralSecurityException("expected serialized EciesAeadHkdfPublicKey proto", e);
        }
    }

    public final /* synthetic */ Object zza(zzfes zzfes) throws GeneralSecurityException {
        return m27487a(zzfes);
    }

    public final /* synthetic */ Object zza(zzfhe zzfhe) throws GeneralSecurityException {
        if (zzfhe instanceof wv) {
            wv wvVar = (wv) zzfhe;
            zo.m20290a(wvVar.m34769a(), 0);
            vf.m20249a(wvVar.m34771b());
            wr b = wvVar.m34771b();
            wx a = b.m34733a();
            zzdur a2 = vf.m20246a(a.m34776a());
            byte[] c = wvVar.m34772c().m20311c();
            byte[] c2 = wvVar.m34773d().m20311c();
            ECParameterSpec a3 = yw.m20274a(a2);
            ECPoint eCPoint = new ECPoint(new BigInteger(1, c), new BigInteger(1, c2));
            yw.m20276a(eCPoint, a3.getCurve());
            return new ys((ECPublicKey) KeyFactory.getInstance("EC").generatePublic(new ECPublicKeySpec(eCPoint, a3)), a.m34779c().m20311c(), vf.m20248a(a.m34778b()), vf.m20247a(b.m34736c()), new vh(b.m34735b().m34725a()));
        }
        throw new GeneralSecurityException("expected EciesAeadHkdfPublicKey proto");
    }

    public final zzfhe zzb(zzfes zzfes) throws GeneralSecurityException {
        throw new GeneralSecurityException("Not implemented.");
    }

    public final zzfhe zzb(zzfhe zzfhe) throws GeneralSecurityException {
        throw new GeneralSecurityException("Not implemented.");
    }

    public final zzdsy zzc(zzfes zzfes) throws GeneralSecurityException {
        throw new GeneralSecurityException("Not implemented.");
    }
}
