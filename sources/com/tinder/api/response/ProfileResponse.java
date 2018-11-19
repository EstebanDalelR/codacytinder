package com.tinder.api.response;

import android.support.annotation.Nullable;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.tinder.api.model.common.TinderSelect;
import com.tinder.api.model.profile.ProfileBoost;
import com.tinder.api.model.profile.Spotify;
import com.tinder.api.response.AutoValue_ProfileResponse_ResponseData.MoshiJsonAdapter;

public abstract class ProfileResponse {

    public static abstract class ResponseData {
        @Nullable
        @Json(name = "boost")
        public abstract ProfileBoost boost();

        @Nullable
        @Json(name = "spotify")
        public abstract Spotify spotify();

        @Nullable
        @Json(name = "select")
        public abstract TinderSelect tinderSelect();

        public static JsonAdapter<ResponseData> jsonAdapter(C5987p c5987p) {
            return new MoshiJsonAdapter(c5987p);
        }
    }

    @Json(name = "data")
    public abstract ResponseData responseData();

    public static JsonAdapter<ProfileResponse> jsonAdapter(C5987p c5987p) {
        return new AutoValue_ProfileResponse.MoshiJsonAdapter(c5987p);
    }
}
