package com.snapchat.kit.sdk.core.security;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Base64;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.UnrecoverableEntryException;
import java.security.interfaces.RSAPublicKey;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import org.apache.commons.lang3.builder.C17715c;

/* renamed from: com.snapchat.kit.sdk.core.security.d */
public class C7157d implements EncryptDecryptAlgorithm {
    /* renamed from: a */
    private final KeyPair f25900a;

    /* renamed from: com.snapchat.kit.sdk.core.security.d$a */
    public static class C5948a {
        /* renamed from: a */
        String f21775a;
        /* renamed from: b */
        String f21776b;

        private C5948a(String str, String str2) {
            this.f21775a = str;
            this.f21776b = str2;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C5948a)) {
                return null;
            }
            C5948a c5948a = (C5948a) obj;
            return new C17715c().a(this.f21775a, c5948a.f21775a).a(this.f21776b, c5948a.f21776b).b().booleanValue();
        }
    }

    public C7157d(KeyStore keyStore, Context context, @Nullable C5948a c5948a) throws NoSuchAlgorithmException, NoSuchProviderException, UnrecoverableEntryException, InvalidAlgorithmParameterException, KeyStoreException {
        this.f25900a = C7157d.m30811a(keyStore, context, c5948a);
    }

    public java.lang.String encrypt(@android.support.annotation.Nullable java.lang.String r2) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r1 = this;
        r0 = 0;
        if (r2 != 0) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r2 = r1.m30810a(r2);	 Catch:{ NoSuchAlgorithmException -> 0x0009, NoSuchAlgorithmException -> 0x0009, NoSuchAlgorithmException -> 0x0009, NoSuchAlgorithmException -> 0x0009, NoSuchAlgorithmException -> 0x0009 }
        return r2;
    L_0x0009:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snapchat.kit.sdk.core.security.d.encrypt(java.lang.String):java.lang.String");
    }

    public java.lang.String decrypt(@android.support.annotation.Nullable java.lang.String r2) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r1 = this;
        r0 = 0;
        if (r2 != 0) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r2 = r1.m30812b(r2);	 Catch:{ NoSuchAlgorithmException -> 0x0009, NoSuchAlgorithmException -> 0x0009, NoSuchAlgorithmException -> 0x0009, NoSuchAlgorithmException -> 0x0009, NoSuchAlgorithmException -> 0x0009 }
        return r2;
    L_0x0009:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snapchat.kit.sdk.core.security.d.decrypt(java.lang.String):java.lang.String");
    }

    @NonNull
    /* renamed from: a */
    public C5948a m30813a() {
        RSAPublicKey rSAPublicKey = (RSAPublicKey) this.f25900a.getPublic();
        return new C5948a(rSAPublicKey.getModulus().toString(), rSAPublicKey.getPublicExponent().toString());
    }

    /* renamed from: a */
    private String m30810a(@NonNull String str) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
        Cipher instance = Cipher.getInstance("RSA/None/NoPadding");
        instance.init(1, this.f25900a.getPublic());
        return Base64.encodeToString(instance.doFinal(str.getBytes()), 0);
    }

    /* renamed from: b */
    private String m30812b(@NonNull String str) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
        Cipher instance = Cipher.getInstance("RSA/None/NoPadding");
        instance.init(2, this.f25900a.getPrivate());
        return new String(instance.doFinal(Base64.decode(str, 0)));
    }

    /* renamed from: a */
    private static java.security.KeyPair m30811a(java.security.KeyStore r3, android.content.Context r4, @android.support.annotation.Nullable com.snapchat.kit.sdk.core.security.C7157d.C5948a r5) throws java.security.NoSuchAlgorithmException, java.security.NoSuchProviderException, java.security.UnrecoverableEntryException, java.security.InvalidAlgorithmParameterException, java.security.KeyStoreException {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        if (r5 == 0) goto L_0x0042;
    L_0x0002:
        r0 = r5.f21775a;
        if (r0 == 0) goto L_0x0042;
    L_0x0006:
        r0 = r5.f21776b;
        if (r0 == 0) goto L_0x0042;
    L_0x000a:
        r0 = "SnapConnectSDK.RSA";
        r0 = r3.containsAlias(r0);
        if (r0 == 0) goto L_0x0042;
    L_0x0012:
        r0 = new java.security.spec.RSAPublicKeySpec;	 Catch:{ InvalidKeySpecException -> 0x0042 }
        r1 = new java.math.BigInteger;	 Catch:{ InvalidKeySpecException -> 0x0042 }
        r2 = r5.f21775a;	 Catch:{ InvalidKeySpecException -> 0x0042 }
        r1.<init>(r2);	 Catch:{ InvalidKeySpecException -> 0x0042 }
        r2 = new java.math.BigInteger;	 Catch:{ InvalidKeySpecException -> 0x0042 }
        r5 = r5.f21776b;	 Catch:{ InvalidKeySpecException -> 0x0042 }
        r2.<init>(r5);	 Catch:{ InvalidKeySpecException -> 0x0042 }
        r0.<init>(r1, r2);	 Catch:{ InvalidKeySpecException -> 0x0042 }
        r5 = "RSA";	 Catch:{ InvalidKeySpecException -> 0x0042 }
        r5 = java.security.KeyFactory.getInstance(r5);	 Catch:{ InvalidKeySpecException -> 0x0042 }
        r5 = r5.generatePublic(r0);	 Catch:{ InvalidKeySpecException -> 0x0042 }
        r0 = "SnapConnectSDK.RSA";	 Catch:{ InvalidKeySpecException -> 0x0042 }
        r1 = 0;	 Catch:{ InvalidKeySpecException -> 0x0042 }
        r0 = r3.getEntry(r0, r1);	 Catch:{ InvalidKeySpecException -> 0x0042 }
        r0 = (java.security.KeyStore.PrivateKeyEntry) r0;	 Catch:{ InvalidKeySpecException -> 0x0042 }
        r0 = r0.getPrivateKey();	 Catch:{ InvalidKeySpecException -> 0x0042 }
        r1 = new java.security.KeyPair;	 Catch:{ InvalidKeySpecException -> 0x0042 }
        r1.<init>(r5, r0);	 Catch:{ InvalidKeySpecException -> 0x0042 }
        return r1;
    L_0x0042:
        r5 = java.util.Calendar.getInstance();
        r0 = r5.getTime();
        r1 = 1;
        r5.add(r1, r1);
        r5 = r5.getTime();
        r1 = "RSA";
        r3 = r3.getType();
        r3 = java.security.KeyPairGenerator.getInstance(r1, r3);
        r1 = new android.security.KeyPairGeneratorSpec$Builder;
        r1.<init>(r4);
        r4 = "SnapConnectSDK.RSA";
        r4 = r1.setAlias(r4);
        r4 = r4.setStartDate(r0);
        r4 = r4.setEndDate(r5);
        r5 = new javax.security.auth.x500.X500Principal;
        r0 = "CN=SnapConnectSDK.RSA";
        r5.<init>(r0);
        r4 = r4.setSubject(r5);
        r5 = java.math.BigInteger.ONE;
        r4 = r4.setSerialNumber(r5);
        r5 = 8192; // 0x2000 float:1.14794E-41 double:4.0474E-320;
        r4 = r4.setKeySize(r5);
        r4 = r4.build();
        r3.initialize(r4);
        r3 = r3.generateKeyPair();
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snapchat.kit.sdk.core.security.d.a(java.security.KeyStore, android.content.Context, com.snapchat.kit.sdk.core.security.d$a):java.security.KeyPair");
    }
}
