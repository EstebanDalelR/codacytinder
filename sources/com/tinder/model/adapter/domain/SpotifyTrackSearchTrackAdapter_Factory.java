package com.tinder.model.adapter.domain;

import dagger.internal.Factory;
import javax.inject.Provider;

public final class SpotifyTrackSearchTrackAdapter_Factory implements Factory<SpotifyTrackSearchTrackAdapter> {
    private final Provider<ArtistAdapter> artistAdapterProvider;

    public SpotifyTrackSearchTrackAdapter_Factory(Provider<ArtistAdapter> provider) {
        this.artistAdapterProvider = provider;
    }

    public SpotifyTrackSearchTrackAdapter get() {
        return provideInstance(this.artistAdapterProvider);
    }

    public static SpotifyTrackSearchTrackAdapter provideInstance(Provider<ArtistAdapter> provider) {
        return new SpotifyTrackSearchTrackAdapter((ArtistAdapter) provider.get());
    }

    public static SpotifyTrackSearchTrackAdapter_Factory create(Provider<ArtistAdapter> provider) {
        return new SpotifyTrackSearchTrackAdapter_Factory(provider);
    }

    public static SpotifyTrackSearchTrackAdapter newSpotifyTrackSearchTrackAdapter(Object obj) {
        return new SpotifyTrackSearchTrackAdapter((ArtistAdapter) obj);
    }
}
