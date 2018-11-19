package com.tinder.spotify.target;

import android.support.annotation.StringRes;
import com.tinder.spotify.model.Artist;
import java.util.List;

public interface SpotifyPickArtistsTarget {
    void onPause();

    void setLastUpdateAt(String str);

    void setTrackList(List<Artist> list);

    void showErrorMessage(@StringRes int i);
}
