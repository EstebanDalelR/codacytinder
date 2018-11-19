package com.tinder.onboarding.model;

import android.support.annotation.Nullable;
import com.tinder.domain.common.model.Gender.Value;

public abstract class GenderSelection {

    public static abstract class Builder {
        public abstract GenderSelection build();

        public abstract Builder customGender(@Nullable String str);

        public abstract Builder gender(@Nullable Value value);

        public abstract Builder showGenderOnProfile(@Nullable Boolean bool);
    }

    @Nullable
    public abstract String customGender();

    @Nullable
    public abstract Value gender();

    @Nullable
    public abstract Boolean showGenderOnProfile();

    public static Builder builder() {
        return new Builder();
    }
}
