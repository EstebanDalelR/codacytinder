package com.snapchat.kit.sdk.core.security;

import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.gson.Gson;

/* renamed from: com.snapchat.kit.sdk.core.security.g */
public class C7158g implements KeyValueStore {
    /* renamed from: a */
    private final SharedPreferences f25901a;
    /* renamed from: b */
    private final EncryptDecryptAlgorithm f25902b;
    /* renamed from: c */
    private final Gson f25903c;

    public C7158g(SharedPreferences sharedPreferences, EncryptDecryptAlgorithm encryptDecryptAlgorithm, Gson gson) {
        this.f25901a = sharedPreferences;
        this.f25902b = encryptDecryptAlgorithm;
        this.f25903c = gson;
    }

    public String getString(@NonNull String str, @Nullable String str2) {
        String string = this.f25901a.getString(str, null);
        if (string == null) {
            return str2;
        }
        string = this.f25902b.decrypt(string);
        if (string != null) {
            return string;
        }
        clearEntry(str);
        return str2;
    }

    public void putString(@NonNull String str, @Nullable String str2) {
        this.f25901a.edit().putString(str, str2 == null ? null : this.f25902b.encrypt(str2)).apply();
    }

    public <T> T get(@android.support.annotation.NonNull java.lang.String r4, java.lang.Class<T> r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r0 = 0;
        r1 = r3.getString(r4, r0);
        if (r1 != 0) goto L_0x0008;
    L_0x0007:
        return r0;
    L_0x0008:
        r2 = r3.f25903c;	 Catch:{ JsonParseException -> 0x000f }
        r5 = r2.fromJson(r1, r5);	 Catch:{ JsonParseException -> 0x000f }
        return r5;
    L_0x000f:
        r3.clearEntry(r4);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snapchat.kit.sdk.core.security.g.get(java.lang.String, java.lang.Class):T");
    }

    public void put(@NonNull String str, Object obj) {
        putString(str, this.f25903c.toJson(obj));
    }

    public void clearEntry(@NonNull String str) {
        this.f25901a.edit().remove(str).apply();
    }
}
