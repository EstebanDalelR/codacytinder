package com.tinder.targets;

import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import com.tinder.goingout.model.GoingOut;
import com.tinder.listeners.OnUnMatchReasonSelectedListener;

public interface ViewProfileTarget {
    void closeScreen();

    void hideGoingOutFeatures();

    void hideGoingOutViewOnError();

    void hideSpotifyFeatures();

    void showGoingOutFeaturesV1(@Nullable GoingOut goingOut, @Nullable String str, @Nullable String str2);

    void showGoingOutFeaturesV2(@Nullable GoingOut goingOut, @Nullable String str, @Nullable String str2);

    void showReportConfirmationDialog();

    void showReportFailedDialog();

    void showSpotifyFeatures();

    void showToast(@StringRes int i);

    void showUnMatchDialog(OnUnMatchReasonSelectedListener onUnMatchReasonSelectedListener);

    void stopPlayingSpotify();
}
