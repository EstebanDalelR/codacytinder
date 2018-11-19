package com.foursquare.internal.util;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.foursquare.internal.util.f */
public final class C1944f {
    /* renamed from: a */
    public static String m6830a(byte[] bArr, String str) throws Exception {
        return new String(C1939a.m6810a(C1944f.m6831a(bArr, str.getBytes())));
    }

    /* renamed from: b */
    public static String m6832b(byte[] bArr, String str) throws Exception {
        return new String(C1944f.m6833b(bArr, C1939a.m6808a(str)));
    }

    /* renamed from: a */
    private static byte[] m6831a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
        instance.init(1, new SecretKeySpec(bArr, "AES"), new IvParameterSpec(new byte[instance.getBlockSize()]));
        return instance.doFinal(bArr2);
    }

    /* renamed from: b */
    private static byte[] m6833b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
        instance.init(2, new SecretKeySpec(bArr, "AES"), new IvParameterSpec(new byte[instance.getBlockSize()]));
        return instance.doFinal(bArr2);
    }
}
