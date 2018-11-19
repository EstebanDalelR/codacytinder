package com.tinder.api.request;

import android.support.annotation.Nullable;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.tinder.api.request.AutoValue_GenderSettingsRequest.MoshiJsonAdapter;

public abstract class GenderSettingsRequest {

    public static abstract class Builder {
        public abstract GenderSettingsRequest build();

        public abstract Builder customGender(String str);

        public abstract Builder gender(Integer num);

        public abstract Builder showGenderOnProfile(Boolean bool);

        public abstract Builder showMe(Integer num);
    }

    @Nullable
    @Json(name = "custom_gender")
    public abstract String customGender();

    @Nullable
    @Json(name = "gender")
    public abstract Integer gender();

    @Nullable
    @Json(name = "show_gender_on_profile")
    public abstract Boolean showGenderOnProfile();

    @Nullable
    @Json(name = "gender_filter")
    public abstract Integer showMe();

    public static JsonAdapter<GenderSettingsRequest> jsonAdapter(C5987p c5987p) {
        return new MoshiJsonAdapter(c5987p);
    }

    public static Builder builder() {
        return new Builder();
    }
}
