package com.tinder.profile.target;

public interface ProfileInstagramAuthTarget {
    void finish();

    void finishWithResultCode();

    void showInitialPhotosFetched(boolean z);

    void showInstagramAccountInUseError();

    void showInstagramConnectError();

    void showInstagramLoginScreen();
}
