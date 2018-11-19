package com.tinder.spotify.target;

import android.support.annotation.StringRes;
import com.tinder.spotify.model.SearchTrack;

public interface SpotifyThemeSongTarget {
    void setThemeTrack(SearchTrack searchTrack);

    void toastError(@StringRes int i);
}
