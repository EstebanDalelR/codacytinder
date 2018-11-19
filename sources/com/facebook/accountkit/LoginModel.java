package com.facebook.accountkit;

import android.os.Parcelable;
import android.support.annotation.Nullable;

public interface LoginModel extends Parcelable {
    @Nullable
    AccessToken getAccessToken();

    @Nullable
    String getCode();

    @Nullable
    String getFinalAuthState();

    @Nullable
    String getPrivacyPolicy();

    @Nullable
    String getTermsOfService();
}
