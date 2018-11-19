package com.tinder.profile.target;

public interface BasicInfoShareRecTarget {
    void setShareComplete();

    void setShareInProgress();

    void showGenericError();

    void showUserHasSharingDisabledError();

    void startShareRecIntent(String str, String str2);
}
