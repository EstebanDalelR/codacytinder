package com.tinder.api.model.meta;

import android.support.annotation.Nullable;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.tinder.api.model.meta.AutoValue_SuperLikes.MoshiJsonAdapter;

public abstract class SuperLikes {
    @Json(name = "alc_remaining")
    public abstract Integer alcRemaining();

    @Json(name = "allotment")
    public abstract Integer allotment();

    @Json(name = "new_alc_remaining")
    public abstract Integer newAlcRemaining();

    @Nullable
    @Json(name = "superlike_refresh_amount")
    public abstract Integer refreshAmount();

    @Nullable
    @Json(name = "superlike_refresh_interval")
    public abstract Integer refreshInterval();

    @Nullable
    @Json(name = "superlike_refresh_interval_unit")
    public abstract String refreshIntervalUnit();

    @Json(name = "remaining")
    public abstract Integer remaining();

    @Nullable
    @Json(name = "resets_at")
    public abstract String resetsAt();

    public static JsonAdapter<SuperLikes> jsonAdapter(C5987p c5987p) {
        return new MoshiJsonAdapter(c5987p);
    }
}
