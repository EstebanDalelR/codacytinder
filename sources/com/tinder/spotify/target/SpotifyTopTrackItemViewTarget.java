package com.tinder.spotify.target;

import android.content.ActivityNotFoundException;
import android.support.annotation.NonNull;

public interface SpotifyTopTrackItemViewTarget {
    void showMustFirstInstallSpotifyMessage();

    void startSpotifyActivity(@NonNull String str) throws ActivityNotFoundException;

    void startSpotifyInstallActivity();

    void stopTrack();
}
