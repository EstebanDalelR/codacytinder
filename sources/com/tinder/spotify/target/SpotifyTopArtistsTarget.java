package com.tinder.spotify.target;

import android.support.annotation.StringRes;
import com.tinder.spotify.p417c.C15047a;
import java.util.List;

public interface SpotifyTopArtistsTarget {
    void hide();

    void showTopTracks(List<C15047a> list);

    void spotifyConnectClicked(@StringRes int i);

    void updateConnectSpotifyVisibility(boolean z);
}
