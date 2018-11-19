package com.snapchat.kit.sdk.core.security;

import android.support.annotation.Nullable;

public interface EncryptDecryptAlgorithm {
    @Nullable
    String decrypt(@Nullable String str);

    @Nullable
    String encrypt(@Nullable String str);
}
