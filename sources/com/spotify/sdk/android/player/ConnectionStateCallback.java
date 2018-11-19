package com.spotify.sdk.android.player;

import com.spotify.jni.annotations.UsedByNativeCode;

public interface ConnectionStateCallback {
    @UsedByNativeCode
    void onConnectionMessage(String str);

    @UsedByNativeCode
    void onLoggedIn();

    @UsedByNativeCode
    void onLoggedOut();

    @UsedByNativeCode
    void onLoginFailed(Throwable th);

    @UsedByNativeCode
    void onTemporaryError();
}
