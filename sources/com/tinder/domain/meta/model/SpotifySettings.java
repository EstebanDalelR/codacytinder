package com.tinder.domain.meta.model;

import android.support.annotation.Nullable;
import com.tinder.domain.common.model.SpotifyArtist;
import com.tinder.domain.common.model.SpotifyTrack;
import java.util.List;
import org.joda.time.DateTime;

public abstract class SpotifySettings {

    public static abstract class Builder {
        public abstract SpotifySettings build();

        abstract Builder isConnected(boolean z);

        abstract Builder lastUpdated(DateTime dateTime);

        abstract Builder themeTrack(SpotifyTrack spotifyTrack);

        abstract Builder topArtists(List<SpotifyArtist> list);

        abstract Builder userType(UserType userType);

        abstract Builder username(String str);
    }

    public enum UserType {
        PREMIUM,
        FREE,
        OPEN,
        OTHER
    }

    abstract boolean isConnected();

    @Nullable
    abstract DateTime lastUpdated();

    @Nullable
    abstract SpotifyTrack themeTrack();

    @Nullable
    abstract List<SpotifyArtist> topArtists();

    @Nullable
    abstract UserType userType();

    @Nullable
    abstract String username();

    public static Builder builder() {
        return new Builder();
    }
}
