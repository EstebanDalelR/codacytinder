package com.tinder.onboarding.model;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

public abstract class OnboardingPassword {

    public static abstract class Builder {
        public abstract OnboardingPassword build();

        public abstract Builder changed(boolean z);

        public abstract Builder exists(boolean z);

        public abstract Builder text(@Nullable String str);
    }

    public abstract boolean changed();

    public abstract boolean exists();

    @Nullable
    public abstract String text();

    abstract Builder toBuilder();

    public static Builder builder() {
        return new Builder().exists(false);
    }

    public OnboardingPassword withText(@NonNull String str) {
        return toBuilder().text(str).changed(true).build();
    }

    public OnboardingPassword withChanged() {
        return toBuilder().changed(true).build();
    }
}
