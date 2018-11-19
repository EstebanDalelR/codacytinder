package com.tinder.api.model.recs;

import android.support.annotation.Nullable;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.tinder.api.model.common.Badge;
import com.tinder.api.model.common.Instagram;
import com.tinder.api.model.common.Job;
import com.tinder.api.model.common.Photo;
import com.tinder.api.model.common.School;
import com.tinder.api.model.common.SpotifyArtist;
import com.tinder.api.model.common.SpotifyThemeTrack;
import com.tinder.api.model.common.Teaser;
import com.tinder.api.model.profile.Facebook;
import com.tinder.api.model.recs.AutoValue_Rec_Spotify.MoshiJsonAdapter;
import com.tinder.api.model.toppicks.Tagging;
import java.util.List;

public abstract class Rec {

    public static abstract class Spotify {
        @Nullable
        @Json(name = "spotify_connected")
        public abstract Boolean isSpotifyConnected();

        @Nullable
        @Json(name = "spotify_theme_track")
        public abstract SpotifyThemeTrack spotifyThemeTrack();

        @Nullable
        @Json(name = "spotify_top_artists")
        public abstract List<SpotifyArtist> spotifyTopArtists();

        public static JsonAdapter<Spotify> jsonAdapter(C5987p c5987p) {
            return new MoshiJsonAdapter(c5987p);
        }
    }

    public static abstract class User {
        @Nullable
        public abstract List<Badge> badges();

        @Nullable
        public abstract String bio();

        @Nullable
        @Json(name = "birth_date")
        public abstract String birthDate();

        @Nullable
        @Json(name = "custom_gender")
        public abstract String customGender();

        @Nullable
        public abstract Integer gender();

        @Nullable
        @Json(name = "hide_age")
        public abstract Boolean hideAge();

        @Nullable
        @Json(name = "hide_distance")
        public abstract Boolean hideDistance();

        @Nullable
        @Json(name = "_id")
        public abstract String id();

        @Nullable
        @Json(name = "is_brand")
        public abstract Boolean isBrand();

        @Nullable
        @Json(name = "is_traveling")
        public abstract Boolean isTraveling();

        @Nullable
        @Json(name = "is_verified")
        public abstract Boolean isVerified();

        @Nullable
        public abstract List<Job> jobs();

        @Nullable
        public abstract String name();

        @Nullable
        public abstract List<Photo> photos();

        @Nullable
        public abstract List<School> schools();

        @Nullable
        @Json(name = "select_member")
        public abstract Boolean selectMember();

        @Nullable
        @Json(name = "show_gender_on_profile")
        public abstract Boolean showGenderOnProfile();

        public static JsonAdapter<User> jsonAdapter(C5987p c5987p) {
            return new AutoValue_Rec_User.MoshiJsonAdapter(c5987p);
        }
    }

    @Nullable
    @Json(name = "content_hash")
    public abstract String contentHash();

    @Nullable
    @Json(name = "distance_mi")
    public abstract Integer distanceMi();

    @Nullable
    @Json(name = "expire_time")
    public abstract Long expirationTime();

    @Nullable
    public abstract Facebook facebook();

    @Nullable
    public abstract Instagram instagram();

    @Nullable
    @Json(name = "already_matched")
    public abstract Boolean isAlreadyMatched();

    @Nullable
    @Json(name = "is_boost")
    public abstract Boolean isBoost();

    @Nullable
    @Json(name = "is_fast_match")
    public abstract Boolean isFastMatch();

    @Nullable
    @Json(name = "group_matched")
    public abstract Boolean isGroupMatched();

    @Nullable
    @Json(name = "is_new")
    public abstract Boolean isNew();

    @Nullable
    @Json(name = "is_super_like")
    public abstract Boolean isSuperLike();

    @Nullable
    @Json(name = "is_top_pick")
    public abstract Boolean isTopPick();

    @Nullable
    @Json(name = "s_number")
    public abstract Long sNumber();

    @Nullable
    public abstract Spotify spotify();

    @Nullable
    @Json(name = "tagging")
    public abstract Tagging tagging();

    @Nullable
    public abstract List<Teaser> teasers();

    @Nullable
    @Json(name = "tp_type")
    public abstract Integer topPickType();

    @Nullable
    public abstract String type();

    @Nullable
    public abstract User user();

    public static JsonAdapter<Rec> jsonAdapter(C5987p c5987p) {
        return new AutoValue_Rec.MoshiJsonAdapter(c5987p);
    }
}
