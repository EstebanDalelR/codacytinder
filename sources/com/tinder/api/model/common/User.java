package com.tinder.api.model.common;

import com.squareup.moshi.C5987p;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.tinder.api.model.common.AutoValue_User_Location.MoshiJsonAdapter;
import java.util.List;
import javax.annotation.Nullable;

public abstract class User {

    public static abstract class Location {
        @Nullable
        @Json(name = "id")
        public abstract String id();

        @Nullable
        @Json(name = "name")
        public abstract String name();

        public static JsonAdapter<Location> jsonAdapter(C5987p c5987p) {
            return new MoshiJsonAdapter(c5987p);
        }
    }

    @Nullable
    @Json(name = "active_time")
    public abstract String activeTime();

    @Nullable
    @Json(name = "age_filter_max")
    public abstract Integer ageFilterMax();

    @Nullable
    @Json(name = "age_filter_min")
    public abstract Integer ageFilterMin();

    @Nullable
    @Json(name = "api_token")
    public abstract String apiToken();

    @Nullable
    @Json(name = "badges")
    public abstract List<Badge> badges();

    @Nullable
    @Json(name = "bio")
    public abstract String bio();

    @Json(name = "birth_date")
    public abstract String birthDate();

    @Nullable
    public abstract String blend();

    @Nullable
    @Json(name = "common_connections")
    public abstract List<CommonConnection> commonConnections();

    @Nullable
    @Json(name = "common_interests")
    public abstract List<Interest> commonInterests();

    @Nullable
    @Json(name = "connection_count")
    public abstract Integer connectionCount();

    @Nullable
    @Json(name = "content_hash")
    public abstract String contentHash();

    @Nullable
    @Json(name = "create_date")
    public abstract String createDate();

    @Nullable
    @Json(name = "custom_gender")
    public abstract String customGender();

    @Nullable
    @Json(name = "deactivated")
    public abstract Boolean deactivated();

    @Nullable
    @Json(name = "discoverable")
    public abstract Boolean discoverable();

    @Nullable
    @Json(name = "discoverable_party")
    public abstract String discoverableParty();

    @Nullable
    @Json(name = "distance_filter")
    public abstract Integer distanceFilter();

    @Nullable
    @Json(name = "distance_mi")
    public abstract Integer distanceMi();

    @Nullable
    @Json(name = "full_name")
    public abstract String fulleName();

    @Nullable
    public abstract Integer gender();

    @Nullable
    @Json(name = "gender_filter")
    public abstract Integer genderFilter();

    @Nullable
    @Json(name = "hide_ads")
    public abstract Boolean hideAds();

    @Nullable
    @Json(name = "hide_age")
    public abstract Boolean hideAge();

    @Nullable
    @Json(name = "hide_distance")
    public abstract Boolean hideDistance();

    @Json(name = "_id")
    public abstract String id();

    @Nullable
    @Json(name = "instagram")
    public abstract Instagram instagram();

    @Nullable
    @Json(name = "interested_in")
    public abstract List<Integer> interestedIn();

    @Nullable
    @Json(name = "interests")
    public abstract List<Interest> interests();

    @Nullable
    @Json(name = "is_new_user")
    public abstract Boolean isNew();

    @Nullable
    @Json(name = "is_verified")
    public abstract Boolean isVerified();

    @Nullable
    @Json(name = "jobs")
    public abstract List<Job> jobs();

    @Nullable
    @Json(name = "location")
    public abstract Location location();

    @Nullable
    @Json(name = "location_name")
    public abstract String locationName();

    @Nullable
    @Json(name = "location_proximity")
    public abstract String locationProximity();

    @Nullable
    @Json(name = "name")
    public abstract String name();

    @Nullable
    @Json(name = "phone_id")
    public abstract String phoneNumber();

    @Nullable
    @Json(name = "photo_optimizer_enabled")
    public abstract Boolean photoOptimizerEnabled();

    @Nullable
    @Json(name = "photo_optimizer_has_result")
    public abstract Boolean photoOptimizerResult();

    @Nullable
    @Json(name = "photos")
    public abstract List<Photo> photos();

    @Nullable
    @Json(name = "photos_processing")
    public abstract Boolean photosProcessing();

    @Nullable
    @Json(name = "ping_time")
    public abstract String pingTime();

    @Nullable
    @Json(name = "schools")
    public abstract List<School> schools();

    @Nullable
    @Json(name = "show_gender_on_profile")
    public abstract Boolean showGenderOnProfile();

    @Nullable
    @Json(name = "spotify_anthem")
    public abstract Boolean spotifyAnthem();

    @Nullable
    @Json(name = "spotify_connected")
    public abstract Boolean spotifyConnected();

    @Nullable
    @Json(name = "spotify_theme_track")
    public abstract SpotifyThemeTrack spotifyThemeTrack();

    @Nullable
    @Json(name = "spotify_top_artists")
    public abstract List<SpotifyArtist> spotifyTopArtists();

    @Nullable
    @Json(name = "username")
    public abstract String username();

    public static JsonAdapter<User> jsonAdapter(C5987p c5987p) {
        return new AutoValue_User.MoshiJsonAdapter(c5987p);
    }
}
