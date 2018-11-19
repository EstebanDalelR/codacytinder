package com.google.android.gms.internal;

import com.google.android.gms.internal.zzdsy.zzb;
import java.security.GeneralSecurityException;

final class ut implements zzdpw<zzdpp> {
    ut() {
    }

    /* renamed from: a */
    private final zzdpp m27479a(zzfes zzfes) throws GeneralSecurityException {
        try {
            vx a = vx.m34666a(zzfes);
            if (a instanceof vx) {
                a = a;
                zo.m20290a(a.m34675a(), 0);
                zo.m20289a(a.m34678c().mo6930a());
                if (a.m34677b().m34686a() == 12 || a.m34677b().m34686a() == 16) {
                    return new yf(a.m34678c().m20311c(), a.m34677b().m34686a());
                }
                throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
            }
            throw new GeneralSecurityException("expected AesEaxKey proto");
        } catch (Throwable e) {
            throw new GeneralSecurityException("expected serialized AesEaxKey proto", e);
        }
    }

    public final /* synthetic */ Object zza(zzfes zzfes) throws GeneralSecurityException {
        return m27479a(zzfes);
    }

    public final /* synthetic */ Object zza(zzfhe zzfhe) throws GeneralSecurityException {
        if (zzfhe instanceof vx) {
            vx vxVar = (vx) zzfhe;
            zo.m20290a(vxVar.m34675a(), 0);
            zo.m20289a(vxVar.m34678c().mo6930a());
            if (vxVar.m34677b().m34686a() == 12 || vxVar.m34677b().m34686a() == 16) {
                return new yf(vxVar.m34678c().m20311c(), vxVar.m34677b().m34686a());
            }
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
        throw new GeneralSecurityException("expected AesEaxKey proto");
    }

    public final zzfhe zzb(zzfes zzfes) throws GeneralSecurityException {
        try {
            return zzb(vz.m34679a(zzfes));
        } catch (Throwable e) {
            throw new GeneralSecurityException("expected serialized AesEaxKeyFormat proto", e);
        }
    }

    public final zzfhe zzb(zzfhe zzfhe) throws GeneralSecurityException {
        if (zzfhe instanceof vz) {
            vz vzVar = (vz) zzfhe;
            zo.m20289a(vzVar.m34683b());
            if (vzVar.m34681a().m34686a() == 12 || vzVar.m34681a().m34686a() == 16) {
                return vx.m34673d().m34665a(zzfes.m20298a(zm.m20287a(vzVar.m34683b()))).m34664a(vzVar.m34681a()).m34663a(0).m34103d();
            }
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
        throw new GeneralSecurityException("expected AesEaxKeyFormat proto");
    }

    public final zzdsy zzc(zzfes zzfes) throws GeneralSecurityException {
        return (zzdsy) zzdsy.m34930d().m34923a("type.googleapis.com/google.crypto.tink.AesEaxKey").m34922a(((vx) zzb(zzfes)).toByteString()).m34921a(zzb.SYMMETRIC).m34103d();
    }
}
