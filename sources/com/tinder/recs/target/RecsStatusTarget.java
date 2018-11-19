package com.tinder.recs.target;

import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import com.tinder.paywall.paywallflow.C10076o;

public interface RecsStatusTarget {
    void clearMessage();

    void hide();

    void hideRadarAnimation();

    void hideSettingsButton();

    void launchPaywallFlow(C10076o c10076o);

    void navigateToSettings();

    void showMessage(String str);

    void showPassportEnableView();

    void showPhotoUrl(@NonNull String str);

    void showPlaceholderImage(@DrawableRes int i);

    void showRadarAnimation(@DrawableRes int i);

    void showSettingsDialog();

    void showSettingsEnableView();

    void showStatusViewWithNoAnimation();

    void showViewWithAnimation(@DrawableRes int i);
}
