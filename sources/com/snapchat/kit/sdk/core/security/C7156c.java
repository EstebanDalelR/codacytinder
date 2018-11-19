package com.snapchat.kit.sdk.core.security;

import android.support.annotation.Nullable;
import android.util.Base64;

/* renamed from: com.snapchat.kit.sdk.core.security.c */
public class C7156c implements EncryptDecryptAlgorithm {
    public String encrypt(@Nullable String str) {
        return str == null ? null : Base64.encodeToString(str.getBytes(), 0);
    }

    public String decrypt(@Nullable String str) {
        return str == null ? null : new String(Base64.decode(str, 0));
    }
}
