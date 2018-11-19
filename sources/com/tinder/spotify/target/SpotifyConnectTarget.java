package com.tinder.spotify.target;

import com.tinder.spotify.model.Artist;
import java.util.List;

public interface SpotifyConnectTarget {
    void initView(boolean z);

    void onConnectFinished(List<Artist> list, boolean z);

    void setTopArtists(List<Artist> list);
}
