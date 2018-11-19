package com.facebook.accountkit;

import android.os.Parcelable;
import android.support.annotation.Nullable;

public interface AccountKitLoginResult extends Parcelable {
    public static final String RESULT_KEY = "account_kit_log_in_result";

    @Nullable
    AccessToken getAccessToken();

    @Nullable
    String getAuthorizationCode();

    @Nullable
    AccountKitError getError();

    @Nullable
    String getFinalAuthorizationState();

    long getTokenRefreshIntervalInSeconds();

    boolean wasCancelled();
}
