package com.google.android.gms.internal;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public final class zi {
    /* renamed from: a */
    public static byte[] m20280a(String str, byte[] bArr, byte[] bArr2, byte[] bArr3, int i) throws GeneralSecurityException {
        Mac mac = (Mac) yz.f16655b.m20279a(str);
        if (i > mac.getMacLength() * 255) {
            throw new GeneralSecurityException("size too large");
        }
        Object obj;
        int i2;
        int i3;
        if (bArr2 != null) {
            if (bArr2.length != 0) {
                mac.init(new SecretKeySpec(bArr2, str));
                obj = new byte[i];
                mac.init(new SecretKeySpec(mac.doFinal(bArr), str));
                bArr = new byte[0];
                i2 = 1;
                i3 = 0;
                while (true) {
                    mac.update(bArr);
                    mac.update(bArr3);
                    mac.update((byte) i2);
                    bArr = mac.doFinal();
                    if (bArr.length + i3 >= i) {
                        System.arraycopy(bArr, 0, obj, i3, bArr.length);
                        i3 += bArr.length;
                        i2++;
                    } else {
                        System.arraycopy(bArr, 0, obj, i3, i - i3);
                        return obj;
                    }
                }
            }
        }
        mac.init(new SecretKeySpec(new byte[mac.getMacLength()], str));
        obj = new byte[i];
        mac.init(new SecretKeySpec(mac.doFinal(bArr), str));
        bArr = new byte[0];
        i2 = 1;
        i3 = 0;
        while (true) {
            mac.update(bArr);
            mac.update(bArr3);
            mac.update((byte) i2);
            bArr = mac.doFinal();
            if (bArr.length + i3 >= i) {
                System.arraycopy(bArr, 0, obj, i3, i - i3);
                return obj;
            }
            System.arraycopy(bArr, 0, obj, i3, bArr.length);
            i3 += bArr.length;
            i2++;
        }
    }
}
