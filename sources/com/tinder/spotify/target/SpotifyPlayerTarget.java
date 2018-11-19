package com.tinder.spotify.target;

import android.support.annotation.StringRes;
import com.tinder.spotify.model.SearchTrack;

public interface SpotifyPlayerTarget {
    void notifyPlayButtonClicked();

    void notifyStopButtonClicked();

    void showLoading(SearchTrack searchTrack);

    void showPlaying(SearchTrack searchTrack);

    void showProgressChanged(float f);

    void showStopped(SearchTrack searchTrack);

    void toastError(@StringRes int i);
}
