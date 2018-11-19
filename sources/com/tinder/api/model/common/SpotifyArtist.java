package com.tinder.api.model.common;

import android.support.annotation.Nullable;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.tinder.api.model.common.AutoValue_SpotifyArtist.MoshiJsonAdapter;

public abstract class SpotifyArtist {
    @Nullable
    public abstract String id();

    @Nullable
    public abstract String name();

    @Nullable
    public abstract Boolean selected();

    @Nullable
    @Json(name = "top_track")
    public abstract SpotifyThemeTrack topTrack();

    public static JsonAdapter<SpotifyArtist> jsonAdapter(C5987p c5987p) {
        return new MoshiJsonAdapter(c5987p);
    }
}
