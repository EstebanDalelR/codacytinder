package com.tinder.api.model.common;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.tinder.api.model.common.AutoValue_ApiMatch_Person.MoshiJsonAdapter;
import java.util.List;

public abstract class ApiMatch {

    public static abstract class Person {
        @Nullable
        public abstract List<Badge> badges();

        @Nullable
        public abstract String bio();

        @Nullable
        @Json(name = "birth_date")
        public abstract String birthDate();

        @Nullable
        public abstract Integer gender();

        @Nullable
        @Json(name = "_id")
        public abstract String id();

        @Nullable
        public abstract String name();

        @Nullable
        public abstract List<Photo> photos();

        @Nullable
        @Json(name = "ping_time")
        public abstract String pingTime();

        @NonNull
        public static JsonAdapter<Person> jsonAdapter(C5987p c5987p) {
            return new MoshiJsonAdapter(c5987p);
        }
    }

    public static abstract class Place {
        @Nullable
        @Json(name = "id")
        public abstract String id();

        @Nullable
        @Json(name = "name")
        public abstract String name();

        @NonNull
        public static JsonAdapter<Place> jsonAdapter(C5987p c5987p) {
            return new AutoValue_ApiMatch_Place.MoshiJsonAdapter(c5987p);
        }
    }

    @Nullable
    public abstract String _id();

    @Nullable
    public abstract Boolean closed();

    @Nullable
    @Json(name = "common_friend_count")
    public abstract Integer commonFriendCount();

    @Nullable
    @Json(name = "common_like_count")
    public abstract Integer commonLikeCount();

    @Nullable
    @Json(name = "created_date")
    public abstract String createdDate();

    @Nullable
    public abstract Boolean following();

    @Nullable
    public abstract String id();

    @Nullable
    @Json(name = "is_boost_match")
    public abstract Boolean isBoostMatch();

    @Nullable
    @Json(name = "is_fast_match")
    public abstract Boolean isFastMatch();

    @Nullable
    @Json(name = "is_new_message")
    public abstract Boolean isNewMessage();

    @Nullable
    @Json(name = "is_place_match")
    public abstract Boolean isPlaceMatch();

    @Nullable
    @Json(name = "is_super_like")
    public abstract Boolean isSuperLike();

    @Nullable
    @Json(name = "is_top_pick")
    public abstract Boolean isTopPick();

    @Nullable
    @Json(name = "last_activity_date")
    public abstract String lastActivityDate();

    @Nullable
    @Json(name = "message_count")
    public abstract Integer messageCount();

    @Nullable
    public abstract List<ApiMessage> messages();

    @Nullable
    public abstract Boolean muted();

    @Nullable
    public abstract List<String> participants();

    @Nullable
    public abstract Boolean pending();

    @Nullable
    public abstract Person person();

    @Nullable
    public abstract Place place();

    @Nullable
    @Json(name = "seen")
    public abstract ApiSeenStatus seenStatus();

    @Nullable
    @Json(name = "super_liker")
    public abstract String superLiker();

    @Nullable
    @Json(name = "update_time")
    public abstract String updateTime();

    @NonNull
    public static JsonAdapter<ApiMatch> jsonAdapter(C5987p c5987p) {
        return new AutoValue_ApiMatch.MoshiJsonAdapter(c5987p);
    }
}
