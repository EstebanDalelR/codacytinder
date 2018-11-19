package com.tinder.auth.target;

import android.support.annotation.ColorRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.text.method.MovementMethod;
import com.facebook.accountkit.ui.AccountKitConfiguration;
import com.facebook.login.LoginBehavior;
import com.tinder.smsauth.sdk.C14987c;

public interface LoginButtonGroupTarget {
    void hideDisclaimerText();

    void launchAccountKitLoginScreen(AccountKitConfiguration accountKitConfiguration);

    void launchFBLoginScreen();

    void launchSMSAuthLoginScreen(C14987c c14987c);

    void launchWebView(@StringRes int i);

    void setAuthDisclaimerText(@StringRes int i, @Nullable MovementMethod movementMethod, @ColorRes int i2);

    void setUpFBLoginButton(@NonNull String[] strArr, @NonNull LoginBehavior loginBehavior);

    void showFBDisclaimerContent();
}
