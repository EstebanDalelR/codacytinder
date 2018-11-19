package com.tinder.interfaces;

public interface InstagramLoginView {
    void hideProgress();

    void showInitialPhotosFetched(boolean z);

    void showInstagramAccountInUseError();

    void showInstagramConnectError();

    void showInstagramDisconnectDialog();

    void showInstagramDisconnectError();

    void showInstagramLoggedIn(String str);

    void showInstagramLoggedOut();

    void showInstagramLoginScreen();

    void showProgress();
}
