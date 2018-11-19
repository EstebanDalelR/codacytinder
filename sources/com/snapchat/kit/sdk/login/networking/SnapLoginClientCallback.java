package com.snapchat.kit.sdk.login.networking;

import android.support.annotation.Nullable;

public interface SnapLoginClientCallback<T> {
    void onFailure(boolean z, int i);

    void onSuccess(@Nullable T t);
}
