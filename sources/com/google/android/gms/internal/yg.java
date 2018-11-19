package com.google.android.gms.internal;

import com.tinder.domain.config.model.ProfileEditingConfig;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class yg implements zzdpp {
    /* renamed from: a */
    private final SecretKey f23509a;

    public yg(byte[] bArr) {
        this.f23509a = new SecretKeySpec(bArr, "AES");
    }

    public final byte[] zzd(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length > 2147483619) {
            throw new GeneralSecurityException("plaintext too long");
        }
        Object obj = new byte[((bArr.length + 12) + 16)];
        Object a = zm.m20287a(12);
        System.arraycopy(a, 0, obj, 0, 12);
        Cipher cipher = (Cipher) yz.f16654a.m20279a("AES/GCM/NoPadding");
        cipher.init(1, this.f23509a, new GCMParameterSpec(ProfileEditingConfig.DEFAULT_MAX_LENGTH, a));
        cipher.updateAAD(bArr2);
        cipher.doFinal(bArr, 0, bArr.length, obj, 12);
        return obj;
    }
}
