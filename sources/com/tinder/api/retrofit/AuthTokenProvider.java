package com.tinder.api.retrofit;

import android.support.annotation.Nullable;

public interface AuthTokenProvider {
    @Nullable
    String getAuthToken();

    void updateAuthToken(@Nullable String str);
}
