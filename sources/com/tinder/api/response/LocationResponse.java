package com.tinder.api.response;

import android.support.annotation.Nullable;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.tinder.api.model.location.Location;
import com.tinder.api.response.AutoValue_LocationResponse.MoshiJsonAdapter;
import java.util.List;

public abstract class LocationResponse {
    @Json(name = "results")
    public abstract List<Location> locationList();

    @Nullable
    @Json(name = "status")
    public abstract Integer status();

    public static JsonAdapter<LocationResponse> jsonAdapter(C5987p c5987p) {
        return new MoshiJsonAdapter(c5987p);
    }
}
