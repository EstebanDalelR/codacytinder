package com.tinder.api.request;

import android.support.annotation.NonNull;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.tinder.api.request.AutoValue_PhotoOptimizerEnableRequest.MoshiJsonAdapter;

public abstract class PhotoOptimizerEnableRequest {

    public static abstract class Builder {
        public abstract PhotoOptimizerEnableRequest build();

        public abstract Builder setPhotoOptimizerEnabled(Boolean bool);
    }

    @NonNull
    @Json(name = "photo_optimizer_enabled")
    public abstract Boolean photoOptimizerEnabled();

    public static JsonAdapter<PhotoOptimizerEnableRequest> jsonAdapter(C5987p c5987p) {
        return new MoshiJsonAdapter(c5987p);
    }

    public static Builder builder() {
        return new Builder();
    }
}
