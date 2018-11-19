package com.tinder.api.request;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.tinder.api.request.AutoValue_HideProfileItemsRequestBody.MoshiJsonAdapter;

public abstract class HideProfileItemsRequestBody {

    public static abstract class Builder {
        public abstract HideProfileItemsRequestBody build();

        public abstract Builder setHideAds(@NonNull Boolean bool);

        public abstract Builder setHideAge(@NonNull Boolean bool);

        public abstract Builder setHideDistance(@NonNull Boolean bool);
    }

    @Nullable
    @Json(name = "hide_ads")
    public abstract Boolean hideAds();

    @Nullable
    @Json(name = "hide_age")
    public abstract Boolean hideAge();

    @Nullable
    @Json(name = "hide_distance")
    public abstract Boolean hideDistance();

    public static JsonAdapter<HideProfileItemsRequestBody> jsonAdapter(C5987p c5987p) {
        return new MoshiJsonAdapter(c5987p);
    }

    public static Builder builder() {
        return new Builder();
    }
}
