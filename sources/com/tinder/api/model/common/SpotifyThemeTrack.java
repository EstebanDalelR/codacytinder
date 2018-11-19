package com.tinder.api.model.common;

import android.support.annotation.Nullable;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.tinder.api.model.common.AutoValue_SpotifyThemeTrack_Album.MoshiJsonAdapter;
import java.util.List;

public abstract class SpotifyThemeTrack {

    public static abstract class Album {
        @Nullable
        public abstract String id();

        @Nullable
        public abstract List<Image> images();

        @Nullable
        public abstract String name();

        public static JsonAdapter<Album> jsonAdapter(C5987p c5987p) {
            return new MoshiJsonAdapter(c5987p);
        }
    }

    public static abstract class Artist {
        @Nullable
        public abstract String id();

        @Nullable
        public abstract String name();

        public static JsonAdapter<Artist> jsonAdapter(C5987p c5987p) {
            return new AutoValue_SpotifyThemeTrack_Artist.MoshiJsonAdapter(c5987p);
        }
    }

    public static abstract class Image {
        @Nullable
        public abstract Integer height();

        @Nullable
        public abstract String url();

        @Nullable
        public abstract Integer width();

        public static JsonAdapter<Image> jsonAdapter(C5987p c5987p) {
            return new AutoValue_SpotifyThemeTrack_Image.MoshiJsonAdapter(c5987p);
        }
    }

    @Nullable
    public abstract Album album();

    @Nullable
    public abstract List<Artist> artists();

    @Nullable
    public abstract String id();

    @Nullable
    @Json(name = "is_playable")
    public abstract Boolean isPlayable();

    @Nullable
    public abstract String name();

    @Nullable
    public abstract Integer popularity();

    @Nullable
    @Json(name = "preview_url")
    public abstract String previewUrl();

    @Nullable
    public abstract String uri();

    public static JsonAdapter<SpotifyThemeTrack> jsonAdapter(C5987p c5987p) {
        return new AutoValue_SpotifyThemeTrack.MoshiJsonAdapter(c5987p);
    }
}
