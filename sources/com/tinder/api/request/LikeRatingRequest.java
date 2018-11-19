package com.tinder.api.request;

import android.support.annotation.Nullable;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.tinder.api.request.AutoValue_LikeRatingRequest.MoshiJsonAdapter;

public abstract class LikeRatingRequest {

    public static abstract class Builder {
        public abstract LikeRatingRequest build();

        public abstract Builder contentHash(String str);

        public abstract Builder didRecUserSuperlike(Integer num);

        public abstract Builder isCurrentUserBoosting(Boolean bool);

        public abstract Builder isCurrentUserPassporting(Boolean bool);

        public abstract Builder isFastMatch(Integer num);

        public abstract Builder isTopPicks(Integer num);

        public abstract Builder isUndo(Integer num);

        public abstract Builder photoId(String str);

        public abstract Builder placeId(String str);

        public abstract Builder sNumber(Long l);

        public abstract Builder wasRecUserPassporting(Boolean bool);
    }

    @Nullable
    @Json(name = "content_hash")
    public abstract String contentHash();

    @Nullable
    @Json(name = "super")
    public abstract Integer didRecUserSuperlike();

    @Nullable
    @Json(name = "is_boosting")
    public abstract Boolean isCurrentUserBoosting();

    @Nullable
    @Json(name = "rec_traveling")
    public abstract Boolean isCurrentUserPassporting();

    @Nullable
    @Json(name = "fast_match")
    public abstract Integer isFastMatch();

    @Nullable
    @Json(name = "top_picks")
    public abstract Integer isTopPicks();

    @Nullable
    @Json(name = "undo")
    public abstract Integer isUndo();

    @Nullable
    public abstract String photoId();

    @Nullable
    @Json(name = "place_id")
    public abstract String placeId();

    @Nullable
    @Json(name = "s_number")
    public abstract Long sNumber();

    @Nullable
    @Json(name = "user_traveling")
    public abstract Boolean wasRecUserPassporting();

    public static JsonAdapter<LikeRatingRequest> jsonAdapter(C5987p c5987p) {
        return new MoshiJsonAdapter(c5987p);
    }

    public static Builder builder() {
        return new Builder();
    }
}
