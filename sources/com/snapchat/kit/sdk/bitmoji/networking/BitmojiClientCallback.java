package com.snapchat.kit.sdk.bitmoji.networking;

import android.support.annotation.Nullable;

public interface BitmojiClientCallback<T> {
    void onFailure(boolean z, int i);

    void onSuccess(@Nullable T t);
}
