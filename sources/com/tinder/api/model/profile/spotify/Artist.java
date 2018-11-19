package com.tinder.api.model.profile.spotify;

import android.support.annotation.Nullable;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.tinder.api.model.profile.spotify.AutoValue_Artist.MoshiJsonAdapter;

public abstract class Artist {
    @Json(name = "id")
    public abstract String id();

    @Nullable
    @Json(name = "selected")
    public abstract Boolean isSelected();

    @Json(name = "name")
    public abstract String name();

    @Nullable
    @Json(name = "top_track")
    public abstract Track topTrack();

    public static JsonAdapter<Artist> jsonAdapter(C5987p c5987p) {
        return new MoshiJsonAdapter(c5987p);
    }
}
