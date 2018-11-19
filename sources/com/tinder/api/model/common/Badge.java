package com.tinder.api.model.common;

import android.support.annotation.Nullable;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.JsonAdapter;
import com.tinder.api.model.common.AutoValue_Badge.MoshiJsonAdapter;

public abstract class Badge {
    @Nullable
    public abstract String color();

    @Nullable
    public abstract String description();

    @Nullable
    public abstract String type();

    public static JsonAdapter<Badge> jsonAdapter(C5987p c5987p) {
        return new MoshiJsonAdapter(c5987p);
    }
}
