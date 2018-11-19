package com.tinder.api.model.updates;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.tinder.api.model.common.ApiMatch;
import com.tinder.api.model.updates.AutoValue_Updates_Boost.MoshiJsonAdapter;
import java.util.List;

public abstract class Updates {

    public static abstract class Boost {
        @Nullable
        @Json(name = "boost_cursor")
        public abstract String boostCursor();

        @Nullable
        public abstract List<String> profiles();

        @NonNull
        public static JsonAdapter<Boost> jsonAdapter(C5987p c5987p) {
            return new MoshiJsonAdapter(c5987p);
        }
    }

    public static abstract class LikedMessage {
        @Nullable
        @Json(name = "is_liked")
        public abstract Boolean isLiked();

        @Nullable
        @Json(name = "liker_id")
        public abstract String likerId();

        @Nullable
        @Json(name = "match_id")
        public abstract String matchId();

        @Nullable
        @Json(name = "message_id")
        public abstract String messageId();

        @Nullable
        @Json(name = "updated_at")
        public abstract String updatedAt();

        @NonNull
        public static JsonAdapter<LikedMessage> jsonAdapter(C5987p c5987p) {
            return new AutoValue_Updates_LikedMessage.MoshiJsonAdapter(c5987p);
        }
    }

    public static abstract class Places {
        @Nullable
        @Json(name = "has_new")
        public abstract Boolean hasNew();

        @NonNull
        public static JsonAdapter<Places> jsonAdapter(C5987p c5987p) {
            return new AutoValue_Updates_Places.MoshiJsonAdapter(c5987p);
        }
    }

    public static abstract class PollInterval {
        @Nullable
        @Json(name = "persistent")
        public abstract Long persistent();

        @Nullable
        @Json(name = "standard")
        public abstract Long standard();

        @NonNull
        public static JsonAdapter<PollInterval> jsonAdapter(C5987p c5987p) {
            return new AutoValue_Updates_PollInterval.MoshiJsonAdapter(c5987p);
        }
    }

    @Nullable
    public abstract List<String> blocks();

    @Nullable
    public abstract Boost boost();

    @Nullable
    @Json(name = "last_activity_date")
    public abstract String lastActivityDate();

    @Nullable
    @Json(name = "liked_messages")
    public abstract List<LikedMessage> likedMessages();

    @Nullable
    public abstract List<ApiMatch> matches();

    @Nullable
    public abstract Places places();

    @Nullable
    @Json(name = "poll_interval")
    public abstract PollInterval pollInterval();

    @NonNull
    public static JsonAdapter<Updates> jsonAdapter(C5987p c5987p) {
        return new AutoValue_Updates.MoshiJsonAdapter(c5987p);
    }
}
