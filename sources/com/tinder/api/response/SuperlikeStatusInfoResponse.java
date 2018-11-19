package com.tinder.api.response;

import com.squareup.moshi.C5987p;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.tinder.api.model.meta.SuperLikes;
import com.tinder.api.response.AutoValue_SuperlikeStatusInfoResponse.MoshiJsonAdapter;

public abstract class SuperlikeStatusInfoResponse {
    @Json(name = "results")
    public abstract SuperLikes superLikeInfo();

    public static JsonAdapter<SuperlikeStatusInfoResponse> jsonAdapter(C5987p c5987p) {
        return new MoshiJsonAdapter(c5987p);
    }
}
