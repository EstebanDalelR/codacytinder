package com.tinder.settings.targets;

import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import com.tinder.paywall.paywallflow.C10076o;

public interface SettingsTarget {
    void createShareWebProfileIntent(String str);

    void hideBoostAlc();

    void hideDeleteButton();

    void hideGetPlus();

    void hideGroupsViews();

    void hideProgressDialog();

    void hideSettingsPurchaseView();

    void hideSuperlikeAlc();

    void launchActivityExitSurvey();

    void launchActivityPassport();

    void launchMyWebProfile(String str);

    void launchPaywallFlow(C10076o c10076o);

    void navigateToPlacesSettings();

    void onAccountDeleteFailed();

    void onAccountDeleted();

    void onDiscoveryPrefUpdateFailed();

    void onDiscoveryPrefsUpdated();

    void onProfileUpdateFailed();

    void onProfileUpdated();

    void setDeleteButtonText(@StringRes int i);

    void showBoostAlc();

    void showEmailSettings();

    void showFAQScreen(@Nullable String str);

    void showGetPlus();

    void showGroupsViews();

    void showNetworkFailureMessage();

    void showPlacesOptions(Boolean bool);

    void showPlusOffer(@StringRes int i);

    void showProgressDialog();

    void showRatingView(int i);

    void showRestoreFailureMessage(@StringRes int i, String str);

    void showRestoreInProgressMessage();

    void showRestoreSuccessMessage(@StringRes int i);

    void showSettingsPurchaseView();

    void showSuperlikeAlc();

    void showWebProfileUsername(String str);

    void showWebProfileUsernameUnavailable();
}
