package com.tinder.api.model.profile;

import android.support.annotation.Nullable;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.tinder.api.model.profile.AutoValue_ProfileBoost.MoshiJsonAdapter;

public abstract class ProfileBoost {
    @Nullable
    @Json(name = "allotment")
    public abstract Integer allotment();

    @Nullable
    @Json(name = "allotment_remaining")
    public abstract Integer allotmentRemaining();

    @Nullable
    @Json(name = "allotment_used")
    public abstract Integer allotmentUsed();

    @Nullable
    @Json(name = "boost_id")
    public abstract String boostId();

    @Nullable
    @Json(name = "duration")
    public abstract Long duration();

    @Nullable
    @Json(name = "expires_at")
    public abstract Long expiredAt();

    @Nullable
    @Json(name = "internal_remaining")
    public abstract Integer internalRemaining();

    @Nullable
    @Json(name = "multiplier")
    public abstract Double multiplier();

    @Nullable
    @Json(name = "purchased_remaining")
    public abstract Integer purchasedRemaining();

    @Nullable
    @Json(name = "boost_refresh_amount")
    public abstract Integer refreshAmount();

    @Nullable
    @Json(name = "boost_refresh_interval")
    public abstract Integer refreshInterval();

    @Nullable
    @Json(name = "boost_refresh_interval_unit")
    public abstract String refreshIntervalUnit();

    @Nullable
    @Json(name = "remaining")
    public abstract Integer remaining();

    @Nullable
    @Json(name = "resets_at")
    public abstract Long resetAt();

    public static JsonAdapter<ProfileBoost> jsonAdapter(C5987p c5987p) {
        return new MoshiJsonAdapter(c5987p);
    }
}
