package com.tinder.spotify.target;

import android.content.ActivityNotFoundException;
import android.support.annotation.NonNull;
import com.tinder.spotify.model.SearchTrack;

public interface SpotifyThemeTrackTarget {
    void hideContainer();

    void prepareTrackForPlay(SearchTrack searchTrack);

    void setArtistName(String str);

    void setPlayFullSongTextOnPlayStart(String str);

    void setThemeTrackName(String str);

    void showMustFirstInstallSpotifyMessage();

    void startSpotifyActivity(@NonNull String str) throws ActivityNotFoundException;

    void startSpotifyInstallActivity();

    void stopTrack();
}
