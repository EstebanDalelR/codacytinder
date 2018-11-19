package com.google.android.gms.internal;

import android.support.v7.widget.ActivityChooserView.ActivityChooserViewAdapter;
import com.tinder.domain.config.model.ProfileEditingConfig;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class yf implements zzdpp {
    /* renamed from: a */
    private final byte[] f23505a;
    /* renamed from: b */
    private final byte[] f23506b;
    /* renamed from: c */
    private final SecretKeySpec f23507c;
    /* renamed from: d */
    private final int f23508d;

    public yf(byte[] bArr, int i) throws GeneralSecurityException {
        if (i == 12 || i == 16) {
            this.f23508d = i;
            this.f23507c = new SecretKeySpec(bArr, "AES");
            Cipher instance = Cipher.getInstance("AES/ECB/NOPADDING");
            instance.init(1, this.f23507c);
            this.f23505a = m27493a(instance.doFinal(new byte[16]));
            this.f23506b = m27493a(this.f23505a);
            return;
        }
        throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
    }

    /* renamed from: a */
    private final byte[] m27492a(Cipher cipher, int i, byte[] bArr, int i2, int i3) throws IllegalBlockSizeException, BadPaddingException {
        byte[] a;
        byte[] bArr2 = new byte[16];
        bArr2[15] = (byte) i;
        if (i3 == 0) {
            a = m27494a(bArr2, this.f23505a);
        } else {
            a = cipher.doFinal(bArr2);
            byte[] bArr3 = a;
            i = 0;
            while (i3 - i > 16) {
                for (int i4 = 0; i4 < 16; i4++) {
                    bArr3[i4] = (byte) (bArr3[i4] ^ bArr[(i2 + i) + i4]);
                }
                bArr3 = cipher.doFinal(bArr3);
                i += 16;
            }
            a = Arrays.copyOfRange(bArr, i + i2, i2 + i3);
            if (a.length == 16) {
                a = m27494a(a, this.f23505a);
            } else {
                bArr = Arrays.copyOf(this.f23506b, 16);
                for (int i5 = 0; i5 < a.length; i5++) {
                    bArr[i5] = (byte) (bArr[i5] ^ a[i5]);
                }
                bArr[a.length] = (byte) (bArr[a.length] ^ ProfileEditingConfig.DEFAULT_MAX_LENGTH);
                a = bArr;
            }
            a = m27494a(bArr3, a);
        }
        return cipher.doFinal(a);
    }

    /* renamed from: a */
    private static byte[] m27493a(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i = 0;
        int i2 = 0;
        while (i2 < 15) {
            int i3 = i2 + 1;
            bArr2[i2] = (byte) ((bArr[i2] << 1) ^ ((bArr[i3] & 255) >>> 7));
            i2 = i3;
        }
        i2 = bArr[15] << 1;
        if ((bArr[0] & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0) {
            i = 135;
        }
        bArr2[15] = (byte) (i2 ^ i);
        return bArr2;
    }

    /* renamed from: a */
    private static byte[] m27494a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
        return bArr3;
    }

    public final byte[] zzd(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = bArr;
        if (bArr3.length > (ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED - this.f23508d) - 16) {
            throw new GeneralSecurityException("plaintext too long");
        }
        Object obj = new byte[((r6.f23508d + bArr3.length) + 16)];
        Object a = zm.m20287a(r6.f23508d);
        int i = 0;
        System.arraycopy(a, 0, obj, 0, r6.f23508d);
        Cipher instance = Cipher.getInstance("AES/ECB/NOPADDING");
        instance.init(1, r6.f23507c);
        Cipher cipher = instance;
        byte[] a2 = m27492a(cipher, 0, a, 0, a.length);
        byte[] bArr4 = bArr2;
        byte[] a3 = m27492a(cipher, 1, bArr4, 0, bArr4.length);
        Cipher instance2 = Cipher.getInstance("AES/CTR/NOPADDING");
        instance2.init(1, r6.f23507c, new IvParameterSpec(a2));
        instance2.doFinal(bArr3, 0, bArr3.length, obj, r6.f23508d);
        byte[] a4 = m27492a(instance, 2, obj, r6.f23508d, bArr3.length);
        int length = bArr3.length + r6.f23508d;
        while (i < 16) {
            obj[length + i] = (byte) ((a3[i] ^ a2[i]) ^ a4[i]);
            i++;
        }
        return obj;
    }
}
