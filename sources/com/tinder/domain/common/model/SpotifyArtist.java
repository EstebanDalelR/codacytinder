package com.tinder.domain.common.model;

import android.support.annotation.Nullable;

public abstract class SpotifyArtist {

    public static abstract class Builder {
        public abstract SpotifyArtist build();

        public abstract Builder id(String str);

        public abstract Builder name(String str);

        public abstract Builder selected(boolean z);

        public abstract Builder topTrack(SpotifyTrack spotifyTrack);
    }

    public abstract String id();

    public abstract String name();

    public abstract boolean selected();

    @Nullable
    public abstract SpotifyTrack topTrack();

    public static Builder builder() {
        return new Builder();
    }
}
