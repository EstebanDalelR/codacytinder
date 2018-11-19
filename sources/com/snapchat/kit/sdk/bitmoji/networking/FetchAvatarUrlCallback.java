package com.snapchat.kit.sdk.bitmoji.networking;

import android.support.annotation.Nullable;

public interface FetchAvatarUrlCallback extends BitmojiClientCallback<String> {
    void onFailure(boolean z, int i);

    void onSuccess(@Nullable String str);
}
