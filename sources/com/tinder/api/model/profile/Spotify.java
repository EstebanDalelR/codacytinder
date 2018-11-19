package com.tinder.api.model.profile;

import android.support.annotation.Nullable;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.tinder.api.model.profile.AutoValue_Spotify.MoshiJsonAdapter;
import com.tinder.api.model.profile.spotify.Artist;
import com.tinder.api.model.profile.spotify.Track;
import java.util.List;

public abstract class Spotify {
    @Nullable
    @Json(name = "spotify_connected")
    public abstract Boolean isConnected();

    @Nullable
    @Json(name = "spotify_last_updated_at")
    public abstract String lastUpdatedAt();

    @Nullable
    @Json(name = "spotify_theme_track")
    public abstract Track themeTrack();

    @Nullable
    @Json(name = "spotify_top_artists")
    public abstract List<Artist> topArtists();

    @Nullable
    @Json(name = "spotify_username")
    public abstract String userName();

    @Nullable
    @Json(name = "spotify_user_type")
    public abstract String userType();

    public static JsonAdapter<Spotify> jsonAdapter(C5987p c5987p) {
        return new MoshiJsonAdapter(c5987p);
    }
}
