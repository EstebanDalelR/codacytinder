package com.google.android.gms.internal;

import android.support.v7.widget.ActivityChooserView.ActivityChooserViewAdapter;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class ye implements zzdvf {
    /* renamed from: a */
    private final SecretKeySpec f23502a;
    /* renamed from: b */
    private final int f23503b;
    /* renamed from: c */
    private final int f23504c = ((Cipher) yz.f16654a.m20279a("AES/CTR/NoPadding")).getBlockSize();

    public ye(byte[] bArr, int i) throws GeneralSecurityException {
        this.f23502a = new SecretKeySpec(bArr, "AES");
        if (i >= 12) {
            if (i <= this.f23504c) {
                this.f23503b = i;
                return;
            }
        }
        throw new GeneralSecurityException("invalid IV size");
    }

    public final byte[] zzag(byte[] bArr) throws GeneralSecurityException {
        if (bArr.length > ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED - this.f23503b) {
            int i = ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED - this.f23503b;
            StringBuilder stringBuilder = new StringBuilder(43);
            stringBuilder.append("plaintext length can not exceed ");
            stringBuilder.append(i);
            throw new GeneralSecurityException(stringBuilder.toString());
        }
        Object obj = new byte[(this.f23503b + bArr.length)];
        Object a = zm.m20287a(this.f23503b);
        System.arraycopy(a, 0, obj, 0, this.f23503b);
        int length = bArr.length;
        int i2 = this.f23503b;
        Cipher cipher = (Cipher) yz.f16654a.m20279a("AES/CTR/NoPadding");
        Object obj2 = new byte[this.f23504c];
        System.arraycopy(a, 0, obj2, 0, this.f23503b);
        cipher.init(1, this.f23502a, new IvParameterSpec(obj2));
        if (cipher.doFinal(bArr, 0, length, obj, i2) == length) {
            return obj;
        }
        throw new GeneralSecurityException("stored output's length does not match input's length");
    }
}
