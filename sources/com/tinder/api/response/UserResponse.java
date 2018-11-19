package com.tinder.api.response;

import android.support.annotation.Nullable;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.tinder.api.model.common.User;
import com.tinder.api.response.AutoValue_UserResponse.MoshiJsonAdapter;

public abstract class UserResponse {
    @Json(name = "results")
    public abstract User getUser();

    @Nullable
    public abstract Integer status();

    public static JsonAdapter<UserResponse> jsonAdapter(C5987p c5987p) {
        return new MoshiJsonAdapter(c5987p);
    }
}
