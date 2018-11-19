package com.tinder.api.request;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.tinder.api.request.AutoValue_DiscoverabilitySettingsRequest.MoshiJsonAdapter;

public abstract class DiscoverabilitySettingsRequest {

    public static abstract class Builder {
        public abstract DiscoverabilitySettingsRequest build();

        public abstract Builder setIsDiscoverable(@NonNull Boolean bool);

        public abstract Builder setIsSquadsDiscoverable(@NonNull Boolean bool);
    }

    @Nullable
    @Json(name = "discoverable")
    public abstract Boolean isDiscoverable();

    @Nullable
    @Json(name = "squads_discoverable")
    public abstract Boolean isSquadsDiscoverable();

    public static JsonAdapter<DiscoverabilitySettingsRequest> jsonAdapter(C5987p c5987p) {
        return new MoshiJsonAdapter(c5987p);
    }

    public static Builder builder() {
        return new Builder();
    }
}
