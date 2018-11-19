package com.tinder.api.model.rating;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.tinder.api.annotation.JsonObjectOrFalse;
import com.tinder.api.model.common.ApiMatch;
import com.tinder.api.model.meta.SuperLikes;
import com.tinder.api.model.rating.AutoValue_SuperLikeRatingResponse.MoshiJsonAdapter;

public abstract class SuperLikeRatingResponse {
    @Nullable
    @Json(name = "limit_exceeded")
    public abstract Boolean limitExceeded();

    @Nullable
    @JsonObjectOrFalse
    public abstract ApiMatch match();

    @Nullable
    public abstract Integer status();

    @Nullable
    @Json(name = "super_likes")
    public abstract SuperLikes superLikes();

    @NonNull
    public static JsonAdapter<SuperLikeRatingResponse> jsonAdapter(@NonNull C5987p c5987p) {
        return new MoshiJsonAdapter(c5987p);
    }
}
