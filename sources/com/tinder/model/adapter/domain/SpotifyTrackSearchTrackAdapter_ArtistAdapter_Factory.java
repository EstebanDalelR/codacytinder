package com.tinder.model.adapter.domain;

import dagger.internal.Factory;

public final class SpotifyTrackSearchTrackAdapter_ArtistAdapter_Factory implements Factory<ArtistAdapter> {
    private static final SpotifyTrackSearchTrackAdapter_ArtistAdapter_Factory INSTANCE = new SpotifyTrackSearchTrackAdapter_ArtistAdapter_Factory();

    public ArtistAdapter get() {
        return provideInstance();
    }

    public static ArtistAdapter provideInstance() {
        return new ArtistAdapter();
    }

    public static SpotifyTrackSearchTrackAdapter_ArtistAdapter_Factory create() {
        return INSTANCE;
    }

    public static ArtistAdapter newArtistAdapter() {
        return new ArtistAdapter();
    }
}
