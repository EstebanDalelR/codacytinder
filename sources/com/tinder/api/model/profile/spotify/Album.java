package com.tinder.api.model.profile.spotify;

import android.support.annotation.Nullable;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.tinder.api.model.profile.spotify.AutoValue_Album.MoshiJsonAdapter;
import java.util.List;
import java.util.Map;

public abstract class Album {
    @Json(name = "id")
    public abstract String id();

    @Nullable
    @Json(name = "images")
    public abstract List<Map<String, String>> images();

    @Json(name = "name")
    public abstract String name();

    @Nullable
    @Json(name = "uri")
    public abstract String uri();

    public static JsonAdapter<Album> jsonAdapter(C5987p c5987p) {
        return new MoshiJsonAdapter(c5987p);
    }
}
