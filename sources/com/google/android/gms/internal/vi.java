package com.google.android.gms.internal;

import com.google.android.gms.internal.zzdsy.zzb;
import java.security.GeneralSecurityException;
import java.security.Key;
import javax.crypto.spec.SecretKeySpec;

final class vi implements zzdpw<zzdqa> {
    vi() {
    }

    /* renamed from: a */
    private final zzdqa m27488a(zzfes zzfes) throws GeneralSecurityException {
        try {
            xb a = xb.m34783a(zzfes);
            if (a instanceof xb) {
                a = a;
                zo.m20290a(a.m34793a(), 0);
                if (a.m34796c().mo6930a() < 16) {
                    throw new GeneralSecurityException("key too short");
                }
                zk zkVar;
                m27489a(a.m34795b());
                zzdsq a2 = a.m34795b().m34805a();
                Key secretKeySpec = new SecretKeySpec(a.m34796c().m20311c(), "HMAC");
                int b = a.m34795b().m34807b();
                switch (vj.f16594a[a2.ordinal()]) {
                    case 1:
                        zkVar = new zk("HMACSHA1", secretKeySpec, b);
                        break;
                    case 2:
                        zkVar = new zk("HMACSHA256", secretKeySpec, b);
                        break;
                    case 3:
                        zkVar = new zk("HMACSHA512", secretKeySpec, b);
                        break;
                    default:
                        throw new GeneralSecurityException("unknown hash");
                }
                return zkVar;
            }
            throw new GeneralSecurityException("expected HmacKey proto");
        } catch (Throwable e) {
            throw new GeneralSecurityException("expected serialized HmacKey proto", e);
        }
    }

    /* renamed from: a */
    private static void m27489a(xf xfVar) throws GeneralSecurityException {
        if (xfVar.m34807b() < 10) {
            throw new GeneralSecurityException("tag size too small");
        }
        switch (vj.f16594a[xfVar.m34805a().ordinal()]) {
            case 1:
                if (xfVar.m34807b() > 20) {
                    throw new GeneralSecurityException("tag size too big");
                }
                return;
            case 2:
                if (xfVar.m34807b() > 32) {
                    throw new GeneralSecurityException("tag size too big");
                }
                return;
            case 3:
                if (xfVar.m34807b() > 64) {
                    throw new GeneralSecurityException("tag size too big");
                }
                return;
            default:
                throw new GeneralSecurityException("unknown hash type");
        }
    }

    public final /* synthetic */ Object zza(zzfes zzfes) throws GeneralSecurityException {
        return m27488a(zzfes);
    }

    public final /* synthetic */ Object zza(zzfhe zzfhe) throws GeneralSecurityException {
        if (zzfhe instanceof xb) {
            xb xbVar = (xb) zzfhe;
            zo.m20290a(xbVar.m34793a(), 0);
            if (xbVar.m34796c().mo6930a() < 16) {
                throw new GeneralSecurityException("key too short");
            }
            m27489a(xbVar.m34795b());
            zzdsq a = xbVar.m34795b().m34805a();
            Key secretKeySpec = new SecretKeySpec(xbVar.m34796c().m20311c(), "HMAC");
            int b = xbVar.m34795b().m34807b();
            switch (vj.f16594a[a.ordinal()]) {
                case 1:
                    return new zk("HMACSHA1", secretKeySpec, b);
                case 2:
                    return new zk("HMACSHA256", secretKeySpec, b);
                case 3:
                    return new zk("HMACSHA512", secretKeySpec, b);
                default:
                    throw new GeneralSecurityException("unknown hash");
            }
        }
        throw new GeneralSecurityException("expected HmacKey proto");
    }

    public final zzfhe zzb(zzfes zzfes) throws GeneralSecurityException {
        try {
            return zzb(xd.m34797a(zzfes));
        } catch (Throwable e) {
            throw new GeneralSecurityException("expected serialized HmacKeyFormat proto", e);
        }
    }

    public final zzfhe zzb(zzfhe zzfhe) throws GeneralSecurityException {
        if (zzfhe instanceof xd) {
            xd xdVar = (xd) zzfhe;
            if (xdVar.m34802b() < 16) {
                throw new GeneralSecurityException("key too short");
            }
            m27489a(xdVar.m34800a());
            return xb.m34790d().m34780a(0).m34781a(xdVar.m34800a()).m34782a(zzfes.m20298a(zm.m20287a(xdVar.m34802b()))).m34103d();
        }
        throw new GeneralSecurityException("expected HmacKeyFormat proto");
    }

    public final zzdsy zzc(zzfes zzfes) throws GeneralSecurityException {
        return (zzdsy) zzdsy.m34930d().m34923a("type.googleapis.com/google.crypto.tink.HmacKey").m34922a(((xb) zzb(zzfes)).toByteString()).m34921a(zzb.SYMMETRIC).m34103d();
    }
}
