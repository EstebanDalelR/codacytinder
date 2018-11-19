package com.tinder.model.adapter.domain;

import android.support.annotation.Nullable;
import com.tinder.data.adapter.C2645i;
import com.tinder.domain.common.model.SpotifyArtist;
import com.tinder.domain.common.model.SpotifyArtist.Builder;
import com.tinder.spotify.model.Artist;
import com.tinder.spotify.model.SearchTrack;
import javax.inject.Inject;

class SpotifyArtistLegacyArtistAdapter extends C2645i<SpotifyArtist, Artist> {
    private final SpotifyTrackSearchTrackAdapter trackAdapter;

    @Inject
    SpotifyArtistLegacyArtistAdapter(SpotifyTrackSearchTrackAdapter spotifyTrackSearchTrackAdapter) {
        this.trackAdapter = spotifyTrackSearchTrackAdapter;
    }

    @Nullable
    public SpotifyArtist adapt(Artist artist) {
        Builder selected = SpotifyArtist.builder().name(artist.getName()).id(artist.getId()).selected(artist.isSelected());
        SearchTrack topTrack = artist.getTopTrack();
        if (topTrack != null) {
            selected.topTrack(this.trackAdapter.adapt(topTrack));
        }
        return selected.build();
    }
}
