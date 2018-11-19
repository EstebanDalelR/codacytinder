package com.tinder.targets;

import com.facebook.accountkit.ui.AccountKitConfiguration;
import com.tinder.auth.model.AuthType;
import com.tinder.auth.model.C8292g;
import java8.util.Optional;

public interface LoginTarget {
    void dismissProgressDialog();

    boolean hasNetwork();

    void launchActivityMain();

    void launchFacebookAuth();

    void relaunchLoginActivity();

    void showAccountKitSMSValidation(AccountKitConfiguration accountKitConfiguration);

    void showCountDownActivity(int i);

    void showFbAuthFixesDialog();

    void showIntroFragment();

    void showLoginFailedDialog(Optional<Integer> optional);

    void showLoginFailure();

    void showLoginIsTween(boolean z);

    void showNetworkDialog();

    void showOnBoardingScreen(AuthType authType);

    void showOutdatedClientDialog();

    void showProgressDialog();

    void showSmsConfirmationScreen();

    void showVerificationNeeded(C8292g c8292g);
}
