package com.google.android.gms.internal;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;

final class vf {
    /* renamed from: a */
    public static zzdur m20246a(zzdso zzdso) throws GeneralSecurityException {
        switch (vg.f16592b[zzdso.ordinal()]) {
            case 1:
                return zzdur.NIST_P256;
            case 2:
                return zzdur.NIST_P384;
            case 3:
                return zzdur.NIST_P521;
            default:
                String valueOf = String.valueOf(zzdso);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 20);
                stringBuilder.append("unknown curve type: ");
                stringBuilder.append(valueOf);
                throw new GeneralSecurityException(stringBuilder.toString());
        }
    }

    /* renamed from: a */
    public static zzdus m20247a(zzdsa zzdsa) throws GeneralSecurityException {
        switch (vg.f16593c[zzdsa.ordinal()]) {
            case 1:
                return zzdus.UNCOMPRESSED;
            case 2:
                return zzdus.COMPRESSED;
            default:
                String valueOf = String.valueOf(zzdsa);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 22);
                stringBuilder.append("unknown point format: ");
                stringBuilder.append(valueOf);
                throw new GeneralSecurityException(stringBuilder.toString());
        }
    }

    /* renamed from: a */
    public static String m20248a(zzdsq zzdsq) throws NoSuchAlgorithmException {
        switch (vg.f16591a[zzdsq.ordinal()]) {
            case 1:
                return "HmacSha1";
            case 2:
                return "HmacSha256";
            case 3:
                return "HmacSha512";
            default:
                String valueOf = String.valueOf(zzdsq);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 27);
                stringBuilder.append("hash unsupported for HMAC: ");
                stringBuilder.append(valueOf);
                throw new NoSuchAlgorithmException(stringBuilder.toString());
        }
    }

    /* renamed from: a */
    public static void m20249a(wr wrVar) throws GeneralSecurityException {
        yw.m20274a(m20246a(wrVar.m34733a().m34776a()));
        m20248a(wrVar.m34733a().m34778b());
        if (wrVar.m34736c() == zzdsa.UNKNOWN_FORMAT) {
            throw new GeneralSecurityException("unknown EC point format");
        }
        uo.m20234a(wrVar.m34735b().m34725a());
    }
}
