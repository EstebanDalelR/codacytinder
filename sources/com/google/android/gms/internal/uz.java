package com.google.android.gms.internal;

import com.google.android.gms.internal.zzdsy.zzb;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;

final class uz implements zzdpw<zzdpu> {
    uz() {
    }

    /* renamed from: a */
    private final zzdpu m27486a(zzfes zzfes) throws GeneralSecurityException {
        try {
            wt a = wt.m34740a(zzfes);
            if (a instanceof wt) {
                a = a;
                zo.m20290a(a.m34749a(), 0);
                vf.m20249a(a.m34751b().m34771b());
                wr b = a.m34751b().m34771b();
                wx a2 = b.m34733a();
                zzdur a3 = vf.m20246a(a2.m34776a());
                byte[] c = a.m34752c().m20311c();
                return new yr((ECPrivateKey) KeyFactory.getInstance("EC").generatePrivate(new ECPrivateKeySpec(new BigInteger(1, c), yw.m20274a(a3))), a2.m34779c().m20311c(), vf.m20248a(a2.m34778b()), vf.m20247a(b.m34736c()), new vh(b.m34735b().m34725a()));
            }
            throw new GeneralSecurityException("expected EciesAeadHkdfPrivateKey proto");
        } catch (Throwable e) {
            throw new GeneralSecurityException("expected serialized EciesAeadHkdfPrivateKey proto", e);
        }
    }

    public final /* synthetic */ Object zza(zzfes zzfes) throws GeneralSecurityException {
        return m27486a(zzfes);
    }

    public final /* synthetic */ Object zza(zzfhe zzfhe) throws GeneralSecurityException {
        if (zzfhe instanceof wt) {
            wt wtVar = (wt) zzfhe;
            zo.m20290a(wtVar.m34749a(), 0);
            vf.m20249a(wtVar.m34751b().m34771b());
            wr b = wtVar.m34751b().m34771b();
            wx a = b.m34733a();
            zzdur a2 = vf.m20246a(a.m34776a());
            byte[] c = wtVar.m34752c().m20311c();
            return new yr((ECPrivateKey) KeyFactory.getInstance("EC").generatePrivate(new ECPrivateKeySpec(new BigInteger(1, c), yw.m20274a(a2))), a.m34779c().m20311c(), vf.m20248a(a.m34778b()), vf.m20247a(b.m34736c()), new vh(b.m34735b().m34725a()));
        }
        throw new GeneralSecurityException("expected EciesAeadHkdfPrivateKey proto");
    }

    public final zzfhe zzb(zzfes zzfes) throws GeneralSecurityException {
        try {
            return zzb(wp.m34727a(zzfes));
        } catch (Throwable e) {
            throw new GeneralSecurityException("invalid EciesAeadHkdf key format", e);
        }
    }

    public final zzfhe zzb(zzfhe zzfhe) throws GeneralSecurityException {
        if (zzfhe instanceof wp) {
            wp wpVar = (wp) zzfhe;
            vf.m20249a(wpVar.m34729a());
            AlgorithmParameterSpec a = yw.m20274a(vf.m20246a(wpVar.m34729a().m34733a().m34776a()));
            KeyPairGenerator instance = KeyPairGenerator.getInstance("EC");
            instance.initialize(a);
            KeyPair generateKeyPair = instance.generateKeyPair();
            ECPublicKey eCPublicKey = (ECPublicKey) generateKeyPair.getPublic();
            ECPrivateKey eCPrivateKey = (ECPrivateKey) generateKeyPair.getPrivate();
            ECPoint w = eCPublicKey.getW();
            return wt.m34747d().m34737a(0).m34738a((wv) wv.m34766e().m34753a(0).m34754a(wpVar.m34729a()).m34755a(zzfes.m20298a(w.getAffineX().toByteArray())).m34756b(zzfes.m20298a(w.getAffineY().toByteArray())).m34103d()).m34739a(zzfes.m20298a(eCPrivateKey.getS().toByteArray())).m34103d();
        }
        throw new GeneralSecurityException("expected EciesAeadHkdfKeyFormat proto");
    }

    public final zzdsy zzc(zzfes zzfes) throws GeneralSecurityException {
        return (zzdsy) zzdsy.m34930d().m34923a("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey").m34922a(((wt) zzb(zzfes)).toByteString()).m34921a(zzb.ASYMMETRIC_PRIVATE).m34103d();
    }
}
