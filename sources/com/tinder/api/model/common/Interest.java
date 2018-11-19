package com.tinder.api.model.common;

import android.support.annotation.Nullable;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.tinder.api.model.common.AutoValue_Interest.MoshiJsonAdapter;

public abstract class Interest {
    @Nullable
    @Json(name = "created_time")
    public abstract String createdTime();

    @Nullable
    public abstract String id();

    @Nullable
    public abstract String name();

    public static JsonAdapter<Interest> jsonAdapter(C5987p c5987p) {
        return new MoshiJsonAdapter(c5987p);
    }
}
