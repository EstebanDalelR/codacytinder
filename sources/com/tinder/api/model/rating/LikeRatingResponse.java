package com.tinder.api.model.rating;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.tinder.api.annotation.JsonObjectOrFalse;
import com.tinder.api.model.common.ApiMatch;
import com.tinder.api.model.rating.AutoValue_LikeRatingResponse.MoshiJsonAdapter;

public abstract class LikeRatingResponse {
    @Nullable
    @Json(name = "likes_remaining")
    public abstract Integer likesRemaining();

    @Nullable
    @JsonObjectOrFalse
    public abstract ApiMatch match();

    @Nullable
    @Json(name = "rate_limited_until")
    public abstract Long rateLimitUntil();

    @NonNull
    public static JsonAdapter<LikeRatingResponse> jsonAdapter(@NonNull C5987p c5987p) {
        return new MoshiJsonAdapter(c5987p);
    }
}
