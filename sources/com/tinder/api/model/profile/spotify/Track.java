package com.tinder.api.model.profile.spotify;

import android.support.annotation.Nullable;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.tinder.api.model.profile.spotify.AutoValue_Track.MoshiJsonAdapter;
import java.util.List;

public abstract class Track {
    @Json(name = "album")
    public abstract Album album();

    @Json(name = "artists")
    public abstract List<Artist> artists();

    @Json(name = "id")
    public abstract String id();

    @Nullable
    @Json(name = "is_playable")
    public abstract Boolean isPlayable();

    @Json(name = "name")
    public abstract String name();

    @Nullable
    @Json(name = "popularity")
    public abstract Integer popularity();

    @Json(name = "preview_url")
    public abstract String previewUrl();

    @Nullable
    @Json(name = "uri")
    public abstract String spotifyUri();

    public static JsonAdapter<Track> jsonAdapter(C5987p c5987p) {
        return new MoshiJsonAdapter(c5987p);
    }
}
