package com.tinder.targets;

import com.tinder.domain.match.model.MessageAdMatch;

public interface CensorTarget {
    void notifyDeleteSponsoredMessageClick(MessageAdMatch messageAdMatch);

    void showErrorMuteNotifications();

    void showErrorUnMuteNotifications();

    void showGenericError();

    void showMuteSuccessful();

    void showReportDialog();

    void showReportFailure();

    void showReportSuccessful();

    void showUnMatchDialog();

    void showUnMatchFailure();

    void showUnMatchSuccessful();

    void showUnMuteSuccessful();

    void showUserHasSharingDisabledError();

    void startShareRecIntent(String str, String str2);
}
