package com.tinder.api.request;

import android.support.annotation.Nullable;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.JsonAdapter;
import com.tinder.api.request.AutoValue_UpdateProfileRequest.MoshiJsonAdapter;

public abstract class UpdateProfileRequest {

    public static abstract class Builder {
        public abstract Builder ageMax(Integer num);

        public abstract Builder ageMin(Integer num);

        public abstract Builder bio(String str);

        public abstract UpdateProfileRequest build();

        public abstract Builder customGender(String str);

        public abstract Builder distanceFilterInMiles(Float f);

        public abstract Builder gender(Integer num);

        public abstract Builder interestedInFemales(Boolean bool);

        public abstract Builder interestedInMales(Boolean bool);
    }

    @Nullable
    public abstract Integer ageMax();

    @Nullable
    public abstract Integer ageMin();

    @Nullable
    public abstract String bio();

    @Nullable
    public abstract String customGender();

    @Nullable
    public abstract Float distanceFilterInMiles();

    @Nullable
    public abstract Integer gender();

    @Nullable
    public abstract Boolean interestedInFemales();

    @Nullable
    public abstract Boolean interestedInMales();

    public static JsonAdapter<UpdateProfileRequest> jsonAdapter(C5987p c5987p) {
        return new MoshiJsonAdapter(c5987p);
    }

    public static Builder builder() {
        return new Builder();
    }
}
