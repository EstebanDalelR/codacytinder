package com.tinder.api.model.location;

import android.support.annotation.Nullable;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.tinder.api.model.location.AutoValue_Location.MoshiJsonAdapter;

public abstract class Location {
    @Nullable
    @Json(name = "administrative_area_level_1")
    public abstract LocationDetails administrativeAreaLevel1();

    @Nullable
    @Json(name = "administrative_area_level_2")
    public abstract LocationDetails administrativeAreaLevel2();

    @Nullable
    @Json(name = "country")
    public abstract LocationDetails country();

    @Nullable
    @Json(name = "lat")
    public abstract Double latitude();

    @Nullable
    @Json(name = "locality")
    public abstract LocationDetails locality();

    @Nullable
    @Json(name = "lon")
    public abstract Double longitude();

    public static JsonAdapter<Location> jsonAdapter(C5987p c5987p) {
        return new MoshiJsonAdapter(c5987p);
    }
}
