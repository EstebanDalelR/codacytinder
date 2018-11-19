package com.google.android.gms.internal;

import com.google.android.gms.internal.zzdsy.zzb;
import java.security.GeneralSecurityException;
import java.util.logging.Logger;

class ur implements zzdpw<zzdpp> {
    /* renamed from: a */
    private static final Logger f23489a = Logger.getLogger(ur.class.getName());

    ur() throws GeneralSecurityException {
        uo.m20239a("type.googleapis.com/google.crypto.tink.AesCtrKey", new us());
    }

    /* renamed from: a */
    private final zzdpp m27476a(zzfes zzfes) throws GeneralSecurityException {
        try {
            vn a = vn.m34618a(zzfes);
            if (a instanceof vn) {
                a = a;
                zo.m20290a(a.m34627a(), 0);
                return new yy((zzdvf) uo.m20243b("type.googleapis.com/google.crypto.tink.AesCtrKey", a.m34629b()), (zzdqa) uo.m20243b("type.googleapis.com/google.crypto.tink.HmacKey", a.m34630c()), a.m34630c().m34795b().m34807b());
            }
            throw new GeneralSecurityException("expected AesCtrHmacAeadKey proto");
        } catch (Throwable e) {
            throw new GeneralSecurityException("expected serialized AesCtrHmacAeadKey proto", e);
        }
    }

    public final /* synthetic */ Object zza(zzfes zzfes) throws GeneralSecurityException {
        return m27476a(zzfes);
    }

    public final /* synthetic */ Object zza(zzfhe zzfhe) throws GeneralSecurityException {
        if (zzfhe instanceof vn) {
            vn vnVar = (vn) zzfhe;
            zo.m20290a(vnVar.m34627a(), 0);
            return new yy((zzdvf) uo.m20243b("type.googleapis.com/google.crypto.tink.AesCtrKey", vnVar.m34629b()), (zzdqa) uo.m20243b("type.googleapis.com/google.crypto.tink.HmacKey", vnVar.m34630c()), vnVar.m34630c().m34795b().m34807b());
        }
        throw new GeneralSecurityException("expected AesCtrHmacAeadKey proto");
    }

    public final zzfhe zzb(zzfes zzfes) throws GeneralSecurityException {
        try {
            return zzb(vp.m34631a(zzfes));
        } catch (Throwable e) {
            throw new GeneralSecurityException("expected serialized AesCtrHmacAeadKeyFormat proto", e);
        }
    }

    public final zzfhe zzb(zzfhe zzfhe) throws GeneralSecurityException {
        if (zzfhe instanceof vp) {
            vp vpVar = (vp) zzfhe;
            vr vrVar = (vr) uo.m20235a("type.googleapis.com/google.crypto.tink.AesCtrKey", vpVar.m34633a());
            return vn.m34625d().m34616a(vrVar).m34617a((xb) uo.m20235a("type.googleapis.com/google.crypto.tink.HmacKey", vpVar.m34635b())).m34615a(0).m34103d();
        }
        throw new GeneralSecurityException("expected AesCtrHmacAeadKeyFormat proto");
    }

    public final zzdsy zzc(zzfes zzfes) throws GeneralSecurityException {
        return (zzdsy) zzdsy.m34930d().m34923a("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey").m34922a(((vn) zzb(zzfes)).toByteString()).m34921a(zzb.SYMMETRIC).m34103d();
    }
}
