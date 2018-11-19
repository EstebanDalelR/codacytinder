package com.tinder.profile.target;

public interface ProfileSpotifyAuthTarget {
    void finish();

    void finishWithResultCode();

    void showError();
}
