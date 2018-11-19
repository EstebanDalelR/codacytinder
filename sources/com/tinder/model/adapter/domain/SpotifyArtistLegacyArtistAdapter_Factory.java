package com.tinder.model.adapter.domain;

import dagger.internal.Factory;
import javax.inject.Provider;

public final class SpotifyArtistLegacyArtistAdapter_Factory implements Factory<SpotifyArtistLegacyArtistAdapter> {
    private final Provider<SpotifyTrackSearchTrackAdapter> trackAdapterProvider;

    public SpotifyArtistLegacyArtistAdapter_Factory(Provider<SpotifyTrackSearchTrackAdapter> provider) {
        this.trackAdapterProvider = provider;
    }

    public SpotifyArtistLegacyArtistAdapter get() {
        return provideInstance(this.trackAdapterProvider);
    }

    public static SpotifyArtistLegacyArtistAdapter provideInstance(Provider<SpotifyTrackSearchTrackAdapter> provider) {
        return new SpotifyArtistLegacyArtistAdapter((SpotifyTrackSearchTrackAdapter) provider.get());
    }

    public static SpotifyArtistLegacyArtistAdapter_Factory create(Provider<SpotifyTrackSearchTrackAdapter> provider) {
        return new SpotifyArtistLegacyArtistAdapter_Factory(provider);
    }

    public static SpotifyArtistLegacyArtistAdapter newSpotifyArtistLegacyArtistAdapter(Object obj) {
        return new SpotifyArtistLegacyArtistAdapter((SpotifyTrackSearchTrackAdapter) obj);
    }
}
