package com.tinder.api.response;

import com.squareup.moshi.C5987p;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.tinder.api.model.common.TinderSelect;
import com.tinder.api.response.AutoValue_TinderSelectResponse.MoshiJsonAdapter;
import com.tinder.api.response.v2.ResponseError;
import javax.annotation.Nullable;

public abstract class TinderSelectResponse {
    @Nullable
    @Json(name = "error")
    public abstract ResponseError error();

    @Nullable
    @Json(name = "data")
    public abstract TinderSelect tinderSelect();

    public static JsonAdapter<TinderSelectResponse> jsonAdapter(C5987p c5987p) {
        return new MoshiJsonAdapter(c5987p);
    }
}
