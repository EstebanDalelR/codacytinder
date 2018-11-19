package com.tinder.api.model.common;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.tinder.api.model.common.AutoValue_School.MoshiJsonAdapter;

public abstract class School {

    public static abstract class Builder {
        public abstract School build();

        public abstract Builder setDisplayed(@NonNull Boolean bool);

        public abstract Builder setId(@Nullable String str);

        public abstract Builder setName(@NonNull String str);
    }

    @Nullable
    @Json(name = "displayed")
    public abstract Boolean displayed();

    @Nullable
    @Json(name = "id")
    public abstract String id();

    @Nullable
    @Json(name = "name")
    public abstract String name();

    public static JsonAdapter<School> jsonAdapter(C5987p c5987p) {
        return new MoshiJsonAdapter(c5987p);
    }

    public static Builder builder() {
        return new Builder();
    }
}
