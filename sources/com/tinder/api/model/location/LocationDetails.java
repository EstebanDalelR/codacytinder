package com.tinder.api.model.location;

import com.squareup.moshi.C5987p;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.tinder.api.model.location.AutoValue_LocationDetails.MoshiJsonAdapter;

public abstract class LocationDetails {
    @Json(name = "long_name")
    public abstract String longName();

    @Json(name = "short_name")
    public abstract String shortName();

    public static JsonAdapter<LocationDetails> jsonAdapter(C5987p c5987p) {
        return new MoshiJsonAdapter(c5987p);
    }
}
