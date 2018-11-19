package com.google.android.gms.internal;

import com.google.android.gms.internal.vr.C8160a;
import com.google.android.gms.internal.wd.C8166a;
import com.google.android.gms.internal.xb.C8176a;
import java.security.GeneralSecurityException;
import java.util.Arrays;

final class vh implements zzduj {
    /* renamed from: a */
    private final String f23494a;
    /* renamed from: b */
    private final int f23495b;
    /* renamed from: c */
    private wd f23496c;
    /* renamed from: d */
    private vn f23497d;
    /* renamed from: e */
    private int f23498e;

    vh(xl xlVar) throws GeneralSecurityException {
        this.f23494a = xlVar.m34811a();
        if (this.f23494a.equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            try {
                wf a = wf.m34703a(xlVar.m34812b());
                this.f23496c = (wd) uo.m20242b(xlVar);
                this.f23495b = a.m34707b();
            } catch (Throwable e) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e);
            }
        } else if (this.f23494a.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            try {
                vp a2 = vp.m34631a(xlVar.m34812b());
                this.f23497d = (vn) uo.m20242b(xlVar);
                this.f23498e = a2.m34633a().m34658b();
                this.f23495b = this.f23498e + a2.m34635b().m34802b();
            } catch (Throwable e2) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e2);
            }
        } else {
            String str = "unsupported AEAD DEM key type: ";
            String valueOf = String.valueOf(this.f23494a);
            throw new GeneralSecurityException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        }
    }

    public final zzdpp zzae(byte[] bArr) throws GeneralSecurityException {
        zzfhe zzfhe;
        if (this.f23494a.equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            zzfhe = (wd) ((C8166a) wd.m34698c().m34100a(this.f23496c)).m34690a(zzfes.m20298a(bArr)).m34103d();
        } else if (this.f23494a.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, this.f23498e);
            xb xbVar = (xb) ((C8176a) xb.m34790d().m34100a(this.f23497d.m34630c())).m34782a(zzfes.m20298a(Arrays.copyOfRange(bArr, this.f23498e, this.f23495b))).m34103d();
            vn vnVar = (vn) vn.m34625d().m34615a(this.f23497d.m34627a()).m34616a((vr) ((C8160a) vr.m34646d().m34100a(this.f23497d.m34629b())).m34638a(zzfes.m20298a(copyOfRange)).m34103d()).m34617a(xbVar).m34103d();
        } else {
            throw new GeneralSecurityException("unknown DEM key type");
        }
        return (zzdpp) uo.m20243b(this.f23494a, zzfhe);
    }

    public final int zzbma() {
        return this.f23495b;
    }
}
