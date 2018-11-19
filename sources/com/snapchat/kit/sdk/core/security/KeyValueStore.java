package com.snapchat.kit.sdk.core.security;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

public interface KeyValueStore {
    void clearEntry(@NonNull String str);

    <T> T get(@NonNull String str, Class<T> cls);

    String getString(@NonNull String str, @Nullable String str2);

    void put(@NonNull String str, Object obj);

    void putString(@NonNull String str, String str2);
}
