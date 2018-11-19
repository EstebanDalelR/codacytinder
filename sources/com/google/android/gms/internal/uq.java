package com.google.android.gms.internal;

import com.google.android.gms.internal.yc.C8191a;
import java.security.GeneralSecurityException;

public final class uq {
    /* renamed from: a */
    public static final yc f16588a = ((yc) ((C8191a) yc.m34917b().m34100a(vm.f16596a)).m34911a(uf.m20222a("TinkAead", "Aead", "AesCtrHmacAeadKey", 0, true)).m34911a(uf.m20222a("TinkAead", "Aead", "AesEaxKey", 0, true)).m34911a(uf.m20222a("TinkAead", "Aead", "AesGcmKey", 0, true)).m34911a(uf.m20222a("TinkAead", "Aead", "ChaCha20Poly1305Key", 0, true)).m34911a(uf.m20222a("TinkAead", "Aead", "KmsAeadKey", 0, true)).m34911a(uf.m20222a("TinkAead", "Aead", "KmsEnvelopeAeadKey", 0, true)).m34912a("TINK_AEAD_1_0_0").m34103d());

    static {
        try {
            m20244a();
        } catch (Throwable e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    /* renamed from: a */
    public static void m20244a() throws GeneralSecurityException {
        uo.m20238a("TinkAead", new up());
        vm.m20258a();
    }
}
