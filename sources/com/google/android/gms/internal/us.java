package com.google.android.gms.internal;

import com.google.android.gms.internal.zzdsy.zzb;
import java.security.GeneralSecurityException;

final class us implements zzdpw<zzdvf> {
    us() {
    }

    /* renamed from: a */
    private final ye m27477a(zzfes zzfes) throws GeneralSecurityException {
        try {
            vr a = vr.m34639a(zzfes);
            if (a instanceof vr) {
                a = a;
                zo.m20290a(a.m34649a(), 0);
                zo.m20289a(a.m34652c().mo6930a());
                m27478a(a.m34651b());
                return new ye(a.m34652c().m20311c(), a.m34651b().m34661a());
            }
            throw new GeneralSecurityException("expected AesCtrKey proto");
        } catch (Throwable e) {
            throw new GeneralSecurityException("expected serialized AesCtrKey proto", e);
        }
    }

    /* renamed from: a */
    private static void m27478a(vv vvVar) throws GeneralSecurityException {
        if (vvVar.m34661a() >= 12) {
            if (vvVar.m34661a() <= 16) {
                return;
            }
        }
        throw new GeneralSecurityException("invalid IV size");
    }

    public final /* synthetic */ Object zza(zzfes zzfes) throws GeneralSecurityException {
        return m27477a(zzfes);
    }

    public final /* synthetic */ Object zza(zzfhe zzfhe) throws GeneralSecurityException {
        if (zzfhe instanceof vr) {
            vr vrVar = (vr) zzfhe;
            zo.m20290a(vrVar.m34649a(), 0);
            zo.m20289a(vrVar.m34652c().mo6930a());
            m27478a(vrVar.m34651b());
            return new ye(vrVar.m34652c().m20311c(), vrVar.m34651b().m34661a());
        }
        throw new GeneralSecurityException("expected AesCtrKey proto");
    }

    public final zzfhe zzb(zzfes zzfes) throws GeneralSecurityException {
        try {
            return zzb(vt.m34653a(zzfes));
        } catch (Throwable e) {
            throw new GeneralSecurityException("expected serialized AesCtrKeyFormat proto", e);
        }
    }

    public final zzfhe zzb(zzfhe zzfhe) throws GeneralSecurityException {
        if (zzfhe instanceof vt) {
            vt vtVar = (vt) zzfhe;
            zo.m20289a(vtVar.m34658b());
            m27478a(vtVar.m34656a());
            return vr.m34646d().m34637a(vtVar.m34656a()).m34638a(zzfes.m20298a(zm.m20287a(vtVar.m34658b()))).m34636a(0).m34103d();
        }
        throw new GeneralSecurityException("expected AesCtrKeyFormat proto");
    }

    public final zzdsy zzc(zzfes zzfes) throws GeneralSecurityException {
        return (zzdsy) zzdsy.m34930d().m34923a("type.googleapis.com/google.crypto.tink.AesCtrKey").m34922a(((vr) zzb(zzfes)).toByteString()).m34921a(zzb.SYMMETRIC).m34103d();
    }
}
