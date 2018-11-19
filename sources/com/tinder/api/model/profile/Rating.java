package com.tinder.api.model.profile;

import android.support.annotation.Nullable;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.tinder.api.model.meta.SuperLikes;
import com.tinder.api.model.profile.AutoValue_Rating.MoshiJsonAdapter;

public abstract class Rating {
    @Json(name = "likes_remaining")
    public abstract int likesRemaining();

    @Json(name = "rate_limited_until")
    public abstract long rateLimitUntil();

    @Nullable
    @Json(name = "super_likes")
    public abstract SuperLikes superLikes();

    public static JsonAdapter<Rating> jsonAdapter(C5987p c5987p) {
        return new MoshiJsonAdapter(c5987p);
    }
}
