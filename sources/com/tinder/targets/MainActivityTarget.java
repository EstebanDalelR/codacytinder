package com.tinder.targets;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.StringRes;
import com.tinder.activities.ActivityEditProfile.EditProfileDestination;
import com.tinder.main.model.MainPage;
import com.tinder.paywall.paywallflow.C10076o;

public interface MainActivityTarget {
    void dismissPausedDialog();

    void dismissVerificationDialog();

    void goToChat(String str);

    void goToMyProfile();

    void hideProgressBar();

    void launchPaywall(C10076o c10076o);

    void openEditProfileActivity(EditProfileDestination editProfileDestination);

    void openIntent(Intent intent);

    void openSettingsActivity();

    void setupProfileAndMatchesTab();

    void showAccountKit();

    void showAccountPausedDialog();

    void showAppRatingDialog();

    void showBitmojiIntroDialog();

    void showBoostSummaryFromNotification();

    void showCrashApologyDialog();

    void showDiscoveryToolTip();

    void showPage(MainPage mainPage);

    void showSmsCollectionFaq(@NonNull String str);

    void showSmsVerificationErrorNotification();

    void showSmsVerificationSuccessNotification();

    void showSnackbar(@StringRes int i);

    void showTinderFlameNoSocial();

    void showTinderGoldIntro();

    void showTinderReactionsIntro();

    void showUpdateAccountEmailPasswordScreen();
}
