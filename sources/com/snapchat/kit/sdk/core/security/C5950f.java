package com.snapchat.kit.sdk.core.security;

import android.content.SharedPreferences;
import android.support.annotation.Nullable;
import java.security.NoSuchAlgorithmException;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.snapchat.kit.sdk.core.security.f */
public class C5950f {
    @android.annotation.TargetApi(23)
    /* renamed from: a */
    public static com.snapchat.kit.sdk.core.security.C5949e m25552a(java.security.KeyStore r3) throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException, java.security.InvalidAlgorithmParameterException {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = "SnapConnectSDK.AES";	 Catch:{ KeyStoreException -> 0x001c, KeyStoreException -> 0x001c }
        r0 = r3.containsAlias(r0);	 Catch:{ KeyStoreException -> 0x001c, KeyStoreException -> 0x001c }
        if (r0 == 0) goto L_0x001c;	 Catch:{ KeyStoreException -> 0x001c, KeyStoreException -> 0x001c }
    L_0x0008:
        r0 = new com.snapchat.kit.sdk.core.security.e;	 Catch:{ KeyStoreException -> 0x001c, KeyStoreException -> 0x001c }
        r1 = "SnapConnectSDK.AES";	 Catch:{ KeyStoreException -> 0x001c, KeyStoreException -> 0x001c }
        r2 = 0;	 Catch:{ KeyStoreException -> 0x001c, KeyStoreException -> 0x001c }
        r1 = r3.getEntry(r1, r2);	 Catch:{ KeyStoreException -> 0x001c, KeyStoreException -> 0x001c }
        r1 = (java.security.KeyStore.SecretKeyEntry) r1;	 Catch:{ KeyStoreException -> 0x001c, KeyStoreException -> 0x001c }
        r1 = r1.getSecretKey();	 Catch:{ KeyStoreException -> 0x001c, KeyStoreException -> 0x001c }
        r2 = 0;	 Catch:{ KeyStoreException -> 0x001c, KeyStoreException -> 0x001c }
        r0.<init>(r1, r2);	 Catch:{ KeyStoreException -> 0x001c, KeyStoreException -> 0x001c }
        return r0;
    L_0x001c:
        r0 = "AES";
        r3 = r3.getType();
        r3 = javax.crypto.KeyGenerator.getInstance(r0, r3);
        r0 = new android.security.keystore.KeyGenParameterSpec$Builder;
        r1 = "SnapConnectSDK.AES";
        r2 = 3;
        r0.<init>(r1, r2);
        r1 = "GCM";
        r1 = new java.lang.String[]{r1};
        r0 = r0.setBlockModes(r1);
        r1 = "NoPadding";
        r1 = new java.lang.String[]{r1};
        r0 = r0.setEncryptionPaddings(r1);
        r1 = 256; // 0x100 float:3.59E-43 double:1.265E-321;
        r0 = r0.setKeySize(r1);
        r0 = r0.build();
        r3.init(r0);
        r0 = new com.snapchat.kit.sdk.core.security.e;
        r3 = r3.generateKey();
        r1 = 1;
        r0.<init>(r3, r1);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snapchat.kit.sdk.core.security.f.a(java.security.KeyStore):com.snapchat.kit.sdk.core.security.e");
    }

    /* renamed from: a */
    public static C5949e m25551a(SharedPreferences sharedPreferences, EncryptDecryptAlgorithm encryptDecryptAlgorithm, boolean z) throws NoSuchAlgorithmException {
        SecretKey secretKey = null;
        if (!z) {
            String string = sharedPreferences.getString("encoded_secret", null);
            if (string != null) {
                secretKey = C5950f.m25555a(string, 32, encryptDecryptAlgorithm);
            }
        }
        if (secretKey == null) {
            z = true;
            secretKey = C5950f.m25554a();
            sharedPreferences.edit().putString("encoded_secret", C5950f.m25553a(secretKey, encryptDecryptAlgorithm)).apply();
        } else {
            z = false;
        }
        return new C5949e(secretKey, z);
    }

    /* renamed from: a */
    private static SecretKey m25554a() throws NoSuchAlgorithmException {
        KeyGenerator instance = KeyGenerator.getInstance("AES");
        instance.init(256);
        return instance.generateKey();
    }

    @Nullable
    /* renamed from: a */
    private static String m25553a(SecretKey secretKey, EncryptDecryptAlgorithm encryptDecryptAlgorithm) {
        return encryptDecryptAlgorithm.encrypt(new String(secretKey.getEncoded()));
    }

    @Nullable
    /* renamed from: a */
    private static SecretKey m25555a(String str, int i, EncryptDecryptAlgorithm encryptDecryptAlgorithm) {
        str = encryptDecryptAlgorithm.decrypt(str);
        if (str == null) {
            return null;
        }
        return new SecretKeySpec(str.getBytes(), str.length() - i, i, "AES");
    }
}
