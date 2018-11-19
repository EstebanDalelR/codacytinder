package com.snapchat.kit.sdk.core.security;

import android.support.annotation.NonNull;
import android.util.Base64;
import com.google.gson.Gson;
import com.tinder.domain.config.model.ProfileEditingConfig;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

/* renamed from: com.snapchat.kit.sdk.core.security.a */
public class C7155a implements EncryptDecryptAlgorithm {
    /* renamed from: a */
    private final SecretKey f25898a;
    /* renamed from: b */
    private final Gson f25899b;

    /* renamed from: com.snapchat.kit.sdk.core.security.a$a */
    private static class C5946a {
        /* renamed from: a */
        String f21773a;
        /* renamed from: b */
        String f21774b;

        C5946a(String str, String str2) {
            this.f21773a = str;
            this.f21774b = str2;
        }
    }

    public C7155a(SecretKey secretKey, Gson gson) {
        this.f25898a = secretKey;
        this.f25899b = gson;
    }

    public java.lang.String encrypt(@android.support.annotation.Nullable java.lang.String r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r0 = 0;
        if (r3 != 0) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = r2.f25899b;	 Catch:{ NoSuchAlgorithmException -> 0x000f, NoSuchAlgorithmException -> 0x000f, NoSuchAlgorithmException -> 0x000f, NoSuchAlgorithmException -> 0x000f, NoSuchAlgorithmException -> 0x000f, NoSuchAlgorithmException -> 0x000f, NoSuchAlgorithmException -> 0x000f }
        r3 = r2.m30808a(r3);	 Catch:{ NoSuchAlgorithmException -> 0x000f, NoSuchAlgorithmException -> 0x000f, NoSuchAlgorithmException -> 0x000f, NoSuchAlgorithmException -> 0x000f, NoSuchAlgorithmException -> 0x000f, NoSuchAlgorithmException -> 0x000f, NoSuchAlgorithmException -> 0x000f }
        r3 = r1.toJson(r3);	 Catch:{ NoSuchAlgorithmException -> 0x000f, NoSuchAlgorithmException -> 0x000f, NoSuchAlgorithmException -> 0x000f, NoSuchAlgorithmException -> 0x000f, NoSuchAlgorithmException -> 0x000f, NoSuchAlgorithmException -> 0x000f, NoSuchAlgorithmException -> 0x000f }
        return r3;
    L_0x000f:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snapchat.kit.sdk.core.security.a.encrypt(java.lang.String):java.lang.String");
    }

    public java.lang.String decrypt(@android.support.annotation.Nullable java.lang.String r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r0 = 0;
        r1 = r3.f25899b;	 Catch:{ JsonParseException -> 0x000c }
        r2 = com.snapchat.kit.sdk.core.security.C7155a.C5946a.class;	 Catch:{ JsonParseException -> 0x000c }
        r4 = r1.fromJson(r4, r2);	 Catch:{ JsonParseException -> 0x000c }
        r4 = (com.snapchat.kit.sdk.core.security.C7155a.C5946a) r4;	 Catch:{ JsonParseException -> 0x000c }
        goto L_0x000d;
    L_0x000c:
        r4 = r0;
    L_0x000d:
        if (r4 == 0) goto L_0x001e;
    L_0x000f:
        r1 = r4.f21774b;
        if (r1 == 0) goto L_0x001e;
    L_0x0013:
        r1 = r4.f21773a;
        if (r1 != 0) goto L_0x0018;
    L_0x0017:
        goto L_0x001e;
    L_0x0018:
        r4 = r3.m30809a(r4);	 Catch:{ NoSuchAlgorithmException -> 0x001d, NoSuchAlgorithmException -> 0x001d, NoSuchAlgorithmException -> 0x001d, NoSuchAlgorithmException -> 0x001d, NoSuchAlgorithmException -> 0x001d, NoSuchAlgorithmException -> 0x001d }
        return r4;
    L_0x001d:
        return r0;
    L_0x001e:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snapchat.kit.sdk.core.security.a.decrypt(java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    private C5946a m30808a(@NonNull String str) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException {
        Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
        instance.init(1, this.f25898a);
        return new C5946a(Base64.encodeToString(instance.getIV(), 0), Base64.encodeToString(instance.doFinal(str.getBytes()), 0));
    }

    /* renamed from: a */
    private String m30809a(@NonNull C5946a c5946a) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException {
        byte[] decode = Base64.decode(c5946a.f21773a, 0);
        c5946a = Base64.decode(c5946a.f21774b, 0);
        Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
        instance.init(2, this.f25898a, new GCMParameterSpec(ProfileEditingConfig.DEFAULT_MAX_LENGTH, decode));
        return new String(instance.doFinal(c5946a));
    }
}
