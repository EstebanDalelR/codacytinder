package com.snapchat.kit.sdk.core.networking;

public interface AuthTokenManager {
    boolean isUserLoggedIn();

    void revokeToken();

    void setAccessToken(String str);

    void startTokenGrant();
}
