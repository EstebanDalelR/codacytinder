package com.tinder.model.adapter.domain;

import android.support.annotation.Nullable;
import com.tinder.data.adapter.C2645i;
import com.tinder.domain.common.model.SpotifyTrack;
import com.tinder.domain.common.model.SpotifyTrack.Artist;
import com.tinder.spotify.model.SearchTrack;
import javax.inject.Inject;

class SpotifyTrackSearchTrackAdapter extends C2645i<SpotifyTrack, SearchTrack> {
    private final ArtistAdapter artistAdapter;

    static class ArtistAdapter extends C2645i<Artist, com.tinder.spotify.model.Artist> {
        @Inject
        ArtistAdapter() {
        }

        @Nullable
        public Artist adapt(com.tinder.spotify.model.Artist artist) {
            return Artist.builder().name(artist.getName()).id(artist.getId()).build();
        }
    }

    @Inject
    SpotifyTrackSearchTrackAdapter(ArtistAdapter artistAdapter) {
        this.artistAdapter = artistAdapter;
    }

    @Nullable
    public SpotifyTrack adapt(SearchTrack searchTrack) {
        return SpotifyTrack.builder().name(searchTrack.getName()).id(searchTrack.getId()).artists(this.artistAdapter.adapt(searchTrack.getArtist())).isPlayable(true).popularity(searchTrack.getPopularity()).previewUrl(searchTrack.getPreviewUrl()).uri(searchTrack.getSpotifyUri()).artworkUrl(null).build();
    }
}
