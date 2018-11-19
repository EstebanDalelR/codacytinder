package com.tinder.spotify.target;

import android.support.annotation.StringRes;
import com.tinder.spotify.model.SearchTrack;
import java.util.List;

public interface SpotifyTrackSearchTarget {
    void addTracks(List<SearchTrack> list);

    void closeView();

    void showSearchError();

    void toastError(@StringRes int i);
}
